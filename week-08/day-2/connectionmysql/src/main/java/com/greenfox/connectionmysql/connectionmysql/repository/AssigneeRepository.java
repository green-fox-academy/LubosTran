package com.greenfox.connectionmysql.connectionmysql.repository;

import com.greenfox.connectionmysql.connectionmysql.model.Assignee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
    @Query("SELECT a FROM Assignee a WHERE a.name LIKE %?1%")
    List<Assignee> findNameLike(@Param("text")String name);
}
