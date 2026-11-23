package fr.amu.iut.noel.lycanthrope;

public class Lycanthropes {

    public static final String SOLITAIRE = "solitaire";

    private String nom;
    private final Sexe sexe;
    private CategorieAge categorieAge;
    private int force;
    private int dominationsExercees;
    private int dominationsSubies;
    private int rang; 
    private double impetuosite; 
    private String meute; 

    public Lycanthropes(
            String nom,
            Sexe sexe,
            CategorieAge categorieAge,
            int force,
            int dominationsExercees,
            int dominationsSubies,
            int rang,
            double impetuosite,
            String meute
    ) 
    {
        this.nom = nom;
        this.sexe = sexe;
        this.categorieAge = categorieAge;
        this.force = force;
        this.dominationsExercees = dominationsExercees;
        this.dominationsSubies = dominationsSubies;
        setMeute(meute, rang);
        this.impetuosite = impetuosite;
    }

    public void setMeute(String meute, int rang) {
        this.meute = meute;
        this.rang = rang;
    }

    public enum Sexe {
        MALE,
        FEMELLE,
        BISEXUELLE
    }

    public enum CategorieAge {
        JEUNE(0.0),
        ADULTE(1.0),
        VIEUX(2.0);

        private final double factor;

        CategorieAge(double factor) {
            this.factor = factor;
        }

        public double getFactor() {
            return factor;
        }
    }

   

 
    public int getFacteurDomination() {
        return dominationsExercees - dominationsSubies;
    }
}
