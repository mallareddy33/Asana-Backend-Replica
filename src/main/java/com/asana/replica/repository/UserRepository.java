package com.asana.replica.repository;

import com.asana.replica.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    List<User> findByWorkspace_Id(String workspaceId);
}
