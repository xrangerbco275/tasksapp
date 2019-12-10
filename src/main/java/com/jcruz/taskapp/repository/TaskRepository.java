package com.jcruz.taskapp.repository;

import com.jcruz.taskapp.domain.Tasks;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TaskRepository extends CrudRepository<Tasks, UUID>
{


}
