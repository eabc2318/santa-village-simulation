package fr.amu.iut.noel.model;

/**
 * Represents a creature in Santa's Village.
 *
 * @author Audren Metery-Drouin
 */
public abstract class Creature extends Character {
    /**
     * Constructor of the {@code Creature} class.
     *
     * @param name   the creature's name
     * @param gender the creature's gender
     * @param age    the creature's age
     */
    public Creature(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    /**
     * Witnesses a prank and loses Christmas magic accordingly.
     *
     * @param prank the prank witnessed by the creature
     * @see fr.amu.iut.noel.model.Character#witnessPrank(fr.amu.iut.noel.model.Prank)
     */
    @Override
    public void witnessPrank(Prank prank) {
        super.modifyXmasMagic(-PRANK_MAGIC);
    }
}
