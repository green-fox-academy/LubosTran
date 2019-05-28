package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.SomeWebsite;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @RequestMapping("/form")
    public String form (Model model){
        SomeWebsite[] someWebsites = {

        };


        model.addAttribute("name", "Tom");
        model.addAttribute("formatted", "<b>blue</b>");
        model.addAttribute("resources", someWebsites);
        model.addAttribute("shouldRenderResources", someWebsites.length ==0);
        return "testGETPOST";
    }

    @RequestMapping("/welcome")
    public String welcome (@RequestParam String addressing, String firstName, String lastName, Model model){
        model.addAttribute("welmes", "Welcome"+addressing+" "+firstName+" "+lastName+"!");

        return "welcome";
    }


}
