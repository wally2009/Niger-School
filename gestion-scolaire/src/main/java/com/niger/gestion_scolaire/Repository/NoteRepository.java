package com.niger.gestion_scolaire.Repository;

import com.niger.gestion_scolaire.Entites.Eleve;
import com.niger.gestion_scolaire.Entites.Matiere;
import com.niger.gestion_scolaire.Entites.Note;
import com.niger.gestion_scolaire.Entites.TypeEvaluation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByEleve(Eleve eleve);
    List<Note> findByEleveAndMatiere(Eleve eleve, Matiere matiere);
    List<Note> findByTypeEvaluation(TypeEvaluation evaluation);
    List<Note> findByDateEvaluationBetween(LocalDate debut, LocalDate fin);
}
