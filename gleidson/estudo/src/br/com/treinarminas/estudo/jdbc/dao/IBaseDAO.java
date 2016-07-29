package br.com.treinarminas.estudo.jdbc.dao;

import java.util.List;

public interface IBaseDAO<T, ID> {
	
	void adicionar(T obj);
	
	void alterar(T obj);
	
	void remover(T obj);
	
	T recuperar(ID id);
	
	List<T> recuperarTodos();

}
