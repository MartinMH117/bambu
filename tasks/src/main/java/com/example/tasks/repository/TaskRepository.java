package com.example.tasks.repository;

import com.example.tasks.model.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

    Page<Task> findByUser(Long user, Pageable pageable);

    Page<Task> findByStatus(String status, Pageable pageable);

    Page<Task> findByUserIdAndStatus(Long userId, String status, Pageable pageable);
}