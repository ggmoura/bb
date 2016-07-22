package br.com.treinarminas.estudo.objeto;

public class EstudoToString {

	
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Gleidson";
		p.cpf = 10481L;
	
		String pessoaStr = p.toString();
		
		System.out.println(p);
		
	}
	
	static class Pessoa {
		String nome;
		Long cpf;
	}
	
}
