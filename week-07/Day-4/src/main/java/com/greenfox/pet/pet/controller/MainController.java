package com.greenfox.pet.pet.controller;

import com.greenfox.pet.pet.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    private List<Fox> foxes = new ArrayList<>();


    @GetMapping("/")
    public String index(@RequestParam String name, Model model){
        Fox fox1 = new Fox("Green Fox","salat","water");
        foxes.add(fox1);

        model.addAttribute("tricks", fox1.getTricks());
        model.addAttribute("fox",fox1);
        model.addAttribute("introduction", "This is " + fox1.getName() +". Currently living on "+fox1.getFood()+ " and drink "+fox1.getDrink()+". He knows "+ fox1.getTricks().size() +" trick(s).");
        model.addAttribute("err","This " + fox1.getName()+" doesn't know any trick yet");
        return "index";

    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login1( Model model){
       //model.addAttribute("nameErr","You have provided a name that has not been used before, add it as a new one!");
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam String name, Model model){
        model.addAttribute("foxName",name);
        model.addAttribute("checkName","");
        /*if (!name.equals(fox1.getName())  || name.isEmpty()){
            model.addAttribute("nameErr","You have provided a name that has not been used before, add it as a new one!");
            return "redirect:/login=?err=" + name;
        }else*/
        return "redirect:/" + "?name=" +name;
    }

    @RequestMapping("/nutrition")
    public String nutri( Model model){
        return "nutrition";
    }
}
