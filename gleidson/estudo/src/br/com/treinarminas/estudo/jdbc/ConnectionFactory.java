package br.com.treinarminas.estudo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static ConnectionFactory instance;
	
	static {
		instance = new ConnectionFactory();
	}
	
	private  ConnectionFactory() {
		super();
	}
	
	public static ConnectionFactory getInstance() {
		return instance;
	}
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/treinar",
					"root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
