package com.JWTSpringSecurity.JWTSecurity.Controller;

import com.JWTSpringSecurity.JWTSecurity.Model.JwtUser;
import com.JWTSpringSecurity.JWTSecurity.Security.JwtGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {
    @PostMapping("/{userName}")
    public String generate(@RequestBody final JwtUser jwtUser) {
        JwtGenerator jwtGenerator = new JwtGenerator();
        return jwtGenerator.generate(jwtUser);
    }

}
