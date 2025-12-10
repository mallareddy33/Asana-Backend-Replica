package com.asana.replica.service;

import com.asana.replica.dto.WorkspaceCreateRequest;
import com.asana.replica.dto.WorkspaceDto;

import java.util.List;

public interface WorkspaceService {

    List<WorkspaceDto> listAll();

    WorkspaceDto getByGid(String workspaceGid);

    WorkspaceDto create(WorkspaceCreateRequest request);
}
