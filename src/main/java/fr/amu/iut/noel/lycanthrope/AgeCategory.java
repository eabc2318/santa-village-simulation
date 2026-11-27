package fr.amu.iut.noel.lycanthrope;


/**
 * Age category. Each category carries a coefficient used in the level computation and the
 * monthly probability of a werewolf of this category to turn into a human.
 */
public enum AgeCategory {
    YOUNG("young", 0.5, 0.01),
    ADULT("adult", 1.0, 0.02),
    OLD("old", 0.7, 0.06);

    private final String label;
    private final double levelCoefficient;
    private final double transformationRate;

    AgeCategory(String label, double levelCoefficient, double transformationRate) {
        this.label = label;
        this.levelCoefficient = levelCoefficient;
        this.transformationRate = transformationRate;
    }

    public String getLabel() {
        return label;
    }

    public double getLevelCoefficient() {
        return levelCoefficient;
    }

    public double getTransformationRate() {
        return transformationRate;
    }

    /** Category of a creature of the given age: young under 2, adult under 10, old from 10. */
    public static AgeCategory fromAge(int ageYears) {
        if (ageYears < 2) {
            return YOUNG;
        }
        if (ageYears < 10) {
            return ADULT;
        }
        return OLD;
    }
}
