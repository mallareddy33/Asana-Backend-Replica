package com.asana.replica.repository;

import com.asana.replica.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, String> {}

