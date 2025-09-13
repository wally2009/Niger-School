package com.niger.gestion_scolaire.Entites;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "eleves")
public class Eleve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String numeroMatricule;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    private LocalDate dateNaissance;
    private String lieuNaissance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private User utilisateur; // Parent

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classe_id")
    private Classe classe;

    @OneToMany(mappedBy = "eleve", cascade = CascadeType.ALL)
    private Set<Note> notes;

    @OneToMany(mappedBy = "eleve", cascade = CascadeType.ALL)
    private Set<Presence> presences;

    private boolean actif = true;

    // Constructeurs, getters et setters
    public Eleve() {}

    public Eleve(String numeroMatricule, String nom, String prenom, LocalDate dateNaissance) {
        this.numeroMatricule = numeroMatricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNumeroMatricule() { return numeroMatricule; }
    public void setNumeroMatricule(String numeroMatricule) { this.numeroMatricule = numeroMatricule; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public LocalDate getDateNaissance() { return dateNaissance; }
    public void setDateNaissance(LocalDate dateNaissance) { this.dateNaissance = dateNaissance; }

    public String getLieuNaissance() { return lieuNaissance; }
    public void setLieuNaissance(String lieuNaissance) { this.lieuNaissance = lieuNaissance; }

    public User getUtilisateur() { return utilisateur; }
    public void setUtilisateur(User utilisateur) { this.utilisateur = utilisateur; }

    public Classe getClasse() { return classe; }
    public void setClasse(Classe classe) { this.classe = classe; }

    public Set<Note> getNotes() { return notes; }
    public void setNotes(Set<Note> notes) { this.notes = notes; }

    public Set<Presence> getPresences() { return presences; }
    public void setPresences(Set<Presence> presences) { this.presences = presences; }

    public boolean isActif() { return actif; }
    public void setActif(boolean actif) { this.actif = actif; }
}