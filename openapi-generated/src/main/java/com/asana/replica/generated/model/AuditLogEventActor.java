package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The entity that triggered the event. Will typically be a user.
 */

@Schema(name = "AuditLogEventActor", description = "The entity that triggered the event. Will typically be a user.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class AuditLogEventActor {

  /**
   * The type of actor. Can be one of `user`, `asana`, `asana_support`, `anonymous`, or `external_administrator`.
   */
  public enum ActorTypeEnum {
    USER("user"),
    
    ASANA("asana"),
    
    ASANA_SUPPORT("asana_support"),
    
    ANONYMOUS("anonymous"),
    
    EXTERNAL_ADMINISTRATOR("external_administrator");

    private final String value;

    ActorTypeEnum(String value) {
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
    public static ActorTypeEnum fromValue(String value) {
      for (ActorTypeEnum b : ActorTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ActorTypeEnum actorType;

  private @Nullable String gid;

  private @Nullable String name;

  private @Nullable String email;

  public AuditLogEventActor actorType(@Nullable ActorTypeEnum actorType) {
    this.actorType = actorType;
    return this;
  }

  /**
   * The type of actor. Can be one of `user`, `asana`, `asana_support`, `anonymous`, or `external_administrator`.
   * @return actorType
   */
  
  @Schema(name = "actor_type", example = "user", description = "The type of actor. Can be one of `user`, `asana`, `asana_support`, `anonymous`, or `external_administrator`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actor_type")
  public @Nullable ActorTypeEnum getActorType() {
    return actorType;
  }

  public void setActorType(@Nullable ActorTypeEnum actorType) {
    this.actorType = actorType;
  }

  public AuditLogEventActor gid(@Nullable String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the actor, if it is a user.
   * @return gid
   */
  
  @Schema(name = "gid", example = "1111", description = "Globally unique identifier of the actor, if it is a user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public @Nullable String getGid() {
    return gid;
  }

  public void setGid(@Nullable String gid) {
    this.gid = gid;
  }

  public AuditLogEventActor name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the actor, if it is a user.
   * @return name
   */
  
  @Schema(name = "name", example = "Greg Sanchez", description = "The name of the actor, if it is a user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public AuditLogEventActor email(@Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * The email of the actor, if it is a user.
   * @return email
   */
  
  @Schema(name = "email", example = "gregsanchez@example.com", description = "The email of the actor, if it is a user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public @Nullable String getEmail() {
    return email;
  }

  public void setEmail(@Nullable String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogEventActor auditLogEventActor = (AuditLogEventActor) o;
    return Objects.equals(this.actorType, auditLogEventActor.actorType) &&
        Objects.equals(this.gid, auditLogEventActor.gid) &&
        Objects.equals(this.name, auditLogEventActor.name) &&
        Objects.equals(this.email, auditLogEventActor.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actorType, gid, name, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogEventActor {\n");
    sb.append("    actorType: ").append(toIndentedString(actorType)).append("\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

