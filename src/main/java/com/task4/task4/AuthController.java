package com.task4.task4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private static final Logger LOG=  LoggerFactory.getLogger(AuthController.class);

    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    private final TokenService tokenService;

    @PostMapping("/token")
    public String token(Authentication authentication){
        LOG.debug("Token requested for user; '{}'",authentication.getName());
        String token=tokenService.generateToken(authentication);
        LOG.debug("Token Granted {} ",token);
        return token;
    }
}
