package br.com.estudo.agenda.agenda.util;

import java.util.ArrayList;
import java.util.List;

import br.com.estudo.agenda.modelo.Contato;

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
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

}
