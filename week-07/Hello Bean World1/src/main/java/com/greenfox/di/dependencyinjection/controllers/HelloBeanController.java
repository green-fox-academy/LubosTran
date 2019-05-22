package com.greenfox.di.dependencyinjection.controllers;

import com.greenfox.di.dependencyinjection.HelloBeanWorldApplication;
import com.greenfox.di.dependencyinjection.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HelloBeanController {

    private UtilityService utilityService;
    List<String> links = Arrays.asList("/useful/colored", "/useful/email");

    @Autowired
    HelloBeanController (UtilityService utilityService){
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful")
    public String usefulLinks(Model model){
        String home = "/useful";
        String colored = "/useful/colored";
        String email = "/useful/email";
        model.addAttribute("home", home);
        model.addAttribute("colored", colored);
        model.addAttribute("email", email);
        return "index";
    }

    @RequestMapping("/useful/colored")
    public String colorBg (Model model){
        String style = "background-color: " +utilityService.randomColor()+";";
        model.addAttribute("style",style);
        return "Colorful";
    }

    @RequestMapping("/useful/email")
    public String emailValidation (@RequestParam String email, Model model){

        model.addAttribute("email", email);
        model.addAttribute("check",utilityService.validateEmail(email));
        model.addAttribute("style", "color: green;");
        return "emailValidator";
    }

}
