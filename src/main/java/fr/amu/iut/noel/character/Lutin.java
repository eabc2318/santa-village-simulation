package fr.amu.iut.noel.character;

import fr.amu.iut.noel.model.*;
import fr.amu.iut.noel.interfaces.*;

public abstract class Lutin extends Humanoid implements Divertissable, Travaillable {
    private boolean estFarceur = false;

    public Lutin(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    public void entertain() {
        super.modifyXmasMagic(super.C_activiteMagic);
    }
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