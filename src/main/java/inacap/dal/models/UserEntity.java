package inacap.dal.models;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOGIN")
public class UserEntity {

    @Id
    @Column(name = "id_login")
    private Integer id_login;
    @Column(name = "id_perfil")
    private Integer id_perfil;
    @Column(name = "id_rut_num_usuario")
    private Integer rut_num_usuario;
    @Column(name = "is_valid")
    private String is_valid;


    public Integer getId_login() { return id_login; }

    public void setId_login(Integer id_login) { this.id_login = id_login; }

    public Integer getId_perfil() { return id_perfil; }

    public void setId_perfil(Integer id_perfil) { this.id_perfil = id_perfil; }

    public Integer getRut_num_usuario() { return rut_num_usuario; }

    public void setRut_num_usuario(Integer rut_num_usuario) { this.rut_num_usuario = rut_num_usuario; }

    public String getIs_valid() { return is_valid; }

    public void setIs_valid(String is_valid) { this.is_valid = is_valid; }
}
