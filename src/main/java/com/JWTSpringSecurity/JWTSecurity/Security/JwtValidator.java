package com.JWTSpringSecurity.JWTSecurity.Security;

import com.JWTSpringSecurity.JWTSecurity.Model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

@Component
public class JwtValidator {
    private String secret = "ThisIsASecret";

    public Object validate(String token) {
        Claims body = Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();
        JwtUser jwtUser = new JwtUser();
        jwtUser.setUserName(body.getSubject());
        jwtUser.setId(Long.parseLong((String)body.get("userId")));
        jwtUser.setRole((String)body.get("role"));
        return jwtUser;
    }
}













