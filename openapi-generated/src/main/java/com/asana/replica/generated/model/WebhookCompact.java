package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.AsanaNamedResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Webhook objects represent the state of an active subscription for a server to be updated with information from Asana. This schema represents the subscription itself, not the objects that are sent to the server. For information on those please refer to the [event](/reference/events) schema.
 */

@Schema(name = "WebhookCompact", description = "Webhook objects represent the state of an active subscription for a server to be updated with information from Asana. This schema represents the subscription itself, not the objects that are sent to the server. For information on those please refer to the [event](/reference/events) schema.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class WebhookCompact {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable Boolean active;

  private @Nullable AsanaNamedResource resource;

  private @Nullable URI target;

  public WebhookCompact gid(@Nullable String gid) {
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

  public WebhookCompact resourceType(@Nullable String resourceType) {
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

  public WebhookCompact active(@Nullable Boolean active) {
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

  public WebhookCompact resource(@Nullable AsanaNamedResource resource) {
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

  public WebhookCompact target(@Nullable URI target) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookCompact webhookCompact = (WebhookCompact) o;
    return Objects.equals(this.gid, webhookCompact.gid) &&
        Objects.equals(this.resourceType, webhookCompact.resourceType) &&
        Objects.equals(this.active, webhookCompact.active) &&
        Objects.equals(this.resource, webhookCompact.resource) &&
        Objects.equals(this.target, webhookCompact.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, active, resource, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

