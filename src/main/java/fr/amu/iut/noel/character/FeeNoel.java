package fr.amu.iut.noel.character;

import fr.amu.iut.noel.model.*;
import fr.amu.iut.noel.interfaces.*;

/**
 * Représente une fée de noël du village
 * @author Audren Metery-Drouin
 */
public class FeeNoel extends Humanoid implements Divertissable, Travaillable {
    /**
     * Constructeur de classe fée de noël
     * @param name le nom de la fée de noël
     * @param gender le genre de la fée de noël
     * @param age l'âge de la fée de noël
     */
    public FeeNoel(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    /**
     * Permet de se divertir
     * @see fr.amu.iut.noel.interfaces.Divertissable#entertain()
     */
    public void entertain() {
        super.modifyXmasMagic(super.C_activiteMagic);
    }

    /**
     * Permet de travailler
     * @see fr.amu.iut.noel.interfaces.Travaillable#work()
     */
    public void work() {
        System.out.println("Travaille..");
    }
}