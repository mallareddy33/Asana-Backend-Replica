package com.asana.replica.repository;

import com.asana.replica.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, String> {

    List<Task> findByProjects_Id(String projectId);

    List<Task> findByTags_Id(String tagId);

    // >>> NEW: tasks in a given section <<<
    List<Task> findBySections_Id(String sectionId);
}
