package br.com.treinarminas.estudo.jdbc.dao;

import java.util.Comparator;

import br.com.treinarminas.estudo.jdbc.modelo.Contato;

public class CriterioDataNascimento implements Comparator<Contato> {

	@Override
	public int compare(Contato o1, Contato o2) {
		return o1.getDataNascimento().compareTo(o2.getDataNascimento());
	}

}
