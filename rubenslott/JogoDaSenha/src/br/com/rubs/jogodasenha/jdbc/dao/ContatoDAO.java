package br.com.rubs.jogodasenha.jdbc.dao;

import java.sql.Connection;

import br.com.rubs.jogodasenha.jdbc.ConnectionFactory;
import br.com.rubs.jogodasenha.jdbc.modelo.Contato;

public class ContatoDAO implements IBaseDAO<Contato, Long> {

	private Connection connection;
	
	public ContatoDAO() {
		this.connection = ConnectionFactory.getInstance().getConnection();
	}

	@Override
	public void adicionar(Contato contato) {
		
	}

	@Override
	public void alterar(Contato contato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recuperar(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
