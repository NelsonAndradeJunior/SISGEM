package br.com.sisgem.model;


import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.sisgem.enums.Ecargo;
import br.com.sisgem.enums.EinativoAtivo;
import br.com.sisgem.model.utils.BaseEntities;

@Entity
@Table(name="usuario")
@AttributeOverride(name = "id", column = @Column(name = "idUsuario"))
public class UsuarioEntity extends BaseEntities<Long> {

	private static final long serialVersionUID = 201404140102L;

	@Enumerated(EnumType.STRING)
	@NotNull
	private Ecargo Cargo;

	@Size(max=40)
	private String Celular;
	
	@Size(max=40)
	@NotNull
	private String Senha;
	
	@Size(max=40)
	@NotNull
	private String Nome;
	
	@Size(max=10)
	@NotNull
	private Integer NumeroEnd;
	
	@Size(max=50)
	@NotNull
	private String CEP;
	
	@Size(max=100)
	private String Telefone;
	
	@Size(max=40)
	private String CelularParticular;
	
	@Size(max=244)
	private String Email;
	
	@Size(max=40)
	private String CMotorista;
	
	@Size(max=40)
	private Date DtaValiCM;
	
	@Size(max=40)
	private String Complemento;
	
	@Size(max=10)
	@NotNull
	private Integer RuasCorreio_idRuasCorreio;	
	
	//um para muitos
	
	@OneToMany(mappedBy="Usuario_idUsuario",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<CarroEntity> carro;
	
	@OneToMany(mappedBy="Usuario_idUsuario", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private List<LocalizacaoLogEntity> LocalizacaologEntity;
	

	


	public UsuarioEntity(Ecargo cargo, String celular, String senha, String nome, Integer numeroEnd, String cEP,
			String telefone, String celularParticular, String email, String cMotorista, Date dtaValiCM,
			String complemento, Integer ruasCorreio_idRuasCorreio, List<CarroEntity> carro,
			List<LocalizacaoLogEntity> localizacaologEntity) {
		super();
		Cargo = cargo;
		Celular = celular;
		Senha = senha;
		Nome = nome;
		NumeroEnd = numeroEnd;
		CEP = cEP;
		Telefone = telefone;
		CelularParticular = celularParticular;
		Email = email;
		CMotorista = cMotorista;
		DtaValiCM = dtaValiCM;
		Complemento = complemento;
		RuasCorreio_idRuasCorreio = ruasCorreio_idRuasCorreio;
		this.carro = carro;
		LocalizacaologEntity = localizacaologEntity;
	}

	public UsuarioEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ecargo getCargo() {
		return Cargo;
	}

	public void setCargo(Ecargo cargo) {
		Cargo = cargo;
	}

	public String getCelular() {
		return Celular;
	}

		

	public List<CarroEntity> getCarro() {
		return carro;
	}

	public void setCarro(List<CarroEntity> carro) {
		this.carro = carro;
	}

	public List<LocalizacaoLogEntity> getLocalizacaologEntity() {
		return LocalizacaologEntity;
	}

	public void setLocalizacaologEntity(List<LocalizacaoLogEntity> localizacaologEntity) {
		LocalizacaologEntity = localizacaologEntity;
	}

	public void setCelular(String celular) {
		Celular = celular;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Integer getNumeroEnd() {
		return NumeroEnd;
	}

	public void setNumeroEnd(Integer numeroEnd) {
		NumeroEnd = numeroEnd;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getCelularParticular() {
		return CelularParticular;
	}

	public void setCelularParticular(String celularParticular) {
		CelularParticular = celularParticular;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getCMotorista() {
		return CMotorista;
	}

	public void setCMotorista(String cMotorista) {
		CMotorista = cMotorista;
	}

	public Date getDtaValiCM() {
		return DtaValiCM;
	}

	public void setDtaValiCM(Date dtaValiCM) {
		DtaValiCM = dtaValiCM;
	}

	public String getComplemento() {
		return Complemento;
	}

	public void setComplemento(String complemento) {
		Complemento = complemento;
	}

	public Integer getRuasCorreio_idRuasCorreio() {
		return RuasCorreio_idRuasCorreio;
	}

	public void setRuasCorreio_idRuasCorreio(Integer ruasCorreio_idRuasCorreio) {
		RuasCorreio_idRuasCorreio = ruasCorreio_idRuasCorreio;
	}

	
	
}