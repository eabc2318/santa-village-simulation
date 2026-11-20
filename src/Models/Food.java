package Models;

public class Food {
    // Privates variables
    private String name;
    private int nutritionValue;

    // Constructor
    public Food(String name, int nutritionValue) {
        this.name = name;
        this.nutritionValue = nutritionValue;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getNutritionValue() {
        return nutritionValue;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setNutritionValue(int nutritionValue) {
        this.nutritionValue = nutritionValue;
    }
}