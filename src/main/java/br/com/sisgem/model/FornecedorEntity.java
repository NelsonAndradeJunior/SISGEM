package br.com.sisgem.model;

import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.sisgem.model.utils.BaseEntities;

@Entity
@Table(name="fornecedor")
@AttributeOverride(name = "id", column = @Column(name = "idPessoaJuridica"))
public class FornecedorEntity extends BaseEntities<Long>{

	private static final long serialVersionUID = 1L;
	
	@Size(max=40)
	@NotNull
	private String cnpj;
	
	@Size(max=40)
	@NotNull
	private String im; 
	
	@Size(max=40)
	@NotNull
	private String ie;
	
	@Size(max=100)
	@NotNull
	private String razaoSocial;	
	
	@Size(max=40)
	@NotNull
	private String telefone;
	
	@Size(max=40)
	@NotNull
	private String telefone2;
	
	@Size(max=40)
	private String complemento;
	
	@Size(max=40)
	@NotNull
	private String email;
	
	@Size(max=40)
	private String contato;
	
	@NotNull
	private Boolean statusForn;
	
	@Size(max=40)
	@NotNull
	private String nomeFantasia;
	
	@Size(max=11)
	@NotNull
	private String cep;
	
	@Size(max=255)
	@NotNull
	@Column(name="endereco")
	private String rua;
	
	@Size(max=255)
	@NotNull
	private String bairro;
	
	@Size(max=255)
	@NotNull
	private String cidade;
	
	@Size(max=100)
	@NotNull
	private String estado;
	
	@Size(max=11)
	@NotNull
	private Integer numero;
	
	@Size(max=255)
	private String observacao;
	
	private Date dtcadastro; 

	
    @OneToMany(mappedBy="Fornecedor_idPessoaJuridica", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private List<ProdutoEntity> produtoEntity;
	
	public FornecedorEntity() {
		// TODO Auto-generated constructor stub
	}

	public FornecedorEntity(String cnpj, String im, String ie,
			String razaoSocial, String telefone, String telefone2,
			String complemento, String email, String contato,
			Boolean statusForn, String nomeFantasia, String cep, String rua,
			String bairro, String cidade, String estado, Integer numero,
			String observacao, Date dtcadastro,
			List<ProdutoEntity> produtoEntity) {
		super();
		this.cnpj = cnpj;
		this.im = im;
		this.ie = ie;
		this.razaoSocial = razaoSocial;
		this.telefone = telefone;
		this.telefone2 = telefone2;
		this.complemento = complemento;
		this.email = email;
		this.contato = contato;
		this.statusForn = statusForn;
		this.nomeFantasia = nomeFantasia;
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.numero = numero;
		this.observacao = observacao;
		this.dtcadastro = dtcadastro;
		this.produtoEntity = produtoEntity;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIm() {
		return im;
	}

	public void setIm(String im) {
		this.im = im;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Boolean getStatusForn() {
		return statusForn;
	}

	public void setStatusForn(Boolean statusForn) {
		this.statusForn = statusForn;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Date getDtcadastro() {
		return dtcadastro;
	}

	public void setDtcadastro(Date dtcadastro) {
		this.dtcadastro = dtcadastro;
	}

	public List<ProdutoEntity> getProdutoEntity() {
		return produtoEntity;
	}

	public void setProdutoEntity(List<ProdutoEntity> produtoEntity) {
		this.produtoEntity = produtoEntity;
	}


}
