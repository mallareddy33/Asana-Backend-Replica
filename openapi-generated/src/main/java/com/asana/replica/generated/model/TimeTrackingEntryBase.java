package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.TaskCompact;
import com.asana.replica.generated.model.TimeTrackingEntryCompactAttributableTo;
import com.asana.replica.generated.model.UserCompact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TimeTrackingEntryBase
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TimeTrackingEntryBase {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable Integer durationMinutes;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate enteredOn;

  private @Nullable TimeTrackingEntryCompactAttributableTo attributableTo;

  private @Nullable UserCompact createdBy;

  private @Nullable TaskCompact task;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  /**
   * *Optional*. The current approval status of the entry.
   */
  public enum ApprovalStatusEnum {
    DRAFT("DRAFT"),
    
    SUBMITTED("SUBMITTED"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED");

    private final String value;

    ApprovalStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ApprovalStatusEnum fromValue(String value) {
      for (ApprovalStatusEnum b : ApprovalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ApprovalStatusEnum approvalStatus;

  /**
   * *Optional*. The current billable status of the entry.
   */
  public enum BillableStatusEnum {
    BILLABLE("billable"),
    
    NON_BILLABLE("nonBillable"),
    
    NOT_APPLICABLE("notApplicable");

    private final String value;

    BillableStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BillableStatusEnum fromValue(String value) {
      for (BillableStatusEnum b : BillableStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable BillableStatusEnum billableStatus;

  private @Nullable String description;

  public TimeTrackingEntryBase gid(@Nullable String gid) {
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

  public TimeTrackingEntryBase resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "time_tracking_entry", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public TimeTrackingEntryBase durationMinutes(@Nullable Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
    return this;
  }

  /**
   * Time in minutes tracked by the entry.
   * @return durationMinutes
   */
  
  @Schema(name = "duration_minutes", example = "12", description = "Time in minutes tracked by the entry.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration_minutes")
  public @Nullable Integer getDurationMinutes() {
    return durationMinutes;
  }

  public void setDurationMinutes(@Nullable Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
  }

  public TimeTrackingEntryBase enteredOn(@Nullable LocalDate enteredOn) {
    this.enteredOn = enteredOn;
    return this;
  }

  /**
   * The day that this entry is logged on.
   * @return enteredOn
   */
  @Valid 
  @Schema(name = "entered_on", example = "2015-03-14", description = "The day that this entry is logged on.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entered_on")
  public @Nullable LocalDate getEnteredOn() {
    return enteredOn;
  }

  public void setEnteredOn(@Nullable LocalDate enteredOn) {
    this.enteredOn = enteredOn;
  }

  public TimeTrackingEntryBase attributableTo(@Nullable TimeTrackingEntryCompactAttributableTo attributableTo) {
    this.attributableTo = attributableTo;
    return this;
  }

  /**
   * Get attributableTo
   * @return attributableTo
   */
  @Valid 
  @Schema(name = "attributable_to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributable_to")
  public @Nullable TimeTrackingEntryCompactAttributableTo getAttributableTo() {
    return attributableTo;
  }

  public void setAttributableTo(@Nullable TimeTrackingEntryCompactAttributableTo attributableTo) {
    this.attributableTo = attributableTo;
  }

  public TimeTrackingEntryBase createdBy(@Nullable UserCompact createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   */
  @Valid 
  @Schema(name = "created_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by")
  public @Nullable UserCompact getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(@Nullable UserCompact createdBy) {
    this.createdBy = createdBy;
  }

  public TimeTrackingEntryBase task(@Nullable TaskCompact task) {
    this.task = task;
    return this;
  }

  /**
   * Get task
   * @return task
   */
  @Valid 
  @Schema(name = "task", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("task")
  public @Nullable TaskCompact getTask() {
    return task;
  }

  public void setTask(@Nullable TaskCompact task) {
    this.task = task;
  }

  public TimeTrackingEntryBase createdAt(@Nullable OffsetDateTime createdAt) {
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

  public TimeTrackingEntryBase approvalStatus(@Nullable ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

  /**
   * *Optional*. The current approval status of the entry.
   * @return approvalStatus
   */
  
  @Schema(name = "approval_status", accessMode = Schema.AccessMode.READ_ONLY, example = "DRAFT", description = "*Optional*. The current approval status of the entry.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approval_status")
  public @Nullable ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(@Nullable ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public TimeTrackingEntryBase billableStatus(@Nullable BillableStatusEnum billableStatus) {
    this.billableStatus = billableStatus;
    return this;
  }

  /**
   * *Optional*. The current billable status of the entry.
   * @return billableStatus
   */
  
  @Schema(name = "billable_status", accessMode = Schema.AccessMode.READ_ONLY, example = "billable", description = "*Optional*. The current billable status of the entry.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billable_status")
  public @Nullable BillableStatusEnum getBillableStatus() {
    return billableStatus;
  }

  public void setBillableStatus(@Nullable BillableStatusEnum billableStatus) {
    this.billableStatus = billableStatus;
  }

  public TimeTrackingEntryBase description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * *Optional*. The description of the entry.
   * @return description
   */
  
  @Schema(name = "description", accessMode = Schema.AccessMode.READ_ONLY, example = "My description of work done on this entry", description = "*Optional*. The description of the entry.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeTrackingEntryBase timeTrackingEntryBase = (TimeTrackingEntryBase) o;
    return Objects.equals(this.gid, timeTrackingEntryBase.gid) &&
        Objects.equals(this.resourceType, timeTrackingEntryBase.resourceType) &&
        Objects.equals(this.durationMinutes, timeTrackingEntryBase.durationMinutes) &&
        Objects.equals(this.enteredOn, timeTrackingEntryBase.enteredOn) &&
        Objects.equals(this.attributableTo, timeTrackingEntryBase.attributableTo) &&
        Objects.equals(this.createdBy, timeTrackingEntryBase.createdBy) &&
        Objects.equals(this.task, timeTrackingEntryBase.task) &&
        Objects.equals(this.createdAt, timeTrackingEntryBase.createdAt) &&
        Objects.equals(this.approvalStatus, timeTrackingEntryBase.approvalStatus) &&
        Objects.equals(this.billableStatus, timeTrackingEntryBase.billableStatus) &&
        Objects.equals(this.description, timeTrackingEntryBase.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, durationMinutes, enteredOn, attributableTo, createdBy, task, createdAt, approvalStatus, billableStatus, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeTrackingEntryBase {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    durationMinutes: ").append(toIndentedString(durationMinutes)).append("\n");
    sb.append("    enteredOn: ").append(toIndentedString(enteredOn)).append("\n");
    sb.append("    attributableTo: ").append(toIndentedString(attributableTo)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    billableStatus: ").append(toIndentedString(billableStatus)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

