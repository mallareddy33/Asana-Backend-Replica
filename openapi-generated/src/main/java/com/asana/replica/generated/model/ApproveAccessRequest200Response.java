package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ApproveAccessRequest200Response
 */

@JsonTypeName("approveAccessRequest_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ApproveAccessRequest200Response {

  private @Nullable Object data;

  public ApproveAccessRequest200Response data(@Nullable Object data) {
    this.data = data;
    return this;
  }

  /**
   * An empty object. Some endpoints do not return an object on success. The success is conveyed through a 2-- status code and returning an empty object.
   * @return data
   */
  
  @Schema(name = "data", description = "An empty object. Some endpoints do not return an object on success. The success is conveyed through a 2-- status code and returning an empty object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public @Nullable Object getData() {
    return data;
  }

  public void setData(@Nullable Object data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApproveAccessRequest200Response approveAccessRequest200Response = (ApproveAccessRequest200Response) o;
    return Objects.equals(this.data, approveAccessRequest200Response.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApproveAccessRequest200Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

