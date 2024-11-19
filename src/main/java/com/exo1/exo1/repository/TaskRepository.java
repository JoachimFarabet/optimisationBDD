package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByTitle(String title);

    @Query("SELECT t FROM Task t JOIN FETCH t.projet WHERE t.title = :title")
    List<Task> findByTitleWithProject(@Param("title") String title);

    @Query("SELECT t FROM Task t JOIN FETCH t.projet")
    List<Task> findAllWithProjects();
}
