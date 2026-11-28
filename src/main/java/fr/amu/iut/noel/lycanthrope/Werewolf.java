package werewolves.model;

import java.util.Optional;
import werewolves.colony.Enclosure;
import werewolves.colony.Pack;
import werewolves.howl.AggressionHowl;
import werewolves.howl.DominationHowl;
import werewolves.howl.Howl;
import werewolves.howl.HowlListener;
import werewolves.howl.PackHowl;
import werewolves.howl.SubmissionHowl;


/** A werewolf: member of a pack, or loner. */
public class Werewolf extends Creature implements HowlListener {
    /** Bound of the domination factor (it is kept in [-MAX_FACTOR, MAX_FACTOR]). */
    public static final int MAX_FACTOR = 10;

    private final double impetuosity;       // in [0, 0.5]
    private final GameRandom random;
    private final LevelStrategy levelStrategy;
    private int dominationFactor;           // dominations performed - dominations suffered
    private Rank rank;                      // null for a loner
    private Pack pack;                      // null for a loner
    private Enclosure enclosure;

    /** Creates a werewolf (normally through {@code WerewolfFactory}). */
    public Werewolf(String name, Sex sex, int ageYears, int strength, double impetuosity,
                    Enclosure enclosure, GameRandom random, LevelStrategy levelStrategy) {
        super(name, sex, ageYears, strength);
        this.impetuosity = impetuosity;
        this.enclosure = enclosure;
        this.random = random;
        this.levelStrategy = levelStrategy;
    }



    public double getImpetuosity() {
        return impetuosity;
    }

    public int getDominationFactor() {
        return dominationFactor;
    }

    public void setDominationFactor(int value) {
        dominationFactor = Math.max(-MAX_FACTOR, Math.min(MAX_FACTOR, value));
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }

    public Enclosure getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
    }

    public boolean isLoner() {
        return pack == null;
    }

    public boolean isOmega() {
        return rank == Rank.OMEGA;
    }

    /** Subjective quality of this werewolf (age, strength, domination factor and rank). */
    public double level() {
        return levelStrategy.levelOf(this);
    }

    /** True if this werewolf thinks the target is weaker or equal (impetuosity makes it optimistic). */
    public boolean thinksWeakerOrEqual(Werewolf target) {
        return target.getStrength() <= getStrength() * (1 + impetuosity);
    }

    /** Probability to leave the enclosure for good when turning into a human (lower level, higher risk). */
    public double departureProbability() {
        return Math.max(0.05, 0.5 - level() / 100.0);
    }



    @Override
    public String describe() {
        return String.format("%-9s %s %-5s %2d y | strength %2d | factor %+d | rank %s | level %.1f",
                getName(), getSex().getSymbol(), getAgeCategory().getLabel(), getAgeYears(), getStrength(),
                dominationFactor, rank == null ? "loner" : String.valueOf(rank.getSymbol()), level());
    }

    /**
     * Howls: the howl is broadcast to the whole colony.
     *
     * @throws IllegalArgumentException if this werewolf is not the emitter of the howl
     */
    public void howl(Howl howl) {
        if (howl.emitter() != this) {
            throw new IllegalArgumentException("a werewolf can only emit its own howls");
        }
        enclosure.getColony().broadcast(howl);
    }

    /** Whether this werewolf is able to hear howls (a young one is not). */
    public boolean canHear() {
        return getAgeCategory() != AgeCategory.YOUNG;
    }

    /**
     * Reacts to a howl. Only pack howls that are not replies call for an answer: members of the
     * same pack always answer, other packs answer with a probability of 30 %.
     * The sealed {@link Howl} type makes this {@code switch} exhaustive.
     */
    @Override
    public void onHowl(Howl howl) {
        if (!canHear() || howl.emitter() == this) {
            return;
        }
        switch (howl) {
            case PackHowl packHowl -> {
                if (!packHowl.reply() && pack != null
                        && (pack == packHowl.emitter().getPack() || random.chance(0.3))) {
                    howl(new PackHowl(this, true));
                }
            }
            case DominationHowl ignored -> { /* the reaction is decided by the pack */ }
            case SubmissionHowl ignored -> { /* nothing to answer */ }
            case AggressionHowl ignored -> { /* nothing to answer */ }
        }
    }

    /** Leaves the pack and becomes a loner (no rank any more). */
    public void leavePack() {
        if (pack == null) {
            return;
        }
        enclosure.getColony().log(getName() + " leaves the pack and becomes a loner.");
        pack.removeMember(this);
        enclosure.addLoner(this);
    }

    /**
     * Moves a loner to another enclosure.
     *
     * @throws IllegalStateException if this werewolf belongs to a pack
     */
    public void moveTo(Enclosure target) {
        if (pack != null) {
            throw new IllegalStateException(getName() + " belongs to a pack and cannot be moved alone");
        }
        if (target == enclosure) {
            return;
        }
        enclosure.removeLoner(this);
        target.addLoner(this);
        enclosure = target;
        enclosure.getColony().log(getName() + " (loner) moves to enclosure " + target.getName() + ".");
    }

    /**
     * Turns into a human. Depending on its level it may leave the pack and the enclosure for good
     * (equivalent to a death).
     *
     * @return the human if the werewolf left, empty if it turned back into a wolf
     */
    public Optional<Human> transformIntoHuman() {
        if (!random.chance(departureProbability())) {
            enclosure.getColony().log(getName() + " turns into a human, then back into a wolf.");
            return Optional.empty();
        }
        enclosure.getColony().log(getName() + " turns into a human and leaves the enclosure for good.");
        if (pack != null) {
            pack.removeMember(this);
        } else {
            enclosure.removeLoner(this);
        }
        return Optional.of(new Human(this));
    }

    /** Ages by one year: strength grows while young, decreases when old. */
    public void ageOneYear() {
        AgeCategory before = getAgeCategory();
        incrementAge();
        if (getAgeYears() <= 4) {
            setStrength(getStrength() + 2);
        } else if (getAgeCategory() == AgeCategory.OLD) {
            setStrength(getStrength() - 1);
        }
        if (before != getAgeCategory()) {
            enclosure.getColony().log(getName() + " is now " + getAgeCategory().getLabel() + ".");
        }
    }

    /** The domination factor slowly goes back to 0. */
    public void relaxDominationFactor() {
        if (dominationFactor != 0 && random.chance(0.5)) {
            setDominationFactor(dominationFactor - Integer.signum(dominationFactor));
        }
    }
}
