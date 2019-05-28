package com.greenfox.connectionmysql.connectionmysql.repository;
import com.greenfox.connectionmysql.connectionmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
