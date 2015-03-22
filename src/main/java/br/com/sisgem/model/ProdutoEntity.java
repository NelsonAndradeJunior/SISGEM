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
	
	private String nome;
	private String unidade_medida;
	private Integer valor_venda;
	private Integer valor_compra;		
	private String epi;
	private String conteudo;
	
	@ManyToOne
	@JoinColumn(name="Fornecedor_idPessoaJuridica")
	private FornecedorEntity Fornecedor_idPessoaJuridica;
	
	public ProdutoEntity() {
		
	}

	public ProdutoEntity(String nome, String unidade_medida,
			Integer valor_venda, Integer valor_compra, String epi,
			String conteudo) {
		super();
		this.nome = nome;
		this.unidade_medida = unidade_medida;
		this.valor_venda = valor_venda;
		this.valor_compra = valor_compra;
		this.epi = epi;
		this.conteudo = conteudo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUnidade_medida() {
		return unidade_medida;
	}

	public void setUnidade_medida(String unidade_medida) {
		this.unidade_medida = unidade_medida;
	}

	public Integer getValor_venda() {
		return valor_venda;
	}

	public void setValor_venda(Integer valor_venda) {
		this.valor_venda = valor_venda;
	}

	public Integer getValor_compra() {
		return valor_compra;
	}

	public void setValor_compra(Integer valor_compra) {
		this.valor_compra = valor_compra;
	}

	public String getEpi() {
		return epi;
	}

	public void setEpi(String epi) {
		this.epi = epi;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public FornecedorEntity getFornecedor_idPessoaJuridica() {
		return Fornecedor_idPessoaJuridica;
	}

	public void setFornecedor_idPessoaJuridica(
			FornecedorEntity fornecedor_idPessoaJuridica) {
		Fornecedor_idPessoaJuridica = fornecedor_idPessoaJuridica;
	}
	
	
}
