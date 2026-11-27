package fr.amu.iut.noel.creatures;

import fr.amu.iut.noel.model.Creature;
import fr.amu.iut.noel.model.Gender;

/**
 * Represents a reindeer in Santa's Village.
 *
 * @author Audren Metery-Drouin
 */
public class Reindeer extends Creature {
    /**
     * Constructor of the {@code Reindeer} class.
     *
     * @param name   the reindeer's name
     * @param gender the reindeer's gender
     * @param age    the reindeer's age
     */
    public Reindeer(String name, Gender gender, int age) {
        super(name, gender, age);
    }
}
