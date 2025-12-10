package com.asana.replica.service;

import com.asana.replica.dto.SectionCreateRequest;
import com.asana.replica.dto.SectionDto;

import java.util.List;

public interface SectionService {

    List<SectionDto> listByProject(String projectGid);

    SectionDto create(String projectGid, SectionCreateRequest request);

    SectionDto getByGid(String sectionGid);
}

