package fr.amu.iut.noel.model;

public class Food {
    // Privates variables
    private final FoodType type;

    // Constructor
    public Food(FoodType type) {
        this.type = type;
    }

    // Getters
    public FoodType getType() {
        return type;
    }

    public int getNutritionValue() {
        return type.getNutritionalValue();
    }
}