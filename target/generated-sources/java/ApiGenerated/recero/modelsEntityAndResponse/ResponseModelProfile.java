package recero.modelsEntityAndResponse;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import recero.modelsEntityAndResponse.ModelProfile;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseModelProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-10-24T00:21:43.025-03:00")

public class ResponseModelProfile   {
  @JsonProperty("profileDetails")
  private ModelProfile profileDetails = null;

  public ResponseModelProfile profileDetails(ModelProfile profileDetails) {
    this.profileDetails = profileDetails;
    return this;
  }

  /**
   * Get profileDetails
   * @return profileDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ModelProfile getProfileDetails() {
    return profileDetails;
  }

  public void setProfileDetails(ModelProfile profileDetails) {
    this.profileDetails = profileDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseModelProfile responseModelProfile = (ResponseModelProfile) o;
    return Objects.equals(this.profileDetails, responseModelProfile.profileDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseModelProfile {\n");
    
    sb.append("    profileDetails: ").append(toIndentedString(profileDetails)).append("\n");
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

