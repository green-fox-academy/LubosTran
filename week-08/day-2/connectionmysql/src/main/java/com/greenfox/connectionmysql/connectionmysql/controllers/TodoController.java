package com.greenfox.connectionmysql.connectionmysql.controllers;


import com.greenfox.connectionmysql.connectionmysql.model.Todo;
import com.greenfox.connectionmysql.connectionmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    TodoController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @GetMapping({"/", "/list"})
    public String list(@RequestParam(required=false)boolean isActive, Model model){
        Iterable<Todo> iterable = this.todoRepository.findAll();
        List<Todo> wasDone = StreamSupport.stream(iterable.spliterator(), false)
                .filter(Todo::isDone).collect(Collectors.toList());
        List<Todo> notDone = StreamSupport.stream(iterable.spliterator(), false)
                .filter(toDo -> !toDo.isDone()).collect(Collectors.toList());

        /*List<Todo> todoList = new ArrayList<>(Arrays.asList(
                new Todo("Brush my tits", true,true),
                new Todo("Clean my armpit", false, true),
                new Todo("Sharpen my sword", false, true),
                new Todo("Kill anyone who dare to cross me", true, false)
        ));
        todoList.forEach(todo -> todoRepository.save(todo));*/

        if(isActive){
            model.addAttribute("todos", wasDone );
        }
        else {
            model.addAttribute("todos", todoRepository.findAll() );
        }

        return "todolist";
    }

    @GetMapping("/add")
    public String addTodo(Model model){
        model.addAttribute("add", new Todo());
        return "addTodo";
    }

    @PostMapping("/add")
    public String save(@ModelAttribute Todo todo){
        todoRepository.save(todo);
        return "redirect:/todo/list";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/delete")
    public String deleteTodo(@PathVariable long id){
         todoRepository.deleteById(id);
         return "redirect:/todo/list";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/edit")
    public String editTodo(@PathVariable long id, Model model){
        model.addAttribute("edit", todoRepository.findById(id).get());
        return "edit";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{id}/edit")
    public String editTodo(@PathVariable Long id, @ModelAttribute Todo todo){
        todo.setId(id);
        todoRepository.findById(id).map(todo1 -> todoRepository.save(todo));
        return "redirect:/todo/list";
    }
}
