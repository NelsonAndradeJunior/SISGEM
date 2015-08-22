package br.com.sisgem.mb.usuario;

import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import br.com.sisgem.model.UsuarioEntity;
import br.com.sisgem.model.repository.IUsuarioRepository;
import br.com.sisgem.model.utils.BaseBeans;
import br.com.sisgem.model.utils.Utilidades;

@Component
@Scope (value = WebApplicationContext.SCOPE_REQUEST)
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

}
