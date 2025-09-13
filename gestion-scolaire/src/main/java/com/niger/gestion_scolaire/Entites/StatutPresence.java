package com.niger.gestion_scolaire.Entites;

public enum StatutPresence {
    PRESENT("Présent"),
    ABSENT("Absent"),
    RETARD("Retard"),
    ABSENT_JUSTIFIE("Absent Justifié");

    private final String libelle;

    StatutPresence(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() { return libelle; }
}
