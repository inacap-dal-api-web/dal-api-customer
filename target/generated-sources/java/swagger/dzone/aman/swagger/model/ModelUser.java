package dzone.aman.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ModelUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-10-23T17:08:04.914-03:00")

public class ModelUser   {
  @JsonProperty("id_login")
  private Integer idLogin = null;

  @JsonProperty("id_perfil")
  private Integer idPerfil = null;

  @JsonProperty("rut_num_usuario")
  private String rutNumUsuario = null;

  @JsonProperty("is_valid")
  private String isValid = null;

  public ModelUser idLogin(Integer idLogin) {
    this.idLogin = idLogin;
    return this;
  }

  /**
   * Primary Key from entity login
   * @return idLogin
  **/
  @ApiModelProperty(example = "1", value = "Primary Key from entity login")


  public Integer getIdLogin() {
    return idLogin;
  }

  public void setIdLogin(Integer idLogin) {
    this.idLogin = idLogin;
  }

  public ModelUser idPerfil(Integer idPerfil) {
    this.idPerfil = idPerfil;
    return this;
  }

  /**
   * Foreign key from entity profile
   * @return idPerfil
  **/
  @ApiModelProperty(example = "1", value = "Foreign key from entity profile")


  public Integer getIdPerfil() {
    return idPerfil;
  }

  public void setIdPerfil(Integer idPerfil) {
    this.idPerfil = idPerfil;
  }

  public ModelUser rutNumUsuario(String rutNumUsuario) {
    this.rutNumUsuario = rutNumUsuario;
    return this;
  }

  /**
   * Digital Number Identification from Chile to rut customer
   * @return rutNumUsuario
  **/
  @ApiModelProperty(example = "Enterprise DNI 88544647-9 - Natural Person DNI 18278775-1", value = "Digital Number Identification from Chile to rut customer")


  public String getRutNumUsuario() {
    return rutNumUsuario;
  }

  public void setRutNumUsuario(String rutNumUsuario) {
    this.rutNumUsuario = rutNumUsuario;
  }

  public ModelUser isValid(String isValid) {
    this.isValid = isValid;
    return this;
  }

  /**
   * When parameters have data user login it's not available to login, when is empty is allowed
   * @return isValid
  **/
  @ApiModelProperty(example = "2021-03-24 16:48:05.591", value = "When parameters have data user login it's not available to login, when is empty is allowed")


  public String getIsValid() {
    return isValid;
  }

  public void setIsValid(String isValid) {
    this.isValid = isValid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelUser modelUser = (ModelUser) o;
    return Objects.equals(this.idLogin, modelUser.idLogin) &&
        Objects.equals(this.idPerfil, modelUser.idPerfil) &&
        Objects.equals(this.rutNumUsuario, modelUser.rutNumUsuario) &&
        Objects.equals(this.isValid, modelUser.isValid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idLogin, idPerfil, rutNumUsuario, isValid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelUser {\n");
    
    sb.append("    idLogin: ").append(toIndentedString(idLogin)).append("\n");
    sb.append("    idPerfil: ").append(toIndentedString(idPerfil)).append("\n");
    sb.append("    rutNumUsuario: ").append(toIndentedString(rutNumUsuario)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
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

