package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.GetEvents412ResponseErrorsInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetEvents412Response
 */

@JsonTypeName("getEvents_412_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class GetEvents412Response {

  @Valid
  private List<@Valid GetEvents412ResponseErrorsInner> errors = new ArrayList<>();

  private @Nullable String sync;

  public GetEvents412Response errors(List<@Valid GetEvents412ResponseErrorsInner> errors) {
    this.errors = errors;
    return this;
  }

  public GetEvents412Response addErrorsItem(GetEvents412ResponseErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
   */
  @Valid 
  @Schema(name = "errors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid GetEvents412ResponseErrorsInner> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid GetEvents412ResponseErrorsInner> errors) {
    this.errors = errors;
  }

  public GetEvents412Response sync(@Nullable String sync) {
    this.sync = sync;
    return this;
  }

  /**
   * A sync token to be used with the next call to the /events endpoint.
   * @return sync
   */
  
  @Schema(name = "sync", accessMode = Schema.AccessMode.READ_ONLY, example = "de4774f6915eae04714ca93bb2f5ee81", description = "A sync token to be used with the next call to the /events endpoint.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sync")
  public @Nullable String getSync() {
    return sync;
  }

  public void setSync(@Nullable String sync) {
    this.sync = sync;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEvents412Response getEvents412Response = (GetEvents412Response) o;
    return Objects.equals(this.errors, getEvents412Response.errors) &&
        Objects.equals(this.sync, getEvents412Response.sync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, sync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEvents412Response {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
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

