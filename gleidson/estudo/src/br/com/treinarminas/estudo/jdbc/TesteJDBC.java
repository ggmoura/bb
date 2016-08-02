package br.com.treinarminas.estudo.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteJDBC {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = ConnectionFactory.getInstance().getConnection();
		conexao.close();
		conexao = ConnectionFactory.getInstance().getConnection();
		conexao.close();
		System.out.println("Conectado!");
		
	}
	
}
