package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.UserCompact;
import com.asana.replica.generated.model.UserTaskListCompact;
import com.asana.replica.generated.model.WorkspaceCompact;
import com.asana.replica.generated.model.WorkspaceMembershipResponseAllOfVacationDates;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * WorkspaceMembershipResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class WorkspaceMembershipResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable UserCompact user;

  private @Nullable WorkspaceCompact workspace;

  private @Nullable UserTaskListCompact userTaskList;

  private @Nullable Boolean isActive;

  private @Nullable Boolean isAdmin;

  private @Nullable Boolean isGuest;

  private @Nullable Boolean isViewOnly;

  private JsonNullable<WorkspaceMembershipResponseAllOfVacationDates> vacationDates = JsonNullable.<WorkspaceMembershipResponseAllOfVacationDates>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  public WorkspaceMembershipResponse gid(@Nullable String gid) {
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

  public WorkspaceMembershipResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "workspace_membership", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public WorkspaceMembershipResponse user(@Nullable UserCompact user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public @Nullable UserCompact getUser() {
    return user;
  }

  public void setUser(@Nullable UserCompact user) {
    this.user = user;
  }

  public WorkspaceMembershipResponse workspace(@Nullable WorkspaceCompact workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * Get workspace
   * @return workspace
   */
  @Valid 
  @Schema(name = "workspace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workspace")
  public @Nullable WorkspaceCompact getWorkspace() {
    return workspace;
  }

  public void setWorkspace(@Nullable WorkspaceCompact workspace) {
    this.workspace = workspace;
  }

  public WorkspaceMembershipResponse userTaskList(@Nullable UserTaskListCompact userTaskList) {
    this.userTaskList = userTaskList;
    return this;
  }

  /**
   * Get userTaskList
   * @return userTaskList
   */
  @Valid 
  @Schema(name = "user_task_list", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_task_list")
  public @Nullable UserTaskListCompact getUserTaskList() {
    return userTaskList;
  }

  public void setUserTaskList(@Nullable UserTaskListCompact userTaskList) {
    this.userTaskList = userTaskList;
  }

  public WorkspaceMembershipResponse isActive(@Nullable Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Indicates whether the user is currently associated with the workspace. Returns `true` for users who have joined the workspace or have been invited but not yet accepted.
   * @return isActive
   */
  
  @Schema(name = "is_active", accessMode = Schema.AccessMode.READ_ONLY, description = "Indicates whether the user is currently associated with the workspace. Returns `true` for users who have joined the workspace or have been invited but not yet accepted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_active")
  public @Nullable Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(@Nullable Boolean isActive) {
    this.isActive = isActive;
  }

  public WorkspaceMembershipResponse isAdmin(@Nullable Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

  /**
   * Reflects if this user is an admin of the workspace.
   * @return isAdmin
   */
  
  @Schema(name = "is_admin", accessMode = Schema.AccessMode.READ_ONLY, description = "Reflects if this user is an admin of the workspace.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_admin")
  public @Nullable Boolean getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(@Nullable Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public WorkspaceMembershipResponse isGuest(@Nullable Boolean isGuest) {
    this.isGuest = isGuest;
    return this;
  }

  /**
   * Reflects if this user is a guest of the workspace.
   * @return isGuest
   */
  
  @Schema(name = "is_guest", accessMode = Schema.AccessMode.READ_ONLY, description = "Reflects if this user is a guest of the workspace.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_guest")
  public @Nullable Boolean getIsGuest() {
    return isGuest;
  }

  public void setIsGuest(@Nullable Boolean isGuest) {
    this.isGuest = isGuest;
  }

  public WorkspaceMembershipResponse isViewOnly(@Nullable Boolean isViewOnly) {
    this.isViewOnly = isViewOnly;
    return this;
  }

  /**
   * Reflects if this user has view only license in the workspace.
   * @return isViewOnly
   */
  
  @Schema(name = "is_view_only", accessMode = Schema.AccessMode.READ_ONLY, description = "Reflects if this user has view only license in the workspace.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_view_only")
  public @Nullable Boolean getIsViewOnly() {
    return isViewOnly;
  }

  public void setIsViewOnly(@Nullable Boolean isViewOnly) {
    this.isViewOnly = isViewOnly;
  }

  public WorkspaceMembershipResponse vacationDates(WorkspaceMembershipResponseAllOfVacationDates vacationDates) {
    this.vacationDates = JsonNullable.of(vacationDates);
    return this;
  }

  /**
   * Get vacationDates
   * @return vacationDates
   */
  @Valid 
  @Schema(name = "vacation_dates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vacation_dates")
  public JsonNullable<WorkspaceMembershipResponseAllOfVacationDates> getVacationDates() {
    return vacationDates;
  }

  public void setVacationDates(JsonNullable<WorkspaceMembershipResponseAllOfVacationDates> vacationDates) {
    this.vacationDates = vacationDates;
  }

  public WorkspaceMembershipResponse createdAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which this resource was created.
   * @return createdAt
   */
  @Valid 
  @Schema(name = "created_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this resource was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public @Nullable OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceMembershipResponse workspaceMembershipResponse = (WorkspaceMembershipResponse) o;
    return Objects.equals(this.gid, workspaceMembershipResponse.gid) &&
        Objects.equals(this.resourceType, workspaceMembershipResponse.resourceType) &&
        Objects.equals(this.user, workspaceMembershipResponse.user) &&
        Objects.equals(this.workspace, workspaceMembershipResponse.workspace) &&
        Objects.equals(this.userTaskList, workspaceMembershipResponse.userTaskList) &&
        Objects.equals(this.isActive, workspaceMembershipResponse.isActive) &&
        Objects.equals(this.isAdmin, workspaceMembershipResponse.isAdmin) &&
        Objects.equals(this.isGuest, workspaceMembershipResponse.isGuest) &&
        Objects.equals(this.isViewOnly, workspaceMembershipResponse.isViewOnly) &&
        equalsNullable(this.vacationDates, workspaceMembershipResponse.vacationDates) &&
        Objects.equals(this.createdAt, workspaceMembershipResponse.createdAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, user, workspace, userTaskList, isActive, isAdmin, isGuest, isViewOnly, hashCodeNullable(vacationDates), createdAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceMembershipResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    userTaskList: ").append(toIndentedString(userTaskList)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isGuest: ").append(toIndentedString(isGuest)).append("\n");
    sb.append("    isViewOnly: ").append(toIndentedString(isViewOnly)).append("\n");
    sb.append("    vacationDates: ").append(toIndentedString(vacationDates)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

