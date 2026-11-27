package fr.amu.iut.noel.model;

/**
 * Base class managing characters in the game, whether they are humanoids or creatures.
 *
 * @author Audren Metery-Drouin
 */
public abstract class Actor {
    private String name;
    private Gender gender;
    private int age;
    private int hunger;
    private int tiredness;
    private int xmasMagic;

    /** Magic gained when a character performs an activity. */
    public static final int ACTIVITY_MAGIC = 5;
    /** Magic modified when a character witnesses a prank. */
    public static final int PRANK_MAGIC = 1;

    /**
     * Constructor of the {@code Character} class.
     *
     * @param name   the character's name
     * @param gender the character's gender
     * @param age    the character's age
     */
    public Actor(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.hunger = 0;
        this.tiredness = 0;
        this.xmasMagic = 0;
    }

    /**
     * Emits a sound.
     */
    public void emitSound() {
        // TODO: Work
    }

    /**
     * Moves the character.
     */
    public void move() {
        // TODO: Work
    }

    /**
     * Restores the character's energy.
     */
    public void restore() {
        // TODO: Work
    }

    /**
     * Performs a given activity.
     *
     * @param activity the activity to perform
     */
    public void doActivity(Activity activity) {
        // TODO: Work
    }

    /**
     * Modifies the character's Christmas magic, clamping it to a minimum of 0.
     *
     * @param amount the amount to add (or subtract if negative)
     */
    public void modifyXmasMagic(int amount) {
        xmasMagic += amount;
        if (xmasMagic < 0) {
            xmasMagic = 0;
        }
    }

    /**
     * Feeds the character with the given food item, reducing hunger down to a minimum of 0.
     *
     * @param food the food item to eat
     */
    public void eat(Food food) {
        hunger -= food.getNutritionValue();
        if (hunger < 0) {
            hunger = 0;
        }
    }

    /**
     * Reacts to witnessing a prank.
     *
     * @param prank the prank witnessed
     */
    public abstract void witnessPrank(Prank prank);

    /**
     * Returns the character's name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the character's gender.
     *
     * @return the gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Returns the character's age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the character's hunger level.
     *
     * @return the hunger level
     */
    public int getHunger() {
        return hunger;
    }

    /**
     * Returns the character's tiredness level.
     *
     * @return the tiredness level
     */
    public int getTiredness() {
        return tiredness;
    }

    /**
     * Returns the character's Christmas magic level.
     *
     * @return the Christmas magic level
     */
    public int getXmasMagic() {
        return xmasMagic;
    }

    /**
     * Sets the character's name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the character's gender.
     *
     * @param gender the new gender
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * Sets the character's age.
     *
     * @param age the new age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets the character's hunger level.
     *
     * @param hunger the new hunger level
     */
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    /**
     * Sets the character's tiredness level.
     *
     * @param tiredness the new tiredness level
     */
    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }

    /**
     * Sets the character's Christmas magic level.
     *
     * @param xmasMagic the new Christmas magic level
     */
    public void setXmasMagic(int xmasMagic) {
        this.xmasMagic = xmasMagic;
    }
}
