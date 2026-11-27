package fr.amu.iut.noel.model;

/**
 * Représente une créature du village
 * @author Audren Metery-Drouin
 */
public abstract class Creature extends Character {
    /**
     * Constructeur de la classe Creature
     * @param name le nom de la créature
     * @param gender le genre de la créature
     * @param age l'âge de la créature
     */
    public Creature(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    /**
     * Permet de voir une farce et donc de perdre de la magie de noël en conséquence
     * @param farce la farce perçue par la créature
     * @see fr.amu.iut.noel.model.Character#voir_farce(fr.amu.iut.noel.model.Farce)
     */
    public void voir_farce(Farce farce) {
        super.modifyXmasMagic(-super.C_farceMagic);
    }
}
