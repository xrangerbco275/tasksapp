package com.jcruz.taskapp.service;

import com.jcruz.taskapp.domain.Tasks;
import com.jcruz.taskapp.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class TaskServiceImpl implements TaskService
{
    @Autowired
    TaskRepository taskRepository;

    @Override
    public Iterable<Tasks> list()
    {
        return taskRepository.findAll();
    }

    @Override
    public Tasks save(Tasks task)
    {
        return taskRepository.save(task);
    }
}
