package fr.amu.iut.noel.exception;

/**
 * Exception thrown when a storage reserve does not have enough food of the requested type.
 */
public class InsufficientFoodException extends VillageException {

    /**
     * Constructs a new {@code InsufficientFoodException} with the specified detail message.
     *
     * @param message the detail message
     */
    public InsufficientFoodException(String message) {
        super(message);
    }
}
