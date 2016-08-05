package br.com.treinarminas.agenda.modelo;

import java.util.Date;

public class Contato implements Comparable<Contato> {

	private Long id;
	private String nome;
	private String email;
	private Endereco endereco;
	private Date dataNascimento;

	// m�todos get e set para id, nome, email, endere�o e dataNascimento

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String novo) {
		this.email = novo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", email=" + email
				+ ", endereco=" + endereco + ", dataNascimento="
				+ dataNascimento + "]";
	}

	@Override
	public int compareTo(Contato o) {
		return this.nome.compareToIgnoreCase(o.nome);
	}
}