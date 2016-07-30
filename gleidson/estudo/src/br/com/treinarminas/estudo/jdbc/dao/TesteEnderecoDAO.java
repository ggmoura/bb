package br.com.treinarminas.estudo.jdbc.dao;

import java.sql.Connection;
import java.util.List;

import br.com.treinarminas.estudo.jdbc.ConnectionFactory;
import br.com.treinarminas.estudo.jdbc.modelo.Contato;

public class TesteEnderecoDAO {
	public static void main(String[] args) {
		Connection connection = ConnectionFactory.getInstance().getConnection();

		ContatoDAO dao = new ContatoDAO(connection);
		
		List<Contato> recuperarTodos = dao.recuperarTodos();
		for (Contato contato : recuperarTodos) {
			System.out.println(contato);
		}
		
	}

}
