package com.example.backend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @CrossOrigin(origins = "*") // For PoC; restrict later
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from Java!";
    }
}
