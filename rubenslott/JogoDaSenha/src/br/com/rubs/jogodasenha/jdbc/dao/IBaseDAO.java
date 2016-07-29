package br.com.rubs.jogodasenha.jdbc.dao;

public interface IBaseDAO<T, ID> {

	
	void adicionar(T obj);
	
	void alterar(T obj);
	
	void remover(T obj);
	
	T recuperar(Long id);
	
	List<T> recuperar();
	
}
