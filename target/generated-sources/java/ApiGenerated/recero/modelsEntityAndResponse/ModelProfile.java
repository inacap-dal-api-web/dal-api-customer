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
 * ModelProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-10-24T00:21:43.025-03:00")

public class ModelProfile   {
  @JsonProperty("id_perfil")
  private Integer idPerfil = null;

  @JsonProperty("descripcion_profile")
  private String descripcionProfile = null;

  @JsonProperty("num_rut_usuario")
  private String numRutUsuario = null;

  @JsonProperty("is_valid")
  private Boolean isValid = null;

  @JsonProperty("fecha_creacion")
  private String fechaCreacion = null;

  @JsonProperty("contrasena_perfil")
  private String contrasenaPerfil = null;

  @JsonProperty("id_roles")
  private Integer idRoles = null;

  public ModelProfile idPerfil(Integer idPerfil) {
    this.idPerfil = idPerfil;
    return this;
  }

  /**
   * foregein key from entity profile
   * @return idPerfil
  **/
  @ApiModelProperty(example = "1", value = "foregein key from entity profile")


  public Integer getIdPerfil() {
    return idPerfil;
  }

  public void setIdPerfil(Integer idPerfil) {
    this.idPerfil = idPerfil;
  }

  public ModelProfile descripcionProfile(String descripcionProfile) {
    this.descripcionProfile = descripcionProfile;
    return this;
  }

  /**
   * description profile
   * @return descripcionProfile
  **/
  @ApiModelProperty(example = "Hola soy usuario de recero", value = "description profile")


  public String getDescripcionProfile() {
    return descripcionProfile;
  }

  public void setDescripcionProfile(String descripcionProfile) {
    this.descripcionProfile = descripcionProfile;
  }

  public ModelProfile numRutUsuario(String numRutUsuario) {
    this.numRutUsuario = numRutUsuario;
    return this;
  }

  /**
   * foreing key from entity user
   * @return numRutUsuario
  **/
  @ApiModelProperty(example = "106665898", value = "foreing key from entity user")


  public String getNumRutUsuario() {
    return numRutUsuario;
  }

  public void setNumRutUsuario(String numRutUsuario) {
    this.numRutUsuario = numRutUsuario;
  }

  public ModelProfile isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

  /**
   * verificacion de usuario
   * @return isValid
  **/
  @ApiModelProperty(example = "true", value = "verificacion de usuario")


  public Boolean isIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public ModelProfile fechaCreacion(String fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
    return this;
  }

  /**
   * date
   * @return fechaCreacion
  **/
  @ApiModelProperty(example = "2021-03-24 16:48:05.591", value = "date")


  public String getFechaCreacion() {
    return fechaCreacion;
  }

  public void setFechaCreacion(String fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  public ModelProfile contrasenaPerfil(String contrasenaPerfil) {
    this.contrasenaPerfil = contrasenaPerfil;
    return this;
  }

  /**
   * password for users
   * @return contrasenaPerfil
  **/
  @ApiModelProperty(example = "123abc", value = "password for users")


  public String getContrasenaPerfil() {
    return contrasenaPerfil;
  }

  public void setContrasenaPerfil(String contrasenaPerfil) {
    this.contrasenaPerfil = contrasenaPerfil;
  }

  public ModelProfile idRoles(Integer idRoles) {
    this.idRoles = idRoles;
    return this;
  }

  /**
   * foreing key from entity roles
   * @return idRoles
  **/
  @ApiModelProperty(example = "1", value = "foreing key from entity roles")


  public Integer getIdRoles() {
    return idRoles;
  }

  public void setIdRoles(Integer idRoles) {
    this.idRoles = idRoles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelProfile modelProfile = (ModelProfile) o;
    return Objects.equals(this.idPerfil, modelProfile.idPerfil) &&
        Objects.equals(this.descripcionProfile, modelProfile.descripcionProfile) &&
        Objects.equals(this.numRutUsuario, modelProfile.numRutUsuario) &&
        Objects.equals(this.isValid, modelProfile.isValid) &&
        Objects.equals(this.fechaCreacion, modelProfile.fechaCreacion) &&
        Objects.equals(this.contrasenaPerfil, modelProfile.contrasenaPerfil) &&
        Objects.equals(this.idRoles, modelProfile.idRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPerfil, descripcionProfile, numRutUsuario, isValid, fechaCreacion, contrasenaPerfil, idRoles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelProfile {\n");
    
    sb.append("    idPerfil: ").append(toIndentedString(idPerfil)).append("\n");
    sb.append("    descripcionProfile: ").append(toIndentedString(descripcionProfile)).append("\n");
    sb.append("    numRutUsuario: ").append(toIndentedString(numRutUsuario)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    fechaCreacion: ").append(toIndentedString(fechaCreacion)).append("\n");
    sb.append("    contrasenaPerfil: ").append(toIndentedString(contrasenaPerfil)).append("\n");
    sb.append("    idRoles: ").append(toIndentedString(idRoles)).append("\n");
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

