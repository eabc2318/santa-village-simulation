package fr.amu.iut.noel.exception;


/** Thrown when an operation needs an alpha pair and the pack has none. */
public class NoAlphaPairException extends Exception {

    public NoAlphaPairException(String message) {
        super(message);
    }
}
