package fr.amu.iut.noel.exception;

/**
 * Exception thrown when Santa Claus attempts to perform an action after reaching the per-turn action limit.
 */
public class ActionLimitExceededException extends VillageException {

    /**
     * Constructs a new {@code ActionLimitExceededException} with the specified detail message.
     *
     * @param message the detail message
     */
    public ActionLimitExceededException(String message) {
        super(message);
    }
}
