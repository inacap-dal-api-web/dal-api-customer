package inacap.dal.repositories;

import inacap.dal.models.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import recero.modelsEntityAndResponse.ModelUser;

@Repository
public interface LoginRepository extends CrudRepository<UserEntity,String> {

    @Query(value = "SELECT * FROM LOGIN WHERE RUT_NUM_USUARIO =:rut_num_usuario",nativeQuery = true)
    ModelUser getLoginUserDetail(@Param("rut_num_usuario") String rut_num_usuario);


}
