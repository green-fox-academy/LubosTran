package com.rest.json.demorest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class index {

    @GetMapping("/")
    public String display(){
        return "index";
    }
}
