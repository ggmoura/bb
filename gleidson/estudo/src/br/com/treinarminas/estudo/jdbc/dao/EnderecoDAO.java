package br.com.treinarminas.estudo.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.com.treinarminas.estudo.jdbc.AgendaException;
import br.com.treinarminas.estudo.jdbc.modelo.Endereco;

public class EnderecoDAO implements IBaseDAO<Endereco, Integer> {

	private Connection connection;

	public EnderecoDAO(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void adicionar(Endereco endereco) {
		String sql = "insert into endereco (logradouro, numero, complemento, bairro) "
				+ "values (?, ?, ?, ?)";
		try {

			PreparedStatement stmt = connection.prepareStatement(sql,
					Statement.RETURN_GENERATED_KEYS);

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

		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}

	@Override
	public void alterar(Endereco obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remover(Endereco obj) throws AgendaException {
		String sql = "DELETE FROM endereco WHERE id = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, obj.getId());
			int afetados = stmt.executeUpdate();
			if (afetados == 0) {
				AgendaException agendaException = new AgendaException();
				agendaException.setCodigoMotivo(1);
				throw agendaException;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Endereco recuperar(Integer id) {
		try {
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
