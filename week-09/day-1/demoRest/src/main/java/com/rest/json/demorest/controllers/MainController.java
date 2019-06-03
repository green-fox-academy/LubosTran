package com.rest.json.demorest.controllers;

import com.rest.json.demorest.models.ErrorMessage;
import com.rest.json.demorest.models.Greeter;
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
    public Object greeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title){
        Greeter aPerson = new Greeter("Petike","student");
        if(name == null && title == null){
            return new ErrorMessage("aaaaaaaaaaa");
        }

        if(!name.isEmpty() && !title.isEmpty()){
            return new Greeter(name, title);
        }else return new ErrorMessage("{\n" +
                "  \"error\": \"Please provide a title!\"\n" +
                "}\n" +
                "```json\n" +
                "{\n" +
                "  \"error\": \"Please provide a name!\"\n" +
                "}");
    }

    @GetMapping("/appenda/{appendable}")
    public Object append(@PathVariable String something,@PathVariable String appendable){
        return
    }

    }


