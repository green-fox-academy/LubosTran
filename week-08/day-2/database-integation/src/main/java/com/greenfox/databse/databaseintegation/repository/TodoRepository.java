package com.greenfox.databse.databaseintegation.repository;


import com.greenfox.databse.databaseintegation.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
