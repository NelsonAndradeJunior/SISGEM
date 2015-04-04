package br.com.sisgem.model;

public class ClienteEntitySM {

	// idcliente
	private long id;
	private String nomerazaos;
	private String complemento;
	private String telefone;
	private String telefone2;
	private String celular;
	private String CNPJCPF;
	private String email;
	private String DtaAniversario;
	private String IE;
	private String IM;
	private int FlagPFPJ;
	private int ReceberSMS;
	private int StatusCliente;
	private int CEP;
	private String bairro;
	private String estado;
	private String cidade;
	private String Endereco;
	private int Numero;
	
	public ClienteEntitySM() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ClienteEntitySM(String nomerazaos, String complemento,
			String telefone, String telefone2, String celular, String cNPJCPF,
			String email, String dtaAniversario, String iE, String iM,
			int flagPFPJ, int receberSMS, int statusCliente, int cEP,
			String bairro, String estado, String cidade, String endereco,
			int numero) {
		super();
		this.nomerazaos = nomerazaos;
		this.complemento = complemento;
		this.telefone = telefone;
		this.telefone2 = telefone2;
		this.celular = celular;
		CNPJCPF = cNPJCPF;
		this.email = email;
		DtaAniversario = dtaAniversario;
		IE = iE;
		IM = iM;
		FlagPFPJ = flagPFPJ;
		ReceberSMS = receberSMS;
		StatusCliente = statusCliente;
		CEP = cEP;
		this.bairro = bairro;
		this.estado = estado;
		this.cidade = cidade;
		Endereco = endereco;
		Numero = numero;
	}

	public String getNomerazaos() {
		return nomerazaos;
	}

	public void setNomerazaos(String nomerazaos) {
		this.nomerazaos = nomerazaos;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
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

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCNPJCPF() {
		return CNPJCPF;
	}

	public void setCNPJCPF(String cNPJCPF) {
		CNPJCPF = cNPJCPF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDtaAniversario() {
		return DtaAniversario;
	}

	public void setDtaAniversario(String dtaAniversario) {
		DtaAniversario = dtaAniversario;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

	public String getIM() {
		return IM;
	}

	public void setIM(String iM) {
		IM = iM;
	}

	public int getFlagPFPJ() {
		return FlagPFPJ;
	}

	public void setFlagPFPJ(int flagPFPJ) {
		FlagPFPJ = flagPFPJ;
	}

	public int getReceberSMS() {
		return ReceberSMS;
	}

	public void setReceberSMS(int receberSMS) {
		ReceberSMS = receberSMS;
	}

	public int getStatusCliente() {
		return StatusCliente;
	}

	public void setStatusCliente(int statusCliente) {
		StatusCliente = statusCliente;
	}

	public int getCEP() {
		return CEP;
	}

	public void setCEP(int cEP) {
		CEP = cEP;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}
	
	

}
