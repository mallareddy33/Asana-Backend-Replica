package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.DateVariableCompact;
import com.asana.replica.generated.model.ProjectTemplateBaseAllOfOwner;
import com.asana.replica.generated.model.TeamCompact;
import com.asana.replica.generated.model.TemplateRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * ProjectTemplateResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ProjectTemplateResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable String htmlDescription;

  private @Nullable Boolean _public;

  private @Nullable ProjectTemplateBaseAllOfOwner owner;

  private @Nullable TeamCompact team;

  @Valid
  private List<@Valid DateVariableCompact> requestedDates = new ArrayList<>();

  /**
   * Color of the project template.
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
      return null;
    }
  }

  private JsonNullable<ColorEnum> color = JsonNullable.<ColorEnum>undefined();

  @Valid
  private List<@Valid TemplateRole> requestedRoles = new ArrayList<>();

  public ProjectTemplateResponse gid(@Nullable String gid) {
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

  public ProjectTemplateResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "project_template", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public ProjectTemplateResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the project template.
   * @return name
   */
  
  @Schema(name = "name", example = "Packing list", description = "Name of the project template.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public ProjectTemplateResponse description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Free-form textual information associated with the project template
   * @return description
   */
  
  @Schema(name = "description", example = "These are things we need to pack for a trip.", description = "Free-form textual information associated with the project template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public ProjectTemplateResponse htmlDescription(@Nullable String htmlDescription) {
    this.htmlDescription = htmlDescription;
    return this;
  }

  /**
   * The description of the project template with formatting as HTML.
   * @return htmlDescription
   */
  
  @Schema(name = "html_description", example = "<body>These are things we need to pack for a trip.</body>", description = "The description of the project template with formatting as HTML.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_description")
  public @Nullable String getHtmlDescription() {
    return htmlDescription;
  }

  public void setHtmlDescription(@Nullable String htmlDescription) {
    this.htmlDescription = htmlDescription;
  }

  public ProjectTemplateResponse _public(@Nullable Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * True if the project template is public to its team.
   * @return _public
   */
  
  @Schema(name = "public", example = "false", description = "True if the project template is public to its team.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("public")
  public @Nullable Boolean getPublic() {
    return _public;
  }

  public void setPublic(@Nullable Boolean _public) {
    this._public = _public;
  }

  public ProjectTemplateResponse owner(@Nullable ProjectTemplateBaseAllOfOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable ProjectTemplateBaseAllOfOwner getOwner() {
    return owner;
  }

  public void setOwner(@Nullable ProjectTemplateBaseAllOfOwner owner) {
    this.owner = owner;
  }

  public ProjectTemplateResponse team(@Nullable TeamCompact team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
   */
  @Valid 
  @Schema(name = "team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team")
  public @Nullable TeamCompact getTeam() {
    return team;
  }

  public void setTeam(@Nullable TeamCompact team) {
    this.team = team;
  }

  public ProjectTemplateResponse requestedDates(List<@Valid DateVariableCompact> requestedDates) {
    this.requestedDates = requestedDates;
    return this;
  }

  public ProjectTemplateResponse addRequestedDatesItem(DateVariableCompact requestedDatesItem) {
    if (this.requestedDates == null) {
      this.requestedDates = new ArrayList<>();
    }
    this.requestedDates.add(requestedDatesItem);
    return this;
  }

  /**
   * Array of date variables in this project template. Calendar dates must be provided for these variables when instantiating a project.
   * @return requestedDates
   */
  @Valid 
  @Schema(name = "requested_dates", accessMode = Schema.AccessMode.READ_ONLY, description = "Array of date variables in this project template. Calendar dates must be provided for these variables when instantiating a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requested_dates")
  public List<@Valid DateVariableCompact> getRequestedDates() {
    return requestedDates;
  }

  public void setRequestedDates(List<@Valid DateVariableCompact> requestedDates) {
    this.requestedDates = requestedDates;
  }

  public ProjectTemplateResponse color(ColorEnum color) {
    this.color = JsonNullable.of(color);
    return this;
  }

  /**
   * Color of the project template.
   * @return color
   */
  
  @Schema(name = "color", example = "light-green", description = "Color of the project template.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public JsonNullable<ColorEnum> getColor() {
    return color;
  }

  public void setColor(JsonNullable<ColorEnum> color) {
    this.color = color;
  }

  public ProjectTemplateResponse requestedRoles(List<@Valid TemplateRole> requestedRoles) {
    this.requestedRoles = requestedRoles;
    return this;
  }

  public ProjectTemplateResponse addRequestedRolesItem(TemplateRole requestedRolesItem) {
    if (this.requestedRoles == null) {
      this.requestedRoles = new ArrayList<>();
    }
    this.requestedRoles.add(requestedRolesItem);
    return this;
  }

  /**
   * Array of template roles in this project template. User Ids can be provided for these variables when instantiating a project to assign template tasks to the user.
   * @return requestedRoles
   */
  @Valid 
  @Schema(name = "requested_roles", description = "Array of template roles in this project template. User Ids can be provided for these variables when instantiating a project to assign template tasks to the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requested_roles")
  public List<@Valid TemplateRole> getRequestedRoles() {
    return requestedRoles;
  }

  public void setRequestedRoles(List<@Valid TemplateRole> requestedRoles) {
    this.requestedRoles = requestedRoles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectTemplateResponse projectTemplateResponse = (ProjectTemplateResponse) o;
    return Objects.equals(this.gid, projectTemplateResponse.gid) &&
        Objects.equals(this.resourceType, projectTemplateResponse.resourceType) &&
        Objects.equals(this.name, projectTemplateResponse.name) &&
        Objects.equals(this.description, projectTemplateResponse.description) &&
        Objects.equals(this.htmlDescription, projectTemplateResponse.htmlDescription) &&
        Objects.equals(this._public, projectTemplateResponse._public) &&
        Objects.equals(this.owner, projectTemplateResponse.owner) &&
        Objects.equals(this.team, projectTemplateResponse.team) &&
        Objects.equals(this.requestedDates, projectTemplateResponse.requestedDates) &&
        equalsNullable(this.color, projectTemplateResponse.color) &&
        Objects.equals(this.requestedRoles, projectTemplateResponse.requestedRoles);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, description, htmlDescription, _public, owner, team, requestedDates, hashCodeNullable(color), requestedRoles);
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
    sb.append("class ProjectTemplateResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    htmlDescription: ").append(toIndentedString(htmlDescription)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    requestedDates: ").append(toIndentedString(requestedDates)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    requestedRoles: ").append(toIndentedString(requestedRoles)).append("\n");
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

