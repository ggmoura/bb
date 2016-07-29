package br.com.treinarminas.estudo.jdbc.dao;

public class TesteEndereco {
	public static void main(String[] args) {
		EnderecoDAO dao = new EnderecoDAO();
		System.out.println(dao.recuperar(1));
		
	}
}
