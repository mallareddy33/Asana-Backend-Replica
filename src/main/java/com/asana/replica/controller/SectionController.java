package com.asana.replica.controller;

import com.asana.replica.api.DataListResponse;
import com.asana.replica.api.DataResponse;
import com.asana.replica.dto.SectionCreateRequest;
import com.asana.replica.dto.SectionDto;
import com.asana.replica.service.SectionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SectionController {

    private final SectionService sectionService;

    // GET /projects/{project_gid}/sections
    @GetMapping("/projects/{project_gid}/sections")
    public DataListResponse<SectionDto> listSections(
            @PathVariable("project_gid") String projectGid
    ) {
        List<SectionDto> sections = sectionService.listByProject(projectGid);
        return new DataListResponse<>(sections);
    }

    // POST /projects/{project_gid}/sections
    @PostMapping("/projects/{project_gid}/sections")
    public ResponseEntity<DataResponse<SectionDto>> createSection(
            @PathVariable("project_gid") String projectGid,
            @Valid @RequestBody SectionCreateRequest request
    ) {
        SectionDto created = sectionService.create(projectGid, request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new DataResponse<>(created));
    }

    // GET /sections/{section_gid}
    @GetMapping("/sections/{section_gid}")
    public DataResponse<SectionDto> getSection(@PathVariable("section_gid") String sectionGid) {
        SectionDto section = sectionService.getByGid(sectionGid);
        return new DataResponse<>(section);
    }
}
