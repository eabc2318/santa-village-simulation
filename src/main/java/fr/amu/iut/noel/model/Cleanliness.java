package fr.amu.iut.noel.model;

/**
 * Represents the cleanliness level of a building in Santa's Village.
 */
public enum Cleanliness {
    /** Dirty state; the building requires cleaning when empty. */
    BAD,
    /** Acceptable state. */
    CORRECT,
    /** Clean state. */
    GOOD;

    /**
     * Checks whether this cleanliness level is considered dirty and requires maintenance.
     *
     * @return {@code true} if the cleanliness is {@link #BAD}, {@code false} otherwise
     */
    public boolean isDirty() {
        return this == BAD;
    }
}
