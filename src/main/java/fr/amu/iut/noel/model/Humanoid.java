package fr.amu.iut.noel.model;

/**
 * Représente un humanoïde du village
 * @author Audren Metery-Drouin
 */
public abstract class Humanoid extends Character {
    /**
     * Constructeur de la classe Humanoid
     * @param name le nom de l'humanoïde
     * @param gender le genre de l'humanoïde
     * @param age l'âge de l'humanoïde
     */
    public Humanoid(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    /**
     * Permet de voir une farce et donc de gagner de la magie de noël en conséquence
     * @param farce la farce perçue par la créature
     * @see fr.amu.iut.noel.model.Character#voir_farce(fr.amu.iut.noel.model.Farce)
     */
    public void voir_farce(Farce farce) {
        super.modifyXmasMagic(super.C_farceMagic);
    }
}