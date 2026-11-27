package fr.amu.iut.noel.lycanthrope;

/**
 * Represents a lycanthrope in the TD4 lycanthrope colony subsystem.
 */
public class Lycanthropes {

    /** Constant indicating a solitary lycanthrope with no pack. */
    public static final String SOLITARY = "solitary";

    private String name;
    private final Sex sex;
    private AgeCategory ageCategory;
    private int strength;
    private int dominationsExerted;
    private int dominationsSuffered;
    private int rank;
    private double impetuosity;
    private String pack;

    /**
     * Constructs a new {@code Lycanthropes} instance.
     *
     * @param name                the lycanthrope's name
     * @param sex                 the lycanthrope's sex
     * @param ageCategory         the lycanthrope's age category
     * @param strength            the lycanthrope's strength
     * @param dominationsExerted  number of dominations exerted
     * @param dominationsSuffered number of dominations suffered
     * @param rank                the domination rank within the pack
     * @param impetuosity         the impetuosity factor
     * @param pack                the pack name, or {@link #SOLITARY}
     */
    public Lycanthropes(
            String name,
            Sex sex,
            AgeCategory ageCategory,
            int strength,
            int dominationsExerted,
            int dominationsSuffered,
            int rank,
            double impetuosity,
            String pack
    ) {
        this.name = name;
        this.sex = sex;
        this.ageCategory = ageCategory;
        this.strength = strength;
        this.dominationsExerted = dominationsExerted;
        this.dominationsSuffered = dominationsSuffered;
        setPack(pack, rank);
        this.impetuosity = impetuosity;
    }

    /**
     * Assigns the lycanthrope to a pack and sets its rank.
     *
     * @param pack the pack name
     * @param rank the rank within the pack
     */
    public void setPack(String pack, int rank) {
        this.pack = pack;
        this.rank = rank;
    }

    /**
     * Biological sex of a lycanthrope.
     */
    public enum Sex {
        /** Male lycanthrope. */
        MALE,
        /** Female lycanthrope. */
        FEMALE,
        /** Bisexual lycanthrope. */
        BISEXUAL
    }

    /**
     * Age category of a lycanthrope and its associated level factor.
     */
    public enum AgeCategory {
        /** Young lycanthrope. */
        YOUNG(0.0),
        /** Adult lycanthrope. */
        ADULT(1.0),
        /** Old lycanthrope. */
        OLD(2.0);

        private final double factor;

        AgeCategory(double factor) {
            this.factor = factor;
        }

        /**
         * Returns the level factor associated with this age category.
         *
         * @return the age category factor
         */
        public double getFactor() {
            return factor;
        }
    }

    /**
     * Computes the domination factor as the difference between dominations exerted and suffered.
     *
     * @return the domination factor
     */
    public int getDominationFactor() {
        return dominationsExerted - dominationsSuffered;
    }
}
