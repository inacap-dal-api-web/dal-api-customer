package dzone.aman.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dzone.aman.swagger.model.ModelUser;
import dzone.aman.swagger.model.ResponseBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseModelUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-10-23T17:08:04.914-03:00")

public class ResponseModelUser   {
  @JsonProperty("userDetails")
  private ModelUser userDetails = null;

  public ResponseModelUser userDetails(ModelUser userDetails) {
    this.userDetails = userDetails;
    return this;
  }

  /**
   * Get userDetails
   * @return userDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ModelUser getUserDetails() {
    return userDetails;
  }

  public void setUserDetails(ModelUser userDetails) {
    this.userDetails = userDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseModelUser responseModelUser = (ResponseModelUser) o;
    return Objects.equals(this.userDetails, responseModelUser.userDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseModelUser {\n");
    
    sb.append("    userDetails: ").append(toIndentedString(userDetails)).append("\n");
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

