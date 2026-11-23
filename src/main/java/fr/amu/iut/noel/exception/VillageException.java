package fr.amu.iut.noel.exception;

/**
 * Base checked exception for all business rule violations in Santa's Village.
 */
public class VillageException extends Exception {

    /**
     * Constructs a new {@code VillageException} with the specified detail message.
     *
     * @param message the detail message explaining the reason for the exception
     */
    public VillageException(String message) {
        super(message);
    }

    /**
     * Constructs a new {@code VillageException} with the specified detail message and cause.
     *
     * @param message the detail message explaining the reason for the exception
     * @param cause   the underlying cause of the exception
     */
    public VillageException(String message, Throwable cause) {
        super(message, cause);
    }
}
