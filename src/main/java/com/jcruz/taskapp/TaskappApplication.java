package com.jcruz.taskapp;

import com.jcruz.taskapp.domain.Tasks;
import com.jcruz.taskapp.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.UUID;

@SpringBootApplication
public class TaskappApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(TaskappApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService)
    {
        return args ->
        {
            taskService.save(Tasks.builder().id(UUID.randomUUID()).name("Create Spring Boot Application").dueDate(LocalDate.now()).completed(true).build());
            taskService.save(Tasks.builder().id(UUID.randomUUID()).name("Create Spring Project Packages").dueDate(LocalDate.now()).completed(true).build());
            taskService.save(Tasks.builder().id(UUID.randomUUID()).name("Create Task Domain classes").dueDate(LocalDate.now()).completed(true).build());
            taskService.save(Tasks.builder().id(UUID.randomUUID()).name("Create Service and Repository classes").dueDate(LocalDate.now()).completed(true).build());
            taskService.save(Tasks.builder().id(UUID.randomUUID()).name("Create Command Line Runner to load date").dueDate(LocalDate.now()).completed(true).build());
            taskService.save(Tasks.builder().id(UUID.randomUUID()).name("Create Required Configuaration properties").dueDate(LocalDate.now()).completed(true).build());
            taskService.save(Tasks.builder().id(UUID.randomUUID()).name("Run the Spring boot Application").dueDate(LocalDate.now()).completed(true).build());
            taskService.save(Tasks.builder().id(UUID.randomUUID()).name("Check the H2 console for the initial data").dueDate(LocalDate.now()).completed(true).build());

        };
    }
}
