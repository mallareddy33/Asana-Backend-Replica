package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.AllocationBaseEffort;
import com.asana.replica.generated.model.AllocationResponseAllOfAssignee;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
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
 * AllocationResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class AllocationResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate endDate;

  private JsonNullable<AllocationBaseEffort> effort = JsonNullable.<AllocationBaseEffort>undefined();

  private @Nullable AllocationResponseAllOfAssignee assignee;

  private @Nullable Object createdBy;

  private @Nullable Object parent;

  private @Nullable String resourceSubtype;

  public AllocationResponse gid(@Nullable String gid) {
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

  public AllocationResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "allocation", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public AllocationResponse startDate(@Nullable LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The localized day on which the allocation starts.
   * @return startDate
   */
  @Valid 
  @Schema(name = "start_date", example = "2024-02-28", description = "The localized day on which the allocation starts.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_date")
  public @Nullable LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable LocalDate startDate) {
    this.startDate = startDate;
  }

  public AllocationResponse endDate(@Nullable LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The localized day on which the allocation ends.
   * @return endDate
   */
  @Valid 
  @Schema(name = "end_date", example = "2024-02-28", description = "The localized day on which the allocation ends.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date")
  public @Nullable LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable LocalDate endDate) {
    this.endDate = endDate;
  }

  public AllocationResponse effort(AllocationBaseEffort effort) {
    this.effort = JsonNullable.of(effort);
    return this;
  }

  /**
   * Get effort
   * @return effort
   */
  @Valid 
  @Schema(name = "effort", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("effort")
  public JsonNullable<AllocationBaseEffort> getEffort() {
    return effort;
  }

  public void setEffort(JsonNullable<AllocationBaseEffort> effort) {
    this.effort = effort;
  }

  public AllocationResponse assignee(@Nullable AllocationResponseAllOfAssignee assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Get assignee
   * @return assignee
   */
  @Valid 
  @Schema(name = "assignee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignee")
  public @Nullable AllocationResponseAllOfAssignee getAssignee() {
    return assignee;
  }

  public void setAssignee(@Nullable AllocationResponseAllOfAssignee assignee) {
    this.assignee = assignee;
  }

  public AllocationResponse createdBy(@Nullable Object createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   */
  
  @Schema(name = "created_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by")
  public @Nullable Object getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(@Nullable Object createdBy) {
    this.createdBy = createdBy;
  }

  public AllocationResponse parent(@Nullable Object parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
   */
  
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public @Nullable Object getParent() {
    return parent;
  }

  public void setParent(@Nullable Object parent) {
    this.parent = parent;
  }

  public AllocationResponse resourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The subtype of the allocation.
   * @return resourceSubtype
   */
  
  @Schema(name = "resource_subtype", example = "project_allocation", description = "The subtype of the allocation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public @Nullable String getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocationResponse allocationResponse = (AllocationResponse) o;
    return Objects.equals(this.gid, allocationResponse.gid) &&
        Objects.equals(this.resourceType, allocationResponse.resourceType) &&
        Objects.equals(this.startDate, allocationResponse.startDate) &&
        Objects.equals(this.endDate, allocationResponse.endDate) &&
        equalsNullable(this.effort, allocationResponse.effort) &&
        Objects.equals(this.assignee, allocationResponse.assignee) &&
        Objects.equals(this.createdBy, allocationResponse.createdBy) &&
        Objects.equals(this.parent, allocationResponse.parent) &&
        Objects.equals(this.resourceSubtype, allocationResponse.resourceSubtype);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, startDate, endDate, hashCodeNullable(effort), assignee, createdBy, parent, resourceSubtype);
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
    sb.append("class AllocationResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    effort: ").append(toIndentedString(effort)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
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

