package com.niger.gestion_scolaire.Entites;

import jakarta.persistence.*;

import java.time.LocalDate;

public class Presence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eleve_id", nullable = false)
    private Eleve eleve;

    @Column(nullable = false)
    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private StatutPresence statut;

    private String motif; // En cas d'absence
    private String commentaire;

    // Constructeurs, getters et setters
    public Presence() {}

    public Presence(Eleve eleve, LocalDate date, StatutPresence statut) {
        this.eleve = eleve;
        this.date = date;
        this.statut = statut;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Eleve getEleve() { return eleve; }
    public void setEleve(Eleve eleve) { this.eleve = eleve; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public StatutPresence getStatut() { return statut; }
    public void setStatut(StatutPresence statut) { this.statut = statut; }

    public String getMotif() { return motif; }
    public void setMotif(String motif) { this.motif = motif; }

    public String getCommentaire() { return commentaire; }
    public void setCommentaire(String commentaire) { this.commentaire = commentaire; }
}


