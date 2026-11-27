package fr.amu.iut.noel.creatures;

import fr.amu.iut.noel.interfaces.Entertainable;
import fr.amu.iut.noel.interfaces.Worker;
import fr.amu.iut.noel.model.Creature;
import fr.amu.iut.noel.model.Gender;

/**
 * Represents a living snowman in Santa's Village.
 *
 * @author Audren Metery-Drouin
 */
public class LivingSnowman extends Creature implements Entertainable, Worker {
    /**
     * Constructor of the {@code LivingSnowman} class.
     *
     * @param name   the living snowman's name
     * @param gender the living snowman's gender
     * @param age    the living snowman's age
     */
    public LivingSnowman(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    /**
     * Allows the living snowman to entertain.
     *
     * @see fr.amu.iut.noel.interfaces.Entertainable#entertain()
     */
    @Override
    public void entertain() {
        super.modifyXmasMagic(ACTIVITY_MAGIC);
    }

    /**
     * Allows the living snowman to work.
     *
     * @see fr.amu.iut.noel.interfaces.Worker#work()
     */
    @Override
    public void work() {
        System.out.println("Working...");
    }
}
