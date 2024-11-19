package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
    
    List<Projet> findByName(String name);

    @Query("SELECT p FROM Projet p JOIN FETCH p.tasks WHERE p.name = :name")
    List<Projet> findByNameWithTasks(@Param("name") String name);

    @Query("SELECT p FROM Projet p JOIN FETCH p.tasks")
    List<Projet> findAllWithTasks();
}
