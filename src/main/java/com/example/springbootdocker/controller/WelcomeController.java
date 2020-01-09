package com.example.springbootdocker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class WelcomeController {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public ResponseEntity sayHi() {
        return ResponseEntity.ok("Hello Spring-Boot-Docker");
    }

    @RequestMapping(value = "/throw", method = RequestMethod.GET)
    public ResponseEntity throwException() {
        throw new NullPointerException("Thrown Exception");
    }
}
