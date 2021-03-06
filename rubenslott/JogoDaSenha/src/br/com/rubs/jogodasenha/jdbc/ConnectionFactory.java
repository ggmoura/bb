package br.com.rubs.jogodasenha.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static ConnectionFactory instance;
	
	static {
		instance = new ConnectionFactory();
	}
	
	private ConnectionFactory() {
		super();
	}
	
	public static ConnectionFactory getInstance() {
		return instance;
	}
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/treinar", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}