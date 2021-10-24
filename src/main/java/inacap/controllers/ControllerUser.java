package inacap.controllers;

import inacap.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import recero.apiInterface.UserApi;
import recero.modelsEntityAndResponse.ResponseModelUser;

@org.springframework.stereotype.Controller
public class ControllerUser implements UserApi {

    @Autowired
    private LoginService serviceLogin;

    @Override
    public ResponseEntity<ResponseModelUser> getUserInfo(String numRut) {
        return new ResponseEntity(serviceLogin.getLoginResponse(numRut), HttpStatus.OK);
    }


}
