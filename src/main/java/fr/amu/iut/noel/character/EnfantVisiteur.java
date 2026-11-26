package fr.amu.iut.noel.character;

import fr.amu.iut.noel.model.*;
import fr.amu.iut.noel.interfaces.*;

public class EnfantVisiteur extends Humanoid implements Divertissable {
    public EnfantVisiteur(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    public void entertain() {
        // Les enfants visiteurs se divertissent partout donc leur magie de Noël compte double.
        super.modifyXmasMagic(super.C_baseMagic*2);
    }
}