package com.exo1.exo1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "project_task_count")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectTaskCount {

    @Id
    @Column(name = "project_id")
    private Long projectId;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "task_count")
    private Long taskCount;
}
