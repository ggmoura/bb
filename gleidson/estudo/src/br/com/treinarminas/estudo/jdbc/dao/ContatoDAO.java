package br.com.treinarminas.estudo.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.treinarminas.estudo.jdbc.ConnectionFactory;
import br.com.treinarminas.estudo.jdbc.modelo.Contato;

public class ContatoDAO implements IBaseDAO<Contato, Long> {

	private Connection connection;

	public ContatoDAO() {
		this.connection = ConnectionFactory.getInstance().getConnection();
	}

	@Override
	public void adicionar(Contato contato) {
		
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		
		
		String sql = "insert into contato (nome,email,endereco,dataNascimento) "
				+ "values (?,?,?,?)";
		try {
			
			enderecoDAO.adicionar(contato.getEndereco());
			
			PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setInt(3, contato.getEndereco().getId());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTime()));
			stmt.executeUpdate();

			//try with resources - fecha o recurso ao executar o bloco
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
	public void remover(Contato contato) {
		// TODO Auto-generated method stub
	}

	@Override
	public Contato recuperar(Long id) {
		return null;
	}

	@Override
	public List<Contato> recuperarTodos() {
		List<Contato> contatos = new ArrayList<Contato>();
		try {
	         Connection connection = ConnectionFactory.getInstance().getConnection();
	         PreparedStatement stmt = connection.prepareStatement("select * from contato");
	         ResultSet rs = stmt.executeQuery();
	         Contato contato = null;
	         while (rs.next()) {
	             // criando o objeto Contato
	             contato = new Contato();
	             contato.setId(rs.getLong("id"));
	             contato.setNome(rs.getString("nome"));
	             contato.setEmail(rs.getString("email"));
	             //contato.setEndereco(rs.getString("endereco"));
	             Date date = rs.getDate("dataNascimento");
	             contato.setDataNascimento(new java.util.Date(date.getTime()));
	             contatos.add(contato);
	         }
	         rs.close();
	         stmt.close();
	         connection.close();
	         return contatos;
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	}

}
