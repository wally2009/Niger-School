package com.niger.gestion_scolaire.Entites;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
public class Notifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titre;

    @Column(length = 1000)
    private String message;

    @Enumerated(EnumType.STRING)
    private TypeNotification type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "destinataire_id")
    private User destinataire;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "expediteur_id")
    private User expediteur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eleve_id")
    private Eleve eleveConnecte; // Pour les notifications concernant un élève

    private LocalDateTime dateEnvoi = LocalDateTime.now();
    private boolean lue = false;

    // Constructeurs, getters et setters
    public Notifications() {}

    public Notifications(String titre, String message, TypeNotification type,
                         User destinataire, User expediteur) {
        this.titre = titre;
        this.message = message;
        this.type = type;
        this.destinataire = destinataire;
        this.expediteur = expediteur;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public TypeNotification getType() { return type; }
    public void setType(TypeNotification type) { this.type = type; }

    public User getDestinataire() { return destinataire; }
    public void setDestinataire(User destinataire) { this.destinataire = destinataire; }

    public User getExpediteur() { return expediteur; }
    public void setExpediteur(User expediteur) { this.expediteur = expediteur; }

    public Eleve getEleveConnecte() { return eleveConnecte; }
    public void setEleveConnecte(Eleve eleveConnecte) { this.eleveConnecte = eleveConnecte; }

    public LocalDateTime getDateEnvoi() { return dateEnvoi; }
    public void setDateEnvoi(LocalDateTime dateEnvoi) { this.dateEnvoi = dateEnvoi; }

    public boolean isLue() { return lue; }
    public void setLue(boolean lue) { this.lue = lue; }
}