package com.jcruz.taskapp.controller;

import com.jcruz.taskapp.domain.Tasks;
import com.jcruz.taskapp.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/tasks")
public class TaskController
{

    @Autowired
    TaskService taskService;

    @GetMapping(value = {"", "/"})
    public Iterable<Tasks> listTask()
    {
        return taskService.list();
    }

    @PostMapping("/save")
    public Tasks saveTask(@RequestBody Tasks task)
    {
        return this.taskService.save(task);
    }
}
