package com.rest.json.demorest.controllers;

import com.rest.json.demorest.models.RestThingy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @GetMapping("/doubling")
    public Object doubling(@RequestParam(required = false) Integer input){


        if(input != null){
            return new RestThingy(input);
        } else {
            return new Error("aaaa") ;
        }
    }

    @GetMapping("/greeter")
    public Object greeting(@PathVariable(required = false) String name, @PathVariable(required = false) String title){
        
    }
}

