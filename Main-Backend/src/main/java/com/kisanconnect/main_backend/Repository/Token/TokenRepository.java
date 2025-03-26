package com.kisanconnect.main_backend.Repository.Token;

import com.kisanconnect.main_backend.Entity.Token.JwtToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<JwtToken, String> {

    JwtToken findByToken(String token);
}
