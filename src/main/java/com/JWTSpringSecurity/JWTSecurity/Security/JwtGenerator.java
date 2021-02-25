package com.JWTSpringSecurity.JWTSecurity.Security;

import com.JWTSpringSecurity.JWTSecurity.Model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtGenerator {

    public String generate(JwtUser jwtuser) {
        //Returns Json Web Token
        Claims claims = Jwts.claims()
                .setSubject(jwtuser.getUserName());
        claims.put("userId",String.valueOf(jwtuser.getUserId()));
        claims.put("role",jwtuser.getRole());

        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.ES512,"ThisIsASecret")
                .compact();
    }
}
