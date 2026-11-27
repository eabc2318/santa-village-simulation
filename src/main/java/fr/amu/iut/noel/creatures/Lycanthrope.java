package fr.amu.iut.noel.creatures;

import fr.amu.iut.noel.interfaces.Entertainable;
import fr.amu.iut.noel.interfaces.Worker;
import fr.amu.iut.noel.model.Creature;
import fr.amu.iut.noel.model.Gender;

/**
 * Represents a lycanthrope creature in Santa's Village.
 *
 * @author Audren Metery-Drouin
 */
public class Lycanthrope extends Creature implements Entertainable, Worker {
    /**
     * Constructor of the {@code Lycanthrope} class.
     *
     * @param name   the lycanthrope's name
     * @param gender the lycanthrope's gender
     * @param age    the lycanthrope's age
     */
    public Lycanthrope(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    /**
     * Allows the lycanthrope to entertain.
     *
     * @see fr.amu.iut.noel.interfaces.Entertainable#entertain()
     */
    @Override
    public void entertain() {
        super.modifyXmasMagic(ACTIVITY_MAGIC);
    }

    /**
     * Allows the lycanthrope to work.
     *
     * @see fr.amu.iut.noel.interfaces.Worker#work()
     */
    @Override
    public void work() {
        System.out.println("Working...");
    }
}
