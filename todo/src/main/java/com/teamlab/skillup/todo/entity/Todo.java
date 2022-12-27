package com.teamlab.skillup.todo.entity;

import com.teamlab.skillup.todo.form.TodoForm;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

/** Todo Entity */
@Data
@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private LocalDate deadline;
    private boolean status;

    @CreationTimestamp
    private LocalDateTime createTime;
    @UpdateTimestamp
    private LocalDateTime updateTime;

    public static Todo of(TodoForm _todo){
        var todo = new Todo();
        todo.title = _todo.getTitle();
        todo.deadline = _todo.getDeadline();
        return todo;
    }
}
