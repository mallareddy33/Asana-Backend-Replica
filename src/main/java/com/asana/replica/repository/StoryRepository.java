package com.asana.replica.repository;

import com.asana.replica.model.Story;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StoryRepository extends JpaRepository<Story, String> {

    List<Story> findByTask_Id(String taskId);

    List<Story> findByProject_Id(String projectId);
}

