package br.com.sisgem.mb.usuario;

import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.sisgem.model.UsuarioEntity;
import br.com.sisgem.model.repository.IUsuarioRepository;
import br.com.sisgem.model.utils.BaseBeans;
import br.com.sisgem.model.utils.Utilidades;

@Component
@Scope("view")
@Named (value = "usuarioAddEditMB")
public class UsuarioAddEditMB extends BaseBeans{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IUsuarioRepository usuarioRepository;
	
	@Inject
	private FacesContext context;
	
	@Inject
	private UsuarioMB mbUsuarioBean;
	
	private UsuarioEntity usuarioObj;
	
	private Boolean flagExibeConsultaUsuario = true;
	
	private Boolean flagExibeFormularioUsuario;
	
	public UsuarioAddEditMB() {
		this.usuarioObj = new UsuarioEntity();
	}
	
	
	public void salvar() {
		try {
			if (this.usuarioObj != null) {
				if (this.usuarioObj.getId() == null) {
					// Add
					this.usuarioRepository.save(this.usuarioObj);
				} else {
					// Update
					this.usuarioRepository.save(this.usuarioObj);
				}
				Utilidades.showFacesMessage("Salvo com Sucesso", 2);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void update(){
		this.usuarioObj = mbUsuarioBean.getUsuarioSelecionado();
	}
	
	public void usuarioVinculado(){
		this.update();
		
		hideDialog("dialogListaResultado");
	}
	
	public void exibeFormularioUsuario() {
		flagExibeFormularioUsuario = true;
		flagExibeConsultaUsuario = false;
		hideDialog("dialogListaUsuarios");
	}
	
	////Getters and Setters////
	public IUsuarioRepository getUsuarioRepository() {
		return usuarioRepository;
	}

	public void setUsuarioRepository(IUsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public FacesContext getContext() {
		return context;
	}

	public void setContext(FacesContext context) {
		this.context = context;
	}

	public UsuarioEntity getUsuarioObj() {
		return usuarioObj;
	}

	public void setUsuarioObj(UsuarioEntity usuarioObj) {
		this.usuarioObj = usuarioObj;
	}


	public Boolean getFlagExibeFormularioUsuario() {
		return flagExibeFormularioUsuario;
	}


	public void setFlagExibeFormularioUsuario(
			Boolean flagExibeFormularioUsuario) {
		this.flagExibeFormularioUsuario = flagExibeFormularioUsuario;
	}


	public Boolean getFlagExibeConsultaUsuario() {
		return flagExibeConsultaUsuario;
	}


	public void setFlagExibeConsultaUsuario(
			Boolean flagExibeConsultaUsuario) {
		this.flagExibeConsultaUsuario = flagExibeConsultaUsuario;
	}

}
