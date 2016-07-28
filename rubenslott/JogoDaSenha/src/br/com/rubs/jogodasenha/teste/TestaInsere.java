package br.com.rubs.jogodasenha.teste;

import br.com.rubs.jogodasenha.jdbc.dao.ContatoDao;
import br.com.rubs.jogodasenha.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Rubens Lott");
		contato.setEmail("rubenslott@oabmg.org.br");
		contato.setEndereco("Rua Albita, 250 - Cruzeiro");
		//contato.setDtNascimento(Calendar.getInstance());
		
		// grave nessa conexão!!!
		ContatoDao dao = new ContatoDao();
		
		// método elegante
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
	}
}
