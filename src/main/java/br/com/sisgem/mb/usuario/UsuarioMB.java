package br.com.sisgem.mb.usuario;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import br.com.sisgem.model.UsuarioEntity;
import br.com.sisgem.model.repository.IUsuarioRepository;
import br.com.sisgem.model.utils.BaseBeans;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION)
@Named(value= "usuarioMB")
public class UsuarioMB extends BaseBeans{

	private static final long serialVersionUID = 1L;
	
	private Logger logger = Logger.getLogger(getClass());
	
	@Inject
	private IUsuarioRepository usuarioRepository;
	
	private List<UsuarioEntity> usuarioList;
	
	private UsuarioEntity usuarioSelecionado;
	
	private String paramUsuario;
	
	private Boolean flagBotaoUpdate = true;
	
	private Boolean flagBotaoDelete = true;
	
	public UsuarioMB() {
		
	}
	
	public void findUsuario(String paramUsuario){
		this.setUsuarioList(this.usuarioRepository.findByNome(paramUsuario));
		this.paramUsuario = null;
		showDialog("dialogListaResultado");
	}
	
	public void selectUsuario(SelectEvent evt) {
		try {
			if (evt.getObject() != null) {
				this.usuarioSelecionado = (UsuarioEntity) evt.getObject();
				this.flagBotaoDelete = false;
				this.flagBotaoUpdate = false;
		
			} else {
				this.usuarioSelecionado = null;
			}
		} catch (Exception e) {
			this.usuarioSelecionado = null;

			logger.error(e.getMessage(), e);
		}
	}
	
	public void unselectUsuario() {
		this.usuarioSelecionado = null;
	}
	
	public void delete() {
		if (this.usuarioSelecionado != null) {
			this.usuarioList.remove(this.usuarioSelecionado);
			this.usuarioRepository.delete(this.usuarioSelecionado.getId());
			unselectUsuario();
		}
	}
	
	////Getters and Setters////
	public List<UsuarioEntity> getUsuarioList() {
		return usuarioList;
	}
	public void setUsuarioList(List<UsuarioEntity> usuarioList) {
		this.usuarioList = usuarioList;
	}
	public UsuarioEntity getUsuarioSelecionado() {
		return usuarioSelecionado;
	}
	public void setUsuarioSelecionado(UsuarioEntity usuarioSelecionado) {
		this.usuarioSelecionado = usuarioSelecionado;
	}
	public String getParamUsuario() {
		return paramUsuario;
	}
	public void setParamUsuario(String paramUsuario) {
		this.paramUsuario = paramUsuario;
	}
	public Logger getLogger() {
		return logger;
	}
	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public IUsuarioRepository getUsuarioRepository() {
		return usuarioRepository;
	}

	public void setUsuarioRepository(IUsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public Boolean getFlagBotaoUpdate() {
		return flagBotaoUpdate;
	}

	public void setFlagBotaoUpdate(Boolean flagBotaoUpdate) {
		this.flagBotaoUpdate = flagBotaoUpdate;
	}

	public Boolean getFlagBotaoDelete() {
		return flagBotaoDelete;
	}

	public void setFlagBotaoDelete(Boolean flagBotaoDelete) {
		this.flagBotaoDelete = flagBotaoDelete;
	}


}
