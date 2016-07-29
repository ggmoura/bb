package br.com.treinarminas.estudo.jdbc.principal;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.treinarminas.estudo.jdbc.dao.ContatoDAO;
import br.com.treinarminas.estudo.jdbc.dao.IBaseDAO;
import br.com.treinarminas.estudo.jdbc.modelo.Contato;
import br.com.treinarminas.estudo.jdbc.modelo.Endereco;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 15);
		calendar.set(Calendar.MONTH, 10);
		calendar.set(Calendar.YEAR, 2012);
		
		Contato c = new Contato();
		c.setNome("Maria Sophia");
		c.setEmail("maria@gmail.com");
		
		c.setEndereco(new Endereco());
		c.getEndereco().setBairro("Calafate");
		c.getEndereco().setComplemento("Apto 102");
		c.getEndereco().setLogradouro("Rua da Paz");
		c.getEndereco().setNumero(202);
		c.setDataNascimento(calendar.getTime());
		
		IBaseDAO<Contato, Long> dao = new ContatoDAO();
		dao.adicionar(c);
		
		System.out.println("finish");

	}
	
}
