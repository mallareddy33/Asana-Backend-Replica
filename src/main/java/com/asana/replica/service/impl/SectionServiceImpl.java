package com.asana.replica.service.impl;

import com.asana.replica.dto.SectionCreateRequest;
import com.asana.replica.dto.SectionDto;
import com.asana.replica.exception.NotFoundException;
import com.asana.replica.mapper.SectionMapper;
import com.asana.replica.model.Project;
import com.asana.replica.model.Section;
import com.asana.replica.repository.ProjectRepository;
import com.asana.replica.repository.SectionRepository;
import com.asana.replica.service.SectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SectionServiceImpl implements SectionService {

    private final SectionRepository sectionRepository;
    private final ProjectRepository projectRepository;

    @Override
    @Transactional(readOnly = true)
    public List<SectionDto> listByProject(String projectGid) {
        List<Section> sections = sectionRepository.findByProject_Id(projectGid);
        return sections.stream()
                .map(SectionMapper::toDto)
                .toList();
    }

    @Override
    @Transactional
    public SectionDto create(String projectGid, SectionCreateRequest request) {
        Project project = projectRepository.findById(projectGid)
                .orElseThrow(() -> new NotFoundException("Project not found: " + projectGid));

        Section section = SectionMapper.fromCreateRequest(request, project);
        Section saved = sectionRepository.save(section);

        return SectionMapper.toDto(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public SectionDto getByGid(String sectionGid) {
        Section section = sectionRepository.findById(sectionGid)
                .orElseThrow(() -> new NotFoundException("Section not found: " + sectionGid));
        return SectionMapper.toDto(section);
    }
}
