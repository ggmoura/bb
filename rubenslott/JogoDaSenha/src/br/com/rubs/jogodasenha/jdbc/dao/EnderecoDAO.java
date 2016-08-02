package br.com.rubs.jogodasenha.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.com.rubs.jogodasenha.jdbc.ConnectionFactory;
import br.com.rubs.jogodasenha.jdbc.modelo.Endereco;

public class EnderecoDAO implements IBaseDAO <Endereco, Integer>{

	private Connection connection;

	public EnderecoDAO(Connection connection2) {
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
			// try with resources - fecha o recurso ao executar o bloco
			try (ResultSet result = stmt.getGeneratedKeys()) {
				if (result.next()) {
					longId = Long.valueOf(result.getLong(1));
					endereco.setId(longId.intValue());
				} else {
					throw new SQLException(
							"Creating user failed, no ID obtained.");
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
		try {
			Connection connection = ConnectionFactory.getInstance().getConnection();
			// sei que a ordenacao poderia ser na query, porem, vamos praticar
			// ordenacao de objetos utilizando a api Collection
			PreparedStatement stmt = connection
					.prepareStatement("select * from endereco where id = ?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			Endereco endereco = null;
			if (rs.next()) {
				// criando o objeto Contato
				endereco = new Endereco();
				endereco.setId(rs.getInt("id"));
				endereco.setBairro(rs.getString("bairro"));
				endereco.setLogradouro(rs.getString("logradouro"));
				endereco.setComplemento(rs.getString("complemento"));
				endereco.setNumero(rs.getInt("numero"));
			}
			rs.close();
			stmt.close();
			connection.close();
			return endereco;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	@Override
	public List<Endereco> recuperarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
