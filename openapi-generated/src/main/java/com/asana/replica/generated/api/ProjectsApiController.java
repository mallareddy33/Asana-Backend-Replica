package com.asana.replica.generated.api;

import com.asana.replica.generated.model.AddCustomFieldSettingForGoal200Response;
import com.asana.replica.generated.model.AddCustomFieldSettingForGoalRequest;
import com.asana.replica.generated.model.AddFollowersForProjectRequest;
import com.asana.replica.generated.model.AddMembersForPortfolioRequest;
import com.asana.replica.generated.model.ApproveAccessRequest200Response;
import com.asana.replica.generated.model.CreateProject201Response;
import com.asana.replica.generated.model.CreateProjectRequest;
import com.asana.replica.generated.model.CreateProjectStatusForProjectRequest;
import com.asana.replica.generated.model.DuplicateProjectRequest;
import com.asana.replica.generated.model.ErrorResponse;
import com.asana.replica.generated.model.GetCustomFieldSettingsForProject200Response;
import com.asana.replica.generated.model.GetItemsForPortfolio200Response;
import com.asana.replica.generated.model.GetJob200Response;
import com.asana.replica.generated.model.GetProjectBrief200Response;
import com.asana.replica.generated.model.GetProjectMembershipsForProject200Response;
import com.asana.replica.generated.model.GetProjectStatus200Response;
import com.asana.replica.generated.model.GetProjectStatusesForProject200Response;
import com.asana.replica.generated.model.GetSection200Response;
import com.asana.replica.generated.model.GetSectionsForProject200Response;
import com.asana.replica.generated.model.GetTaskCountsForProject200Response;
import com.asana.replica.generated.model.GetTasks200Response;
import com.asana.replica.generated.model.InsertSectionForProjectRequest;
import org.springframework.lang.Nullable;
import com.asana.replica.generated.model.ProjectSaveAsTemplateRequest;
import com.asana.replica.generated.model.RemoveCustomFieldSettingForGoalRequest;
import com.asana.replica.generated.model.RemoveFollowersForProjectRequest;
import com.asana.replica.generated.model.RemoveMembersForPortfolioRequest;
import com.asana.replica.generated.model.UpdateProjectBriefRequest;
import com.asana.replica.generated.model.UpdateProjectRequest;
import com.asana.replica.generated.model.UpdateSectionRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
@Controller
@RequestMapping("${openapi.asana.base-path:/api/1.0}")
public class ProjectsApiController implements ProjectsApi {

    private final NativeWebRequest request;

    @Autowired
    public ProjectsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
