package com.teamlab.skillup.todo.repository;

import com.teamlab.skillup.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/** Todo repository */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByTitleContainingOrderByCreateTime(String title);
}
