package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Event specific details. The schema will vary depending on the &#x60;event_type&#x60;.
 */

@Schema(name = "AuditLogEventDetails", description = "Event specific details. The schema will vary depending on the `event_type`.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class AuditLogEventDetails {

  private JsonNullable<String> oldValue = JsonNullable.<String>undefined();

  private JsonNullable<String> newValue = JsonNullable.<String>undefined();

  @Valid
  private Map<String, Object> group = new HashMap<>();

  public AuditLogEventDetails oldValue(String oldValue) {
    this.oldValue = JsonNullable.of(oldValue);
    return this;
  }

  /**
   * The previous value of the field that was modified in the audited event.
   * @return oldValue
   */
  
  @Schema(name = "old_value", description = "The previous value of the field that was modified in the audited event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_value")
  public JsonNullable<String> getOldValue() {
    return oldValue;
  }

  public void setOldValue(JsonNullable<String> oldValue) {
    this.oldValue = oldValue;
  }

  public AuditLogEventDetails newValue(String newValue) {
    this.newValue = JsonNullable.of(newValue);
    return this;
  }

  /**
   * The new value after the modification in the audited event.
   * @return newValue
   */
  
  @Schema(name = "new_value", description = "The new value after the modification in the audited event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_value")
  public JsonNullable<String> getNewValue() {
    return newValue;
  }

  public void setNewValue(JsonNullable<String> newValue) {
    this.newValue = newValue;
  }

  public AuditLogEventDetails group(Map<String, Object> group) {
    this.group = group;
    return this;
  }

  public AuditLogEventDetails putGroupItem(String key, Object groupItem) {
    if (this.group == null) {
      this.group = new HashMap<>();
    }
    this.group.put(key, groupItem);
    return this;
  }

  /**
   * The division or organizational unit where the event occurred. Primarily used to scope role change events (e.g., `user_division_admin_role_changed`), but may appear in other contexts involving group-level changes.
   * @return group
   */
  
  @Schema(name = "group", description = "The division or organizational unit where the event occurred. Primarily used to scope role change events (e.g., `user_division_admin_role_changed`), but may appear in other contexts involving group-level changes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group")
  public Map<String, Object> getGroup() {
    return group;
  }

  public void setGroup(Map<String, Object> group) {
    this.group = group;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public AuditLogEventDetails putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogEventDetails auditLogEventDetails = (AuditLogEventDetails) o;
    return equalsNullable(this.oldValue, auditLogEventDetails.oldValue) &&
        equalsNullable(this.newValue, auditLogEventDetails.newValue) &&
        Objects.equals(this.group, auditLogEventDetails.group) &&
    Objects.equals(this.additionalProperties, auditLogEventDetails.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(oldValue), hashCodeNullable(newValue), group, additionalProperties);
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
    sb.append("class AuditLogEventDetails {\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

