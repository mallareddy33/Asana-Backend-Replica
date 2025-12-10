package com.asana.replica.repository;

import com.asana.replica.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag, String> {

    List<Tag> findByWorkspace_Id(String workspaceId);
}

