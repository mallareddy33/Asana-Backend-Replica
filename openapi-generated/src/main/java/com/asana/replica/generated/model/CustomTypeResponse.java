package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.CustomTypeStatusOptionResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * CustomTypeResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class CustomTypeResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  @Valid
  private JsonNullable<List<CustomTypeStatusOptionResponse>> statusOptions = JsonNullable.<List<CustomTypeStatusOptionResponse>>undefined();

  public CustomTypeResponse gid(@Nullable String gid) {
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

  public CustomTypeResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "custom_type", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public CustomTypeResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the custom type.
   * @return name
   */
  
  @Schema(name = "name", example = "Bug ticket", description = "The name of the custom type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public CustomTypeResponse statusOptions(List<CustomTypeStatusOptionResponse> statusOptions) {
    this.statusOptions = JsonNullable.of(statusOptions);
    return this;
  }

  public CustomTypeResponse addStatusOptionsItem(CustomTypeStatusOptionResponse statusOptionsItem) {
    if (this.statusOptions == null || !this.statusOptions.isPresent()) {
      this.statusOptions = JsonNullable.of(new ArrayList<>());
    }
    this.statusOptions.get().add(statusOptionsItem);
    return this;
  }

  /**
   * The available options for the custom type.
   * @return statusOptions
   */
  @Valid 
  @Schema(name = "status_options", description = "The available options for the custom type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status_options")
  public JsonNullable<List<CustomTypeStatusOptionResponse>> getStatusOptions() {
    return statusOptions;
  }

  public void setStatusOptions(JsonNullable<List<CustomTypeStatusOptionResponse>> statusOptions) {
    this.statusOptions = statusOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTypeResponse customTypeResponse = (CustomTypeResponse) o;
    return Objects.equals(this.gid, customTypeResponse.gid) &&
        Objects.equals(this.resourceType, customTypeResponse.resourceType) &&
        Objects.equals(this.name, customTypeResponse.name) &&
        equalsNullable(this.statusOptions, customTypeResponse.statusOptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, hashCodeNullable(statusOptions));
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
    sb.append("class CustomTypeResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statusOptions: ").append(toIndentedString(statusOptions)).append("\n");
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

