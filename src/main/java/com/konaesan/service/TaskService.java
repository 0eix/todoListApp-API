package com.konaesan.service;

import com.konaesan.domain.Task;

public interface TaskService
{
    Iterable<Task> list();

    Task save(Task task);
}
