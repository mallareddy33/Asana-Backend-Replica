package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
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
 * The primary object that was affected by this event.
 */

@Schema(name = "AuditLogEventResource", description = "The primary object that was affected by this event.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class AuditLogEventResource {

  private @Nullable String resourceType;

  private @Nullable String resourceSubtype;

  private @Nullable String gid;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private @Nullable String email;

  public AuditLogEventResource resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The type of resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", example = "task", description = "The type of resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public AuditLogEventResource resourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The subtype of resource. Most resources will not have a subtype.
   * @return resourceSubtype
   */
  
  @Schema(name = "resource_subtype", example = "milestone", description = "The subtype of resource. Most resources will not have a subtype.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public @Nullable String getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public AuditLogEventResource gid(@Nullable String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource.
   * @return gid
   */
  
  @Schema(name = "gid", example = "1111", description = "Globally unique identifier of the resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public @Nullable String getGid() {
    return gid;
  }

  public void setGid(@Nullable String gid) {
    this.gid = gid;
  }

  public AuditLogEventResource name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * The name of the resource.
   * @return name
   */
  
  @Schema(name = "name", example = "Example Task", description = "The name of the resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public AuditLogEventResource email(@Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * The email of the resource, if applicable.
   * @return email
   */
  
  @Schema(name = "email", description = "The email of the resource, if applicable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public @Nullable String getEmail() {
    return email;
  }

  public void setEmail(@Nullable String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogEventResource auditLogEventResource = (AuditLogEventResource) o;
    return Objects.equals(this.resourceType, auditLogEventResource.resourceType) &&
        Objects.equals(this.resourceSubtype, auditLogEventResource.resourceSubtype) &&
        Objects.equals(this.gid, auditLogEventResource.gid) &&
        equalsNullable(this.name, auditLogEventResource.name) &&
        Objects.equals(this.email, auditLogEventResource.email);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, resourceSubtype, gid, hashCodeNullable(name), email);
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
    sb.append("class AuditLogEventResource {\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

