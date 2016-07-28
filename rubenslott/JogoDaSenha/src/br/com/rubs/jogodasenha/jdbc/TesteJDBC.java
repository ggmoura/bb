package br.com.rubs.jogodasenha.jdbc;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteJDBC {

	public static void main(String[] args) throws SQLException {
		Connection conexao = ConnectionFactory().getInstance().getConnection();
		//Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/treinar", "root", "");
		System.out.println("Conectado!");
		conexao.close();
	}

}
