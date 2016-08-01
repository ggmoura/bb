package br.com.rubs.jogodasenha.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.rubs.jogodasenha.jdbc.AgendaException;
import br.com.rubs.jogodasenha.jdbc.modelo.Contato;

public class ContatoDAO implements IBaseDAO<Contato, Long> {

	private Connection connection;

	public ContatoDAO(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public void adicionar(Contato contato) {

		EnderecoDAO enderecoDAO = new EnderecoDAO(connection);

		String sql = "insert into contato (nome,email,endereco,dataNascimento) " + "values (?,?,?,?)";
		try {

			enderecoDAO.adicionar(contato.getEndereco());

			PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setInt(3, contato.getEndereco().getId());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTime()));
			stmt.executeUpdate();

			// try with resources - fecha o recurso ao executar o bloco
			try (ResultSet result = stmt.getGeneratedKeys()) {
				if (result.next()) {
					contato.setId(result.getLong(1));
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
	public void alterar(Contato contato) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remover(Contato contato) throws AgendaException {
		String sql = "DELETE FROM contato WHERE id = ?";
		try {
			String nome = null;
			EnderecoDAO enderecoDAO = new EnderecoDAO(connection);
			enderecoDAO.remover(contato.getEndereco());
			PreparedStatement stmt = connection.prepareStatement(sql);
			nome.toString();
			stmt.setLong(1, contato.getId());
			int afetados = stmt.executeUpdate();
			if (afetados == 0) {
				AgendaException agendaException = new AgendaException();
				agendaException.setCodigoMotivo(1);
				throw agendaException;
			}
		} catch (AgendaException e) {
			//TODO
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Contato recuperar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contato> recuperarTodos() {
		List<Contato> contatos = new ArrayList<Contato>();
		EnderecoDAO dao = new EnderecoDAO(connection);
		try {
			// sei que a ordenacao poderia ser na query, porem, vamos praticar
			// ordenacao de objetos utilizando a api Collection
			PreparedStatement stmt = connection
					.prepareStatement("select * from contato");
			ResultSet rs = stmt.executeQuery();
			Contato contato = null;
			while (rs.next()) {
				// criando o objeto Contato
				contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(dao.recuperar(rs.getInt("endereco")));
				Date date = rs.getDate("dataNascimento");
				contato.setDataNascimento(new java.util.Date(date.getTime()));
				contatos.add(contato);
			} 
			rs.close();
			stmt.close();
			ordenarContatos(contatos);
			return contatos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	private void ordenarContatos(List<Contato> contatos) {
		Collections.sort(contatos);
	}

}
