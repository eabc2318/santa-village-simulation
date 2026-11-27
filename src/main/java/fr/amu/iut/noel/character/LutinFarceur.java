package fr.amu.iut.noel.character;

import fr.amu.iut.noel.model.*;

public class LutinFarceur extends Lutin {
    public LutinFarceur(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    public void faire_farce(Farce farce) {
        System.out.println("Farce réalisé");
    }
}