package fr.amu.iut.noel.character;

import fr.amu.iut.noel.interfaces.Entertainable;
import fr.amu.iut.noel.model.Gender;
import fr.amu.iut.noel.model.Humanoid;

/**
 * Represents a visiting child in Santa's Village.
 *
 * @author Audren Metery-Drouin
 */
public class VisitingChild extends Humanoid implements Entertainable {
    /**
     * Constructor of the {@code VisitingChild} class.
     *
     * @param name   the visiting child's name
     * @param gender the visiting child's gender
     * @param age    the visiting child's age
     */
    public VisitingChild(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    /**
     * Entertains the visiting child, doubling the Christmas magic gained.
     *
     * @see fr.amu.iut.noel.interfaces.Entertainable#entertain()
     */
    @Override
    public void entertain() {
        // Visiting children have fun everywhere, so their Christmas magic counts double.
        super.modifyXmasMagic(ACTIVITY_MAGIC * 2);
    }
}
