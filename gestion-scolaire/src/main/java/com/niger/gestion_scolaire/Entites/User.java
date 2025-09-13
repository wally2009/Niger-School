package com.niger.gestion_scolaire.Entites;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "utilisateurs")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nomUtilisateur;

    @Column(nullable = false)
    private String motDePasse;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    private String email;
    private String telephone;

    @Enumerated(EnumType.STRING)
    private TypeUtilisateur typeUtilisateur;

    private boolean actif = true;
    private LocalDateTime dateCreation = LocalDateTime.now();

    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    private Set<Eleve> enfants; // Pour les parents

    // Constructeurs, getters et setters
    public User() {}

    public User(String nomUtilisateur, String motDePasse, String nom, String prenom,
                TypeUtilisateur typeUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
        this.nom = nom;
        this.prenom = prenom;
        this.typeUtilisateur = typeUtilisateur;
    }

// Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNomUtilisateur() { return nomUtilisateur; }
    public void setNomUtilisateur(String nomUtilisateur) { this.nomUtilisateur = nomUtilisateur; }

    public String getMotDePasse() { return motDePasse; }
    public void setMotDePasse(String motDePasse) { this.motDePasse = motDePasse; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public TypeUtilisateur getTypeUtilisateur() { return typeUtilisateur; }
    public void setTypeUtilisateur(TypeUtilisateur typeUtilisateur) { this.typeUtilisateur = typeUtilisateur; }

    public boolean isActif() { return actif; }
    public void setActif(boolean actif) { this.actif = actif; }

    public LocalDateTime getDateCreation() { return dateCreation; }
    public void setDateCreation(LocalDateTime dateCreation) { this.dateCreation = dateCreation; }

    public Set<Eleve> getEnfants() { return enfants; }
    public void setEnfants(Set<Eleve> enfants) { this.enfants = enfants; }
    }
