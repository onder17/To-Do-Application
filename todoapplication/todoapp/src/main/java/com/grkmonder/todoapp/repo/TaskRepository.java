package com.grkmonder.todoapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grkmonder.todoapp.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
	

}
