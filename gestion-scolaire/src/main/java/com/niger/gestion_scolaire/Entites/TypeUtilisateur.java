package com.niger.gestion_scolaire.Entites;

public enum TypeUtilisateur {

    DIRECTEUR("Directeur", "ROLE_DIRECTEUR"),
    MANAGER("Manager", "ROLE_MANAGER"),
    ENSEIGNANT("Enseignant", "ROLE_ENSEIGNANT"),
    CENTRE_INFO("Centre d'Information", "ROLE_CENTRE_INFO"),
    PARENT("Parent", "ROLE_PARENT"),
    ELEVE("Élève", "ROLE_ELEVE");

    private final String libelle;
    private final String role;

    TypeUtilisateur(String libelle, String role) {
        this.libelle = libelle;
        this.role = role;
    }
    public String getLibelle() { return libelle; }
    public String getRole() { return role; }
}
