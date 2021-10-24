package inacap.dal.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "perfil")
public class ProfileEntity {

    @Id
    @Column(name ="Id_Perfil")
    private Integer id_perfil;
    @Column(name = "Descripcion_Perfil")
    private String descripcion_perfil;
    @Column(name = "Rut_Num_Usuario")
    private String rut_num_usario;
    @Column(name = "Is_Valid")
    private boolean is_valid;
    @Column(name = "Fecha_creación")
    private String fecha_creacion;
    @Column(name = "Contrasena_Perfil")
    private String contrasena_perfil;
    @Column(name = "Id_Roles")
    private Integer id_roles;

    public Integer getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(Integer id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getDescripcion_perfil() {
        return descripcion_perfil;
    }

    public void setDescripcion_perfil(String descripcion_perfil) {
        this.descripcion_perfil = descripcion_perfil;
    }

    public String getRut_num_usario() {
        return rut_num_usario;
    }

    public void setRut_num_usario(String rut_num_usario) {
        this.rut_num_usario = rut_num_usario;
    }

    public boolean isIs_valid() {
        return is_valid;
    }

    public void setIs_valid(boolean is_valid) {
        this.is_valid = is_valid;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getContrasena_perfil() {
        return contrasena_perfil;
    }

    public void setContrasena_perfil(String contrasena_perfil) {
        this.contrasena_perfil = contrasena_perfil;
    }

    public Integer getId_roles() {
        return id_roles;
    }

    public void setId_roles(Integer id_roles) {
        this.id_roles = id_roles;
    }
}
