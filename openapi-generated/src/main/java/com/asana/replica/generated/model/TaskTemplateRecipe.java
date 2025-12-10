package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.AttachmentCompact;
import com.asana.replica.generated.model.CustomFieldCompact;
import com.asana.replica.generated.model.ProjectCompact;
import com.asana.replica.generated.model.TaskTemplateRecipeCompact;
import com.asana.replica.generated.model.UserCompact;
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
 * TaskTemplateRecipe
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TaskTemplateRecipe {

  private @Nullable String name;

  /**
   * The subtype of the task that will be created from this template.
   */
  public enum TaskResourceSubtypeEnum {
    DEFAULT_TASK("default_task"),
    
    MILESTONE_TASK("milestone_task"),
    
    APPROVAL_TASK("approval_task");

    private final String value;

    TaskResourceSubtypeEnum(String value) {
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
    public static TaskResourceSubtypeEnum fromValue(String value) {
      for (TaskResourceSubtypeEnum b : TaskResourceSubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable TaskResourceSubtypeEnum taskResourceSubtype;

  private @Nullable String description;

  private @Nullable String htmlDescription;

  @Valid
  private List<@Valid ProjectCompact> memberships = new ArrayList<>();

  private JsonNullable<Integer> relativeStartOn = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> relativeDueOn = JsonNullable.<Integer>undefined();

  private JsonNullable<String> dueTime = JsonNullable.<String>undefined();

  @Valid
  private List<@Valid TaskTemplateRecipeCompact> dependencies = new ArrayList<>();

  @Valid
  private List<@Valid TaskTemplateRecipeCompact> dependents = new ArrayList<>();

  @Valid
  private List<@Valid UserCompact> followers = new ArrayList<>();

  @Valid
  private List<@Valid AttachmentCompact> attachments = new ArrayList<>();

  @Valid
  private List<@Valid TaskTemplateRecipeCompact> subtasks = new ArrayList<>();

  @Valid
  private List<@Valid CustomFieldCompact> customFields = new ArrayList<>();

  public TaskTemplateRecipe name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the task that will be created from this template.
   * @return name
   */
  
  @Schema(name = "name", example = "Bug Report", description = "Name of the task that will be created from this template.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public TaskTemplateRecipe taskResourceSubtype(@Nullable TaskResourceSubtypeEnum taskResourceSubtype) {
    this.taskResourceSubtype = taskResourceSubtype;
    return this;
  }

  /**
   * The subtype of the task that will be created from this template.
   * @return taskResourceSubtype
   */
  
  @Schema(name = "task_resource_subtype", example = "default_task", description = "The subtype of the task that will be created from this template.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("task_resource_subtype")
  public @Nullable TaskResourceSubtypeEnum getTaskResourceSubtype() {
    return taskResourceSubtype;
  }

  public void setTaskResourceSubtype(@Nullable TaskResourceSubtypeEnum taskResourceSubtype) {
    this.taskResourceSubtype = taskResourceSubtype;
  }

  public TaskTemplateRecipe description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the task that will be created from this template.
   * @return description
   */
  
  @Schema(name = "description", example = "Please describe the bug you found and how to reproduce it.", description = "Description of the task that will be created from this template.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public TaskTemplateRecipe htmlDescription(@Nullable String htmlDescription) {
    this.htmlDescription = htmlDescription;
    return this;
  }

  /**
   * HTML description of the task that will be created from this template.
   * @return htmlDescription
   */
  
  @Schema(name = "html_description", example = "Please describe the bug you found and how to reproduce it.", description = "HTML description of the task that will be created from this template.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_description")
  public @Nullable String getHtmlDescription() {
    return htmlDescription;
  }

  public void setHtmlDescription(@Nullable String htmlDescription) {
    this.htmlDescription = htmlDescription;
  }

  public TaskTemplateRecipe memberships(List<@Valid ProjectCompact> memberships) {
    this.memberships = memberships;
    return this;
  }

  public TaskTemplateRecipe addMembershipsItem(ProjectCompact membershipsItem) {
    if (this.memberships == null) {
      this.memberships = new ArrayList<>();
    }
    this.memberships.add(membershipsItem);
    return this;
  }

  /**
   * Array of projects that the task created from this template will be added to
   * @return memberships
   */
  @Valid 
  @Schema(name = "memberships", description = "Array of projects that the task created from this template will be added to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memberships")
  public List<@Valid ProjectCompact> getMemberships() {
    return memberships;
  }

  public void setMemberships(List<@Valid ProjectCompact> memberships) {
    this.memberships = memberships;
  }

  public TaskTemplateRecipe relativeStartOn(Integer relativeStartOn) {
    this.relativeStartOn = JsonNullable.of(relativeStartOn);
    return this;
  }

  /**
   * The number of days after the task has been instantiated on which that the task will start
   * @return relativeStartOn
   */
  
  @Schema(name = "relative_start_on", example = "1", description = "The number of days after the task has been instantiated on which that the task will start", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relative_start_on")
  public JsonNullable<Integer> getRelativeStartOn() {
    return relativeStartOn;
  }

  public void setRelativeStartOn(JsonNullable<Integer> relativeStartOn) {
    this.relativeStartOn = relativeStartOn;
  }

  public TaskTemplateRecipe relativeDueOn(Integer relativeDueOn) {
    this.relativeDueOn = JsonNullable.of(relativeDueOn);
    return this;
  }

  /**
   * The number of days after the task has been instantiated on which that the task will be due
   * @return relativeDueOn
   */
  
  @Schema(name = "relative_due_on", example = "2", description = "The number of days after the task has been instantiated on which that the task will be due", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relative_due_on")
  public JsonNullable<Integer> getRelativeDueOn() {
    return relativeDueOn;
  }

  public void setRelativeDueOn(JsonNullable<Integer> relativeDueOn) {
    this.relativeDueOn = relativeDueOn;
  }

  public TaskTemplateRecipe dueTime(String dueTime) {
    this.dueTime = JsonNullable.of(dueTime);
    return this;
  }

  /**
   * The time of day that the task will be due
   * @return dueTime
   */
  
  @Schema(name = "due_time", example = "13:15:00.000Z", description = "The time of day that the task will be due", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_time")
  public JsonNullable<String> getDueTime() {
    return dueTime;
  }

  public void setDueTime(JsonNullable<String> dueTime) {
    this.dueTime = dueTime;
  }

  public TaskTemplateRecipe dependencies(List<@Valid TaskTemplateRecipeCompact> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public TaskTemplateRecipe addDependenciesItem(TaskTemplateRecipeCompact dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

  /**
   * Array of task templates that the task created from this template will depend on
   * @return dependencies
   */
  @Valid 
  @Schema(name = "dependencies", description = "Array of task templates that the task created from this template will depend on", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dependencies")
  public List<@Valid TaskTemplateRecipeCompact> getDependencies() {
    return dependencies;
  }

  public void setDependencies(List<@Valid TaskTemplateRecipeCompact> dependencies) {
    this.dependencies = dependencies;
  }

  public TaskTemplateRecipe dependents(List<@Valid TaskTemplateRecipeCompact> dependents) {
    this.dependents = dependents;
    return this;
  }

  public TaskTemplateRecipe addDependentsItem(TaskTemplateRecipeCompact dependentsItem) {
    if (this.dependents == null) {
      this.dependents = new ArrayList<>();
    }
    this.dependents.add(dependentsItem);
    return this;
  }

  /**
   * Array of task templates that will depend on the task created from this template
   * @return dependents
   */
  @Valid 
  @Schema(name = "dependents", description = "Array of task templates that will depend on the task created from this template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dependents")
  public List<@Valid TaskTemplateRecipeCompact> getDependents() {
    return dependents;
  }

  public void setDependents(List<@Valid TaskTemplateRecipeCompact> dependents) {
    this.dependents = dependents;
  }

  public TaskTemplateRecipe followers(List<@Valid UserCompact> followers) {
    this.followers = followers;
    return this;
  }

  public TaskTemplateRecipe addFollowersItem(UserCompact followersItem) {
    if (this.followers == null) {
      this.followers = new ArrayList<>();
    }
    this.followers.add(followersItem);
    return this;
  }

  /**
   * Array of users that will be added as followers to the task created from this template
   * @return followers
   */
  @Valid 
  @Schema(name = "followers", description = "Array of users that will be added as followers to the task created from this template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followers")
  public List<@Valid UserCompact> getFollowers() {
    return followers;
  }

  public void setFollowers(List<@Valid UserCompact> followers) {
    this.followers = followers;
  }

  public TaskTemplateRecipe attachments(List<@Valid AttachmentCompact> attachments) {
    this.attachments = attachments;
    return this;
  }

  public TaskTemplateRecipe addAttachmentsItem(AttachmentCompact attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Array of attachments that will be added to the task created from this template
   * @return attachments
   */
  @Valid 
  @Schema(name = "attachments", description = "Array of attachments that will be added to the task created from this template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachments")
  public List<@Valid AttachmentCompact> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<@Valid AttachmentCompact> attachments) {
    this.attachments = attachments;
  }

  public TaskTemplateRecipe subtasks(List<@Valid TaskTemplateRecipeCompact> subtasks) {
    this.subtasks = subtasks;
    return this;
  }

  public TaskTemplateRecipe addSubtasksItem(TaskTemplateRecipeCompact subtasksItem) {
    if (this.subtasks == null) {
      this.subtasks = new ArrayList<>();
    }
    this.subtasks.add(subtasksItem);
    return this;
  }

  /**
   * Array of subtasks that will be added to the task created from this template
   * @return subtasks
   */
  @Valid 
  @Schema(name = "subtasks", description = "Array of subtasks that will be added to the task created from this template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subtasks")
  public List<@Valid TaskTemplateRecipeCompact> getSubtasks() {
    return subtasks;
  }

  public void setSubtasks(List<@Valid TaskTemplateRecipeCompact> subtasks) {
    this.subtasks = subtasks;
  }

  public TaskTemplateRecipe customFields(List<@Valid CustomFieldCompact> customFields) {
    this.customFields = customFields;
    return this;
  }

  public TaskTemplateRecipe addCustomFieldsItem(CustomFieldCompact customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

  /**
   * Array of custom fields that will be added to the task created from this template
   * @return customFields
   */
  @Valid 
  @Schema(name = "custom_fields", description = "Array of custom fields that will be added to the task created from this template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_fields")
  public List<@Valid CustomFieldCompact> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(List<@Valid CustomFieldCompact> customFields) {
    this.customFields = customFields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskTemplateRecipe taskTemplateRecipe = (TaskTemplateRecipe) o;
    return Objects.equals(this.name, taskTemplateRecipe.name) &&
        Objects.equals(this.taskResourceSubtype, taskTemplateRecipe.taskResourceSubtype) &&
        Objects.equals(this.description, taskTemplateRecipe.description) &&
        Objects.equals(this.htmlDescription, taskTemplateRecipe.htmlDescription) &&
        Objects.equals(this.memberships, taskTemplateRecipe.memberships) &&
        equalsNullable(this.relativeStartOn, taskTemplateRecipe.relativeStartOn) &&
        equalsNullable(this.relativeDueOn, taskTemplateRecipe.relativeDueOn) &&
        equalsNullable(this.dueTime, taskTemplateRecipe.dueTime) &&
        Objects.equals(this.dependencies, taskTemplateRecipe.dependencies) &&
        Objects.equals(this.dependents, taskTemplateRecipe.dependents) &&
        Objects.equals(this.followers, taskTemplateRecipe.followers) &&
        Objects.equals(this.attachments, taskTemplateRecipe.attachments) &&
        Objects.equals(this.subtasks, taskTemplateRecipe.subtasks) &&
        Objects.equals(this.customFields, taskTemplateRecipe.customFields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, taskResourceSubtype, description, htmlDescription, memberships, hashCodeNullable(relativeStartOn), hashCodeNullable(relativeDueOn), hashCodeNullable(dueTime), dependencies, dependents, followers, attachments, subtasks, customFields);
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
    sb.append("class TaskTemplateRecipe {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taskResourceSubtype: ").append(toIndentedString(taskResourceSubtype)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    htmlDescription: ").append(toIndentedString(htmlDescription)).append("\n");
    sb.append("    memberships: ").append(toIndentedString(memberships)).append("\n");
    sb.append("    relativeStartOn: ").append(toIndentedString(relativeStartOn)).append("\n");
    sb.append("    relativeDueOn: ").append(toIndentedString(relativeDueOn)).append("\n");
    sb.append("    dueTime: ").append(toIndentedString(dueTime)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    dependents: ").append(toIndentedString(dependents)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    subtasks: ").append(toIndentedString(subtasks)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

