package com.kisanconnect.main_backend.Repository;

import com.kisanconnect.main_backend.Entity.BlackListedToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BlackListedTokenRepo extends JpaRepository<BlackListedToken, String> {
    Optional<BlackListedToken> findByToken(String token);
}