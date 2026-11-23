package fr.amu.iut.noel.model;

/**
 * Represents the types of food available in Santa's Village and their nutritional values.
 */
public enum FoodType {
    /** Christmas biscuit. */
    BISCUIT(10),
    /** Hot chocolate drink. */
    HOT_CHOCOLATE(15),
    /** Marshmallow treat. */
    MARSHMALLOW(8),
    /** Warm oatmeal bowl. */
    OATMEAL(20),
    /** Candy cane or sweet. */
    CANDY(5);

    private final int nutritionalValue;

    FoodType(int nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }

    /**
     * Returns the nutritional value restored when a character eats this food.
     *
     * @return the nutritional value
     */
    public int getNutritionalValue() {
        return nutritionalValue;
    }
}
