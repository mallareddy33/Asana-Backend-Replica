package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.CustomFieldCompactDateValue;
import com.asana.replica.generated.model.CustomFieldCompactEnumValue;
import com.asana.replica.generated.model.EnumOption;
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
 * Custom Fields store the metadata that is used in order to add user-specified information to tasks in Asana. Be sure to reference the [custom fields](/reference/custom-fields) developer documentation for more information about how custom fields relate to various resources in Asana.  Users in Asana can [lock custom fields](https://asana.com/guide/help/premium/custom-fields#gl-lock-fields), which will make them read-only when accessed by other users. Attempting to edit a locked custom field will return HTTP error code &#x60;403 Forbidden&#x60;.
 */

@Schema(name = "CustomFieldCompact", description = "Custom Fields store the metadata that is used in order to add user-specified information to tasks in Asana. Be sure to reference the [custom fields](/reference/custom-fields) developer documentation for more information about how custom fields relate to various resources in Asana.  Users in Asana can [lock custom fields](https://asana.com/guide/help/premium/custom-fields#gl-lock-fields), which will make them read-only when accessed by other users. Attempting to edit a locked custom field will return HTTP error code `403 Forbidden`.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class CustomFieldCompact {

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
    
    CUSTOM_ID("custom_id");

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

  public CustomFieldCompact gid(@Nullable String gid) {
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

  public CustomFieldCompact resourceType(@Nullable String resourceType) {
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

  public CustomFieldCompact name(@Nullable String name) {
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

  public CustomFieldCompact type(@Nullable TypeEnum type) {
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

  public CustomFieldCompact enumOptions(List<@Valid EnumOption> enumOptions) {
    this.enumOptions = enumOptions;
    return this;
  }

  public CustomFieldCompact addEnumOptionsItem(EnumOption enumOptionsItem) {
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

  public CustomFieldCompact enabled(@Nullable Boolean enabled) {
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

  public CustomFieldCompact representationType(@Nullable RepresentationTypeEnum representationType) {
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

  public CustomFieldCompact idPrefix(String idPrefix) {
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

  public CustomFieldCompact inputRestrictions(List<String> inputRestrictions) {
    this.inputRestrictions = inputRestrictions;
    return this;
  }

  public CustomFieldCompact addInputRestrictionsItem(String inputRestrictionsItem) {
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

  public CustomFieldCompact isFormulaField(@Nullable Boolean isFormulaField) {
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

  public CustomFieldCompact dateValue(CustomFieldCompactDateValue dateValue) {
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

  public CustomFieldCompact enumValue(@Nullable CustomFieldCompactEnumValue enumValue) {
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

  public CustomFieldCompact multiEnumValues(List<@Valid EnumOption> multiEnumValues) {
    this.multiEnumValues = multiEnumValues;
    return this;
  }

  public CustomFieldCompact addMultiEnumValuesItem(EnumOption multiEnumValuesItem) {
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

  public CustomFieldCompact numberValue(BigDecimal numberValue) {
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

  public CustomFieldCompact textValue(String textValue) {
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

  public CustomFieldCompact displayValue(String displayValue) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldCompact customFieldCompact = (CustomFieldCompact) o;
    return Objects.equals(this.gid, customFieldCompact.gid) &&
        Objects.equals(this.resourceType, customFieldCompact.resourceType) &&
        Objects.equals(this.name, customFieldCompact.name) &&
        Objects.equals(this.type, customFieldCompact.type) &&
        Objects.equals(this.enumOptions, customFieldCompact.enumOptions) &&
        Objects.equals(this.enabled, customFieldCompact.enabled) &&
        Objects.equals(this.representationType, customFieldCompact.representationType) &&
        equalsNullable(this.idPrefix, customFieldCompact.idPrefix) &&
        Objects.equals(this.inputRestrictions, customFieldCompact.inputRestrictions) &&
        Objects.equals(this.isFormulaField, customFieldCompact.isFormulaField) &&
        equalsNullable(this.dateValue, customFieldCompact.dateValue) &&
        Objects.equals(this.enumValue, customFieldCompact.enumValue) &&
        Objects.equals(this.multiEnumValues, customFieldCompact.multiEnumValues) &&
        equalsNullable(this.numberValue, customFieldCompact.numberValue) &&
        equalsNullable(this.textValue, customFieldCompact.textValue) &&
        equalsNullable(this.displayValue, customFieldCompact.displayValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, type, enumOptions, enabled, representationType, hashCodeNullable(idPrefix), inputRestrictions, isFormulaField, hashCodeNullable(dateValue), enumValue, multiEnumValues, hashCodeNullable(numberValue), hashCodeNullable(textValue), hashCodeNullable(displayValue));
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
    sb.append("class CustomFieldCompact {\n");
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

