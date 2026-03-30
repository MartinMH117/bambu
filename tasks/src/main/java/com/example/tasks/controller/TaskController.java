package com.example.tasks.controller;

import com.example.tasks.model.Task;
import com.example.tasks.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskRepository taskRepository;

    @PostMapping
    public Task create(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @GetMapping
    public Page<Task> getTasks(Long user, Pageable pageable) {
        return taskRepository.findByUser(user, pageable);
    }
}