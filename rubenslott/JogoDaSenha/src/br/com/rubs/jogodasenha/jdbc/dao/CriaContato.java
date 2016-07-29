package br.com.rubs.jogodasenha.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.rubs.jogodasenha.jdbc.ConnectionFactory;
import br.com.rubs.jogodasenha.jdbc.modelo.Contato;

public class CriaContato {

	public void criarContato(Contato contato) throws SQLException {
		
		Connection connection = ConnectionFactory.getInstance().getConnection();
		String sql = "insert into contatos (nome,email,endereco,dataNascimento) "
					+ "values (?,?,?,?)";
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		stmt.setString(1, contato.getNome());
		stmt.setString(2, contato.getEmail());
		stmt.setString(3, contato.getEndereco());
		
		java.sql.Date dataParaGravar = new java.sql.Date(
				Calendar.getInstance().getTimeInMillis());
		stmt.setDate(4, dataParaGravar);

		stmt.execute();
		
		connection.close();
		
	}
	
}
