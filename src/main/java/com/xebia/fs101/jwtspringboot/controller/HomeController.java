package com.xebia.fs101.jwtspringboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class HomeController {

    @GetMapping("/rest/hello")
    public ResponseEntity<?> home() {
        return new ResponseEntity<>("Home page should be visible to everyone except PHP developers", OK);
    }

//    @GetMapping("/secured")
//    public ResponseEntity<?> secured(){
//        return new ResponseEntity<>("Secured page",OK);
//    }
}
