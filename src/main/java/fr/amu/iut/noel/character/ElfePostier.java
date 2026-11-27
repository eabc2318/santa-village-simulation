package fr.amu.iut.noel.character;

import fr.amu.iut.noel.model.*;
import fr.amu.iut.noel.interfaces.*;

/**
 * Représente un elfe postier du village
 * @author Audren Metery-Drouin
 */
public class ElfePostier extends Humanoid implements Travaillable {
    /**
     * Constructeur de la classe ElfePostier
     * @param name le nom de l'elfe postier
     * @param gender le genre de l'elfe postier
     * @param age l'âge de l'elfe postier
     */
    public ElfePostier(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    /**
     * Permet à l'elfe de travailler
     * @see fr.amu.iut.noel.interfaces.Travaillable#work()
     */
    public void work() {
        System.out.println("Travaille..");
    }
}