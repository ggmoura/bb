package br.com.rubs.jogodasenha.jdbc.principal;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import br.com.rubs.jogodasenha.jdbc.dao.CriaContato;
import br.com.rubs.jogodasenha.jdbc.dao.RecuperaContato;
import br.com.rubs.jogodasenha.jdbc.modelo.Contato;

public class Main {

	public static void main(String[] args) throws SQLException {
		
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(Calendar.DAY_OF_MONTH, 27);
//		calendar.set(Calendar.MONTH, 9);
//		calendar.set(Calendar.YEAR, 2011);
//		
//		CriaContato cc = new CriaContato();
//		Contato c = new Contato();
//		c.setNome("Rubens Lott");
//		c.setEmail("rubenslott@gmail.com");
//		c.setEndereco("Rua Itambacuri, 139");
//		c.setDataNascimento(calendar.getTime());
//		cc.criarContato(c);
//	
//		System.out.println("finish");
		
		RecuperaContato recuperaContato = new RecuperaContato();
		List<Contato> contatos = recuperaContato.getListaContatos();
		
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
		
		
	}
	
}
