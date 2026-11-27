package fr.amu.iut.noel.simulation;

import fr.amu.iut.noel.model.*;
import fr.amu.iut.noel.character.*;
import fr.amu.iut.noel.creatures.*;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    private static int day = 27;
    private static int month = 11;
    private static int year = 2026;

    // private SantaClaus santa = new SantaClaus();
    // private Building[] buildings = ;
    private static List<Actor> actors = new ArrayList<>();

    /**
     * Allows to display all the actors currently in the simulation
     */
    public static void display_actors() {
        System.out.println("Acteurs actuelles dans la simulation:");
        int creature_count = 0;
        int humanoid_count = 0;
        for (Actor actor : actors) {
            if (actor instanceof Creature) {
                creature_count+=1;
            } else if (actor instanceof Humanoid) {
                humanoid_count+=1;
            } else {
                System.out.println(actor.getClass());
            }
        }
        System.out.println("Il y a: " + creature_count + " creatures");
        System.out.println("Il y a: " + humanoid_count + " humanoïdes");
    }

    /**
     * Allows to initialize every building of the village in the simulation
     */
    public static void init_buildings() {

    }

    /**
     * Allows to initialize every actors of the village in the simulation
     */
    public static void init_actors() {
        Actor ewanPrankeur = new PranksterImp("Ewan", Gender.MALE, 19);
        Actor thomasLycanthrope = new Lycanthrope("Thomas", Gender.MALE, 19);

        actors.add(ewanPrankeur);
        actors.add(thomasLycanthrope);
    }

    /**
     * Allows to call all of the init methods for the different parts of the simulation
     */
    public static void init_simulation() {
        // Initializing buildings
        init_buildings();
        // Initializing actors
        init_actors();
    }

    /**
     * Allows to make the simulation move from a single step
     */
    public static void step_simulation() {

    }

    /**
     * Main function
     * @param args
     */
    public static void main(String[]args) {
        // Init
        init_simulation();
        // Run the simulation for n steps
        int n = 10;
        for (int i=1; i < n; i++) {
            step_simulation();
        }
        // Display
        display_actors();
    }
}
