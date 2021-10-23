package inacap.gateway;

import inacap.dal.repositories.LoginRepository;
import inacap.gateway.mapper.LoginMapper;
import dzone.aman.swagger.model.ModelUser;
import dzone.aman.swagger.model.ResponseModelUser;
import org.springframework.stereotype.Repository;

@Repository
public class LoginGateway {

    private final LoginMapper loginMapperGateway;
    private final LoginRepository loginRepository;

    public LoginGateway(LoginMapper loginMapperGateway, LoginRepository loginRepository) {
        this.loginMapperGateway = loginMapperGateway;
        this.loginRepository = loginRepository;
    }


    public ResponseModelUser getMappingGatewayLogin(String rut_num_usuario){
        ModelUser modelEntityUser = loginRepository.getLoginUserDetail(rut_num_usuario);
        ResponseModelUser modelResponseJson =  loginMapperGateway.getLoginMapping(modelEntityUser);
        return modelResponseJson;
    }
}
