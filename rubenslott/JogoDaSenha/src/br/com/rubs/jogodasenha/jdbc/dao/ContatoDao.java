package br.com.rubs.jogodasenha.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.treinarminas.estudo.jdbc.ConnectionFactory;
import br.com.treinarminas.estudo.jdbc.modelo.Contato;

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
