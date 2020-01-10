package com.example.springbootdocker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InformationController {

    @GetMapping("/info")
    public ResponseEntity info() {
        return ResponseEntity.ok().body("Everything is good.");
    }
}
