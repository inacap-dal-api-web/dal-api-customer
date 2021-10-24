package inacap.controllers;

import inacap.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import recero.apiInterface.ProfileApi;
import recero.modelsEntityAndResponse.ResponseModelProfile;

@Controller
public class ControllerProfile implements ProfileApi {
    @Autowired
    ProfileService profileService;
    @Override
    public ResponseEntity<ResponseModelProfile> getProfileInfo(Integer id_perfil) {
        return new ResponseEntity(profileService.getProfileResponse(id_perfil), HttpStatus.OK);

    }
}
