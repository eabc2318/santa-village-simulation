package fr.amu.iut.noel.model;

public abstract class Humanoid extends Character {
    public Humanoid(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    public void voir_farce(Farce farce) {
        super.modifyXmasMagic(super.C_farceMagic);
    }
}