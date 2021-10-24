package inacap.service;

import inacap.gateway.LoginGateway;
import org.springframework.stereotype.Service;
import recero.modelsEntityAndResponse.ResponseModelUser;

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
