package br.com.sisgem.mb.cliente;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION)
@Named(value= "clienteMB")

public class ClienteMB {
	
	
	
	
	
	

}
