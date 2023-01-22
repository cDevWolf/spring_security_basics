package com.afelio.springsecuritybasics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WController {

    @GetMapping("/home")
    public String welcome(){
        return "Welcome";
    }
}
