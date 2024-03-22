package com.example.tpspringmvc.web;

import org.springframework.web.bind.annotation.GetMapping;

public class SecurityController {

    @GetMapping("/notAuthorized")
    public String notAuthorized(){
        return "notAuthorized";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
