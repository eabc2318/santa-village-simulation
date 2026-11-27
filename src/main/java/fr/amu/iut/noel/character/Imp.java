package fr.amu.iut.noel.character;

import fr.amu.iut.noel.interfaces.Entertainable;
import fr.amu.iut.noel.interfaces.Worker;
import fr.amu.iut.noel.model.Gender;
import fr.amu.iut.noel.model.Humanoid;

/**
 * Represents an imp in Santa's Village.
 *
 * @author Audren Metery-Drouin
 */
public abstract class Imp extends Humanoid implements Entertainable, Worker {
    private boolean prankster = false; // Indicates whether the imp is in "prankster" mode

    /**
     * Constructor of the {@code Imp} class.
     *
     * @param name   the imp's name
     * @param gender the imp's gender
     * @param age    the imp's age
     */
    public Imp(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    /**
     * Allows the imp to entertain.
     *
     * @see fr.amu.iut.noel.interfaces.Entertainable#entertain()
     */
    @Override
    public void entertain() {
        super.modifyXmasMagic(ACTIVITY_MAGIC);
    }

    /**
     * Allows the imp to work.
     *
     * @see fr.amu.iut.noel.interfaces.Worker#work()
     */
    @Override
    public void work() {
        // TODO: Work
        System.out.println("Working...");
    }

    /**
     * Sets whether the imp is in prankster mode.
     *
     * @param prankster {@code true} to enable prankster mode, {@code false} otherwise
     */
    public void setPrankster(boolean prankster) {
        this.prankster = prankster;
    }

    /**
     * Returns whether the imp is currently in prankster mode.
     *
     * @return {@code true} if the imp is a prankster, {@code false} otherwise
     */
    public boolean isPrankster() {
        return prankster;
    }
}
