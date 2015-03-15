package br.com.sisgem.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.sisgem.model.utils.BaseEntities;

@Entity
@Table(name="produtos")
@AttributeOverride(name = "id", column = @Column(name = "idProdutos"))
public class ProdutoEntity extends BaseEntities<Long> {

	private static final long serialVersionUID = 1L;
	
	private String Nome;
	private String Unidade;
	private Integer Valor;
	public FornecedorEntity getFornecedor_idPessoaJuridica() {
		return Fornecedor_idPessoaJuridica;
	}

	public void setFornecedor_idPessoaJuridica(
			FornecedorEntity fornecedor_idPessoaJuridica) {
		Fornecedor_idPessoaJuridica = fornecedor_idPessoaJuridica;
	}

	private String EPI;
	
	@ManyToOne
	@JoinColumn(name="Fornecedor_idPessoaJuridica")
	private FornecedorEntity Fornecedor_idPessoaJuridica;
	
	public ProdutoEntity() {
		
	}

	public ProdutoEntity(Integer fornecedor_idPessoaJuridica, String nome,
			String unidade, Integer valor, String ePI) {
		super();
		
		Nome = nome;
		Unidade = unidade;
		Valor = valor;
		EPI = ePI;
	}


	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getUnidade() {
		return Unidade;
	}

	public void setUnidade(String unidade) {
		Unidade = unidade;
	}

	public Integer getValor() {
		return Valor;
	}

	public void setValor(Integer valor) {
		Valor = valor;
	}

	public String getEPI() {
		return EPI;
	}

	public void setEPI(String ePI) {
		EPI = ePI;
	}
	
	

}
