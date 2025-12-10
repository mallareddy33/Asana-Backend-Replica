package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
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
 * PortfolioBase
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class PortfolioBase {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  private @Nullable Boolean archived;

  /**
   * Color of the portfolio.
   */
  public enum ColorEnum {
    DARK_PINK("dark-pink"),
    
    DARK_GREEN("dark-green"),
    
    DARK_BLUE("dark-blue"),
    
    DARK_RED("dark-red"),
    
    DARK_TEAL("dark-teal"),
    
    DARK_BROWN("dark-brown"),
    
    DARK_ORANGE("dark-orange"),
    
    DARK_PURPLE("dark-purple"),
    
    DARK_WARM_GRAY("dark-warm-gray"),
    
    LIGHT_PINK("light-pink"),
    
    LIGHT_GREEN("light-green"),
    
    LIGHT_BLUE("light-blue"),
    
    LIGHT_RED("light-red"),
    
    LIGHT_TEAL("light-teal"),
    
    LIGHT_BROWN("light-brown"),
    
    LIGHT_ORANGE("light-orange"),
    
    LIGHT_PURPLE("light-purple"),
    
    LIGHT_WARM_GRAY("light-warm-gray");

    private final String value;

    ColorEnum(String value) {
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
    public static ColorEnum fromValue(String value) {
      for (ColorEnum b : ColorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ColorEnum color;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> startOn = JsonNullable.<LocalDate>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> dueOn = JsonNullable.<LocalDate>undefined();

  /**
   * The default access level when inviting new members to the portfolio
   */
  public enum DefaultAccessLevelEnum {
    ADMIN("admin"),
    
    EDITOR("editor"),
    
    VIEWER("viewer");

    private final String value;

    DefaultAccessLevelEnum(String value) {
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
    public static DefaultAccessLevelEnum fromValue(String value) {
      for (DefaultAccessLevelEnum b : DefaultAccessLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable DefaultAccessLevelEnum defaultAccessLevel;

  public PortfolioBase gid(@Nullable String gid) {
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

  public PortfolioBase resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "portfolio", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public PortfolioBase name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the portfolio.
   * @return name
   */
  
  @Schema(name = "name", example = "Bug Portfolio", description = "The name of the portfolio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public PortfolioBase archived(@Nullable Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * [Opt In](/docs/inputoutput-options). True if the portfolio is archived, false if not. Archived portfolios do not show in the UI by default and may be treated differently for queries.
   * @return archived
   */
  
  @Schema(name = "archived", example = "false", description = "[Opt In](/docs/inputoutput-options). True if the portfolio is archived, false if not. Archived portfolios do not show in the UI by default and may be treated differently for queries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archived")
  public @Nullable Boolean getArchived() {
    return archived;
  }

  public void setArchived(@Nullable Boolean archived) {
    this.archived = archived;
  }

  public PortfolioBase color(@Nullable ColorEnum color) {
    this.color = color;
    return this;
  }

  /**
   * Color of the portfolio.
   * @return color
   */
  
  @Schema(name = "color", example = "light-green", description = "Color of the portfolio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public @Nullable ColorEnum getColor() {
    return color;
  }

  public void setColor(@Nullable ColorEnum color) {
    this.color = color;
  }

  public PortfolioBase startOn(LocalDate startOn) {
    this.startOn = JsonNullable.of(startOn);
    return this;
  }

  /**
   * The day on which work for this portfolio begins, or null if the portfolio has no start date. This takes a date with `YYYY-MM-DD` format. *Note: `due_on` must be present in the request when setting or unsetting the `start_on` parameter. Additionally, `start_on` and `due_on` cannot be the same date.*
   * @return startOn
   */
  @Valid 
  @Schema(name = "start_on", example = "2019-09-14", description = "The day on which work for this portfolio begins, or null if the portfolio has no start date. This takes a date with `YYYY-MM-DD` format. *Note: `due_on` must be present in the request when setting or unsetting the `start_on` parameter. Additionally, `start_on` and `due_on` cannot be the same date.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_on")
  public JsonNullable<LocalDate> getStartOn() {
    return startOn;
  }

  public void setStartOn(JsonNullable<LocalDate> startOn) {
    this.startOn = startOn;
  }

  public PortfolioBase dueOn(LocalDate dueOn) {
    this.dueOn = JsonNullable.of(dueOn);
    return this;
  }

  /**
   * The day on which this portfolio is due. This takes a date with format YYYY-MM-DD.
   * @return dueOn
   */
  @Valid 
  @Schema(name = "due_on", example = "2019-09-15", description = "The day on which this portfolio is due. This takes a date with format YYYY-MM-DD.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_on")
  public JsonNullable<LocalDate> getDueOn() {
    return dueOn;
  }

  public void setDueOn(JsonNullable<LocalDate> dueOn) {
    this.dueOn = dueOn;
  }

  public PortfolioBase defaultAccessLevel(@Nullable DefaultAccessLevelEnum defaultAccessLevel) {
    this.defaultAccessLevel = defaultAccessLevel;
    return this;
  }

  /**
   * The default access level when inviting new members to the portfolio
   * @return defaultAccessLevel
   */
  
  @Schema(name = "default_access_level", example = "viewer", description = "The default access level when inviting new members to the portfolio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_access_level")
  public @Nullable DefaultAccessLevelEnum getDefaultAccessLevel() {
    return defaultAccessLevel;
  }

  public void setDefaultAccessLevel(@Nullable DefaultAccessLevelEnum defaultAccessLevel) {
    this.defaultAccessLevel = defaultAccessLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioBase portfolioBase = (PortfolioBase) o;
    return Objects.equals(this.gid, portfolioBase.gid) &&
        Objects.equals(this.resourceType, portfolioBase.resourceType) &&
        Objects.equals(this.name, portfolioBase.name) &&
        Objects.equals(this.archived, portfolioBase.archived) &&
        Objects.equals(this.color, portfolioBase.color) &&
        equalsNullable(this.startOn, portfolioBase.startOn) &&
        equalsNullable(this.dueOn, portfolioBase.dueOn) &&
        Objects.equals(this.defaultAccessLevel, portfolioBase.defaultAccessLevel);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, archived, color, hashCodeNullable(startOn), hashCodeNullable(dueOn), defaultAccessLevel);
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
    sb.append("class PortfolioBase {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    defaultAccessLevel: ").append(toIndentedString(defaultAccessLevel)).append("\n");
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

