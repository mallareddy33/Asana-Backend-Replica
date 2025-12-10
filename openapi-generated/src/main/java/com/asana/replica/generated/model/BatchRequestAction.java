package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.BatchRequestActionOptions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * An action object for use in a batch request.
 */

@Schema(name = "BatchRequestAction", description = "An action object for use in a batch request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class BatchRequestAction {

  private String relativePath;

  /**
   * The HTTP method you wish to emulate for the action.
   */
  public enum MethodEnum {
    GET("get"),
    
    POST("post"),
    
    PUT("put"),
    
    DELETE("delete"),
    
    PATCH("patch"),
    
    HEAD("head");

    private final String value;

    MethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MethodEnum method;

  private @Nullable Object data;

  private @Nullable BatchRequestActionOptions options;

  public BatchRequestAction() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BatchRequestAction(String relativePath, MethodEnum method) {
    this.relativePath = relativePath;
    this.method = method;
  }

  public BatchRequestAction relativePath(String relativePath) {
    this.relativePath = relativePath;
    return this;
  }

  /**
   * The path of the desired endpoint relative to the API’s base URL. Query parameters are not accepted here; put them in `data` instead.
   * @return relativePath
   */
  @NotNull 
  @Schema(name = "relative_path", example = "/tasks/123", description = "The path of the desired endpoint relative to the API’s base URL. Query parameters are not accepted here; put them in `data` instead.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("relative_path")
  public String getRelativePath() {
    return relativePath;
  }

  public void setRelativePath(String relativePath) {
    this.relativePath = relativePath;
  }

  public BatchRequestAction method(MethodEnum method) {
    this.method = method;
    return this;
  }

  /**
   * The HTTP method you wish to emulate for the action.
   * @return method
   */
  @NotNull 
  @Schema(name = "method", example = "get", description = "The HTTP method you wish to emulate for the action.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("method")
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public BatchRequestAction data(@Nullable Object data) {
    this.data = data;
    return this;
  }

  /**
   * For `GET` requests, this should be a map of query parameters you would have normally passed in the URL. Options and pagination are not accepted here; put them in `options` instead. For `POST`, `PATCH`, and `PUT` methods, this should be the content you would have normally put in the data field of the body.
   * @return data
   */
  
  @Schema(name = "data", example = "{\"assignee\":\"me\",\"workspace\":\"1337\"}", description = "For `GET` requests, this should be a map of query parameters you would have normally passed in the URL. Options and pagination are not accepted here; put them in `options` instead. For `POST`, `PATCH`, and `PUT` methods, this should be the content you would have normally put in the data field of the body.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public @Nullable Object getData() {
    return data;
  }

  public void setData(@Nullable Object data) {
    this.data = data;
  }

  public BatchRequestAction options(@Nullable BatchRequestActionOptions options) {
    this.options = options;
    return this;
  }

  /**
   * Get options
   * @return options
   */
  @Valid 
  @Schema(name = "options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("options")
  public @Nullable BatchRequestActionOptions getOptions() {
    return options;
  }

  public void setOptions(@Nullable BatchRequestActionOptions options) {
    this.options = options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequestAction batchRequestAction = (BatchRequestAction) o;
    return Objects.equals(this.relativePath, batchRequestAction.relativePath) &&
        Objects.equals(this.method, batchRequestAction.method) &&
        Objects.equals(this.data, batchRequestAction.data) &&
        Objects.equals(this.options, batchRequestAction.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relativePath, method, data, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequestAction {\n");
    sb.append("    relativePath: ").append(toIndentedString(relativePath)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

