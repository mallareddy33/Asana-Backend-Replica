package com.asana.replica.generated.api;

import com.asana.replica.generated.model.AddDependenciesForTaskRequest;
import com.asana.replica.generated.model.AddDependentsForTaskRequest;
import com.asana.replica.generated.model.AddFollowersRequest;
import com.asana.replica.generated.model.AddProjectForTaskRequest;
import com.asana.replica.generated.model.AddTagForTaskRequest;
import com.asana.replica.generated.model.ApproveAccessRequest200Response;
import com.asana.replica.generated.model.CreateTask201Response;
import com.asana.replica.generated.model.CreateTaskRequest;
import com.asana.replica.generated.model.CreateTimeTrackingEntry201Response;
import com.asana.replica.generated.model.CreateTimeTrackingEntryRequest;
import org.springframework.format.annotation.DateTimeFormat;
import com.asana.replica.generated.model.DuplicateTaskRequest;
import com.asana.replica.generated.model.ErrorResponse;
import com.asana.replica.generated.model.GetItemsForPortfolio200Response;
import com.asana.replica.generated.model.GetJob200Response;
import com.asana.replica.generated.model.GetStoriesForTask200Response;
import com.asana.replica.generated.model.GetStory200Response;
import com.asana.replica.generated.model.GetTags200Response;
import com.asana.replica.generated.model.GetTasks200Response;
import com.asana.replica.generated.model.GetTimeTrackingEntriesForTask200Response;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import com.asana.replica.generated.model.RemoveFollowerForTaskRequest;
import com.asana.replica.generated.model.RemoveProjectForTaskRequest;
import com.asana.replica.generated.model.RemoveTagForTaskRequest;
import com.asana.replica.generated.model.SetParentForTaskRequest;
import com.asana.replica.generated.model.UpdateStoryRequest;


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
public class TasksApiController implements TasksApi {

    private final NativeWebRequest request;

    @Autowired
    public TasksApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
