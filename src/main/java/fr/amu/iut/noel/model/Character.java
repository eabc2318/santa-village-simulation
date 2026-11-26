package fr.amu.iut.noel.model;

public abstract class Character {
    // Privates variables
    private String name;
    private Gender gender;
    private int age;
    private int hunger;
    private int tiredness;
    private int xmasMagic;

    public final int C_baseMagic = 5;

    // Constructor
    public Character(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.hunger = 0;
        this.tiredness = 0;
        this.xmasMagic = 0;
    }

    // Methods
    public void emitSound() {} // Pour émettre un son
    public void move() {} // Pour se déplacer
    public void restore() {} // Pour se restaurer
    public void doActivity() {} // Pour faire une activité (se reposer est une activité)
    public void modifyXmasMagic(int amount) {
        xmasMagic += amount;
    } // Pour modifier la magie de Noël

    public void eat(Food food) {
        hunger -= food.getNutritionValue();
        if (hunger < 0) {
            hunger = 0;
        }
    } // Pour manger de la nourriture

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