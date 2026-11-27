package fr.amu.iut.noel.creatures;

import fr.amu.iut.noel.model.*;
import fr.amu.iut.noel.interfaces.*;

/**
 * Représente un lycnathrope du village de noël
 * @author Audren Metery-Drouin
 */
public class Lycanthrope extends Creature implements Divertissable, Travaillable {
    /**
     * Constructeur de la classe lycanthrope
     * @param name le nom du lycanthrope
     * @param gender le genre du lycanthrope
     * @param age l'âge du lycanthrope
     */
    public Lycanthrope(String name, Gender gender, int age) {
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