package fr.amu.iut.noel.character;

import fr.amu.iut.noel.interfaces.Entertainable;
import fr.amu.iut.noel.interfaces.Worker;
import fr.amu.iut.noel.model.Gender;
import fr.amu.iut.noel.model.Humanoid;

/**
 * Represents a Christmas fairy in Santa's Village.
 *
 * @author Audren Metery-Drouin
 */
public class ChristmasFairy extends Humanoid implements Entertainable, Worker {
    /**
     * Constructor of the {@code ChristmasFairy} class.
     *
     * @param name   the Christmas fairy's name
     * @param gender the Christmas fairy's gender
     * @param age    the Christmas fairy's age
     */
    public ChristmasFairy(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    /**
     * Allows the Christmas fairy to entertain.
     *
     * @see fr.amu.iut.noel.interfaces.Entertainable#entertain()
     */
    @Override
    public void entertain() {
        super.modifyXmasMagic(ACTIVITY_MAGIC);
    }

    /**
     * Allows the Christmas fairy to work.
     *
     * @see fr.amu.iut.noel.interfaces.Worker#work()
     */
    @Override
    public void work() {
        // TODO: Work
        System.out.println("Working...");
    }
}
