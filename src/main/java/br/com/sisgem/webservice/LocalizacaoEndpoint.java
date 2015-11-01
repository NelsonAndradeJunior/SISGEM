package br.com.sisgem.webservice;
 
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.sisgem.model.LocalizacaoLogEntity;
import br.com.sisgem.model.UsuarioEntity;
import br.com.sisgem.model.repository.ILocalizacaoLogRepository;
 
@WebService(serviceName="Localizacao/longlatVendedor")
public class LocalizacaoEndpoint implements LocalizacaoWebService{
 
	@Inject
	private ILocalizacaoLogRepository localizacaologRepository;
	
    @Override
    @WebMethod
    public String localizacaolog(@WebParam(name = "latitude") String x,
            			   @WebParam(name = "longitude") String y,
            			   @WebParam(name = "idUsuario") String id) {
    	
    	UsuarioEntity usuario = new UsuarioEntity();
        LocalizacaoLogEntity localizacaologEntity = new LocalizacaoLogEntity();

		usuario.setId((long) 1);
			
		localizacaologEntity.setUsuario_idUsuario(usuario);
		localizacaologEntity.setLatitude(x);
		localizacaologEntity.setLongitude(y);
					
		this.localizacaologRepository.save(localizacaologEntity);
        
    	
    	
    	
    	return x;
    }
    
   
}