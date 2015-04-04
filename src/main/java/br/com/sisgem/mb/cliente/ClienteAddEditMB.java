package br.com.sisgem.mb.cliente;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import br.com.sisgem.model.ClienteEntitySM;



@Component
@Scope (value = WebApplicationContext.SCOPE_REQUEST)
@Named (value = "clienteAddEditMB")

public class ClienteAddEditMB {
	
private static final long serialVersionUID = 1L;
	

	private ClienteEntitySM clienteObj;
	
	public ClienteAddEditMB() {
		this.setClienteObj(new ClienteEntitySM());
	}	
	
	public void salvar() {
		
	}
	
	public void update(){
		
	}

	
	//// getters e setters
	public ClienteEntitySM getClienteObj() {
		return clienteObj;
	}

	public void setClienteObj(ClienteEntitySM clienteObj) {
		this.clienteObj = clienteObj;
	}
	
	
	

}
