package fr.amu.iut.noel.character;

import fr.amu.iut.noel.model.*;

/**
 * Représente un lutin farceur du village de noël
 * @author Audren Metery-Drouin
 */
public class LutinFarceur extends Lutin {
    /**
     * Constructeur de la classe lutin farceur
     * @param name le nom du lutin farceur
     * @param gender le genre du lutin farceur
     * @param age l'âge du lutin farceur
     */
    public LutinFarceur(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    /**
     * Permet de réaliser une farce
     * @param farce la farce réaliser par le lutin farceur
     */
    public void faire_farce(Farce farce) {
        System.out.println("Farce réalisé");
    }
}