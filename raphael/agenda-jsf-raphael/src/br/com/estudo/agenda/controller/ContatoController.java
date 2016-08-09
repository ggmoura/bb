package br.com.estudo.agenda.controller;

import javax.annotation.ManagedBean;

import br.com.estudo.agenda.agenda.util.AgendaUtil;
import br.com.estudo.agenda.modelo.Contato;

@ManagedBean
public class ContatoController {
	
	private Contato contato;
	
	public void salvar(){
		AgendaUtil.getInstance().getContatos().add(contato);
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	
}
