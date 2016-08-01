package br.com.treinarminas.estudo.string;

public class ExemploString {

	public static void main(String[] args) {
		String nome = "Isabela";
		System.out.println("Isabela");
		String nome2 = "Isabela";
		String nome3 = new String("Isabela");
		nome2 = null;
		nome3 = null;
		
		
		String nome4 = "Gleidson";
		String frase = "";
		//StringBuffer sb = new StringBuffer();
		
		
		
		for (int i = 0; i < 10; i++) {
			frase += "Isabela" + " " + i + " ";
		}
		System.out.println(frase);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append("Isabela ").append(" ").append(i).append(" ");
		}
		System.out.println(sb.toString());
		
		System.out.println(nome.charAt(0));
		System.out.println(nome2 == nome);
		System.out.println("nome2 == nome3: " + nome2 == nome3);
		System.out.println("nome2 == nome3: " + nome4 == nome3);
		System.out.println(frase);
		String nomeTemp = "Isabela 3";
		
		nomeTemp.isEmpty();
		nomeTemp.length();
		char[] letras = nomeTemp.toCharArray();
		
		for (Character c : letras) {
			
		}
		
		for (int i = 0; i < nomeTemp.length(); i++) {
			nomeTemp.charAt(i);
		}
	}
	
	void teste(Character c) {
		
	}
	void teste(char c) {
		
	}
	
	
}
