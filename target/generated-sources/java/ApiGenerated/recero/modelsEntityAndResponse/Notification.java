package recero.modelsEntityAndResponse;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Notification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-10-24T00:21:43.025-03:00")

public class Notification   {
  @JsonProperty("category")
  private String category = null;

  @JsonProperty("code")
  private String code = null;

  public Notification category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Category of this notification as a Http status
   * @return category
  **/
  @ApiModelProperty(example = "bad request", value = "Category of this notification as a Http status")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Notification code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Notification code. First character indicates severity (E,W,I).
   * @return code
  **/
  @ApiModelProperty(example = "bad request", value = "Notification code. First character indicates severity (E,W,I).")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.category, notification.category) &&
        Objects.equals(this.code, notification.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

