package br.com.rubs.jogodasenha.teste;

import java.util.List;

import br.com.rubs.jogodasenha.jdbc.dao.CriaContato;
import br.com.rubs.jogodasenha.jdbc.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CriaContato cc = new CriaContato();

		List<Contato> contatos = dao.getLista();

		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			// System.out.println("Data de Nascimento: " +
			// contato.getDataNascimento().getTime() + "\n");
		}
	}
}
