package com.jcruz.taskapp.service;

import com.jcruz.taskapp.domain.Tasks;
import org.springframework.stereotype.Service;

@Service
public interface TaskService
{
    Iterable<Tasks> list();

    Tasks save(Tasks task);
}
