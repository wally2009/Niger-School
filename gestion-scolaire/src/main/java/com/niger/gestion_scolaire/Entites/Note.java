package com.niger.gestion_scolaire.Entites;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "notes")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eleve_id", nullable = false)
    private Eleve eleve;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "matiere_id", nullable = false)
    private Matiere matiere;

    @Column(nullable = false)
    private Double valeur; // Note sur 20

    @Enumerated(EnumType.STRING)
    private TypeEvaluation typeEvaluation;

    private LocalDate dateEvaluation;
    private String commentaire;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enseignant_id")
    private User enseignant;

    // Constructeurs, getters et setters
    public Note() {}

    public Note(Eleve eleve, Matiere matiere, Double valeur, TypeEvaluation typeEvaluation) {
        this.eleve = eleve;
        this.matiere = matiere;
        this.valeur = valeur;
        this.typeEvaluation = typeEvaluation;
        this.dateEvaluation = LocalDate.now();
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Eleve getEleve() { return eleve; }
    public void setEleve(Eleve eleve) { this.eleve = eleve; }

    public Matiere getMatiere() { return matiere; }
    public void setMatiere(Matiere matiere) { this.matiere = matiere; }

    public Double getValeur() { return valeur; }
    public void setValeur(Double valeur) { this.valeur = valeur; }

    public TypeEvaluation getTypeEvaluation() { return typeEvaluation; }
    public void setTypeEvaluation(TypeEvaluation typeEvaluation) { this.typeEvaluation = typeEvaluation; }

    public LocalDate getDateEvaluation() { return dateEvaluation; }
    public void setDateEvaluation(LocalDate dateEvaluation) { this.dateEvaluation = dateEvaluation; }

    public String getCommentaire() { return commentaire; }
    public void setCommentaire(String commentaire) { this.commentaire = commentaire; }

    public User getEnseignant() { return enseignant; }
    public void setEnseignant(User enseignant) { this.enseignant = enseignant; }




}