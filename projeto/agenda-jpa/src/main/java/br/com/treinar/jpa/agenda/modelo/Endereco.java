package br.com.treinar.jpa.agenda.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(@NamedQuery(name = Endereco.EnderecoConstante.LIST_KEY, query = Endereco.EnderecoConstante.LIST_QUERY))
@Entity(name = "Address")
@Table(name = "TB_Endereco")
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nome_rua")
	private String logradouro;
	private Integer numero;
	private String complemento;
	private String bairro;

	public Endereco() {
		super();
	}

	public Endereco(String bairro) {
		this();
		this.bairro = bairro;
	}

	public Endereco(Integer id, String bairro, String logradouro) {
		this(bairro);
		this.id = id;
		this.logradouro = logradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", logradouro=" + logradouro
				+ ", numero=" + numero + ", complemento=" + complemento
				+ ", bairro=" + bairro + "]";
	}

	public interface EnderecoConstante {
		String LIST_KEY = "Endereco.queryList";
		String LIST_QUERY = "select distinct new br.com.treinar.jpa.agenda.modelo.Endereco(e.id, e.bairro, e.logradouro) from Address e";
		String EDIT_KEY = "";
		String EDIT_QUERY = "";
	}

}
