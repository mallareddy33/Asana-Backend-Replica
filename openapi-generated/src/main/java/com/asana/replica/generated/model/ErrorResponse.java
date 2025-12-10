package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.Error;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Sadly, sometimes requests to the API are not successful. Failures can occur for a wide range of reasons. In all cases, the API should return an HTTP Status Code that indicates the nature of the failure, with a response body in JSON format containing additional information.   In the event of a server error the response body will contain an error phrase. These phrases are automatically generated using the [node-asana-phrase library](https://github.com/Asana/node-asana-phrase) and can be used by Asana support to quickly look up the incident that caused the server error.
 */

@Schema(name = "ErrorResponse", description = "Sadly, sometimes requests to the API are not successful. Failures can occur for a wide range of reasons. In all cases, the API should return an HTTP Status Code that indicates the nature of the failure, with a response body in JSON format containing additional information.   In the event of a server error the response body will contain an error phrase. These phrases are automatically generated using the [node-asana-phrase library](https://github.com/Asana/node-asana-phrase) and can be used by Asana support to quickly look up the incident that caused the server error.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ErrorResponse {

  @Valid
  private List<@Valid Error> errors = new ArrayList<>();

  public ErrorResponse errors(List<@Valid Error> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorResponse addErrorsItem(Error errorsItem) {
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
  public List<@Valid Error> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid Error> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.errors, errorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

