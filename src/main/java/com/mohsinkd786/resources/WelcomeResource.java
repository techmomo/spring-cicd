package com.mohsinkd786.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeResource {

    @GetMapping
    public String sayWelcome(){
        return "Welcome to Spring based CI /CD Project";
    }
}
