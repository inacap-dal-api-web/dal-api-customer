package inacap.service;

import inacap.gateway.ProfileGateway;
import org.springframework.stereotype.Service;
import recero.modelsEntityAndResponse.ResponseModelProfile;
import recero.modelsEntityAndResponse.ResponseModelUser;

@Service
public class ProfileService {

    private ProfileGateway profileGateway;

    public ProfileService(ProfileGateway profileGateway) {
        this.profileGateway = profileGateway;
    }
    public ResponseModelProfile getProfileResponse(Integer Id_perfil){
        return profileGateway.getMappingGatewayProfile(Id_perfil);
    }
}