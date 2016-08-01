package br.com.rubs.jogodasenha.collection.ordenacao;

import java.util.Comparator;

public class CriterioNomePessoa implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.nome.compareTo(o2.nome);
	}

}
