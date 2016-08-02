package br.com.rubs.jogodasenha.jdbc.dao;

import java.util.List;
import br.com.rubs.jogodasenha.jdbc.AgendaException;

public interface IBaseDAO<T, ID> {

	void adicionar(T obj);
	
	void alterar(T obj);
	
	void remover(T obj) throws AgendaException;
	
	T recuperar(ID id);
	
	List<T> recuperarTodos();
	
}
