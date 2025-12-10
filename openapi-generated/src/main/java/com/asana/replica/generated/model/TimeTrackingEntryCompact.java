package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.TimeTrackingEntryCompactAttributableTo;
import com.asana.replica.generated.model.UserCompact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
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
 * A generic Asana Resource, containing a globally unique identifier.
 */

@Schema(name = "TimeTrackingEntryCompact", description = "A generic Asana Resource, containing a globally unique identifier.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TimeTrackingEntryCompact {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable Integer durationMinutes;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate enteredOn;

  private @Nullable TimeTrackingEntryCompactAttributableTo attributableTo;

  private @Nullable UserCompact createdBy;

  public TimeTrackingEntryCompact gid(@Nullable String gid) {
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

  public TimeTrackingEntryCompact resourceType(@Nullable String resourceType) {
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

  public TimeTrackingEntryCompact durationMinutes(@Nullable Integer durationMinutes) {
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

  public TimeTrackingEntryCompact enteredOn(@Nullable LocalDate enteredOn) {
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

  public TimeTrackingEntryCompact attributableTo(@Nullable TimeTrackingEntryCompactAttributableTo attributableTo) {
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

  public TimeTrackingEntryCompact createdBy(@Nullable UserCompact createdBy) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeTrackingEntryCompact timeTrackingEntryCompact = (TimeTrackingEntryCompact) o;
    return Objects.equals(this.gid, timeTrackingEntryCompact.gid) &&
        Objects.equals(this.resourceType, timeTrackingEntryCompact.resourceType) &&
        Objects.equals(this.durationMinutes, timeTrackingEntryCompact.durationMinutes) &&
        Objects.equals(this.enteredOn, timeTrackingEntryCompact.enteredOn) &&
        Objects.equals(this.attributableTo, timeTrackingEntryCompact.attributableTo) &&
        Objects.equals(this.createdBy, timeTrackingEntryCompact.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, durationMinutes, enteredOn, attributableTo, createdBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeTrackingEntryCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    durationMinutes: ").append(toIndentedString(durationMinutes)).append("\n");
    sb.append("    enteredOn: ").append(toIndentedString(enteredOn)).append("\n");
    sb.append("    attributableTo: ").append(toIndentedString(attributableTo)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

