package br.com.rubs.jogodasenha.jdbc.modelo;

import java.util.Date;

public class Contato implements Comparable<Contato> {

	private Long id;
	private String nome;
	private String email;
	private Endereco endereco;
	private Date dataNascimento;

	// Métodos GET e SET para id, nome, email, endereço e dataNascimento

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Date getDataNascimento() {
		return dataNascimento;
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