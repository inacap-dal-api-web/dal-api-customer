package inacap.gateway;

import inacap.dal.repositories.ProfileRepository;
import inacap.gateway.mapper.ProfileMapper;
import org.springframework.stereotype.Repository;
import recero.modelsEntityAndResponse.ModelProfile;
import recero.modelsEntityAndResponse.ResponseModelProfile;
import recero.modelsEntityAndResponse.ResponseModelUser;

@Repository
public class ProfileGateway {

    private final ProfileMapper profileMapperGateway;
    private final ProfileRepository profileRepository;


    public ProfileGateway(ProfileMapper profileMapperGateway, ProfileRepository profileRepository){

        this.profileMapperGateway = profileMapperGateway;
        this.profileRepository = profileRepository;
    }
    public ResponseModelProfile getMappingGatewayProfile(Integer id_perfil){
        ModelProfile modelEntityProfile =profileRepository.getProfileUserDetail(id_perfil);
        ResponseModelProfile modelResponseJson =  profileMapperGateway.getProfileMapping(modelEntityProfile);
        return modelResponseJson;
    }
}
