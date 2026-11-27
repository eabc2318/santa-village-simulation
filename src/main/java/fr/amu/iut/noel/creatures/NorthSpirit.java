package fr.amu.iut.noel.creatures;

import fr.amu.iut.noel.model.*;
import fr.amu.iut.noel.interfaces.*;

/**
 * Représente une esprit du nord du village de noël
 * @author Audren Metery-Drouin
 */
public class NorthSpirit extends Creature implements Divertissable, Travaillable {
    /**
     * Constructeur de la classe esprit du nord
     * @param name le nom de l'esprit du nord
     * @param gender le genre de l'esprit du nord
     * @param age l'âge de l'esprit du nord
     */
    public NorthSpirit(String name, Gender gender, int age) {
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