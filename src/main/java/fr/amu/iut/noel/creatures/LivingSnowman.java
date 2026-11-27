package fr.amu.iut.noel.creatures;

import fr.amu.iut.noel.model.*;
import fr.amu.iut.noel.interfaces.*;

/**
 * Représente un bonhomme de neige vivant du village de noël
 * @author Audren Metery-Drouin
 */
public class LivingSnowman extends Creature implements Divertissable, Travaillable {
    /**
     * Constructeur de la classe bonhomme de neige vivant
     * @param name
     * @param gender
     * @param age
     */
    public LivingSnowman(String name, Gender gender, int age) {
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