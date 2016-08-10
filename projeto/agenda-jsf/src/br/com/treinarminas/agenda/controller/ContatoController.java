package br.com.treinarminas.agenda.controller;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.treinarminas.agenda.modelo.Contato;
import br.com.treinarminas.agenda.modelo.Telefone;

@SessionScoped
@ManagedBean(name = "controller")
public class ContatoController {

	private Contato contato;
	private Integer tipo;
	private String url;

	public ContatoController() {
		contato = new Contato();
		contato.setEmail(new Date().getTime() + "_isabela@bela.com");
		contato.setTelefone(new Telefone());
	}

	public void salvar() {
		System.out.println(contato.getNome());
		System.out.println(contato.getDataNascimento());
		FacesMessage msg = new FacesMessage("Cadastro Efetuado com sucesso!");
        FacesContext.getCurrentInstance().addMessage("nome", msg);
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
