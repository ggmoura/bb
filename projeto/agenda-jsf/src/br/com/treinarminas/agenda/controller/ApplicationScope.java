package br.com.treinarminas.agenda.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import br.com.treinarminas.agenda.modelo.TipoTelefone;

@ManagedBean
public class ApplicationScope {

	private List<TipoTelefone> tipos;
	private List<SelectItem> itens;

	public ApplicationScope() {
		tipos = new ArrayList<TipoTelefone>(
				Arrays.asList(TipoTelefone.values()));
		itens = new ArrayList<SelectItem>();
		for (TipoTelefone tipo : tipos) {
			itens.add(new SelectItem(tipo.ordinal(), tipo.getDescricao()));
		}

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
