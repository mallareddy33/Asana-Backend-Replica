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
 * GetEvents412ResponseErrorsInner
 */

@JsonTypeName("getEvents_412_response_errors_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class GetEvents412ResponseErrorsInner {

  private @Nullable String message;

  public GetEvents412ResponseErrorsInner message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Message providing more detail about the error that occurred, if available.
   * @return message
   */
  
  @Schema(name = "message", accessMode = Schema.AccessMode.READ_ONLY, example = "Sync token invalid or too old. If you are attempting to keep resources in sync, you must fetch the full dataset for this query now and use the new sync token for the next sync.", description = "Message providing more detail about the error that occurred, if available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEvents412ResponseErrorsInner getEvents412ResponseErrorsInner = (GetEvents412ResponseErrorsInner) o;
    return Objects.equals(this.message, getEvents412ResponseErrorsInner.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEvents412ResponseErrorsInner {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

