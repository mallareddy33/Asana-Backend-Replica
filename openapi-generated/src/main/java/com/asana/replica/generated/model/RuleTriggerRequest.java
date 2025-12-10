package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RuleTriggerRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class RuleTriggerRequest {

  private String resource;

  @Valid
  private Map<String, Object> actionData = new HashMap<>();

  public RuleTriggerRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RuleTriggerRequest(String resource, Map<String, Object> actionData) {
    this.resource = resource;
    this.actionData = actionData;
  }

  public RuleTriggerRequest resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * The ID of the resource. For the duration of the beta, this resource is always a task, and this task must exist in the project in which the rule is created.
   * @return resource
   */
  @NotNull 
  @Schema(name = "resource", example = "12345", description = "The ID of the resource. For the duration of the beta, this resource is always a task, and this task must exist in the project in which the rule is created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resource")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public RuleTriggerRequest actionData(Map<String, Object> actionData) {
    this.actionData = actionData;
    return this;
  }

  public RuleTriggerRequest putActionDataItem(String key, Object actionDataItem) {
    if (this.actionData == null) {
      this.actionData = new HashMap<>();
    }
    this.actionData.put(key, actionDataItem);
    return this;
  }

  /**
   * The dynamic keys and values of the request. These fields are intended to be used in the action for the rule associated with this trigger.
   * @return actionData
   */
  @NotNull 
  @Schema(name = "action_data", example = "{\"jira_ticket_name\":\"Test\",\"jira_ticket_id\":\"123\"}", description = "The dynamic keys and values of the request. These fields are intended to be used in the action for the rule associated with this trigger.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action_data")
  public Map<String, Object> getActionData() {
    return actionData;
  }

  public void setActionData(Map<String, Object> actionData) {
    this.actionData = actionData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleTriggerRequest ruleTriggerRequest = (RuleTriggerRequest) o;
    return Objects.equals(this.resource, ruleTriggerRequest.resource) &&
        Objects.equals(this.actionData, ruleTriggerRequest.actionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, actionData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleTriggerRequest {\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    actionData: ").append(toIndentedString(actionData)).append("\n");
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

