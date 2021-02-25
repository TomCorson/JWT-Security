package com.JWTSpringSecurity.JWTSecurity.Security;

import com.JWTSpringSecurity.JWTSecurity.Model.JwtAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtAuthenticationTokenFilter extends AbstractAuthenticationProcessingFilter {
    public JwtAuthenticationTokenFilter() {
        super("/**");
    }
    @Override
    public Authentication attemptAuthentication(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws AuthenticationException, IOException, ServletException {
       String header = httpServletRequest.getHeader("Authorization");
       if(header==null || !header.startsWith("Token ")){
           throw new RuntimeException("Jwt Token is missing");
       }
       String authenticationToken = header.substring(6);
       JwtAuthenticationToken token = new JwtAuthenticationToken(authenticationToken);

        return getAuthenticationManager().authenticate(token);
    }

}













