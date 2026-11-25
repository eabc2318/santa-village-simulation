package fr.amu.iut.noel.lycanthrope;

public enum Sexe {
    MALE("♂"), FEMELLE("♀");

    private final String symbole;

    Sexe(String symbole) { 
      this.symbole = symbole; 
    }

    public String getSymbole() { 
      return symbole; 
    }
}
