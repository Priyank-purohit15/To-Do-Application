package com.example.ToDo_App.service;

import java.util.ArrayList;
import java.util.List;

import com.example.ToDo_App.model.toDo;
import com.example.ToDo_App.repo.iTOdorepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    @Autowired
    private final iTOdorepo repo;

    public ToDoService (iTOdorepo repo) {
        this.repo = repo;
    }

    public List<toDo> getAllTodoItem() {
        return repo.findAll();
    }

    public void createTask(String titie) {
        toDo task = new toDo();
        task.setTitle(titie);
        task.setCompleted(false);
        repo.save(task);
    }

    public void deleteTask(Long id) {
        repo.deleteById(id);
    }

    public void togletask(long id) {
        toDo task = repo.findById(id).orElseThrow(() -> new IllegalArgumentException());
        task.setCompleted(!task.isCompleted());
        repo.save(task);

    }

}
