package inacap.gateway.mapper;


import org.springframework.stereotype.Component;
import recero.modelsEntityAndResponse.ModelUser;
import recero.modelsEntityAndResponse.ResponseModelUser;

@Component
public class LoginMapper {

    /**
     * Recibimos el objeto loginModelUser
     * El objeto loginModelUser viene con los datos obtenidos desde el repositorio
     * estos datos, han sido rellenados con los valores de consulta desde la base de datos,
     * y debemos mapearlos dentro de nuestra entidad en Java.
     *
     * Este mapeo, se hará con un ResponseModelUser, el cual respondera un JSON
     *
     * @param loginModeluser
     * @return
     */
    public ResponseModelUser getLoginMapping(ModelUser loginModeluser){
        ResponseModelUser response;
        if(loginModeluser != null){
            response = new ResponseModelUser();
            response.setUserDetails(loginModeluser);
        }else{
            response = new ResponseModelUser();
            response.setUserDetails(loginModeluser);
        }
        return response;
    }
}
