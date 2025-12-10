package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.ResourceExportRequestParameter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A *resource_export* request starts a job to bulk export objects for one or more resources.
 */

@Schema(name = "ResourceExportRequest", description = "A *resource_export* request starts a job to bulk export objects for one or more resources.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ResourceExportRequest {

  private @Nullable String workspace;

  @Valid
  private List<@Valid ResourceExportRequestParameter> exportRequestParameters = new ArrayList<>();

  public ResourceExportRequest workspace(@Nullable String workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * Gid of a workspace.
   * @return workspace
   */
  
  @Schema(name = "workspace", example = "12345", description = "Gid of a workspace.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workspace")
  public @Nullable String getWorkspace() {
    return workspace;
  }

  public void setWorkspace(@Nullable String workspace) {
    this.workspace = workspace;
  }

  public ResourceExportRequest exportRequestParameters(List<@Valid ResourceExportRequestParameter> exportRequestParameters) {
    this.exportRequestParameters = exportRequestParameters;
    return this;
  }

  public ResourceExportRequest addExportRequestParametersItem(ResourceExportRequestParameter exportRequestParametersItem) {
    if (this.exportRequestParameters == null) {
      this.exportRequestParameters = new ArrayList<>();
    }
    this.exportRequestParameters.add(exportRequestParametersItem);
    return this;
  }

  /**
   * An object containing the parameters for the export request. The keys of this object are the GIDs of the resources to be exported. The values are objects with additional parameters for each resource.
   * @return exportRequestParameters
   */
  @Valid 
  @Schema(name = "export_request_parameters", description = "An object containing the parameters for the export request. The keys of this object are the GIDs of the resources to be exported. The values are objects with additional parameters for each resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("export_request_parameters")
  public List<@Valid ResourceExportRequestParameter> getExportRequestParameters() {
    return exportRequestParameters;
  }

  public void setExportRequestParameters(List<@Valid ResourceExportRequestParameter> exportRequestParameters) {
    this.exportRequestParameters = exportRequestParameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceExportRequest resourceExportRequest = (ResourceExportRequest) o;
    return Objects.equals(this.workspace, resourceExportRequest.workspace) &&
        Objects.equals(this.exportRequestParameters, resourceExportRequest.exportRequestParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspace, exportRequestParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceExportRequest {\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    exportRequestParameters: ").append(toIndentedString(exportRequestParameters)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

