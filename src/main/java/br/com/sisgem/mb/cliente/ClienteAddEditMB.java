package br.com.sisgem.mb.cliente;

import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.sisgem.model.ClienteEntity;
import br.com.sisgem.model.repository.IClienteRepository;
import br.com.sisgem.model.utils.BaseBeans;
import br.com.sisgem.model.utils.Utilidades;

@Component
@Scope("view")
@Named (value = "clienteAddEditMB")
public class ClienteAddEditMB extends BaseBeans{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IClienteRepository clienteRepository;
	
	@Inject
	private FacesContext context;
	
	@Inject
	private ClienteMB mbClienteBean;
	
	private ClienteEntity clienteObj;
	
	private Boolean flagExibeConsultaCliente = true;
	
	private Boolean flagExibeFormularioCliente;
	
	public ClienteAddEditMB() {
		this.clienteObj = new ClienteEntity();
	}
	
	
	public void salvar() {
		try {
			if (this.clienteObj != null) {
				if (this.clienteObj.getId() == null) {
					// Add
					this.clienteRepository.save(this.clienteObj);
				} else {
					// Update
					this.clienteRepository.save(this.clienteObj);
				}
				Utilidades.showFacesMessage("Salvo com Sucesso", 2);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void update(){
		this.clienteObj = mbClienteBean.getClienteSelecionado();
	}
	
	public void clienteVinculado(){
		this.update();
		
		hideDialog("dialogListaResultado");
	}
	
	public void exibeFormularioCliente() {
		flagExibeFormularioCliente = true;
		flagExibeConsultaCliente = false;
		hideDialog("dialogListaClientes");
	}
	
	////Getters and Setters////
	public IClienteRepository getClienteRepository() {
		return clienteRepository;
	}

	public void setClienteRepository(IClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public FacesContext getContext() {
		return context;
	}

	public void setContext(FacesContext context) {
		this.context = context;
	}

	public ClienteEntity getClienteObj() {
		return clienteObj;
	}

	public void setClienteObj(ClienteEntity clienteObj) {
		this.clienteObj = clienteObj;
	}


	public Boolean getFlagExibeFormularioCliente() {
		return flagExibeFormularioCliente;
	}


	public void setFlagExibeFormularioCliente(
			Boolean flagExibeFormularioCliente) {
		this.flagExibeFormularioCliente = flagExibeFormularioCliente;
	}


	public Boolean getFlagExibeConsultaCliente() {
		return flagExibeConsultaCliente;
	}


	public void setFlagExibeConsultaCliente(
			Boolean flagExibeConsultaCliente) {
		this.flagExibeConsultaCliente = flagExibeConsultaCliente;
	}

}
