package fr.amu.iut.noel.character;

import fr.amu.iut.noel.model.*;
import fr.amu.iut.noel.interfaces.*;

public class FeeNoel extends Humanoid implements Divertissable, Travaillable {
    public FeeNoel(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    public void entertain() {
        super.modifyXmasMagic(super.C_baseMagic);
    }
    public void work() {
        System.out.println("Travaille..");
    }
}