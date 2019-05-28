package com.greenfox.connectionmysql.connectionmysql.controllers;


import com.greenfox.connectionmysql.connectionmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    TodoController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model){
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }
}
