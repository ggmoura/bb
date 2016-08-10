package br.com.treinarminas.agenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import br.com.treinarminas.agenda.modelo.Contato;
import br.com.treinarminas.agenda.modelo.Telefone;
import br.com.treinarminas.agenda.modelo.TipoTelefone;

@ViewScoped
@ManagedBean
public class ViewScopeAgenda implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Telefone telefone;
	private List<TipoTelefone> tipos;
	private List<SelectItem> itens;

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public ViewScopeAgenda() {
		telefone = new Telefone();
		contato = new Contato();
		contato.setNome("Isabela");
		System.out.println("Excecutou");
		tipos = new ArrayList<TipoTelefone>(
				Arrays.asList(TipoTelefone.values()));
		itens = new ArrayList<SelectItem>();
		for (TipoTelefone tipo : tipos) {
			itens.add(new SelectItem(tipo.ordinal(), tipo.getDescricao()));
		}
	}

	private Contato contato = new Contato();

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public void salvar() {
		System.out.println("executou");
	}
	
	public String navegarIndex() {
		return "index.jsf";
	}

	public List<TipoTelefone> getTipos() {
		return tipos;
	}

	public void setTipos(List<TipoTelefone> tipos) {
		this.tipos = tipos;
	}

	public List<SelectItem> getItens() {
		return itens;
	}

	public void setItens(List<SelectItem> itens) {
		this.itens = itens;
	}

}
