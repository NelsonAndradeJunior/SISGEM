package br.com.sisgem.mb.fornecedor;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import br.com.sisgem.model.FornecedorEntity;
import br.com.sisgem.model.repository.IFornecedorRepository;
import br.com.sisgem.model.utils.BaseBeans;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION)
@Named(value= "fornecedorMB")
public class FornecedorMB extends BaseBeans{

	private static final long serialVersionUID = 1L;
	
	private Logger logger = Logger.getLogger(getClass());
	
	@Inject
	private IFornecedorRepository fornecedorRepository;
	
	private List<FornecedorEntity> fornecedorList;
	
	private FornecedorEntity fornecedorSelecionado;
	
	private String paramFornecedor;
	
	private Boolean flagBotaoUpdate = true;
	
	private Boolean flagBotaoDelete = true;
	
	public FornecedorMB() {
		
	}
	
	public void findFornecedor(String paramFornecedor){
		this.setFornecedorList(this.fornecedorRepository.findByCNPJ(paramFornecedor));
		this.paramFornecedor = null;
		showDialog("dialogListaResultado");
	}
	
	public void selectFornecedor(SelectEvent evt) {
		try {
			if (evt.getObject() != null) {
				this.fornecedorSelecionado = (FornecedorEntity) evt.getObject();
				this.flagBotaoDelete = false;
				this.flagBotaoUpdate = false;
		
			} else {
				this.fornecedorSelecionado = null;
			}
		} catch (Exception e) {
			this.fornecedorSelecionado = null;

			logger.error(e.getMessage(), e);
		}
	}
	
	public void unselectFornecedor() {
		this.fornecedorSelecionado = null;
	}
	
	public void delete() {
		if (this.fornecedorSelecionado != null) {
			this.fornecedorList.remove(this.fornecedorSelecionado);
			this.fornecedorRepository.delete(this.fornecedorSelecionado.getId());
			unselectFornecedor();
		}
	}
	
	////Getters and Setters////
	public List<FornecedorEntity> getFornecedorList() {
		return fornecedorList;
	}
	public void setFornecedorList(List<FornecedorEntity> fornecedorList) {
		this.fornecedorList = fornecedorList;
	}
	public FornecedorEntity getFornecedorSelecionado() {
		return fornecedorSelecionado;
	}
	public void setFornecedorSelecionado(FornecedorEntity fornecedorSelecionado) {
		this.fornecedorSelecionado = fornecedorSelecionado;
	}
	public String getParamFornecedor() {
		return paramFornecedor;
	}
	public void setParamFornecedor(String paramFornecedor) {
		this.paramFornecedor = paramFornecedor;
	}
	public Logger getLogger() {
		return logger;
	}
	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public IFornecedorRepository getFornecedorRepository() {
		return fornecedorRepository;
	}

	public void setFornecedorRepository(IFornecedorRepository fornecedorRepository) {
		this.fornecedorRepository = fornecedorRepository;
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