package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.BatchRequestAction;
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
 * A request object for use in a batch request.
 */

@Schema(name = "BatchRequest", description = "A request object for use in a batch request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class BatchRequest {

  @Valid
  private List<@Valid BatchRequestAction> actions = new ArrayList<>();

  public BatchRequest actions(List<@Valid BatchRequestAction> actions) {
    this.actions = actions;
    return this;
  }

  public BatchRequest addActionsItem(BatchRequestAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Get actions
   * @return actions
   */
  @Valid 
  @Schema(name = "actions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actions")
  public List<@Valid BatchRequestAction> getActions() {
    return actions;
  }

  public void setActions(List<@Valid BatchRequestAction> actions) {
    this.actions = actions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequest batchRequest = (BatchRequest) o;
    return Objects.equals(this.actions, batchRequest.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequest {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

