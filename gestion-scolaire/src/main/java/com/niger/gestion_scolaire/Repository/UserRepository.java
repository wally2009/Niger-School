package com.niger.gestion_scolaire.Repository;

import com.niger.gestion_scolaire.Entites.TypeUtilisateur;
import com.niger.gestion_scolaire.Entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{

    Optional<User> findByNomUtilisateur(String nomUtilisateur);
    List<User> findByTypeUtilisateur(TypeUtilisateur typeUtilisateur);
    List<User> findByActifTrue();


}
