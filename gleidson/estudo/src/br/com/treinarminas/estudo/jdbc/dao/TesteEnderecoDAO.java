package br.com.treinarminas.estudo.jdbc.dao;

import java.util.List;

import br.com.treinarminas.estudo.jdbc.modelo.Contato;

public class TesteEnderecoDAO {
	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		
		List<Contato> recuperarTodos = dao.recuperarTodos();
		for (Contato contato : recuperarTodos) {
			System.out.println(contato);
		}
		
	}

}
