package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.TaskCompactCreatedBy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * AttachmentResponseAllOfParent
 */

@JsonTypeName("AttachmentResponse_allOf_parent")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class AttachmentResponseAllOfParent {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  private JsonNullable<String> resourceSubtype = JsonNullable.<String>undefined();

  private @Nullable TaskCompactCreatedBy createdBy;

  public AttachmentResponseAllOfParent gid(@Nullable String gid) {
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

  public AttachmentResponseAllOfParent resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public AttachmentResponseAllOfParent name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the task.
   * @return name
   */
  
  @Schema(name = "name", example = "Bug Task", description = "The name of the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public AttachmentResponseAllOfParent resourceSubtype(String resourceSubtype) {
    this.resourceSubtype = JsonNullable.of(resourceSubtype);
    return this;
  }

  /**
   * The resource subtype of the parent resource that the filter applies to.
   * @return resourceSubtype
   */
  
  @Schema(name = "resource_subtype", example = "default_task", description = "The resource subtype of the parent resource that the filter applies to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public JsonNullable<String> getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(JsonNullable<String> resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public AttachmentResponseAllOfParent createdBy(@Nullable TaskCompactCreatedBy createdBy) {
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
  public @Nullable TaskCompactCreatedBy getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(@Nullable TaskCompactCreatedBy createdBy) {
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
    AttachmentResponseAllOfParent attachmentResponseAllOfParent = (AttachmentResponseAllOfParent) o;
    return Objects.equals(this.gid, attachmentResponseAllOfParent.gid) &&
        Objects.equals(this.resourceType, attachmentResponseAllOfParent.resourceType) &&
        Objects.equals(this.name, attachmentResponseAllOfParent.name) &&
        equalsNullable(this.resourceSubtype, attachmentResponseAllOfParent.resourceSubtype) &&
        Objects.equals(this.createdBy, attachmentResponseAllOfParent.createdBy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, hashCodeNullable(resourceSubtype), createdBy);
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
    sb.append("class AttachmentResponseAllOfParent {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
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

