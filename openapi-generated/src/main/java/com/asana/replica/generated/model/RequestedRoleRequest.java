package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RequestedRoleRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class RequestedRoleRequest {

  private @Nullable String gid;

  private @Nullable String value;

  public RequestedRoleRequest gid(@Nullable String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the template role in the project template.
   * @return gid
   */
  
  @Schema(name = "gid", example = "1", description = "Globally unique identifier of the template role in the project template.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public @Nullable String getGid() {
    return gid;
  }

  public void setGid(@Nullable String gid) {
    this.gid = gid;
  }

  public RequestedRoleRequest value(@Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * The user id that should be assigned to the template role.
   * @return value
   */
  
  @Schema(name = "value", example = "123", description = "The user id that should be assigned to the template role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable String getValue() {
    return value;
  }

  public void setValue(@Nullable String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestedRoleRequest requestedRoleRequest = (RequestedRoleRequest) o;
    return Objects.equals(this.gid, requestedRoleRequest.gid) &&
        Objects.equals(this.value, requestedRoleRequest.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestedRoleRequest {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

