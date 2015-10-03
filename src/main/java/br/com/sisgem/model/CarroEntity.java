package br.com.sisgem.model;

import java.awt.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.sisgem.model.utils.BaseEntities;

@Entity
@Table(name="carro")
@AttributeOverride(name = "id", column = @Column(name = "idCarro"))
public class CarroEntity extends BaseEntities<Long>{

	private static final long serialVersionUID = 1L;
	

	
	@Size(max=40)
	private String Modelo;
	
	@Size(max=10)
	private Integer Ano;

	@Size(max=1)
	private boolean Aluguel;
	
	//@Column(columnDefinition = "TINYINT")
	//@Type(type = "org.hibernate.type.NumericBooleanType")
	//public boolean admin = true;
	
	@Size(max=40)
	private String Cor;

	@Size(max=40)
	private String Placa;
	
	@Size(max=40)
	@NotNull
	private String LocalCarro;
	
	@Size(max=40)
	private String StatusCarro;	
	
	//relacionamento muitos para um "@ManyToOne = Esta classe só pode ter uma dessa variável, mas a variavel pode ter várias dessa classe; "
	
	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="Usuario_idUsuario")//
	private UsuarioEntity Usuario_idUsuario; 
	
	
	public CarroEntity() {
		// TODO Auto-generated constructor stub
	}


	public CarroEntity( String modelo, Integer ano, boolean aluguel, String cor, String placa,
			String localCarro, String statusCarro) {
		super();
		
		Modelo = modelo;
		Ano = ano;
		Aluguel = aluguel;
		Cor = cor;
		Placa = placa;
		LocalCarro = localCarro;
		StatusCarro = statusCarro;
	}


	


	


	public String getModelo() {
		return Modelo;
	}


	public void setModelo(String modelo) {
		Modelo = modelo;
	}


	public Integer getAno() {
		return Ano;
	}


	public void setAno(Integer ano) {
		Ano = ano;
	}


	public boolean isAluguel() {
		return Aluguel;
	}


	public void setAluguel(boolean aluguel) {
		Aluguel = aluguel;
	}


	public String getCor() {
		return Cor;
	}


	public void setCor(String cor) {
		Cor = cor;
	}


	public String getPlaca() {
		return Placa;
	}


	public void setPlaca(String placa) {
		Placa = placa;
	}


	public String getLocalCarro() {
		return LocalCarro;
	}


	public void setLocalCarro(String localCarro) {
		LocalCarro = localCarro;
	}


	public String getStatusCarro() {
		return StatusCarro;
	}


	public void setStatusCarro(String statusCarro) {
		StatusCarro = statusCarro;
	}

	
}
