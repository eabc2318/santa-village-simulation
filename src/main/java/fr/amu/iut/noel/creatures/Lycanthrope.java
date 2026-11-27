package fr.amu.iut.noel.creatures;

import fr.amu.iut.noel.model.*;
import fr.amu.iut.noel.interfaces.*;

public class Lycanthrope extends Creature implements Divertissable, Travaillable {
    public Lycanthrope(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    public void entertain() {
        super.modifyXmasMagic(super.C_activiteMagic);
    }
    public void work() {
        System.out.println("Travaille..");
    }
}