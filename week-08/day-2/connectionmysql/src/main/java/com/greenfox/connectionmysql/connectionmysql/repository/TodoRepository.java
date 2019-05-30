package com.greenfox.connectionmysql.connectionmysql.repository;
import com.greenfox.connectionmysql.connectionmysql.model.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

     List<Todo> findAllByTitle (String title);

     @Query( "SELECT t FROM Todo t WHERE t.title LIKE ?1%")
    List<Todo> findTodoLikeText (@Param("text") String wutever);
}
