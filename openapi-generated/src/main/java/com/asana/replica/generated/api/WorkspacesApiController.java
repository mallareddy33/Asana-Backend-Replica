package com.asana.replica.generated.api;

import com.asana.replica.generated.model.AddUserForWorkspace200Response;
import com.asana.replica.generated.model.AddUserForWorkspaceRequest;
import com.asana.replica.generated.model.ApproveAccessRequest200Response;
import com.asana.replica.generated.model.CreateProject201Response;
import com.asana.replica.generated.model.CreateProjectRequest;
import com.asana.replica.generated.model.CreateTag201Response;
import com.asana.replica.generated.model.CreateTagForWorkspaceRequest;
import com.asana.replica.generated.model.CreateTask201Response;
import org.springframework.format.annotation.DateTimeFormat;
import com.asana.replica.generated.model.ErrorResponse;
import com.asana.replica.generated.model.GetAuditLogEvents200Response;
import com.asana.replica.generated.model.GetCustomFieldsForWorkspace200Response;
import com.asana.replica.generated.model.GetEvents200Response;
import com.asana.replica.generated.model.GetItemsForPortfolio200Response;
import com.asana.replica.generated.model.GetTags200Response;
import com.asana.replica.generated.model.GetTeamsForWorkspace200Response;
import com.asana.replica.generated.model.GetUser200Response;
import com.asana.replica.generated.model.GetUsersForTeam200Response;
import com.asana.replica.generated.model.GetWorkspace200Response;
import com.asana.replica.generated.model.GetWorkspaceMembershipsForUser200Response;
import com.asana.replica.generated.model.GetWorkspaces200Response;
import java.time.LocalDate;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import com.asana.replica.generated.model.RemoveUserForWorkspaceRequest;
import com.asana.replica.generated.model.SearchTasksForWorkspace200Response;
import com.asana.replica.generated.model.TypeaheadForWorkspace200Response;
import com.asana.replica.generated.model.UpdateUserRequest;
import com.asana.replica.generated.model.UpdateWorkspaceRequest;


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
public class WorkspacesApiController implements WorkspacesApi {

    private final NativeWebRequest request;

    @Autowired
    public WorkspacesApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
