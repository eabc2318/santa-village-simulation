package fr.amu.iut.noel.model;

/**
 * Gère les personnages du jeu qu'ils soient des humanoïdes ou des créatures.
 * @author Audren Metery-Drouin
 */
public abstract class Character {
    // Privates variables
    private String name;
    private Gender gender;
    private int age;
    private int hunger;
    private int tiredness;
    private int xmasMagic;

    public final int C_activiteMagic = 5; // Magie gagné lorsque un character réalise son activité
    public final int C_farceMagic = 1; // Magie modifié lorsque un character voit une farce

    /**
     * Constructor of the Character class
     * @param name le nom du character
     * @param gender le genre du character
     * @param age l'âge du character
     */
    public Character(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.hunger = 0;
        this.tiredness = 0;
        this.xmasMagic = 0;
    }

    // Methods
    /**
     * Permet d'émettre un son
     */
    public void emitSound() {}

    /**
     * Permet de se déplacer
     */
    public void move() {}

    /**
     * Permet de se restaurer
     */
    public void restore() {}

    /**
     * Permet de réaliser une activité
     * @param activity l'activité realisé
     */
    public void doActivity(Activity activity) {}

    /**
     * Permet de modifier la magie de noël
     * @param amount
     */
    public void modifyXmasMagic(int amount) {
        xmasMagic += amount;
        if (xmasMagic < 0) {
            xmasMagic = 0;
        }
    }

    /**
     * Permet de manger de la nourriture
     * @param food
     */
    public void eat(Food food) {
        hunger -= food.getNutritionValue();
        if (hunger < 0) {
            hunger = 0;
        }
    }

    /**
     * Permet de voir une farce
     * @param farce
     */
    abstract public void voir_farce(Farce farce);

    // Getters & setters
    public String getName() {
        return name;
    }
    public Gender getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public int getHunger() {
        return hunger;
    }
    public int getTiredness() {
        return tiredness;
    }
    public int getXmasMagic() {
        return xmasMagic;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }
    public void setXmasMagic(int xmasMagic) {
        this.xmasMagic = xmasMagic;
    }
}