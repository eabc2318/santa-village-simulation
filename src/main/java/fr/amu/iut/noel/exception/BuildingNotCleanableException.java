package fr.amu.iut.noel.exception;

/**
 * Exception thrown when attempting to clean a building that is either not dirty or not empty.
 */
public class BuildingNotCleanableException extends VillageException {

    /**
     * Constructs a new {@code BuildingNotCleanableException} with the specified detail message.
     *
     * @param message the detail message
     */
    public BuildingNotCleanableException(String message) {
        super(message);
    }
}
