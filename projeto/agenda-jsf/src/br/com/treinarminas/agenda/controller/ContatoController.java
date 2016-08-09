package br.com.treinarminas.agenda.controller;

import javax.faces.bean.ManagedBean;

import br.com.treinarminas.agenda.modelo.Contato;

@ManagedBean
public class ContatoController {
	
	private Contato contato;
	
	public ContatoController() {
		contato = new Contato();
	}
	
	public void salvar() {
		System.out.println(contato.getNome());
		System.out.println(contato.getDataNascimento());
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
