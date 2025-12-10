package com.asana.replica.service.impl;

import com.asana.replica.dto.WorkspaceCreateRequest;
import com.asana.replica.dto.WorkspaceDto;
import com.asana.replica.exception.NotFoundException;
import com.asana.replica.mapper.WorkspaceMapper;
import com.asana.replica.model.Workspace;
import com.asana.replica.repository.WorkspaceRepository;
import com.asana.replica.service.WorkspaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkspaceServiceImpl implements WorkspaceService {

    private final WorkspaceRepository workspaceRepository;

    @Override
    @Transactional(readOnly = true)
    public List<WorkspaceDto> listAll() {
        return workspaceRepository.findAll().stream()
                .map(WorkspaceMapper::toDto)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public WorkspaceDto getByGid(String workspaceGid) {
        Workspace ws = workspaceRepository.findById(workspaceGid)
                .orElseThrow(() -> new NotFoundException("Workspace not found: " + workspaceGid));
        return WorkspaceMapper.toDto(ws);
    }

    @Override
    @Transactional
    public WorkspaceDto create(WorkspaceCreateRequest request) {
        Workspace ws = WorkspaceMapper.fromCreateRequest(request);
        Workspace saved = workspaceRepository.save(ws);
        return WorkspaceMapper.toDto(saved);
    }
}
