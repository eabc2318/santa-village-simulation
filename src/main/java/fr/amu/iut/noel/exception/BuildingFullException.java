package fr.amu.iut.noel.exception;

/**
 * Exception thrown when attempting to add a character to a building that has reached its maximum capacity.
 */
public class BuildingFullException extends VillageException {

    /**
     * Constructs a new {@code BuildingFullException} with the specified detail message.
     *
     * @param message the detail message
     */
    public BuildingFullException(String message) {
        super(message);
    }
}
