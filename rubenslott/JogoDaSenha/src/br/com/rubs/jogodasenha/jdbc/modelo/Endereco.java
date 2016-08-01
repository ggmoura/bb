package br.com.rubs.jogodasenha.jdbc.modelo;

public class Endereco {

	private Integer id;
	private String logradouro;
	private Integer numero;
	private String complemento;
	private String bairro;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", logradouro=" + logradouro
				+ ", numero=" + numero + ", complemento=" + complemento
				+ ", bairro=" + bairro + "]";
	}
}
