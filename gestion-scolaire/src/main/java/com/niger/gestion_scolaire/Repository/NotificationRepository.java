package com.niger.gestion_scolaire.Repository;

import com.niger.gestion_scolaire.Entites.TypeNotification;
import com.niger.gestion_scolaire.Entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.management.Notification;
import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long>{
    List<Notification> findByDestinataire(User destinataire);
    List<Notification> findByDestinataireAndLueFalse(User destinataire);
    List<Notification> findByType(TypeNotification type);
    List<Notification> findByDestinataireOrderByDateEnvoiDesc(User destinataire);

}
