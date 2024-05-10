package com.konaesan.controller;

import com.konaesan.domain.Task;
import com.konaesan.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController
{
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping( value = {"", "/"})
    public Iterable<Task> getTasks() {
        return this.taskService.list();
    }

    @PostMapping(value = {"", "/"})
    public Task createTask(@RequestBody Task task) {
        return this.taskService.save(task);
    }

    @PutMapping(value = {"", "/"})
    public Task updateTask(@RequestBody Task task) {
        return this.taskService.save(task);
    }
}
