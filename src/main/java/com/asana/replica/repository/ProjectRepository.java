package com.asana.replica.repository;

import com.asana.replica.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, String> {

    List<Project> findByWorkspace_Id(String workspaceId);

    List<Project> findByTeam_Id(String teamId);
}
