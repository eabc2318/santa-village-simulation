package fr.amu.iut.noel.lycanthrope;

public enum Rank {
    ALPHA('α'), BETA('β'),
    GAMMA('γ'), DELTA('δ'),
    EPSILON('ε'), ZETA('ζ'),
    THETA('θ'), IOTA('ι'),
    KAPPA('κ'), LAMBDA('λ'),
    MU('μ'), NU('ν'),
    XI('ξ'), OMICRON('ο'),
    PI('π'), RHO('ρ'),
    SIGMA('σ'), TAU('τ'),
    UPSILON('υ'), PHI('φ'),
    CHI('χ'), PSI('ψ'),
    OMEGA('ω');

    private final char symbol;

    Rank(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public boolean dominates(Rank other) {
        return this.ordinal() < other.ordinal();
    }

    public Rank getHigherRank() {
        int index = this.ordinal();
        if (index > 0) {
            return Rank.values()[index - 1];
        }
        return null;
    }
}
