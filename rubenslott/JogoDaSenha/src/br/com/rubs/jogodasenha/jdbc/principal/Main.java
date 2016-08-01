package br.com.rubs.jogodasenha.jdbc.principal;

//import java.sql.Connection;
import java.sql.SQLException;
//import java.util.Calendar;
import java.util.List;

//import br.com.rubs.jogodasenha.jdbc.ConnectionFactory;
//import br.com.rubs.jogodasenha.jdbc.dao.ContatoDAO;
//import br.com.rubs.jogodasenha.jdbc.dao.IBaseDAO;
import br.com.rubs.jogodasenha.jdbc.dao.RecuperaContato;
import br.com.rubs.jogodasenha.jdbc.modelo.Contato;
//import br.com.rubs.jogodasenha.jdbc.modelo.Endereco;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws SQLException, IOException {

		// Calendar calendar = Calendar.getInstance();
		// calendar.set(Calendar.DAY_OF_MONTH, 15);
		// calendar.set(Calendar.MONTH, 5);
		// calendar.set(Calendar.YEAR, 1962);
		//
		// Contato c = new Contato();
		// c.setNome("Rubens Lott de Almeida Cunha");
		// c.setEmail("rubenslott@gmail.com");
		//
		// c.setEndereco(new Endereco());
		// c.getEndereco().setLogradouro("Rua Itambacuri");
		// c.getEndereco().setNumero(139);
		// c.getEndereco().setComplemento("Apto 601");
		// c.getEndereco().setBairro("Carlos Prates");
		//
		// c.setDataNascimento(calendar.getTime());
		//
		// Connection connection =
		// ConnectionFactory.getInstance().getConnection();
		//
		// IBaseDAO<Contato, Long> dao = new ContatoDAO(connection);
		// dao.adicionar(c);
		//
		// System.out.println("Successfully done!!!");

		RecuperaContato recuperaContato = new RecuperaContato();
		List<Contato> contatos = recuperaContato.getListaContatos();

		OutputStream os;
		try {
			os = new FileOutputStream("contatos.txt", Boolean.TRUE);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			for (Contato contato : contatos) {
				// System.out.println(contato);
				bw.write(contato + "\n");
			}
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
