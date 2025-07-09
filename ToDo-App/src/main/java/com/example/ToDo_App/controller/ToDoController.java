package com.example.ToDo_App.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.ToDo_App.model.toDo;
import com.example.ToDo_App.service.ToDoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ToDoController {
    private final ToDoService service;

    public ToDoController(ToDoService service) {
        this.service = service;
    }

    @GetMapping
    public String getTask(Model model) {
        List<toDo> tasks = service.getAllTodoItem();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @PostMapping
    public String createTask(@RequestParam String title) {
        service.createTask(title);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
        return "redirect:/";
    }
    
    @GetMapping("/{id}/togle")
    public String togletask(@PathVariable Long id) {
        service.togletask(id);
        return "redirect:/";
    }
    
}
