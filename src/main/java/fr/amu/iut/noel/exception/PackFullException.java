package fr.amu.iut.noel.exception;

/** Thrown when a werewolf is added to a pack that has reached its capacity. */
public class PackFullException extends Exception {


    public PackFullException(String message) {
        super(message);
    }
}
