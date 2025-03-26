package com.kisanconnect.main_backend.Service.Token;

import com.kisanconnect.main_backend.Entity.Token.JwtToken;
import com.kisanconnect.main_backend.Repository.Token.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    @Autowired
    private TokenRepository tokenRepository;

//    @CachePut(value = "tokens", key = "#token.id")
    public JwtToken saveToken(JwtToken token) {
        return tokenRepository.save(token);
    }

//    @Cacheable(value = "tokens", key = "#token")
    public JwtToken getToken(String token) {
        return tokenRepository.findByToken(token);
    }

//    @CacheEvict(value = "tokens", key = "#token")
    public void deleteToken(String token) {
        JwtToken jwtToken = tokenRepository.findByToken(token);
        if (jwtToken != null) {
            tokenRepository.deleteById(jwtToken.getId());
        }
    }
}
