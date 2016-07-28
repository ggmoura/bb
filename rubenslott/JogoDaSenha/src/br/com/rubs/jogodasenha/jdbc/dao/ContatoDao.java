package br.com.rubs.jogodasenha.jdbc.dao;

import java.sql.Connection;

import br.com.rubs.jogodasenha.jdbc.ConnectionFactory;

public class ContatoDAO implements IBaseDAO {

	private Connection connection;
	
	public ContatoDAO() {
		this.connection = ConnectionFactory.getInstance().getConnection();
	}

	@Override
	public void adicionar(Object obj) {
		
	}

	@Override
	public void alterar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recuperar() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
