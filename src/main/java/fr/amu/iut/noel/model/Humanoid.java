package fr.amu.iut.noel.model;

/**
 * Represents a humanoid in Santa's Village.
 *
 * @author Audren Metery-Drouin
 */
public abstract class Humanoid extends Actor {
    /**
     * Constructor of the {@code Humanoid} class.
     *
     * @param name   the humanoid's name
     * @param gender the humanoid's gender
     * @param age    the humanoid's age
     */
    public Humanoid(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    /**
     * Witnesses a prank and gains Christmas magic accordingly.
     *
     * @param prank the prank witnessed by the humanoid
     * @see fr.amu.iut.noel.model.Character#witnessPrank(fr.amu.iut.noel.model.Prank)
     */
    @Override
    public void witnessPrank(Prank prank) {
        super.modifyXmasMagic(PRANK_MAGIC);
    }
}
