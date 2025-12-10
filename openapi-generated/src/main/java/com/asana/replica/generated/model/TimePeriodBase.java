package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.TimePeriodCompact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * TimePeriodBase
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TimePeriodBase {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String endOn;

  private @Nullable String startOn;

  /**
   * The cadence and index of the time period.
   */
  public enum PeriodEnum {
    FY("FY"),
    
    H1("H1"),
    
    H2("H2"),
    
    Q1("Q1"),
    
    Q2("Q2"),
    
    Q3("Q3"),
    
    Q4("Q4");

    private final String value;

    PeriodEnum(String value) {
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
    public static PeriodEnum fromValue(String value) {
      for (PeriodEnum b : PeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable PeriodEnum period;

  private @Nullable String displayName;

  private JsonNullable<TimePeriodCompact> parent = JsonNullable.<TimePeriodCompact>undefined();

  public TimePeriodBase gid(@Nullable String gid) {
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

  public TimePeriodBase resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "time_period", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public TimePeriodBase endOn(@Nullable String endOn) {
    this.endOn = endOn;
    return this;
  }

  /**
   * The localized end date of the time period in `YYYY-MM-DD` format.
   * @return endOn
   */
  
  @Schema(name = "end_on", example = "2019-09-14", description = "The localized end date of the time period in `YYYY-MM-DD` format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_on")
  public @Nullable String getEndOn() {
    return endOn;
  }

  public void setEndOn(@Nullable String endOn) {
    this.endOn = endOn;
  }

  public TimePeriodBase startOn(@Nullable String startOn) {
    this.startOn = startOn;
    return this;
  }

  /**
   * The localized start date of the time period in `YYYY-MM-DD` format.
   * @return startOn
   */
  
  @Schema(name = "start_on", example = "2019-09-13", description = "The localized start date of the time period in `YYYY-MM-DD` format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_on")
  public @Nullable String getStartOn() {
    return startOn;
  }

  public void setStartOn(@Nullable String startOn) {
    this.startOn = startOn;
  }

  public TimePeriodBase period(@Nullable PeriodEnum period) {
    this.period = period;
    return this;
  }

  /**
   * The cadence and index of the time period.
   * @return period
   */
  
  @Schema(name = "period", example = "Q1", description = "The cadence and index of the time period.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("period")
  public @Nullable PeriodEnum getPeriod() {
    return period;
  }

  public void setPeriod(@Nullable PeriodEnum period) {
    this.period = period;
  }

  public TimePeriodBase displayName(@Nullable String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * A string representing the cadence code and the fiscal year.
   * @return displayName
   */
  
  @Schema(name = "display_name", example = "Q1 FY22", description = "A string representing the cadence code and the fiscal year.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display_name")
  public @Nullable String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(@Nullable String displayName) {
    this.displayName = displayName;
  }

  public TimePeriodBase parent(TimePeriodCompact parent) {
    this.parent = JsonNullable.of(parent);
    return this;
  }

  /**
   * Get parent
   * @return parent
   */
  @Valid 
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public JsonNullable<TimePeriodCompact> getParent() {
    return parent;
  }

  public void setParent(JsonNullable<TimePeriodCompact> parent) {
    this.parent = parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePeriodBase timePeriodBase = (TimePeriodBase) o;
    return Objects.equals(this.gid, timePeriodBase.gid) &&
        Objects.equals(this.resourceType, timePeriodBase.resourceType) &&
        Objects.equals(this.endOn, timePeriodBase.endOn) &&
        Objects.equals(this.startOn, timePeriodBase.startOn) &&
        Objects.equals(this.period, timePeriodBase.period) &&
        Objects.equals(this.displayName, timePeriodBase.displayName) &&
        equalsNullable(this.parent, timePeriodBase.parent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, endOn, startOn, period, displayName, hashCodeNullable(parent));
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
    sb.append("class TimePeriodBase {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    endOn: ").append(toIndentedString(endOn)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

