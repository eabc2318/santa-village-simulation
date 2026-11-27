package fr.amu.iut.noel.character;

import fr.amu.iut.noel.model.*;
import fr.amu.iut.noel.interfaces.*;

/**
 * Représente un lutin du village de noël
 * @author Audren Metery-Drouin
 */
public abstract class Lutin extends Humanoid implements Divertissable, Travaillable {
    private boolean estFarceur = false; // Permet de savoir si le lutin est en mode "farceur"

    /**
     * Constructeur de la classe Lutin
     * @param name le nom du lutin
     * @param gender le genre du lutin
     * @param age l'âge du lutin
     */
    public Lutin(String name, Gender gender, int age) {
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

    public void setEstFarceur(boolean estFarceur) {
        this.estFarceur = estFarceur;
    }
    public boolean getEstFarceur() {
        return estFarceur;
    }
}