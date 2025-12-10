package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.Arrays;
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

/**
 * GoalResponseAllOfMetric
 */

@JsonTypeName("GoalResponse_allOf_metric")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class GoalResponseAllOfMetric {

  private @Nullable String gid;

  private @Nullable String resourceType;

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   */
  public enum ResourceSubtypeEnum {
    NUMBER("number");

    private final String value;

    ResourceSubtypeEnum(String value) {
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
    public static ResourceSubtypeEnum fromValue(String value) {
      for (ResourceSubtypeEnum b : ResourceSubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ResourceSubtypeEnum resourceSubtype;

  private @Nullable Integer precision;

  /**
   * A supported unit of measure for the goal metric, or none.
   */
  public enum UnitEnum {
    NONE("none"),
    
    CURRENCY("currency"),
    
    PERCENTAGE("percentage");

    private final String value;

    UnitEnum(String value) {
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
    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable UnitEnum unit;

  private JsonNullable<String> currencyCode = JsonNullable.<String>undefined();

  private @Nullable BigDecimal initialNumberValue;

  private @Nullable BigDecimal targetNumberValue;

  private @Nullable BigDecimal currentNumberValue;

  private @Nullable String currentDisplayValue;

  /**
   * This field defines how the progress value of a goal metric is being calculated. A goal's progress can be provided manually by the user, calculated automatically from contributing subgoals, projects, or tasks, or managed by an integration with an external data source, such as Salesforce.
   */
  public enum ProgressSourceEnum {
    MANUAL("manual"),
    
    SUBGOAL_PROGRESS("subgoal_progress"),
    
    PROJECT_TASK_COMPLETION("project_task_completion"),
    
    PROJECT_MILESTONE_COMPLETION("project_milestone_completion"),
    
    TASK_COMPLETION("task_completion"),
    
    EXTERNAL("external");

    private final String value;

    ProgressSourceEnum(String value) {
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
    public static ProgressSourceEnum fromValue(String value) {
      for (ProgressSourceEnum b : ProgressSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ProgressSourceEnum progressSource;

  private @Nullable Boolean isCustomWeight;

  private @Nullable Boolean canManage;

  public GoalResponseAllOfMetric gid(@Nullable String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
   */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public @Nullable String getGid() {
    return gid;
  }

  public void setGid(@Nullable String gid) {
    this.gid = gid;
  }

  public GoalResponseAllOfMetric resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public GoalResponseAllOfMetric resourceSubtype(@Nullable ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   * @return resourceSubtype
   */
  
  @Schema(name = "resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "number", description = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public @Nullable ResourceSubtypeEnum getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(@Nullable ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public GoalResponseAllOfMetric precision(@Nullable Integer precision) {
    this.precision = precision;
    return this;
  }

  /**
   * *Conditional*. Only relevant for goal metrics of type `Number`. This field dictates the number of places after the decimal to round to, i.e. 0 is integer values, 1 rounds to the nearest tenth, and so on. Must be between 0 and 6, inclusive. For percentage format, this may be unintuitive, as a value of 0.25 has a precision of 0, while a value of 0.251 has a precision of 1. This is due to 0.25 being displayed as 25%.
   * @return precision
   */
  
  @Schema(name = "precision", example = "2", description = "*Conditional*. Only relevant for goal metrics of type `Number`. This field dictates the number of places after the decimal to round to, i.e. 0 is integer values, 1 rounds to the nearest tenth, and so on. Must be between 0 and 6, inclusive. For percentage format, this may be unintuitive, as a value of 0.25 has a precision of 0, while a value of 0.251 has a precision of 1. This is due to 0.25 being displayed as 25%.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("precision")
  public @Nullable Integer getPrecision() {
    return precision;
  }

  public void setPrecision(@Nullable Integer precision) {
    this.precision = precision;
  }

  public GoalResponseAllOfMetric unit(@Nullable UnitEnum unit) {
    this.unit = unit;
    return this;
  }

  /**
   * A supported unit of measure for the goal metric, or none.
   * @return unit
   */
  
  @Schema(name = "unit", description = "A supported unit of measure for the goal metric, or none.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unit")
  public @Nullable UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(@Nullable UnitEnum unit) {
    this.unit = unit;
  }

  public GoalResponseAllOfMetric currencyCode(String currencyCode) {
    this.currencyCode = JsonNullable.of(currencyCode);
    return this;
  }

  /**
   * ISO 4217 currency code to format this custom field. This will be null if the `unit` is not `currency`.
   * @return currencyCode
   */
  
  @Schema(name = "currency_code", example = "EUR", description = "ISO 4217 currency code to format this custom field. This will be null if the `unit` is not `currency`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency_code")
  public JsonNullable<String> getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(JsonNullable<String> currencyCode) {
    this.currencyCode = currencyCode;
  }

  public GoalResponseAllOfMetric initialNumberValue(@Nullable BigDecimal initialNumberValue) {
    this.initialNumberValue = initialNumberValue;
    return this;
  }

  /**
   * This number is the start value of a goal metric of type number.
   * @return initialNumberValue
   */
  @Valid 
  @Schema(name = "initial_number_value", example = "5.2", description = "This number is the start value of a goal metric of type number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("initial_number_value")
  public @Nullable BigDecimal getInitialNumberValue() {
    return initialNumberValue;
  }

  public void setInitialNumberValue(@Nullable BigDecimal initialNumberValue) {
    this.initialNumberValue = initialNumberValue;
  }

  public GoalResponseAllOfMetric targetNumberValue(@Nullable BigDecimal targetNumberValue) {
    this.targetNumberValue = targetNumberValue;
    return this;
  }

  /**
   * This number is the end value of a goal metric of type number. This number cannot equal `initial_number_value`.
   * @return targetNumberValue
   */
  @Valid 
  @Schema(name = "target_number_value", example = "10.2", description = "This number is the end value of a goal metric of type number. This number cannot equal `initial_number_value`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target_number_value")
  public @Nullable BigDecimal getTargetNumberValue() {
    return targetNumberValue;
  }

  public void setTargetNumberValue(@Nullable BigDecimal targetNumberValue) {
    this.targetNumberValue = targetNumberValue;
  }

  public GoalResponseAllOfMetric currentNumberValue(@Nullable BigDecimal currentNumberValue) {
    this.currentNumberValue = currentNumberValue;
    return this;
  }

  /**
   * This number is the current value of a goal metric of type number.
   * @return currentNumberValue
   */
  @Valid 
  @Schema(name = "current_number_value", example = "8.12", description = "This number is the current value of a goal metric of type number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current_number_value")
  public @Nullable BigDecimal getCurrentNumberValue() {
    return currentNumberValue;
  }

  public void setCurrentNumberValue(@Nullable BigDecimal currentNumberValue) {
    this.currentNumberValue = currentNumberValue;
  }

  public GoalResponseAllOfMetric currentDisplayValue(@Nullable String currentDisplayValue) {
    this.currentDisplayValue = currentDisplayValue;
    return this;
  }

  /**
   * This string is the current value of a goal metric of type string.
   * @return currentDisplayValue
   */
  
  @Schema(name = "current_display_value", accessMode = Schema.AccessMode.READ_ONLY, example = "8.12", description = "This string is the current value of a goal metric of type string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current_display_value")
  public @Nullable String getCurrentDisplayValue() {
    return currentDisplayValue;
  }

  public void setCurrentDisplayValue(@Nullable String currentDisplayValue) {
    this.currentDisplayValue = currentDisplayValue;
  }

  public GoalResponseAllOfMetric progressSource(@Nullable ProgressSourceEnum progressSource) {
    this.progressSource = progressSource;
    return this;
  }

  /**
   * This field defines how the progress value of a goal metric is being calculated. A goal's progress can be provided manually by the user, calculated automatically from contributing subgoals, projects, or tasks, or managed by an integration with an external data source, such as Salesforce.
   * @return progressSource
   */
  
  @Schema(name = "progress_source", example = "manual", description = "This field defines how the progress value of a goal metric is being calculated. A goal's progress can be provided manually by the user, calculated automatically from contributing subgoals, projects, or tasks, or managed by an integration with an external data source, such as Salesforce.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("progress_source")
  public @Nullable ProgressSourceEnum getProgressSource() {
    return progressSource;
  }

  public void setProgressSource(@Nullable ProgressSourceEnum progressSource) {
    this.progressSource = progressSource;
  }

  public GoalResponseAllOfMetric isCustomWeight(@Nullable Boolean isCustomWeight) {
    this.isCustomWeight = isCustomWeight;
    return this;
  }

  /**
   * *Conditional*. Only relevant if `metric.progress_source` is one of `subgoal_progress`, `project_task_completion`, `project_milestone_completion`, or `task_completion`. If true, we use the supporting object's custom weight to calculate the goal's progress. If false, we treat all supporting objects as equally weighted
   * @return isCustomWeight
   */
  
  @Schema(name = "is_custom_weight", example = "false", description = "*Conditional*. Only relevant if `metric.progress_source` is one of `subgoal_progress`, `project_task_completion`, `project_milestone_completion`, or `task_completion`. If true, we use the supporting object's custom weight to calculate the goal's progress. If false, we treat all supporting objects as equally weighted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_custom_weight")
  public @Nullable Boolean getIsCustomWeight() {
    return isCustomWeight;
  }

  public void setIsCustomWeight(@Nullable Boolean isCustomWeight) {
    this.isCustomWeight = isCustomWeight;
  }

  public GoalResponseAllOfMetric canManage(@Nullable Boolean canManage) {
    this.canManage = canManage;
    return this;
  }

  /**
   * *Conditional*. Only relevant for `progress_source` of type `external`. This boolean indicates whether the requester has the ability to update the current value of this metric. This returns `true` if the external metric was created by the requester, `false` otherwise.
   * @return canManage
   */
  
  @Schema(name = "can_manage", accessMode = Schema.AccessMode.READ_ONLY, example = "true", description = "*Conditional*. Only relevant for `progress_source` of type `external`. This boolean indicates whether the requester has the ability to update the current value of this metric. This returns `true` if the external metric was created by the requester, `false` otherwise.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("can_manage")
  public @Nullable Boolean getCanManage() {
    return canManage;
  }

  public void setCanManage(@Nullable Boolean canManage) {
    this.canManage = canManage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalResponseAllOfMetric goalResponseAllOfMetric = (GoalResponseAllOfMetric) o;
    return Objects.equals(this.gid, goalResponseAllOfMetric.gid) &&
        Objects.equals(this.resourceType, goalResponseAllOfMetric.resourceType) &&
        Objects.equals(this.resourceSubtype, goalResponseAllOfMetric.resourceSubtype) &&
        Objects.equals(this.precision, goalResponseAllOfMetric.precision) &&
        Objects.equals(this.unit, goalResponseAllOfMetric.unit) &&
        equalsNullable(this.currencyCode, goalResponseAllOfMetric.currencyCode) &&
        Objects.equals(this.initialNumberValue, goalResponseAllOfMetric.initialNumberValue) &&
        Objects.equals(this.targetNumberValue, goalResponseAllOfMetric.targetNumberValue) &&
        Objects.equals(this.currentNumberValue, goalResponseAllOfMetric.currentNumberValue) &&
        Objects.equals(this.currentDisplayValue, goalResponseAllOfMetric.currentDisplayValue) &&
        Objects.equals(this.progressSource, goalResponseAllOfMetric.progressSource) &&
        Objects.equals(this.isCustomWeight, goalResponseAllOfMetric.isCustomWeight) &&
        Objects.equals(this.canManage, goalResponseAllOfMetric.canManage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, resourceSubtype, precision, unit, hashCodeNullable(currencyCode), initialNumberValue, targetNumberValue, currentNumberValue, currentDisplayValue, progressSource, isCustomWeight, canManage);
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
    sb.append("class GoalResponseAllOfMetric {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    initialNumberValue: ").append(toIndentedString(initialNumberValue)).append("\n");
    sb.append("    targetNumberValue: ").append(toIndentedString(targetNumberValue)).append("\n");
    sb.append("    currentNumberValue: ").append(toIndentedString(currentNumberValue)).append("\n");
    sb.append("    currentDisplayValue: ").append(toIndentedString(currentDisplayValue)).append("\n");
    sb.append("    progressSource: ").append(toIndentedString(progressSource)).append("\n");
    sb.append("    isCustomWeight: ").append(toIndentedString(isCustomWeight)).append("\n");
    sb.append("    canManage: ").append(toIndentedString(canManage)).append("\n");
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

