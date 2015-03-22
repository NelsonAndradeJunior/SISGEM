package br.com.sisgem.mb.fornecedor;

import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import br.com.sisgem.model.FornecedorEntity;
import br.com.sisgem.model.repository.IFornecedorRepository;
import br.com.sisgem.model.utils.BaseBeans;

@Component
@Scope (value = WebApplicationContext.SCOPE_REQUEST)
@Named (value = "fornecedorAddEditMB")
public class FornecedorAddEditMB extends BaseBeans{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IFornecedorRepository fornecedorRepository;
	
	@Inject
	private FacesContext context;
	
	@Inject
	private FornecedorMB mbFornecedorBean;
	
	private FornecedorEntity fornecedorObj;
	
	public FornecedorAddEditMB() {
		this.fornecedorObj = new FornecedorEntity();
	}
	
	public void salvar(){
		this.fornecedorRepository.save(this.fornecedorObj);
	}
	
	public void update(){
		this.fornecedorObj = mbFornecedorBean.getFornecedorSelecionado();
	}
	
	////Getters and Setters////
	public IFornecedorRepository getFornecedorRepository() {
		return fornecedorRepository;
	}

	public void setFornecedorRepository(IFornecedorRepository fornecedorRepository) {
		this.fornecedorRepository = fornecedorRepository;
	}

	public FacesContext getContext() {
		return context;
	}

	public void setContext(FacesContext context) {
		this.context = context;
	}

	public FornecedorEntity getFornecedorObj() {
		return fornecedorObj;
	}

	public void setFornecedorObj(FornecedorEntity fornecedorObj) {
		this.fornecedorObj = fornecedorObj;
	}

}
