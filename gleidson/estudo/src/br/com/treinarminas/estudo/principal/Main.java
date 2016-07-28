package br.com.treinarminas.estudo.principal;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import br.com.treinarminas.estudo.jdbc.dao.CriaContato;
import br.com.treinarminas.estudo.jdbc.dao.RecuperaContato;
import br.com.treinarminas.estudo.jdbc.modelo.Contato;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 15);
		calendar.set(Calendar.MONTH, 10);
		calendar.set(Calendar.YEAR, 2012);
		
		CriaContato cc = new CriaContato();
		Contato c = new Contato();
		c.setNome("Maria Sophia");
		c.setEmail("maria@gmail.com");
		c.setEndereco("rua da paz 202...");
		c.setDataNascimento(calendar.getTime());
		
		cc.criarContato(c);
		
		System.out.println("finish");
		
		RecuperaContato recuperaContato = new RecuperaContato();
		List<Contato> contatos = recuperaContato.getListaContatos();
		
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
		
		
	}
	
}
