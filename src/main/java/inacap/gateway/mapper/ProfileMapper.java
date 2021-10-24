package inacap.gateway.mapper;

import inacap.dal.models.ProfileEntity;
import org.springframework.stereotype.Component;
import recero.modelsEntityAndResponse.ModelProfile;
import recero.modelsEntityAndResponse.ResponseModelProfile;

@Component
public class ProfileMapper {

    public ResponseModelProfile getProfileMapping (ModelProfile modelProfile){
        ResponseModelProfile response = new ResponseModelProfile();

        if (modelProfile == null){

            response.setProfileDetails(null);
        }else {

            response.setProfileDetails(modelProfile);
        }
        return response;
    }
}
