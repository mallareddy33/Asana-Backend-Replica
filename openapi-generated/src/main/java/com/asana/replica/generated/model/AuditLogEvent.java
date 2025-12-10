package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.AuditLogEventActor;
import com.asana.replica.generated.model.AuditLogEventContext;
import com.asana.replica.generated.model.AuditLogEventDetails;
import com.asana.replica.generated.model.AuditLogEventResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * An object representing a single event within an Asana domain.  Every audit log event is comprised of an &#x60;event_type&#x60;, &#x60;actor&#x60;, &#x60;resource&#x60;, and &#x60;context&#x60;. Some events will include additional metadata about the event under &#x60;details&#x60;. See our [currently supported list of events](/docs/audit-log-events#supported-audit-log-events) for more details.
 */

@Schema(name = "AuditLogEvent", description = "An object representing a single event within an Asana domain.  Every audit log event is comprised of an `event_type`, `actor`, `resource`, and `context`. Some events will include additional metadata about the event under `details`. See our [currently supported list of events](/docs/audit-log-events#supported-audit-log-events) for more details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class AuditLogEvent {

  private @Nullable String gid;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  private @Nullable String eventType;

  private @Nullable String eventCategory;

  private @Nullable AuditLogEventActor actor;

  private @Nullable AuditLogEventResource resource;

  private @Nullable AuditLogEventDetails details;

  private @Nullable AuditLogEventContext context;

  public AuditLogEvent gid(@Nullable String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the `AuditLogEvent`, as a string.
   * @return gid
   */
  
  @Schema(name = "gid", example = "12345", description = "Globally unique identifier of the `AuditLogEvent`, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public @Nullable String getGid() {
    return gid;
  }

  public void setGid(@Nullable String gid) {
    this.gid = gid;
  }

  public AuditLogEvent createdAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time the event was created.
   * @return createdAt
   */
  @Valid 
  @Schema(name = "created_at", example = "2021-01-01T00:00Z", description = "The time the event was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public @Nullable OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AuditLogEvent eventType(@Nullable String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The type of the event.
   * @return eventType
   */
  
  @Schema(name = "event_type", example = "task_deleted", description = "The type of the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event_type")
  public @Nullable String getEventType() {
    return eventType;
  }

  public void setEventType(@Nullable String eventType) {
    this.eventType = eventType;
  }

  public AuditLogEvent eventCategory(@Nullable String eventCategory) {
    this.eventCategory = eventCategory;
    return this;
  }

  /**
   * The category that this `event_type` belongs to.
   * @return eventCategory
   */
  
  @Schema(name = "event_category", example = "deletion", description = "The category that this `event_type` belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event_category")
  public @Nullable String getEventCategory() {
    return eventCategory;
  }

  public void setEventCategory(@Nullable String eventCategory) {
    this.eventCategory = eventCategory;
  }

  public AuditLogEvent actor(@Nullable AuditLogEventActor actor) {
    this.actor = actor;
    return this;
  }

  /**
   * Get actor
   * @return actor
   */
  @Valid 
  @Schema(name = "actor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actor")
  public @Nullable AuditLogEventActor getActor() {
    return actor;
  }

  public void setActor(@Nullable AuditLogEventActor actor) {
    this.actor = actor;
  }

  public AuditLogEvent resource(@Nullable AuditLogEventResource resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
   */
  @Valid 
  @Schema(name = "resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource")
  public @Nullable AuditLogEventResource getResource() {
    return resource;
  }

  public void setResource(@Nullable AuditLogEventResource resource) {
    this.resource = resource;
  }

  public AuditLogEvent details(@Nullable AuditLogEventDetails details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
   */
  @Valid 
  @Schema(name = "details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public @Nullable AuditLogEventDetails getDetails() {
    return details;
  }

  public void setDetails(@Nullable AuditLogEventDetails details) {
    this.details = details;
  }

  public AuditLogEvent context(@Nullable AuditLogEventContext context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
   */
  @Valid 
  @Schema(name = "context", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("context")
  public @Nullable AuditLogEventContext getContext() {
    return context;
  }

  public void setContext(@Nullable AuditLogEventContext context) {
    this.context = context;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogEvent auditLogEvent = (AuditLogEvent) o;
    return Objects.equals(this.gid, auditLogEvent.gid) &&
        Objects.equals(this.createdAt, auditLogEvent.createdAt) &&
        Objects.equals(this.eventType, auditLogEvent.eventType) &&
        Objects.equals(this.eventCategory, auditLogEvent.eventCategory) &&
        Objects.equals(this.actor, auditLogEvent.actor) &&
        Objects.equals(this.resource, auditLogEvent.resource) &&
        Objects.equals(this.details, auditLogEvent.details) &&
        Objects.equals(this.context, auditLogEvent.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, createdAt, eventType, eventCategory, actor, resource, details, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogEvent {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventCategory: ").append(toIndentedString(eventCategory)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

