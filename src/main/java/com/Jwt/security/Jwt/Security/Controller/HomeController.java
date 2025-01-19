package com.Jwt.security.Jwt.Security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String homeWelcome(){
        return "Hello from JWT security zone";
    }
}
