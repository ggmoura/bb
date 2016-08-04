package br.com.treinar.web.util;

import java.util.ArrayList;
import java.util.List;

import br.com.treinar.web.model.Pessoa;

public class TreinarUtil {
	private static TreinarUtil instance;
	private List<Pessoa> pessoas;

	// inicializador de atribnutos estaticos
	static {
		instance = new TreinarUtil();
	}

	private TreinarUtil() {
		init();
	}

	private void init() {
		pessoas = new ArrayList<Pessoa>();
		Pessoa pessoa = new Pessoa();
		pessoa.setDataNascimento();
		pessoa.setNome("Nome");

	}

	public static TreinarUtil getInstance() {
		return instance;
	}
}
