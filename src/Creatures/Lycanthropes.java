public class Lycanthrope{

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

    public Lycanthrope(
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
        this.dominationsExercees = 
        this.dominationsSubies = 
        setMeute(meute, rang);
        this.impetuosite = impetuosite;
    }

    public enum sexe{
        MALE,
        FEMELLE,
        BISEXUELLE

    }

    public enum CategorieAge {
        JEUNE(0.0),
        ADULTE(1.0),
        VIEUX(2.0);

    }

   

 
    public int getFacteurDomination() {
        return dominationsExercees - dominationsSubies;
    }
}
