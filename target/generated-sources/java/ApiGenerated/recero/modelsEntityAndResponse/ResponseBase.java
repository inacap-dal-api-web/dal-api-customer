package recero.modelsEntityAndResponse;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import recero.modelsEntityAndResponse.ModelUser;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseBase
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-10-23T21:33:41.857-03:00")

public class ResponseBase   {
  @JsonProperty("userDetails")
  private ModelUser userDetails = null;

  public ResponseBase userDetails(ModelUser userDetails) {
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
    ResponseBase responseBase = (ResponseBase) o;
    return Objects.equals(this.userDetails, responseBase.userDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBase {\n");
    
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

