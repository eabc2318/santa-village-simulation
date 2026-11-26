package fr.amu.iut.noel.creatures;

import fr.amu.iut.noel.model.*;
import fr.amu.iut.noel.interfaces.*;

public class LivingSnowman extends Creature implements Divertissable, Travaillable {
    public LivingSnowman(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    public void entertain() {
        super.modifyXmasMagic(super.C_baseMagic);
    }
    public void work() {
        System.out.println("Travaille..");
    }
}