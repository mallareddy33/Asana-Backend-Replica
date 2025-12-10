package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.AsanaNamedResource;
import com.asana.replica.generated.model.WebhookResponseAllOfFilters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * WebhookResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class WebhookResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable Boolean active;

  private @Nullable AsanaNamedResource resource;

  private @Nullable URI target;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastFailureAt;

  private @Nullable String lastFailureContent;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastSuccessAt;

  private @Nullable Integer deliveryRetryCount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime nextAttemptAfter;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime failureDeletionTimestamp;

  @Valid
  private List<WebhookResponseAllOfFilters> filters = new ArrayList<>();

  public WebhookResponse gid(@Nullable String gid) {
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

  public WebhookResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "webhook", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public WebhookResponse active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * If true, the webhook will send events - if false it is considered inactive and will not generate events.
   * @return active
   */
  
  @Schema(name = "active", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "If true, the webhook will send events - if false it is considered inactive and will not generate events.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public WebhookResponse resource(@Nullable AsanaNamedResource resource) {
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
  public @Nullable AsanaNamedResource getResource() {
    return resource;
  }

  public void setResource(@Nullable AsanaNamedResource resource) {
    this.resource = resource;
  }

  public WebhookResponse target(@Nullable URI target) {
    this.target = target;
    return this;
  }

  /**
   * The URL to receive the HTTP POST.
   * @return target
   */
  @Valid 
  @Schema(name = "target", accessMode = Schema.AccessMode.READ_ONLY, example = "https://example.com/receive-webhook/7654", description = "The URL to receive the HTTP POST.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target")
  public @Nullable URI getTarget() {
    return target;
  }

  public void setTarget(@Nullable URI target) {
    this.target = target;
  }

  public WebhookResponse createdAt(@Nullable OffsetDateTime createdAt) {
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

  public WebhookResponse lastFailureAt(@Nullable OffsetDateTime lastFailureAt) {
    this.lastFailureAt = lastFailureAt;
    return this;
  }

  /**
   * The timestamp when the webhook last received an error when sending an event to the target.
   * @return lastFailureAt
   */
  @Valid 
  @Schema(name = "last_failure_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The timestamp when the webhook last received an error when sending an event to the target.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_failure_at")
  public @Nullable OffsetDateTime getLastFailureAt() {
    return lastFailureAt;
  }

  public void setLastFailureAt(@Nullable OffsetDateTime lastFailureAt) {
    this.lastFailureAt = lastFailureAt;
  }

  public WebhookResponse lastFailureContent(@Nullable String lastFailureContent) {
    this.lastFailureContent = lastFailureContent;
    return this;
  }

  /**
   * The contents of the last error response sent to the webhook when attempting to deliver events to the target.
   * @return lastFailureContent
   */
  
  @Schema(name = "last_failure_content", accessMode = Schema.AccessMode.READ_ONLY, example = "500 Server Error\\n\\nCould not complete the request", description = "The contents of the last error response sent to the webhook when attempting to deliver events to the target.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_failure_content")
  public @Nullable String getLastFailureContent() {
    return lastFailureContent;
  }

  public void setLastFailureContent(@Nullable String lastFailureContent) {
    this.lastFailureContent = lastFailureContent;
  }

  public WebhookResponse lastSuccessAt(@Nullable OffsetDateTime lastSuccessAt) {
    this.lastSuccessAt = lastSuccessAt;
    return this;
  }

  /**
   * The timestamp when the webhook last successfully sent an event to the target.
   * @return lastSuccessAt
   */
  @Valid 
  @Schema(name = "last_success_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The timestamp when the webhook last successfully sent an event to the target.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_success_at")
  public @Nullable OffsetDateTime getLastSuccessAt() {
    return lastSuccessAt;
  }

  public void setLastSuccessAt(@Nullable OffsetDateTime lastSuccessAt) {
    this.lastSuccessAt = lastSuccessAt;
  }

  public WebhookResponse deliveryRetryCount(@Nullable Integer deliveryRetryCount) {
    this.deliveryRetryCount = deliveryRetryCount;
    return this;
  }

  /**
   * The number of times the webhook has retried delivery of events to the target (resets after a successful attempt).
   * @return deliveryRetryCount
   */
  
  @Schema(name = "delivery_retry_count", accessMode = Schema.AccessMode.READ_ONLY, example = "3", description = "The number of times the webhook has retried delivery of events to the target (resets after a successful attempt).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delivery_retry_count")
  public @Nullable Integer getDeliveryRetryCount() {
    return deliveryRetryCount;
  }

  public void setDeliveryRetryCount(@Nullable Integer deliveryRetryCount) {
    this.deliveryRetryCount = deliveryRetryCount;
  }

  public WebhookResponse nextAttemptAfter(@Nullable OffsetDateTime nextAttemptAfter) {
    this.nextAttemptAfter = nextAttemptAfter;
    return this;
  }

  /**
   * The timestamp after which the webhook will next attempt to deliver an event to the target.
   * @return nextAttemptAfter
   */
  @Valid 
  @Schema(name = "next_attempt_after", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The timestamp after which the webhook will next attempt to deliver an event to the target.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next_attempt_after")
  public @Nullable OffsetDateTime getNextAttemptAfter() {
    return nextAttemptAfter;
  }

  public void setNextAttemptAfter(@Nullable OffsetDateTime nextAttemptAfter) {
    this.nextAttemptAfter = nextAttemptAfter;
  }

  public WebhookResponse failureDeletionTimestamp(@Nullable OffsetDateTime failureDeletionTimestamp) {
    this.failureDeletionTimestamp = failureDeletionTimestamp;
    return this;
  }

  /**
   * The timestamp when the webhook will be deleted if there is no successful attempt to deliver events to the target
   * @return failureDeletionTimestamp
   */
  @Valid 
  @Schema(name = "failure_deletion_timestamp", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The timestamp when the webhook will be deleted if there is no successful attempt to deliver events to the target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failure_deletion_timestamp")
  public @Nullable OffsetDateTime getFailureDeletionTimestamp() {
    return failureDeletionTimestamp;
  }

  public void setFailureDeletionTimestamp(@Nullable OffsetDateTime failureDeletionTimestamp) {
    this.failureDeletionTimestamp = failureDeletionTimestamp;
  }

  public WebhookResponse filters(List<WebhookResponseAllOfFilters> filters) {
    this.filters = filters;
    return this;
  }

  public WebhookResponse addFiltersItem(WebhookResponseAllOfFilters filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Whitelist of filters to apply to events from this webhook. If a webhook event passes any of the filters the event will be delivered; otherwise no event will be sent to the receiving server.
   * @return filters
   */
  @Valid 
  @Schema(name = "filters", description = "Whitelist of filters to apply to events from this webhook. If a webhook event passes any of the filters the event will be delivered; otherwise no event will be sent to the receiving server.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filters")
  public List<WebhookResponseAllOfFilters> getFilters() {
    return filters;
  }

  public void setFilters(List<WebhookResponseAllOfFilters> filters) {
    this.filters = filters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookResponse webhookResponse = (WebhookResponse) o;
    return Objects.equals(this.gid, webhookResponse.gid) &&
        Objects.equals(this.resourceType, webhookResponse.resourceType) &&
        Objects.equals(this.active, webhookResponse.active) &&
        Objects.equals(this.resource, webhookResponse.resource) &&
        Objects.equals(this.target, webhookResponse.target) &&
        Objects.equals(this.createdAt, webhookResponse.createdAt) &&
        Objects.equals(this.lastFailureAt, webhookResponse.lastFailureAt) &&
        Objects.equals(this.lastFailureContent, webhookResponse.lastFailureContent) &&
        Objects.equals(this.lastSuccessAt, webhookResponse.lastSuccessAt) &&
        Objects.equals(this.deliveryRetryCount, webhookResponse.deliveryRetryCount) &&
        Objects.equals(this.nextAttemptAfter, webhookResponse.nextAttemptAfter) &&
        Objects.equals(this.failureDeletionTimestamp, webhookResponse.failureDeletionTimestamp) &&
        Objects.equals(this.filters, webhookResponse.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, active, resource, target, createdAt, lastFailureAt, lastFailureContent, lastSuccessAt, deliveryRetryCount, nextAttemptAfter, failureDeletionTimestamp, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastFailureAt: ").append(toIndentedString(lastFailureAt)).append("\n");
    sb.append("    lastFailureContent: ").append(toIndentedString(lastFailureContent)).append("\n");
    sb.append("    lastSuccessAt: ").append(toIndentedString(lastSuccessAt)).append("\n");
    sb.append("    deliveryRetryCount: ").append(toIndentedString(deliveryRetryCount)).append("\n");
    sb.append("    nextAttemptAfter: ").append(toIndentedString(nextAttemptAfter)).append("\n");
    sb.append("    failureDeletionTimestamp: ").append(toIndentedString(failureDeletionTimestamp)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

