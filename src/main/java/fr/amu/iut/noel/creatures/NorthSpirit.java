package fr.amu.iut.noel.creatures;

import fr.amu.iut.noel.interfaces.Entertainable;
import fr.amu.iut.noel.interfaces.Worker;
import fr.amu.iut.noel.model.Creature;
import fr.amu.iut.noel.model.Gender;

/**
 * Represents a northern spirit in Santa's Village.
 *
 * @author Audren Metery-Drouin
 */
public class NorthSpirit extends Creature implements Entertainable, Worker {
    /**
     * Constructor of the {@code NorthSpirit} class.
     *
     * @param name   the northern spirit's name
     * @param gender the northern spirit's gender
     * @param age    the northern spirit's age
     */
    public NorthSpirit(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    /**
     * Allows the northern spirit to entertain.
     *
     * @see fr.amu.iut.noel.interfaces.Entertainable#entertain()
     */
    @Override
    public void entertain() {
        super.modifyXmasMagic(ACTIVITY_MAGIC);
    }

    /**
     * Allows the northern spirit to work.
     *
     * @see fr.amu.iut.noel.interfaces.Worker#work()
     */
    @Override
    public void work() {
        // TODO: Work
        System.out.println("Working...");
    }
}
