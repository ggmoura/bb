package br.com.treinarminas.estudo.jdbc.principal;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import br.com.treinarminas.estudo.jdbc.AgendaException;
import br.com.treinarminas.estudo.jdbc.ConnectionFactory;
import br.com.treinarminas.estudo.jdbc.dao.ContatoDAO;
import br.com.treinarminas.estudo.jdbc.modelo.Contato;

public class TesteExclusao {

	public static void main(String[] args) throws SQLException, AgendaException {
		
		
		//a transacao eh fechada pelo try with resource 
		try(Connection connection = ConnectionFactory.getInstance().getConnection()) {
			connection.setAutoCommit(Boolean.FALSE);
			ContatoDAO dao = new ContatoDAO(connection);
			List<Contato> contatos = dao.recuperarTodos();
			
			for (int i = 0; i < contatos.size(); i++) {
				System.out.println(i + " - " + contatos.get(i));
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o contato a ser excluido");
			Integer contatoId = sc.nextInt();
			sc.close();
			Contato c = contatos.get(contatoId);
			
			try {
				dao.remover(c);
				connection.commit();
				System.out.println("Excluido");
			} catch (Exception e) {
				System.out.println("Excluido");
				connection.rollback();
			} 
		}
	}
	
}
