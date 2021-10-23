package inacap.service;

import inacap.gateway.LoginGateway;
import dzone.aman.swagger.model.ResponseModelUser;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private  LoginGateway gatewayLogin;

    public LoginService(LoginGateway gatewayLogin) {
        this.gatewayLogin = gatewayLogin;
    }

    public ResponseModelUser getLoginResponse(String rut_num_usuario){
        return gatewayLogin.getMappingGatewayLogin(rut_num_usuario);
    }
}
