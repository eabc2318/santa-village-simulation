package fr.amu.iut.noel.exception;

/** Thrown when a werewolf or an enclosure cannot be found by its name. */
public class EntityNotFoundException extends Exception {

  
    public EntityNotFoundException(String message) {
        super(message);
    }
}
