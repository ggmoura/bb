package br.com.treinarminas.estudo.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.treinarminas.estudo.jdbc.ConnectionFactory;
import br.com.treinarminas.estudo.jdbc.modelo.Contato;

public class CriaContato {

	public void criarContato(Contato contato) throws SQLException {
		
		Connection connection = ConnectionFactory.getInstance().getConnection();
		String sql = "insert into contato (nome,email,endereco,dataNascimento) "
					+ "values (?,?,?,?)";
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		stmt.setString(1, contato.getNome());
		stmt.setString(2, contato.getEmail());
		stmt.setString(3, contato.getEndereco());
		stmt.setDate(4, new Date(contato.getDataNascimento().getTime()));
		stmt.execute();
		
		connection.close();
		
	}
	
}
