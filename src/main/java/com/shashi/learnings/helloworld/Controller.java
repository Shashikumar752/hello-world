package com.shashi.learnings.helloworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/say-hello")
    public ResponseEntity<?> sayHello(){
        return new ResponseEntity<String>("hello-world",HttpStatus.OK) ;       
    }
    
}