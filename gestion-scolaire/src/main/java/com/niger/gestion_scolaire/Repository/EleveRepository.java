package com.niger.gestion_scolaire.Repository;

import com.niger.gestion_scolaire.Entites.Classe;
import com.niger.gestion_scolaire.Entites.Eleve;
import com.niger.gestion_scolaire.Entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EleveRepository extends JpaRepository {
    Optional<Eleve> findByNumeroMatricule(String numeroMatricule);
    List<Eleve> findByUtilisateur(User parent);
    List<Eleve> findByClasse(Classe classe);
    List<Eleve> findByActifTrue();

}
