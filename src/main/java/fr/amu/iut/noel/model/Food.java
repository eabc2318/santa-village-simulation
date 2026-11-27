package fr.amu.iut.noel.model;

/**
 * Represents a food item in Santa's Village.
 *
 * @author Audren Metery-Drouin
 */
public class Food {
    private final FoodType type;

    /**
     * Constructs a new {@code Food} item of the given type.
     *
     * @param type the type of food
     */
    public Food(FoodType type) {
        this.type = type;
    }

    /**
     * Returns the type of this food item.
     *
     * @return the food type
     */
    public FoodType getType() {
        return type;
    }

    /**
     * Returns the nutritional value of this food item.
     *
     * @return the nutritional value
     */
    public int getNutritionValue() {
        return type.getNutritionalValue();
    }
}
