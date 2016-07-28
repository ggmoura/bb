package br.com.rubs.jogodasenha.teste;

import java.sql.SQLException;

import br.com.rubs.jogodasenha.jdbc.dao.CriaContato;
import br.com.rubs.jogodasenha.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Stella Lott");
		contato.setEmail("stellinhalott@yahoo.org.br");
		contato.setEndereco("Rua do Ouro, 1885 - Serra/Mangabeiras");
		//contato.setDataNascimento(Calendar.getInstance());
		
		// grave nessa conexão!!!
		CriaContato cc = new CriaContato();
		
		// método elegante
		try {
			cc.criarContato(contato);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Gravado!");
	}
}
