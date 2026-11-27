package fr.amu.iut.noel.lycanthrope;

public enum HowlType {
    PACK_BELONGING("Pack belonging"),
    DOMINATION("Domination"),
    SUBMISSION("Submission"),
    AGGRESSION("Aggression");

    private final String label;

    HowlType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
