package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.UserCompact;
import com.asana.replica.generated.model.WorkspaceCompact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A user task list represents the tasks assigned to a particular user. It provides API access to a user’s [My tasks](https://asana.com/guide/help/fundamentals/my-tasks) view in Asana.
 */

@Schema(name = "UserTaskListCompact", description = "A user task list represents the tasks assigned to a particular user. It provides API access to a user’s [My tasks](https://asana.com/guide/help/fundamentals/my-tasks) view in Asana.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class UserTaskListCompact {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  private @Nullable UserCompact owner;

  private @Nullable WorkspaceCompact workspace;

  public UserTaskListCompact gid(@Nullable String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
   */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public @Nullable String getGid() {
    return gid;
  }

  public void setGid(@Nullable String gid) {
    this.gid = gid;
  }

  public UserTaskListCompact resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "user_task_list", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public UserTaskListCompact name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the user task list.
   * @return name
   */
  
  @Schema(name = "name", example = "My tasks in My Workspace", description = "The name of the user task list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public UserTaskListCompact owner(@Nullable UserCompact owner) {
    this.owner = owner;
    return this;
  }

  /**
   * The owner of the user task list, i.e. the person whose My Tasks is represented by this resource.
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", accessMode = Schema.AccessMode.READ_ONLY, description = "The owner of the user task list, i.e. the person whose My Tasks is represented by this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable UserCompact getOwner() {
    return owner;
  }

  public void setOwner(@Nullable UserCompact owner) {
    this.owner = owner;
  }

  public UserTaskListCompact workspace(@Nullable WorkspaceCompact workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * The workspace in which the user task list is located.
   * @return workspace
   */
  @Valid 
  @Schema(name = "workspace", accessMode = Schema.AccessMode.READ_ONLY, description = "The workspace in which the user task list is located.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workspace")
  public @Nullable WorkspaceCompact getWorkspace() {
    return workspace;
  }

  public void setWorkspace(@Nullable WorkspaceCompact workspace) {
    this.workspace = workspace;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTaskListCompact userTaskListCompact = (UserTaskListCompact) o;
    return Objects.equals(this.gid, userTaskListCompact.gid) &&
        Objects.equals(this.resourceType, userTaskListCompact.resourceType) &&
        Objects.equals(this.name, userTaskListCompact.name) &&
        Objects.equals(this.owner, userTaskListCompact.owner) &&
        Objects.equals(this.workspace, userTaskListCompact.workspace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, owner, workspace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTaskListCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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

