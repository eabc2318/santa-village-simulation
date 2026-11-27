package fr.amu.iut.noel.character;

import fr.amu.iut.noel.model.*;
import fr.amu.iut.noel.interfaces.*;

/**
 * Représente un enfant visiteur du village
 * @author Audren Metery-Drouin
 */
public class EnfantVisiteur extends Humanoid implements Divertissable {
    /**
     * Constructeur de la classe enfant visiteur
     * @param name le nom de l'enfant visiteur
     * @param gender le genre de l'enfant visiteur
     * @param age l'âge de l'enfant visiteur
     */
    public EnfantVisiteur(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    /**
     * Permet de se divertir
     * @see fr.amu.iut.noel.interfaces.Divertissable#entertain()
     */
    public void entertain() {
        // Les enfants visiteurs se divertissent partout donc leur magie de Noël compte double.
        super.modifyXmasMagic(super.C_activiteMagic*2);
    }
}