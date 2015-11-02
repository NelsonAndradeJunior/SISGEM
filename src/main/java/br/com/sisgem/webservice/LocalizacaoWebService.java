package br.com.sisgem.webservice;
 
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.sisgem.model.LocalizacaoLogEntity;
 
@WebService
public interface LocalizacaoWebService {
    
	@WebMethod
    String localizacaolog(@WebParam(name = "Latitude") String latitude
    		, @WebParam(name = "Longitude") String longitude
    		, @WebParam(name = "idUsuario") String idUsuario);
}