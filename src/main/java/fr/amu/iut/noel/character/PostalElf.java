package fr.amu.iut.noel.character;

import fr.amu.iut.noel.interfaces.Worker;
import fr.amu.iut.noel.model.Gender;
import fr.amu.iut.noel.model.Humanoid;

/**
 * Represents a postal elf in Santa's Village.
 *
 * @author Audren Metery-Drouin
 */
public class PostalElf extends Humanoid implements Worker {
    /**
     * Constructor of the {@code PostalElf} class.
     *
     * @param name   the postal elf's name
     * @param gender the postal elf's gender
     * @param age    the postal elf's age
     */
    public PostalElf(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    /**
     * Allows the postal elf to work.
     *
     * @see fr.amu.iut.noel.interfaces.Worker#work()
     */
    @Override
    public void work() {
        System.out.println("Working...");
    }
}
