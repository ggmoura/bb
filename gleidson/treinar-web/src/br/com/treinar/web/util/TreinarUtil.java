package br.com.treinar.web.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.treinar.web.modelo.Pessoa;

public class TreinarUtil {

	private static TreinarUtil instance;
	private List<Pessoa> pessoas;

	// inicializador de atributos estaticos
	static {
		instance = new TreinarUtil();
	}

	private TreinarUtil() {
		init();
	}

	private void init() {
		pessoas = new ArrayList<Pessoa>();
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Isabela");

		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 15);
		c.set(Calendar.MONTH, 5);
		c.set(Calendar.YEAR, 1986);

		pessoa.setDataNascimento(c.getTime());
		pessoas.add(pessoa);

		pessoa = new Pessoa();
		pessoa.setNome("Gleidson");

		c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 9);
		c.set(Calendar.MONTH, 11);
		c.set(Calendar.YEAR, 1980);

		pessoa.setDataNascimento(c.getTime());
		pessoas.add(pessoa);

	}

	public static TreinarUtil getInstance() {
		return instance;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

}
