package com.greenfox.connectionmysql.connectionmysql;


import com.greenfox.connectionmysql.connectionmysql.model.Todo;
import com.greenfox.connectionmysql.connectionmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ConnectionmysqlApplication implements CommandLineRunner {

    @Autowired
    TodoRepository todoRepository;

    public static void main(String[] args) {
        SpringApplication.run(ConnectionmysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Todo> todoList = new ArrayList<>(Arrays.asList(
                new Todo("Brush my tits", true,true),
                new Todo("Clean my armpit", false, true),
                new Todo("Sharpen my sword", false, true),
                new Todo("Kill anyone who dare to cross me", true, false)
        ));
        todoList.stream()
                .forEach(todo -> todoRepository.save(todo));


    }
}
