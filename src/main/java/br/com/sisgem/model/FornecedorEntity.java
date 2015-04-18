package br.com.sisgem.model;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.sisgem.model.utils.BaseEntities;

@Entity
@Table(name="fornecedor")
@AttributeOverride(name = "id", column = @Column(name = "idPessoaJuridica"))
public class FornecedorEntity extends BaseEntities<Long>{

	private static final long serialVersionUID = 1L;
	
	private String cnpj;
	private String im; 
	private String ie;
	private String razaoSocial;
	private String telefone;
	private String telefone2;
	private String complemento;
	private String email;
	private String contato;
	private Integer statusForn;
	private String nomeFantasia;
	@Column(name="endereco")
	private String rua;
	private String cep;
	private Integer numero;
	private String bairro;
	private String cidade;
	private String estado;
	
    @OneToMany(mappedBy="Fornecedor_idPessoaJuridica", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private List<ProdutoEntity> produtoEntity;
	
	public FornecedorEntity() {
		// TODO Auto-generated constructor stub
	}

	public FornecedorEntity(String cnpj, String im, String ie,
			String razaoSocial, String telefone, String complemento,
			String email, String contato, Integer statusForn, String nomeFantasia,
			String rua, String cep, Integer numero, String bairro,
			String cidade, String estado, List<ProdutoEntity> produtoEntity) {
		super();
		this.cnpj = cnpj;
		this.im = im;
		this.ie = ie;
		this.razaoSocial = razaoSocial;
		this.telefone = telefone;
		this.complemento = complemento;
		this.email = email;
		this.contato = contato;
		this.statusForn = statusForn;
		this.nomeFantasia = nomeFantasia;
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
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

	public Integer getStatusForn() {
		return statusForn;
	}

	public void setStatusForn(Integer statusForn) {
		this.statusForn = statusForn;
	}

	public String getnomeFantasia() {
		return nomeFantasia;
	}

	public void setnomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
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

	public List<ProdutoEntity> getProdutoEntity() {
		return produtoEntity;
	}

	public void setProdutoEntity(List<ProdutoEntity> produtoEntity) {
		this.produtoEntity = produtoEntity;
	}

	
	

}
