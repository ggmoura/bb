package br.com.rubs.jogodasenha.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.rubs.jogodasenha.jdbc.ConnectionFactory;
import br.com.rubs.jogodasenha.jdbc.modelo.Contato;

public class RecuperaContato {

	public List<Contato> getListaContatos() {
	     try {
	         List<Contato> contatos = new ArrayList<Contato>();
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
	             contato.setEndereco(rs.getString("endereco"));
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
