package com.niger.gestion_scolaire.Repository;

import com.niger.gestion_scolaire.Entites.Eleve;
import com.niger.gestion_scolaire.Entites.Presence;
import com.niger.gestion_scolaire.Entites.StatutPresence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PresenceRepository extends JpaRepository {
    List<Presence> findByEleve(Eleve eleve);
    List<Presence> findByDateAndEleve(LocalDate date, Eleve eleve);
    List<Presence> findByDateBetween(LocalDate debut, LocalDate fin);
    List<Presence> findByStatus (StatutPresence status);
}
