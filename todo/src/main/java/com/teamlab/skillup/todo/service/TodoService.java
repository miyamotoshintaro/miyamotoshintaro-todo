package com.teamlab.skillup.todo.service;

import com.teamlab.skillup.todo.entity.Todo;
import com.teamlab.skillup.todo.form.TodoForm;
import com.teamlab.skillup.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/** Todo Service */
@Service
@Transactional
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    /**
     * Todo情報を全件取得する
     *
     * @return Todo情報
     */
    public List<Todo> searchAllTodo() {
        return todoRepository.findAll();
    }

    /**
     * Todo情報を保存する
     *
     * @param todoForm
     */
    public void saveTodo(TodoForm todoForm) {
        todoRepository.save(Todo.of(todoForm));
    }
}