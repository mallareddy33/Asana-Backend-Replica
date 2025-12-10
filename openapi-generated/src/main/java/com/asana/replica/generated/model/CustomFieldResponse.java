package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.AsanaNamedResource;
import com.asana.replica.generated.model.CustomFieldCompactDateValue;
import com.asana.replica.generated.model.CustomFieldCompactEnumValue;
import com.asana.replica.generated.model.EnumOption;
import com.asana.replica.generated.model.UserCompact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
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
 * CustomFieldResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class CustomFieldResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  /**
   * *Deprecated: new integrations should prefer the resource_subtype field.* The type of the custom field. Must be one of the given values. 
   */
  public enum TypeEnum {
    TEXT("text"),
    
    ENUM("enum"),
    
    MULTI_ENUM("multi_enum"),
    
    NUMBER("number"),
    
    DATE("date"),
    
    PEOPLE("people");

    private final String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable TypeEnum type;

  @Valid
  private List<@Valid EnumOption> enumOptions = new ArrayList<>();

  private @Nullable Boolean enabled;

  /**
   * This field tells the type of the custom field.
   */
  public enum RepresentationTypeEnum {
    TEXT("text"),
    
    ENUM("enum"),
    
    MULTI_ENUM("multi_enum"),
    
    NUMBER("number"),
    
    DATE("date"),
    
    PEOPLE("people"),
    
    FORMULA("formula"),
    
    CUSTOM_ID("custom_id"),
    
    REFERENCE("reference");

    private final String value;

    RepresentationTypeEnum(String value) {
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
    public static RepresentationTypeEnum fromValue(String value) {
      for (RepresentationTypeEnum b : RepresentationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable RepresentationTypeEnum representationType;

  private JsonNullable<String> idPrefix = JsonNullable.<String>undefined();

  @Valid
  private List<String> inputRestrictions = new ArrayList<>();

  private @Nullable Boolean isFormulaField;

  private JsonNullable<CustomFieldCompactDateValue> dateValue = JsonNullable.<CustomFieldCompactDateValue>undefined();

  private @Nullable CustomFieldCompactEnumValue enumValue;

  @Valid
  private List<@Valid EnumOption> multiEnumValues = new ArrayList<>();

  private JsonNullable<BigDecimal> numberValue = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<String> textValue = JsonNullable.<String>undefined();

  private JsonNullable<String> displayValue = JsonNullable.<String>undefined();

  private @Nullable String description;

  private @Nullable Integer precision;

  /**
   * The format of this custom field.
   */
  public enum FormatEnum {
    CURRENCY("currency"),
    
    IDENTIFIER("identifier"),
    
    PERCENTAGE("percentage"),
    
    CUSTOM("custom"),
    
    DURATION("duration"),
    
    NONE("none");

    private final String value;

    FormatEnum(String value) {
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
    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable FormatEnum format;

  private JsonNullable<String> currencyCode = JsonNullable.<String>undefined();

  private JsonNullable<String> customLabel = JsonNullable.<String>undefined();

  /**
   * Only relevant for custom fields with `custom` format. This depicts where to place the custom label. This will be null if the `format` is not `custom`.
   */
  public enum CustomLabelPositionEnum {
    PREFIX("prefix"),
    
    SUFFIX("suffix");

    private final String value;

    CustomLabelPositionEnum(String value) {
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
    public static CustomLabelPositionEnum fromValue(String value) {
      for (CustomLabelPositionEnum b : CustomLabelPositionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private JsonNullable<CustomLabelPositionEnum> customLabelPosition = JsonNullable.<CustomLabelPositionEnum>undefined();

  private @Nullable Boolean isGlobalToWorkspace;

  private @Nullable Boolean hasNotificationsEnabled;

  /**
   * *Conditional*. A unique identifier to associate this field with the template source of truth.
   */
  public enum AsanaCreatedFieldEnum {
    A_V_REQUIREMENTS("a_v_requirements"),
    
    ACCOUNT_NAME("account_name"),
    
    ACTIONABLE("actionable"),
    
    ALIGN_SHIPPING_LINK("align_shipping_link"),
    
    ALIGN_STATUS("align_status"),
    
    ALLOTTED_TIME("allotted_time"),
    
    APPOINTMENT("appointment"),
    
    APPROVAL_STAGE("approval_stage"),
    
    APPROVED("approved"),
    
    ARTICLE_SERIES("article_series"),
    
    BOARD_COMMITTEE("board_committee"),
    
    BROWSER("browser"),
    
    CAMPAIGN_AUDIENCE("campaign_audience"),
    
    CAMPAIGN_PROJECT_STATUS("campaign_project_status"),
    
    CAMPAIGN_REGIONS("campaign_regions"),
    
    CHANNEL_PRIMARY("channel_primary"),
    
    CLIENT_TOPIC_TYPE("client_topic_type"),
    
    COMPLETE_BY("complete_by"),
    
    CONTACT("contact"),
    
    CONTACT_EMAIL_ADDRESS("contact_email_address"),
    
    CONTENT_CHANNELS("content_channels"),
    
    CONTENT_CHANNELS_NEEDED("content_channels_needed"),
    
    CONTENT_STAGE("content_stage"),
    
    CONTENT_TYPE("content_type"),
    
    CONTRACT("contract"),
    
    CONTRACT_STATUS("contract_status"),
    
    COST("cost"),
    
    CREATION_STAGE("creation_stage"),
    
    CREATIVE_CHANNEL("creative_channel"),
    
    CREATIVE_NEEDED("creative_needed"),
    
    CREATIVE_NEEDS("creative_needs"),
    
    DATA_SENSITIVITY("data_sensitivity"),
    
    DEAL_SIZE("deal_size"),
    
    DELIVERY_APPT("delivery_appt"),
    
    DELIVERY_APPT_DATE("delivery_appt_date"),
    
    DEPARTMENT("department"),
    
    DEPARTMENT_RESPONSIBLE("department_responsible"),
    
    DESIGN_REQUEST_NEEDED("design_request_needed"),
    
    DESIGN_REQUEST_TYPE("design_request_type"),
    
    DISCUSSION_CATEGORY("discussion_category"),
    
    DO_THIS_TASK("do_this_task"),
    
    EDITORIAL_CONTENT_STATUS("editorial_content_status"),
    
    EDITORIAL_CONTENT_TAG("editorial_content_tag"),
    
    EDITORIAL_CONTENT_TYPE("editorial_content_type"),
    
    EFFORT("effort"),
    
    EFFORT_LEVEL("effort_level"),
    
    EST_COMPLETION_DATE("est_completion_date"),
    
    ESTIMATED_TIME("estimated_time"),
    
    ESTIMATED_VALUE("estimated_value"),
    
    EXPECTED_COST("expected_cost"),
    
    EXTERNAL_STEPS_NEEDED("external_steps_needed"),
    
    FAVORITE_IDEA("favorite_idea"),
    
    FEEDBACK_TYPE("feedback_type"),
    
    FINANCIAL("financial"),
    
    FUNDING_AMOUNT("funding_amount"),
    
    GRANT_APPLICATION_PROCESS("grant_application_process"),
    
    HIRING_CANDIDATE_STATUS("hiring_candidate_status"),
    
    IDEA_STATUS("idea_status"),
    
    IDS_LINK("ids_link"),
    
    IDS_PATIENT_LINK("ids_patient_link"),
    
    IMPLEMENTATION_STAGE("implementation_stage"),
    
    INSURANCE("insurance"),
    
    INTERVIEW_AREA("interview_area"),
    
    INTERVIEW_QUESTION_SCORE("interview_question_score"),
    
    ITERO_SCAN_LINK("itero_scan_link"),
    
    JOB_S_APPLIED_TO("job_s_applied_to"),
    
    LAB("lab"),
    
    LAUNCH_STATUS("launch_status"),
    
    LEAD_STATUS("lead_status"),
    
    LOCALIZATION_LANGUAGE("localization_language"),
    
    LOCALIZATION_MARKET_TEAM("localization_market_team"),
    
    LOCALIZATION_STATUS("localization_status"),
    
    MEETING_MINUTES("meeting_minutes"),
    
    MEETING_NEEDED("meeting_needed"),
    
    MINUTES("minutes"),
    
    MRR("mrr"),
    
    MUST_LOCALIZE("must_localize"),
    
    NAME_OF_FOUNDATION("name_of_foundation"),
    
    NEED_TO_FOLLOW_UP("need_to_follow_up"),
    
    NEXT_APPOINTMENT("next_appointment"),
    
    NEXT_STEPS_SALES("next_steps_sales"),
    
    NUM_PEOPLE("num_people"),
    
    NUMBER_OF_USER_REPORTS("number_of_user_reports"),
    
    OFFICE_LOCATION("office_location"),
    
    ONBOARDING_ACTIVITY("onboarding_activity"),
    
    OWNER("owner"),
    
    PARTICIPANTS_NEEDED("participants_needed"),
    
    PATIENT_DATE_OF_BIRTH("patient_date_of_birth"),
    
    PATIENT_EMAIL("patient_email"),
    
    PATIENT_PHONE("patient_phone"),
    
    PATIENT_STATUS("patient_status"),
    
    PHONE_NUMBER("phone_number"),
    
    PLANNING_CATEGORY("planning_category"),
    
    POINT_OF_CONTACT("point_of_contact"),
    
    POSITION("position"),
    
    POST_FORMAT("post_format"),
    
    PRESCRIPTION("prescription"),
    
    PRIORITY("priority"),
    
    PRIORITY_LEVEL("priority_level"),
    
    PRODUCT("product"),
    
    PRODUCT_STAGE("product_stage"),
    
    PROGRESS("progress"),
    
    PROJECT_SIZE("project_size"),
    
    PROJECT_STATUS("project_status"),
    
    PROPOSED_BUDGET("proposed_budget"),
    
    PUBLISH_STATUS("publish_status"),
    
    REASON_FOR_SCAN("reason_for_scan"),
    
    REFERRAL("referral"),
    
    REQUEST_TYPE("request_type"),
    
    RESEARCH_STATUS("research_status"),
    
    RESPONSIBLE_DEPARTMENT("responsible_department"),
    
    RESPONSIBLE_TEAM("responsible_team"),
    
    RISK_ASSESSMENT_STATUS("risk_assessment_status"),
    
    ROOM_NAME("room_name"),
    
    SALES_COUNTERPART("sales_counterpart"),
    
    SENTIMENT("sentiment"),
    
    SHIPPING_LINK("shipping_link"),
    
    SOCIAL_CHANNELS("social_channels"),
    
    STAGE("stage"),
    
    STATUS("status"),
    
    STATUS_DESIGN("status_design"),
    
    STATUS_OF_INITIATIVE("status_of_initiative"),
    
    SYSTEM_SETUP("system_setup"),
    
    TASK_PROGRESS("task_progress"),
    
    TEAM("team"),
    
    TEAM_MARKETING("team_marketing"),
    
    TEAM_RESPONSIBLE("team_responsible"),
    
    TIME_IT_TAKES_TO_COMPLETE_TASKS("time_it_takes_to_complete_tasks"),
    
    TIMEFRAME("timeframe"),
    
    TREATMENT_TYPE("treatment_type"),
    
    TYPE_WORK_REQUESTS_IT("type_work_requests_it"),
    
    USE_AGENCY("use_agency"),
    
    USER_NAME("user_name"),
    
    VENDOR_CATEGORY("vendor_category"),
    
    VENDOR_TYPE("vendor_type"),
    
    WORD_COUNT("word_count");

    private final String value;

    AsanaCreatedFieldEnum(String value) {
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
    public static AsanaCreatedFieldEnum fromValue(String value) {
      for (AsanaCreatedFieldEnum b : AsanaCreatedFieldEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private JsonNullable<AsanaCreatedFieldEnum> asanaCreatedField = JsonNullable.<AsanaCreatedFieldEnum>undefined();

  private @Nullable Boolean isValueReadOnly;

  private JsonNullable<UserCompact> createdBy = JsonNullable.<UserCompact>undefined();

  @Valid
  private List<@Valid UserCompact> peopleValue = new ArrayList<>();

  @Valid
  private List<@Valid AsanaNamedResource> referenceValue = new ArrayList<>();

  /**
   * The privacy setting of the custom field. *Note: Administrators in your organization may restrict the values of `privacy_setting`.*
   */
  public enum PrivacySettingEnum {
    PUBLIC_WITH_GUESTS("public_with_guests"),
    
    PUBLIC("public"),
    
    PRIVATE("private");

    private final String value;

    PrivacySettingEnum(String value) {
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
    public static PrivacySettingEnum fromValue(String value) {
      for (PrivacySettingEnum b : PrivacySettingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable PrivacySettingEnum privacySetting;

  /**
   * The default access level when inviting new members to the custom field. This isn't applied when the `privacy_setting` is `private`, or the user is a guest. For local fields in a project or portfolio, the user must additionally have permission to modify the container itself.
   */
  public enum DefaultAccessLevelEnum {
    ADMIN("admin"),
    
    EDITOR("editor"),
    
    USER("user");

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

  /**
   * The type of the custom field. Must be one of the given values. 
   */
  public enum ResourceSubtypeEnum {
    TEXT("text"),
    
    ENUM("enum"),
    
    MULTI_ENUM("multi_enum"),
    
    NUMBER("number"),
    
    DATE("date"),
    
    PEOPLE("people"),
    
    REFERENCE("reference");

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

  public CustomFieldResponse gid(@Nullable String gid) {
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

  public CustomFieldResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "custom_field", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public CustomFieldResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the custom field.
   * @return name
   */
  
  @Schema(name = "name", example = "Status", description = "The name of the custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public CustomFieldResponse type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * *Deprecated: new integrations should prefer the resource_subtype field.* The type of the custom field. Must be one of the given values. 
   * @return type
   */
  
  @Schema(name = "type", accessMode = Schema.AccessMode.READ_ONLY, description = "*Deprecated: new integrations should prefer the resource_subtype field.* The type of the custom field. Must be one of the given values. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  public void setType(@Nullable TypeEnum type) {
    this.type = type;
  }

  public CustomFieldResponse enumOptions(List<@Valid EnumOption> enumOptions) {
    this.enumOptions = enumOptions;
    return this;
  }

  public CustomFieldResponse addEnumOptionsItem(EnumOption enumOptionsItem) {
    if (this.enumOptions == null) {
      this.enumOptions = new ArrayList<>();
    }
    this.enumOptions.add(enumOptionsItem);
    return this;
  }

  /**
   * *Conditional*. Only relevant for custom fields of type `enum` or `multi_enum`. This array specifies the possible values which an `enum` custom field can adopt. To modify the enum options, refer to [working with enum options](/reference/createenumoptionforcustomfield).
   * @return enumOptions
   */
  @Valid 
  @Schema(name = "enum_options", description = "*Conditional*. Only relevant for custom fields of type `enum` or `multi_enum`. This array specifies the possible values which an `enum` custom field can adopt. To modify the enum options, refer to [working with enum options](/reference/createenumoptionforcustomfield).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enum_options")
  public List<@Valid EnumOption> getEnumOptions() {
    return enumOptions;
  }

  public void setEnumOptions(List<@Valid EnumOption> enumOptions) {
    this.enumOptions = enumOptions;
  }

  public CustomFieldResponse enabled(@Nullable Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * *Conditional*. This field applies only to [custom field values](/docs/custom-fields-guide#/accessing-custom-field-values-on-tasks-or-projects) and is not available for [custom field definitions](/docs/custom-fields-guide#/accessing-custom-field-definitions). Determines if the custom field is enabled or not. For more details, see the [Custom Fields documentation](/docs/custom-fields-guide#/enabled-and-disabled-values).
   * @return enabled
   */
  
  @Schema(name = "enabled", accessMode = Schema.AccessMode.READ_ONLY, example = "true", description = "*Conditional*. This field applies only to [custom field values](/docs/custom-fields-guide#/accessing-custom-field-values-on-tasks-or-projects) and is not available for [custom field definitions](/docs/custom-fields-guide#/accessing-custom-field-definitions). Determines if the custom field is enabled or not. For more details, see the [Custom Fields documentation](/docs/custom-fields-guide#/enabled-and-disabled-values).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public @Nullable Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(@Nullable Boolean enabled) {
    this.enabled = enabled;
  }

  public CustomFieldResponse representationType(@Nullable RepresentationTypeEnum representationType) {
    this.representationType = representationType;
    return this;
  }

  /**
   * This field tells the type of the custom field.
   * @return representationType
   */
  
  @Schema(name = "representation_type", accessMode = Schema.AccessMode.READ_ONLY, example = "number", description = "This field tells the type of the custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("representation_type")
  public @Nullable RepresentationTypeEnum getRepresentationType() {
    return representationType;
  }

  public void setRepresentationType(@Nullable RepresentationTypeEnum representationType) {
    this.representationType = representationType;
  }

  public CustomFieldResponse idPrefix(String idPrefix) {
    this.idPrefix = JsonNullable.of(idPrefix);
    return this;
  }

  /**
   * This field is the unique custom ID string for the custom field.
   * @return idPrefix
   */
  
  @Schema(name = "id_prefix", example = "ID", description = "This field is the unique custom ID string for the custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id_prefix")
  public JsonNullable<String> getIdPrefix() {
    return idPrefix;
  }

  public void setIdPrefix(JsonNullable<String> idPrefix) {
    this.idPrefix = idPrefix;
  }

  public CustomFieldResponse inputRestrictions(List<String> inputRestrictions) {
    this.inputRestrictions = inputRestrictions;
    return this;
  }

  public CustomFieldResponse addInputRestrictionsItem(String inputRestrictionsItem) {
    if (this.inputRestrictions == null) {
      this.inputRestrictions = new ArrayList<>();
    }
    this.inputRestrictions.add(inputRestrictionsItem);
    return this;
  }

  /**
   * *Conditional*. Only relevant for custom fields of type `reference`. This array of strings reflects the allowed types of objects that can be written to a `reference` custom field value.
   * @return inputRestrictions
   */
  
  @Schema(name = "input_restrictions", example = "task", description = "*Conditional*. Only relevant for custom fields of type `reference`. This array of strings reflects the allowed types of objects that can be written to a `reference` custom field value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("input_restrictions")
  public List<String> getInputRestrictions() {
    return inputRestrictions;
  }

  public void setInputRestrictions(List<String> inputRestrictions) {
    this.inputRestrictions = inputRestrictions;
  }

  public CustomFieldResponse isFormulaField(@Nullable Boolean isFormulaField) {
    this.isFormulaField = isFormulaField;
    return this;
  }

  /**
   * *Conditional*. This flag describes whether a custom field is a formula custom field.
   * @return isFormulaField
   */
  
  @Schema(name = "is_formula_field", example = "false", description = "*Conditional*. This flag describes whether a custom field is a formula custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_formula_field")
  public @Nullable Boolean getIsFormulaField() {
    return isFormulaField;
  }

  public void setIsFormulaField(@Nullable Boolean isFormulaField) {
    this.isFormulaField = isFormulaField;
  }

  public CustomFieldResponse dateValue(CustomFieldCompactDateValue dateValue) {
    this.dateValue = JsonNullable.of(dateValue);
    return this;
  }

  /**
   * Get dateValue
   * @return dateValue
   */
  @Valid 
  @Schema(name = "date_value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date_value")
  public JsonNullable<CustomFieldCompactDateValue> getDateValue() {
    return dateValue;
  }

  public void setDateValue(JsonNullable<CustomFieldCompactDateValue> dateValue) {
    this.dateValue = dateValue;
  }

  public CustomFieldResponse enumValue(@Nullable CustomFieldCompactEnumValue enumValue) {
    this.enumValue = enumValue;
    return this;
  }

  /**
   * Get enumValue
   * @return enumValue
   */
  @Valid 
  @Schema(name = "enum_value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enum_value")
  public @Nullable CustomFieldCompactEnumValue getEnumValue() {
    return enumValue;
  }

  public void setEnumValue(@Nullable CustomFieldCompactEnumValue enumValue) {
    this.enumValue = enumValue;
  }

  public CustomFieldResponse multiEnumValues(List<@Valid EnumOption> multiEnumValues) {
    this.multiEnumValues = multiEnumValues;
    return this;
  }

  public CustomFieldResponse addMultiEnumValuesItem(EnumOption multiEnumValuesItem) {
    if (this.multiEnumValues == null) {
      this.multiEnumValues = new ArrayList<>();
    }
    this.multiEnumValues.add(multiEnumValuesItem);
    return this;
  }

  /**
   * *Conditional*. Only relevant for custom fields of type `multi_enum`. This object is the chosen values of a `multi_enum` custom field.
   * @return multiEnumValues
   */
  @Valid 
  @Schema(name = "multi_enum_values", description = "*Conditional*. Only relevant for custom fields of type `multi_enum`. This object is the chosen values of a `multi_enum` custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("multi_enum_values")
  public List<@Valid EnumOption> getMultiEnumValues() {
    return multiEnumValues;
  }

  public void setMultiEnumValues(List<@Valid EnumOption> multiEnumValues) {
    this.multiEnumValues = multiEnumValues;
  }

  public CustomFieldResponse numberValue(BigDecimal numberValue) {
    this.numberValue = JsonNullable.of(numberValue);
    return this;
  }

  /**
   * *Conditional*. This number is the value of a `number` custom field.
   * @return numberValue
   */
  @Valid 
  @Schema(name = "number_value", example = "5.2", description = "*Conditional*. This number is the value of a `number` custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number_value")
  public JsonNullable<BigDecimal> getNumberValue() {
    return numberValue;
  }

  public void setNumberValue(JsonNullable<BigDecimal> numberValue) {
    this.numberValue = numberValue;
  }

  public CustomFieldResponse textValue(String textValue) {
    this.textValue = JsonNullable.of(textValue);
    return this;
  }

  /**
   * *Conditional*. This string is the value of a `text` custom field.
   * @return textValue
   */
  
  @Schema(name = "text_value", example = "Some Value", description = "*Conditional*. This string is the value of a `text` custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text_value")
  public JsonNullable<String> getTextValue() {
    return textValue;
  }

  public void setTextValue(JsonNullable<String> textValue) {
    this.textValue = textValue;
  }

  public CustomFieldResponse displayValue(String displayValue) {
    this.displayValue = JsonNullable.of(displayValue);
    return this;
  }

  /**
   * A string representation for the value of the custom field. Integrations that don't require the underlying type should use this field to read values. Using this field will future-proof an app against new custom field types.
   * @return displayValue
   */
  
  @Schema(name = "display_value", accessMode = Schema.AccessMode.READ_ONLY, example = "blue", description = "A string representation for the value of the custom field. Integrations that don't require the underlying type should use this field to read values. Using this field will future-proof an app against new custom field types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display_value")
  public JsonNullable<String> getDisplayValue() {
    return displayValue;
  }

  public void setDisplayValue(JsonNullable<String> displayValue) {
    this.displayValue = displayValue;
  }

  public CustomFieldResponse description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * [Opt In](/docs/inputoutput-options). The description of the custom field.
   * @return description
   */
  
  @Schema(name = "description", example = "Development team priority", description = "[Opt In](/docs/inputoutput-options). The description of the custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public CustomFieldResponse precision(@Nullable Integer precision) {
    this.precision = precision;
    return this;
  }

  /**
   * Only relevant for custom fields of type `Number`. This field dictates the number of places after the decimal to round to, i.e. 0 is integer values, 1 rounds to the nearest tenth, and so on. Must be between 0 and 6, inclusive. For percentage format, this may be unintuitive, as a value of 0.25 has a precision of 0, while a value of 0.251 has a precision of 1. This is due to 0.25 being displayed as 25%. The identifier format will always have a precision of 0.
   * @return precision
   */
  
  @Schema(name = "precision", example = "2", description = "Only relevant for custom fields of type `Number`. This field dictates the number of places after the decimal to round to, i.e. 0 is integer values, 1 rounds to the nearest tenth, and so on. Must be between 0 and 6, inclusive. For percentage format, this may be unintuitive, as a value of 0.25 has a precision of 0, while a value of 0.251 has a precision of 1. This is due to 0.25 being displayed as 25%. The identifier format will always have a precision of 0.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("precision")
  public @Nullable Integer getPrecision() {
    return precision;
  }

  public void setPrecision(@Nullable Integer precision) {
    this.precision = precision;
  }

  public CustomFieldResponse format(@Nullable FormatEnum format) {
    this.format = format;
    return this;
  }

  /**
   * The format of this custom field.
   * @return format
   */
  
  @Schema(name = "format", example = "custom", description = "The format of this custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("format")
  public @Nullable FormatEnum getFormat() {
    return format;
  }

  public void setFormat(@Nullable FormatEnum format) {
    this.format = format;
  }

  public CustomFieldResponse currencyCode(String currencyCode) {
    this.currencyCode = JsonNullable.of(currencyCode);
    return this;
  }

  /**
   * ISO 4217 currency code to format this custom field. This will be null if the `format` is not `currency`.
   * @return currencyCode
   */
  
  @Schema(name = "currency_code", example = "EUR", description = "ISO 4217 currency code to format this custom field. This will be null if the `format` is not `currency`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency_code")
  public JsonNullable<String> getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(JsonNullable<String> currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CustomFieldResponse customLabel(String customLabel) {
    this.customLabel = JsonNullable.of(customLabel);
    return this;
  }

  /**
   * This is the string that appears next to the custom field value. This will be null if the `format` is not `custom`.
   * @return customLabel
   */
  
  @Schema(name = "custom_label", example = "gold pieces", description = "This is the string that appears next to the custom field value. This will be null if the `format` is not `custom`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label")
  public JsonNullable<String> getCustomLabel() {
    return customLabel;
  }

  public void setCustomLabel(JsonNullable<String> customLabel) {
    this.customLabel = customLabel;
  }

  public CustomFieldResponse customLabelPosition(CustomLabelPositionEnum customLabelPosition) {
    this.customLabelPosition = JsonNullable.of(customLabelPosition);
    return this;
  }

  /**
   * Only relevant for custom fields with `custom` format. This depicts where to place the custom label. This will be null if the `format` is not `custom`.
   * @return customLabelPosition
   */
  
  @Schema(name = "custom_label_position", example = "suffix", description = "Only relevant for custom fields with `custom` format. This depicts where to place the custom label. This will be null if the `format` is not `custom`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_position")
  public JsonNullable<CustomLabelPositionEnum> getCustomLabelPosition() {
    return customLabelPosition;
  }

  public void setCustomLabelPosition(JsonNullable<CustomLabelPositionEnum> customLabelPosition) {
    this.customLabelPosition = customLabelPosition;
  }

  public CustomFieldResponse isGlobalToWorkspace(@Nullable Boolean isGlobalToWorkspace) {
    this.isGlobalToWorkspace = isGlobalToWorkspace;
    return this;
  }

  /**
   * This flag describes whether this custom field is available to every container in the workspace. Before project-specific custom fields, this field was always true.
   * @return isGlobalToWorkspace
   */
  
  @Schema(name = "is_global_to_workspace", accessMode = Schema.AccessMode.READ_ONLY, example = "true", description = "This flag describes whether this custom field is available to every container in the workspace. Before project-specific custom fields, this field was always true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_global_to_workspace")
  public @Nullable Boolean getIsGlobalToWorkspace() {
    return isGlobalToWorkspace;
  }

  public void setIsGlobalToWorkspace(@Nullable Boolean isGlobalToWorkspace) {
    this.isGlobalToWorkspace = isGlobalToWorkspace;
  }

  public CustomFieldResponse hasNotificationsEnabled(@Nullable Boolean hasNotificationsEnabled) {
    this.hasNotificationsEnabled = hasNotificationsEnabled;
    return this;
  }

  /**
   * *Conditional*. This flag describes whether a follower of a task with this field should receive inbox notifications from changes to this field.
   * @return hasNotificationsEnabled
   */
  
  @Schema(name = "has_notifications_enabled", example = "true", description = "*Conditional*. This flag describes whether a follower of a task with this field should receive inbox notifications from changes to this field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_notifications_enabled")
  public @Nullable Boolean getHasNotificationsEnabled() {
    return hasNotificationsEnabled;
  }

  public void setHasNotificationsEnabled(@Nullable Boolean hasNotificationsEnabled) {
    this.hasNotificationsEnabled = hasNotificationsEnabled;
  }

  public CustomFieldResponse asanaCreatedField(AsanaCreatedFieldEnum asanaCreatedField) {
    this.asanaCreatedField = JsonNullable.of(asanaCreatedField);
    return this;
  }

  /**
   * *Conditional*. A unique identifier to associate this field with the template source of truth.
   * @return asanaCreatedField
   */
  
  @Schema(name = "asana_created_field", accessMode = Schema.AccessMode.READ_ONLY, example = "priority", description = "*Conditional*. A unique identifier to associate this field with the template source of truth.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asana_created_field")
  public JsonNullable<AsanaCreatedFieldEnum> getAsanaCreatedField() {
    return asanaCreatedField;
  }

  public void setAsanaCreatedField(JsonNullable<AsanaCreatedFieldEnum> asanaCreatedField) {
    this.asanaCreatedField = asanaCreatedField;
  }

  public CustomFieldResponse isValueReadOnly(@Nullable Boolean isValueReadOnly) {
    this.isValueReadOnly = isValueReadOnly;
    return this;
  }

  /**
   * *Conditional*. This flag describes whether a custom field is read only.
   * @return isValueReadOnly
   */
  
  @Schema(name = "is_value_read_only", example = "false", description = "*Conditional*. This flag describes whether a custom field is read only.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_value_read_only")
  public @Nullable Boolean getIsValueReadOnly() {
    return isValueReadOnly;
  }

  public void setIsValueReadOnly(@Nullable Boolean isValueReadOnly) {
    this.isValueReadOnly = isValueReadOnly;
  }

  public CustomFieldResponse createdBy(UserCompact createdBy) {
    this.createdBy = JsonNullable.of(createdBy);
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   */
  @Valid 
  @Schema(name = "created_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by")
  public JsonNullable<UserCompact> getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(JsonNullable<UserCompact> createdBy) {
    this.createdBy = createdBy;
  }

  public CustomFieldResponse peopleValue(List<@Valid UserCompact> peopleValue) {
    this.peopleValue = peopleValue;
    return this;
  }

  public CustomFieldResponse addPeopleValueItem(UserCompact peopleValueItem) {
    if (this.peopleValue == null) {
      this.peopleValue = new ArrayList<>();
    }
    this.peopleValue.add(peopleValueItem);
    return this;
  }

  /**
   * *Conditional*. Only relevant for custom fields of type `people`. This array of [compact user](/reference/users) objects reflects the values of a `people` custom field.
   * @return peopleValue
   */
  @Valid 
  @Schema(name = "people_value", description = "*Conditional*. Only relevant for custom fields of type `people`. This array of [compact user](/reference/users) objects reflects the values of a `people` custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("people_value")
  public List<@Valid UserCompact> getPeopleValue() {
    return peopleValue;
  }

  public void setPeopleValue(List<@Valid UserCompact> peopleValue) {
    this.peopleValue = peopleValue;
  }

  public CustomFieldResponse referenceValue(List<@Valid AsanaNamedResource> referenceValue) {
    this.referenceValue = referenceValue;
    return this;
  }

  public CustomFieldResponse addReferenceValueItem(AsanaNamedResource referenceValueItem) {
    if (this.referenceValue == null) {
      this.referenceValue = new ArrayList<>();
    }
    this.referenceValue.add(referenceValueItem);
    return this;
  }

  /**
   * *Conditional*. Only relevant for custom fields of type `reference`. This array of objects reflects the values of a `reference` custom field.
   * @return referenceValue
   */
  @Valid 
  @Schema(name = "reference_value", description = "*Conditional*. Only relevant for custom fields of type `reference`. This array of objects reflects the values of a `reference` custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reference_value")
  public List<@Valid AsanaNamedResource> getReferenceValue() {
    return referenceValue;
  }

  public void setReferenceValue(List<@Valid AsanaNamedResource> referenceValue) {
    this.referenceValue = referenceValue;
  }

  public CustomFieldResponse privacySetting(@Nullable PrivacySettingEnum privacySetting) {
    this.privacySetting = privacySetting;
    return this;
  }

  /**
   * The privacy setting of the custom field. *Note: Administrators in your organization may restrict the values of `privacy_setting`.*
   * @return privacySetting
   */
  
  @Schema(name = "privacy_setting", example = "public_with_guests", description = "The privacy setting of the custom field. *Note: Administrators in your organization may restrict the values of `privacy_setting`.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("privacy_setting")
  public @Nullable PrivacySettingEnum getPrivacySetting() {
    return privacySetting;
  }

  public void setPrivacySetting(@Nullable PrivacySettingEnum privacySetting) {
    this.privacySetting = privacySetting;
  }

  public CustomFieldResponse defaultAccessLevel(@Nullable DefaultAccessLevelEnum defaultAccessLevel) {
    this.defaultAccessLevel = defaultAccessLevel;
    return this;
  }

  /**
   * The default access level when inviting new members to the custom field. This isn't applied when the `privacy_setting` is `private`, or the user is a guest. For local fields in a project or portfolio, the user must additionally have permission to modify the container itself.
   * @return defaultAccessLevel
   */
  
  @Schema(name = "default_access_level", example = "user", description = "The default access level when inviting new members to the custom field. This isn't applied when the `privacy_setting` is `private`, or the user is a guest. For local fields in a project or portfolio, the user must additionally have permission to modify the container itself.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_access_level")
  public @Nullable DefaultAccessLevelEnum getDefaultAccessLevel() {
    return defaultAccessLevel;
  }

  public void setDefaultAccessLevel(@Nullable DefaultAccessLevelEnum defaultAccessLevel) {
    this.defaultAccessLevel = defaultAccessLevel;
  }

  public CustomFieldResponse resourceSubtype(@Nullable ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The type of the custom field. Must be one of the given values. 
   * @return resourceSubtype
   */
  
  @Schema(name = "resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "text", description = "The type of the custom field. Must be one of the given values. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public @Nullable ResourceSubtypeEnum getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(@Nullable ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldResponse customFieldResponse = (CustomFieldResponse) o;
    return Objects.equals(this.gid, customFieldResponse.gid) &&
        Objects.equals(this.resourceType, customFieldResponse.resourceType) &&
        Objects.equals(this.name, customFieldResponse.name) &&
        Objects.equals(this.type, customFieldResponse.type) &&
        Objects.equals(this.enumOptions, customFieldResponse.enumOptions) &&
        Objects.equals(this.enabled, customFieldResponse.enabled) &&
        Objects.equals(this.representationType, customFieldResponse.representationType) &&
        equalsNullable(this.idPrefix, customFieldResponse.idPrefix) &&
        Objects.equals(this.inputRestrictions, customFieldResponse.inputRestrictions) &&
        Objects.equals(this.isFormulaField, customFieldResponse.isFormulaField) &&
        equalsNullable(this.dateValue, customFieldResponse.dateValue) &&
        Objects.equals(this.enumValue, customFieldResponse.enumValue) &&
        Objects.equals(this.multiEnumValues, customFieldResponse.multiEnumValues) &&
        equalsNullable(this.numberValue, customFieldResponse.numberValue) &&
        equalsNullable(this.textValue, customFieldResponse.textValue) &&
        equalsNullable(this.displayValue, customFieldResponse.displayValue) &&
        Objects.equals(this.description, customFieldResponse.description) &&
        Objects.equals(this.precision, customFieldResponse.precision) &&
        Objects.equals(this.format, customFieldResponse.format) &&
        equalsNullable(this.currencyCode, customFieldResponse.currencyCode) &&
        equalsNullable(this.customLabel, customFieldResponse.customLabel) &&
        equalsNullable(this.customLabelPosition, customFieldResponse.customLabelPosition) &&
        Objects.equals(this.isGlobalToWorkspace, customFieldResponse.isGlobalToWorkspace) &&
        Objects.equals(this.hasNotificationsEnabled, customFieldResponse.hasNotificationsEnabled) &&
        equalsNullable(this.asanaCreatedField, customFieldResponse.asanaCreatedField) &&
        Objects.equals(this.isValueReadOnly, customFieldResponse.isValueReadOnly) &&
        equalsNullable(this.createdBy, customFieldResponse.createdBy) &&
        Objects.equals(this.peopleValue, customFieldResponse.peopleValue) &&
        Objects.equals(this.referenceValue, customFieldResponse.referenceValue) &&
        Objects.equals(this.privacySetting, customFieldResponse.privacySetting) &&
        Objects.equals(this.defaultAccessLevel, customFieldResponse.defaultAccessLevel) &&
        Objects.equals(this.resourceSubtype, customFieldResponse.resourceSubtype);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, type, enumOptions, enabled, representationType, hashCodeNullable(idPrefix), inputRestrictions, isFormulaField, hashCodeNullable(dateValue), enumValue, multiEnumValues, hashCodeNullable(numberValue), hashCodeNullable(textValue), hashCodeNullable(displayValue), description, precision, format, hashCodeNullable(currencyCode), hashCodeNullable(customLabel), hashCodeNullable(customLabelPosition), isGlobalToWorkspace, hasNotificationsEnabled, hashCodeNullable(asanaCreatedField), isValueReadOnly, hashCodeNullable(createdBy), peopleValue, referenceValue, privacySetting, defaultAccessLevel, resourceSubtype);
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
    sb.append("class CustomFieldResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    enumOptions: ").append(toIndentedString(enumOptions)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    representationType: ").append(toIndentedString(representationType)).append("\n");
    sb.append("    idPrefix: ").append(toIndentedString(idPrefix)).append("\n");
    sb.append("    inputRestrictions: ").append(toIndentedString(inputRestrictions)).append("\n");
    sb.append("    isFormulaField: ").append(toIndentedString(isFormulaField)).append("\n");
    sb.append("    dateValue: ").append(toIndentedString(dateValue)).append("\n");
    sb.append("    enumValue: ").append(toIndentedString(enumValue)).append("\n");
    sb.append("    multiEnumValues: ").append(toIndentedString(multiEnumValues)).append("\n");
    sb.append("    numberValue: ").append(toIndentedString(numberValue)).append("\n");
    sb.append("    textValue: ").append(toIndentedString(textValue)).append("\n");
    sb.append("    displayValue: ").append(toIndentedString(displayValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    customLabel: ").append(toIndentedString(customLabel)).append("\n");
    sb.append("    customLabelPosition: ").append(toIndentedString(customLabelPosition)).append("\n");
    sb.append("    isGlobalToWorkspace: ").append(toIndentedString(isGlobalToWorkspace)).append("\n");
    sb.append("    hasNotificationsEnabled: ").append(toIndentedString(hasNotificationsEnabled)).append("\n");
    sb.append("    asanaCreatedField: ").append(toIndentedString(asanaCreatedField)).append("\n");
    sb.append("    isValueReadOnly: ").append(toIndentedString(isValueReadOnly)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    peopleValue: ").append(toIndentedString(peopleValue)).append("\n");
    sb.append("    referenceValue: ").append(toIndentedString(referenceValue)).append("\n");
    sb.append("    privacySetting: ").append(toIndentedString(privacySetting)).append("\n");
    sb.append("    defaultAccessLevel: ").append(toIndentedString(defaultAccessLevel)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
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

