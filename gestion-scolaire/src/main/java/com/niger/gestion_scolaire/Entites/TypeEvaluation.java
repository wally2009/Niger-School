package com.niger.gestion_scolaire.Entites;

public enum TypeEvaluation {
    DEVOIR("Devoir"),
    COMPOSITION("Composition"),
    INTERROGATION("Interrogation"),
    EXAMEN("Examen");

    private final String libelle;

    TypeEvaluation(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() { return libelle; }
}
