package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.AllocationBaseEffort;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * CreateAllocationRequestData
 */

@JsonTypeName("createAllocation_request_data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class CreateAllocationRequestData {

  private @Nullable String gid;

  private @Nullable String resourceType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate endDate;

  private JsonNullable<AllocationBaseEffort> effort = JsonNullable.<AllocationBaseEffort>undefined();

  private String assignee;

  private String parent;

  public CreateAllocationRequestData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateAllocationRequestData(LocalDate startDate, LocalDate endDate, String assignee, String parent) {
    this.startDate = startDate;
    this.endDate = endDate;
    this.assignee = assignee;
    this.parent = parent;
  }

  public CreateAllocationRequestData gid(@Nullable String gid) {
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

  public CreateAllocationRequestData resourceType(@Nullable String resourceType) {
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

  public CreateAllocationRequestData startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The localized day on which the allocation starts.
   * @return startDate
   */
  @NotNull @Valid 
  @Schema(name = "start_date", example = "2024-02-28", description = "The localized day on which the allocation starts.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start_date")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public CreateAllocationRequestData endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The localized day on which the allocation ends.
   * @return endDate
   */
  @NotNull @Valid 
  @Schema(name = "end_date", example = "2024-02-28", description = "The localized day on which the allocation ends.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("end_date")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public CreateAllocationRequestData effort(AllocationBaseEffort effort) {
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

  public CreateAllocationRequestData assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Globally unique identifier for the user or placeholder assigned to the allocation.
   * @return assignee
   */
  @NotNull 
  @Schema(name = "assignee", description = "Globally unique identifier for the user or placeholder assigned to the allocation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assignee")
  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public CreateAllocationRequestData parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Globally unique identifier for the project the allocation is on.
   * @return parent
   */
  @NotNull 
  @Schema(name = "parent", description = "Globally unique identifier for the project the allocation is on.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parent")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAllocationRequestData createAllocationRequestData = (CreateAllocationRequestData) o;
    return Objects.equals(this.gid, createAllocationRequestData.gid) &&
        Objects.equals(this.resourceType, createAllocationRequestData.resourceType) &&
        Objects.equals(this.startDate, createAllocationRequestData.startDate) &&
        Objects.equals(this.endDate, createAllocationRequestData.endDate) &&
        equalsNullable(this.effort, createAllocationRequestData.effort) &&
        Objects.equals(this.assignee, createAllocationRequestData.assignee) &&
        Objects.equals(this.parent, createAllocationRequestData.parent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, startDate, endDate, hashCodeNullable(effort), assignee, parent);
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
    sb.append("class CreateAllocationRequestData {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    effort: ").append(toIndentedString(effort)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

