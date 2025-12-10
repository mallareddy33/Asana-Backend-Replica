package com.asana.replica.repository;

import com.asana.replica.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SectionRepository extends JpaRepository<Section, String> {

    List<Section> findByProject_Id(String projectId);
}
