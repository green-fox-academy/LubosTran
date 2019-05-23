package com.greenfox.di.dependencyinjection.controllers;

import com.greenfox.di.dependencyinjection.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenfoxClassController {
    private StudentService studentService;


    @Autowired
    GreenfoxClassController (StudentService studentService){
        this.studentService = studentService;
        studentService.save("an idiot");
    }

    @RequestMapping("/gfa")
    public String mainPage(Model model){
           return "gfa";
    }

    @RequestMapping("/gfa/list")
    public String listAll (Model model){
        model.addAttribute("listAll", studentService.findAll());
        return "gfa";
    }

    @RequestMapping("/gfa/add")
    public String addStudent (Model model){
        return "addNewStudent";
    }

    @RequestMapping("/gfa/save")
    public String save (@RequestParam String unicorn, Model model){
        studentService.save(unicorn);
        return "gfa";
    }
}
