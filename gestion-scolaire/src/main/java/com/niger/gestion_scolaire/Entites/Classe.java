package com.niger.gestion_scolaire.Entites;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "classes")
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String niveau; // CP1, CP2, CE1, CE2, CM1, CM2, etc.

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enseignant_id")
    private User enseignantTitulaire;

    private int capaciteMax = 50;

    @OneToMany(mappedBy = "classe", cascade = CascadeType.ALL)
    private Set<Eleve> eleves;

    // Constructeurs, getters et setters
    public Classe() {}

    public Classe(String nom, String niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getNiveau() { return niveau; }
    public void setNiveau(String niveau) { this.niveau = niveau; }

    public User getEnseignantTitulaire() { return enseignantTitulaire; }
    public void setEnseignantTitulaire(User enseignantTitulaire) { this.enseignantTitulaire = enseignantTitulaire; }

    public int getCapaciteMax() { return capaciteMax; }
    public void setCapaciteMax(int capaciteMax) { this.capaciteMax = capaciteMax; }

    public Set<Eleve> getEleves() { return eleves; }
    public void setEleves(Set<Eleve> eleves) { this.eleves = eleves; }
}