package fr.amu.iut.noel.character;

import fr.amu.iut.noel.model.Gender;
import fr.amu.iut.noel.model.Prank;

/**
 * Represents a prankster imp in Santa's Village.
 *
 * @author Audren Metery-Drouin
 */
public class PranksterImp extends Imp {
    /**
     * Constructor of the {@code PranksterImp} class.
     *
     * @param name   the prankster imp's name
     * @param gender the prankster imp's gender
     * @param age    the prankster imp's age
     */
    public PranksterImp(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    /**
     * Plays a prank.
     *
     * @param prank the prank performed by the prankster imp
     */
    public void playPrank(Prank prank) {
        System.out.println("Prank performed");
    }
}
