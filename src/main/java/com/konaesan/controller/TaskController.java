package com.konaesan.controller;

import com.konaesan.domain.Task;
import com.konaesan.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController
{
    @Autowired
    TaskService taskService;

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
