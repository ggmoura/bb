package br.com.treinarminas.estudo.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.com.treinarminas.estudo.jdbc.ConnectionFactory;
import br.com.treinarminas.estudo.jdbc.modelo.Endereco;

public class EnderecoDAO implements IBaseDAO<Endereco, Integer> {

	private Connection connection;

	public EnderecoDAO() {
		this.connection = ConnectionFactory.getInstance().getConnection();
	}
	
	@Override
	public void adicionar(Endereco endereco) {
		String sql = "insert into endereco (logradouro, numero, complemento, bairro) "
					+ "values (?, ?, ?, ?)";
		try {
			
			PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, endereco.getLogradouro());
			stmt.setInt(2, endereco.getNumero());
			stmt.setString(3, endereco.getComplemento());
			stmt.setString(4, endereco.getBairro());
			stmt.executeUpdate();
			Long longId = null;
			//try with resources - fecha o recurso ao executar o bloco
			try (ResultSet result = stmt.getGeneratedKeys()) {
				if (result.next()) {
					longId = Long.valueOf(result.getLong(1));
					endereco.setId(longId.intValue());
				} else {
					throw new SQLException("Creating user failed, no ID obtained.");
				}
			}
				
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}

	@Override
	public void alterar(Endereco obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Endereco obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Endereco recuperar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Endereco> recuperarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
