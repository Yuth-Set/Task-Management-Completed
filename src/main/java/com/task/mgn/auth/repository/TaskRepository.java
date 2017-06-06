package com.task.mgn.auth.repository;

import org.springframework.data.repository.CrudRepository;

import com.task.mgn.auth.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{
}
