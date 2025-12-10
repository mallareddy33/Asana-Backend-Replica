package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
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
 * Pagination (&#x60;limit&#x60; and &#x60;offset&#x60;) and output options (&#x60;fields&#x60; or &#x60;expand&#x60;) for the action. “Pretty” JSON output is not an available option on individual actions; if you want pretty output, specify that option on the parent request.
 */

@Schema(name = "BatchRequestAction_options", description = "Pagination (`limit` and `offset`) and output options (`fields` or `expand`) for the action. “Pretty” JSON output is not an available option on individual actions; if you want pretty output, specify that option on the parent request.")
@JsonTypeName("BatchRequestAction_options")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class BatchRequestActionOptions {

  private @Nullable Integer limit;

  private @Nullable Integer offset;

  @Valid
  private List<String> fields = new ArrayList<>();

  public BatchRequestActionOptions limit(@Nullable Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Pagination limit for the request.
   * @return limit
   */
  
  @Schema(name = "limit", example = "50", description = "Pagination limit for the request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public @Nullable Integer getLimit() {
    return limit;
  }

  public void setLimit(@Nullable Integer limit) {
    this.limit = limit;
  }

  public BatchRequestActionOptions offset(@Nullable Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Pagination offset for the request.
   * @return offset
   */
  
  @Schema(name = "offset", description = "Pagination offset for the request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offset")
  public @Nullable Integer getOffset() {
    return offset;
  }

  public void setOffset(@Nullable Integer offset) {
    this.offset = offset;
  }

  public BatchRequestActionOptions fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public BatchRequestActionOptions addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * The fields to retrieve in the request.
   * @return fields
   */
  
  @Schema(name = "fields", example = "[\"name\",\"gid\",\"notes\",\"completed\"]", description = "The fields to retrieve in the request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequestActionOptions batchRequestActionOptions = (BatchRequestActionOptions) o;
    return Objects.equals(this.limit, batchRequestActionOptions.limit) &&
        Objects.equals(this.offset, batchRequestActionOptions.offset) &&
        Objects.equals(this.fields, batchRequestActionOptions.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequestActionOptions {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

