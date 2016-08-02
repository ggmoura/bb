package br.com.treinarminas.estudo.jdbc.dao;

import java.sql.Connection;

import br.com.treinarminas.estudo.jdbc.ConnectionFactory;

public class TesteEndereco {
	public static void main(String[] args) {
		Connection connection = ConnectionFactory.getInstance().getConnection();

		EnderecoDAO dao = new EnderecoDAO(connection);
		System.out.println(dao.recuperar(1));
		
	}
}
