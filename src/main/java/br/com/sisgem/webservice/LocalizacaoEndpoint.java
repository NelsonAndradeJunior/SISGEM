package br.com.sisgem.webservice;
 
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
 
@WebService(serviceName="LocalizacaoEndpoint/localizacaoendpoint")
public class LocalizacaoEndpoint implements LocalizacaoWebService{
 
    @Override
    @WebMethod
    public String localizacaolog(@WebParam(name = "latitude") String x,
            			   @WebParam(name = "longitude") String y,
            			   @WebParam(name = "idUsuario") String id) {
        
    	
    	
    	
    	return x;
    }
    
   
}