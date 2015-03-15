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
	
	private String CNPJ;
	private String IM; 
	private String IE;
	private String RazaoSocial;
	private String Telefone;
	private String Complemento;
	private String Email;
	private String Contato;
	private Integer StatusForn;
	private String Nome;
	private String Rua;
	private String CEP;
	private Integer Numero;
	private String Bairro;
	private String Cidade;
	private String Estado;
	
    @OneToMany(mappedBy="Fornecedor_idPessoaJuridica", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private List<ProdutoEntity> produtoEntity;
	
	public FornecedorEntity() {
		
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public Integer getNumero() {
		return Numero;
	}

	public void setNumero(Integer numero) {
		Numero = numero;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public FornecedorEntity(String cNPJ, String iM, String iE,
			String razaoSocial, String telefone, String complemento,
			String email, String contato, Integer statusForn, String nome,
			String rua, String cEP, Integer numero, String bairro,
			String cidade, String estado) {
		super();
		CNPJ = cNPJ;
		IM = iM;
		IE = iE;
		RazaoSocial = razaoSocial;
		Telefone = telefone;
		Complemento = complemento;
		Email = email;
		Contato = contato;
		StatusForn = statusForn;
		Nome = nome;
		Rua = rua;
		CEP = cEP;
		Numero = numero;
		Bairro = bairro;
		Cidade = cidade;
		Estado = estado;
	}



	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getIM() {
		return IM;
	}

	public void setIM(String iM) {
		IM = iM;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getComplemento() {
		return Complemento;
	}

	public void setComplemento(String complemento) {
		Complemento = complemento;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getContato() {
		return Contato;
	}

	public void setContato(String contato) {
		Contato = contato;
	}

	public Integer getStatusForn() {
		return StatusForn;
	}

	public void setStatusForn(Integer statusForn) {
		StatusForn = statusForn;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	

}
