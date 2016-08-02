package br.com.treinarminas.estudo.string;

public class AtividadeString {

	public static void main(String[] args) {
		String nome = "Gleidson Moura";

		for (int i = nome.length() - 1; i >= 0; i--) {
			System.out.print(nome.charAt(i));
		}
		StringBuilder sb = new StringBuilder(nome);
		System.out.println("\n" + sb.reverse());

	}

}
