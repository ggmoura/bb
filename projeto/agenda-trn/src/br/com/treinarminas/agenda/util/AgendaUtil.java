package br.com.treinarminas.agenda.util;

import java.util.ArrayList;
import java.util.List;

import br.com.treinarminas.agenda.modelo.Contato;
import br.com.treinarminas.agenda.modelo.Telefone;
import br.com.treinarminas.agenda.modelo.TipoTelefone;

public class AgendaUtil {

	private static AgendaUtil instance;
	
	private List<Contato> contatos;

	// inicializador de atributos estaticos
	static {
		instance = new AgendaUtil();
	}
	
	public static AgendaUtil getInstance() {
		return instance;
	}

	private AgendaUtil() {
		contatos = new ArrayList<Contato>();
		Contato c = new Contato();
		c.setNome("Isabela");
		c.setEmail("isabela@bela.com");
		c.setTelefone(new Telefone());
		c.getTelefone().setDdi(55);
		c.getTelefone().setDdd(31);
		c.getTelefone().setNumero(987749131);
		c.getTelefone().setTipo(TipoTelefone.CELULAR);
		contatos.add(c);
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

}
