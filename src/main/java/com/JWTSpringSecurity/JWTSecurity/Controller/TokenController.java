package com.JWTSpringSecurity.JWTSecurity.Controller;

import com.JWTSpringSecurity.JWTSecurity.Model.JwtUser;
import com.JWTSpringSecurity.JWTSecurity.Security.JwtGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {
    private JwtGenerator jwtGenerator;
    public TokenController(JwtGenerator jwtGenerator){
        this.jwtGenerator = jwtGenerator;
    }
    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser) {
        return jwtGenerator.generate(jwtUser);
    }

}
