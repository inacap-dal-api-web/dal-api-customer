package inacap.controllers;

import inacap.service.LoginService;
import dzone.aman.swagger.api.UserApi;
import dzone.aman.swagger.model.ResponseModelUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@org.springframework.stereotype.Controller
public class Controller implements UserApi {

    @Autowired
    private LoginService serviceLogin;

    @Override
    public ResponseEntity<ResponseModelUser> getUserInfo(String numRut) {
        return new ResponseEntity(serviceLogin.getLoginResponse(numRut), HttpStatus.OK);
    }
}
