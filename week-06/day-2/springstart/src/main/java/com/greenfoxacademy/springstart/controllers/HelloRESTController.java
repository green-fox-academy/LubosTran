package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {


    @RequestMapping(value = "/greeting", produces = "application/json")
    public Greeting greeting (@RequestParam String name){
        Greeting greeting = new Greeting(  "Hello, " +name);

        return greeting;
    }
}
