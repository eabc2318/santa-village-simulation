package fr.amu.iut.noel.exception;

/**
 * Exception thrown when a character is not allowed to enter a specific building
 * (e.g., a creature entering a workshop, or a character entering a non-mixed dormitory of the opposite gender).
 */
public class InvalidBuildingAccessException extends VillageException {

    /**
     * Constructs a new {@code InvalidBuildingAccessException} with the specified detail message.
     *
     * @param message the detail message
     */
    public InvalidBuildingAccessException(String message) {
        super(message);
    }
}
