package fr.amu.iut.noel.creatures;

import fr.amu.iut.noel.model.*;

/**
 * Représente un renne du village de noël
 * @author Audren Metery-Drouin
 */
public class Renne extends Creature {
    /**
     * Constructeur de la classe renne
     * @param name le nom du renne
     * @param gender le genre du renne
     * @param age l'âge du renne
     */
    public Renne(String name, Gender gender, int age) {
        super(name, gender, age);
    }
}