package com.kisanconnect.main_backend.Repository.Session;

import com.kisanconnect.main_backend.Entity.Session.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SessionRepository extends JpaRepository<Session, String> {

    Optional<Session> findBySessionId(String sessionId);

    
}
