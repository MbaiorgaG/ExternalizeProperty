package com.sdl.externalizeproperty.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/")
    public ResponseEntity<String> homeApi(){
        return ResponseEntity.ok().body("Application running fine");
    }
}
