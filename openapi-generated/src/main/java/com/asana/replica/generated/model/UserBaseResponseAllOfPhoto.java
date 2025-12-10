package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A map of the user&#39;s profile photo in various sizes, or null if no photo is set. Sizes provided are 21, 27, 36, 60, 128, and 1024. All images are in PNG format, except for 1024 (which is in JPEG format).
 */

@Schema(name = "UserBaseResponse_allOf_photo", description = "A map of the user's profile photo in various sizes, or null if no photo is set. Sizes provided are 21, 27, 36, 60, 128, and 1024. All images are in PNG format, except for 1024 (which is in JPEG format).")
@JsonTypeName("UserBaseResponse_allOf_photo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class UserBaseResponseAllOfPhoto {

  private @Nullable URI image21x21;

  private @Nullable URI image27x27;

  private @Nullable URI image36x36;

  private @Nullable URI image60x60;

  private @Nullable URI image128x128;

  private @Nullable URI image1024x1024;

  public UserBaseResponseAllOfPhoto image21x21(@Nullable URI image21x21) {
    this.image21x21 = image21x21;
    return this;
  }

  /**
   * PNG image of the user at 21x21 pixels.
   * @return image21x21
   */
  @Valid 
  @Schema(name = "image_21x21", description = "PNG image of the user at 21x21 pixels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_21x21")
  public @Nullable URI getImage21x21() {
    return image21x21;
  }

  public void setImage21x21(@Nullable URI image21x21) {
    this.image21x21 = image21x21;
  }

  public UserBaseResponseAllOfPhoto image27x27(@Nullable URI image27x27) {
    this.image27x27 = image27x27;
    return this;
  }

  /**
   * PNG image of the user at 27x27 pixels.
   * @return image27x27
   */
  @Valid 
  @Schema(name = "image_27x27", description = "PNG image of the user at 27x27 pixels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_27x27")
  public @Nullable URI getImage27x27() {
    return image27x27;
  }

  public void setImage27x27(@Nullable URI image27x27) {
    this.image27x27 = image27x27;
  }

  public UserBaseResponseAllOfPhoto image36x36(@Nullable URI image36x36) {
    this.image36x36 = image36x36;
    return this;
  }

  /**
   * PNG image of the user at 36x36 pixels.
   * @return image36x36
   */
  @Valid 
  @Schema(name = "image_36x36", description = "PNG image of the user at 36x36 pixels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_36x36")
  public @Nullable URI getImage36x36() {
    return image36x36;
  }

  public void setImage36x36(@Nullable URI image36x36) {
    this.image36x36 = image36x36;
  }

  public UserBaseResponseAllOfPhoto image60x60(@Nullable URI image60x60) {
    this.image60x60 = image60x60;
    return this;
  }

  /**
   * PNG image of the user at 60x60 pixels.
   * @return image60x60
   */
  @Valid 
  @Schema(name = "image_60x60", description = "PNG image of the user at 60x60 pixels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_60x60")
  public @Nullable URI getImage60x60() {
    return image60x60;
  }

  public void setImage60x60(@Nullable URI image60x60) {
    this.image60x60 = image60x60;
  }

  public UserBaseResponseAllOfPhoto image128x128(@Nullable URI image128x128) {
    this.image128x128 = image128x128;
    return this;
  }

  /**
   * PNG image of the user at 128x128 pixels.
   * @return image128x128
   */
  @Valid 
  @Schema(name = "image_128x128", description = "PNG image of the user at 128x128 pixels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_128x128")
  public @Nullable URI getImage128x128() {
    return image128x128;
  }

  public void setImage128x128(@Nullable URI image128x128) {
    this.image128x128 = image128x128;
  }

  public UserBaseResponseAllOfPhoto image1024x1024(@Nullable URI image1024x1024) {
    this.image1024x1024 = image1024x1024;
    return this;
  }

  /**
   * JPEG image of the user at 1024x1024 pixels.
   * @return image1024x1024
   */
  @Valid 
  @Schema(name = "image_1024x1024", description = "JPEG image of the user at 1024x1024 pixels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_1024x1024")
  public @Nullable URI getImage1024x1024() {
    return image1024x1024;
  }

  public void setImage1024x1024(@Nullable URI image1024x1024) {
    this.image1024x1024 = image1024x1024;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBaseResponseAllOfPhoto userBaseResponseAllOfPhoto = (UserBaseResponseAllOfPhoto) o;
    return Objects.equals(this.image21x21, userBaseResponseAllOfPhoto.image21x21) &&
        Objects.equals(this.image27x27, userBaseResponseAllOfPhoto.image27x27) &&
        Objects.equals(this.image36x36, userBaseResponseAllOfPhoto.image36x36) &&
        Objects.equals(this.image60x60, userBaseResponseAllOfPhoto.image60x60) &&
        Objects.equals(this.image128x128, userBaseResponseAllOfPhoto.image128x128) &&
        Objects.equals(this.image1024x1024, userBaseResponseAllOfPhoto.image1024x1024);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image21x21, image27x27, image36x36, image60x60, image128x128, image1024x1024);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBaseResponseAllOfPhoto {\n");
    sb.append("    image21x21: ").append(toIndentedString(image21x21)).append("\n");
    sb.append("    image27x27: ").append(toIndentedString(image27x27)).append("\n");
    sb.append("    image36x36: ").append(toIndentedString(image36x36)).append("\n");
    sb.append("    image60x60: ").append(toIndentedString(image60x60)).append("\n");
    sb.append("    image128x128: ").append(toIndentedString(image128x128)).append("\n");
    sb.append("    image1024x1024: ").append(toIndentedString(image1024x1024)).append("\n");
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

