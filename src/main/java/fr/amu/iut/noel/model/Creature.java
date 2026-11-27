package fr.amu.iut.noel.model;

public abstract class Creature extends Character {
    public Creature(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    public void voir_farce(Farce farce) {
        super.modifyXmasMagic(-super.C_farceMagic);
    }
}
