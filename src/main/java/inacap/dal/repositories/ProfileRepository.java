package inacap.dal.repositories;

import inacap.dal.models.ProfileEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import recero.modelsEntityAndResponse.ModelProfile;

@Repository
public interface  ProfileRepository  extends CrudRepository<ProfileEntity,Integer> {

    @Query ( value = "SELECT * FROM PERFIL WHERE ID_PERFIL =:id_perfil", nativeQuery = true)
    ModelProfile getProfileUserDetail(@Param("id_perfil") Integer id_perfil);

}
