package br.com.sisgem.mb.produto;

import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.sisgem.mb.fornecedor.FornecedorAddEditMB;
import br.com.sisgem.mb.fornecedor.FornecedorMB;
import br.com.sisgem.model.ProdutoEntity;
import br.com.sisgem.model.repository.IProdutoRepository;
import br.com.sisgem.model.utils.BaseBeans;

@Component
@Scope ("view")
@Named (value = "produtoAddEditMB")
public class ProdutoAddEditMB extends BaseBeans{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IProdutoRepository produtoRepository;
	
	@Inject
	private FacesContext context;
	
	@Inject
	private ProdutoMB mbProdutoBean;
	
	@Inject
	private FornecedorMB fornecedor;
	
	@Inject
	private FornecedorAddEditMB fornecedorAddEdit;
	
	public FornecedorAddEditMB getFornecedorAddEdit() {
		return fornecedorAddEdit;
	}

	public void setFornecedorAddEdit(FornecedorAddEditMB fornecedorAddEdit) {
		this.fornecedorAddEdit = fornecedorAddEdit;
	}

	private ProdutoEntity produtoObj;
	
	public ProdutoAddEditMB() {
		this.produtoObj = new ProdutoEntity();
	}
	
	public void salvar(){
		this.produtoRepository.save(this.produtoObj);
	}
	
	public void update(){
		this.produtoObj = mbProdutoBean.getProdutoSelecionado();
	}
	
	
	////Getters and Setters////
	public IProdutoRepository getProdutoRepository() {
		return produtoRepository;
	}

	public void setProdutoRepository(IProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

	public FacesContext getContext() {
		return context;
	}

	public void setContext(FacesContext context) {
		this.context = context;
	}

	public ProdutoEntity getProdutoObj() {
		return produtoObj;
	}

	public void setProdutoObj(ProdutoEntity produtoObj) {
		this.produtoObj = produtoObj;
	}

	public FornecedorMB getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(FornecedorMB fornecedor) {
		this.fornecedor = fornecedor;
	}

}
