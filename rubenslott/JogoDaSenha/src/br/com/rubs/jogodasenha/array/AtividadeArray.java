package br.com.rubs.jogodasenha.array;

import java.util.Scanner;

public class AtividadeArray {

	
	public static void main(String[] args) {
		executarAtividade();
	}
	
	private static void executarAtividade() {
		System.out.print("Qantos nomes: ");
		Scanner sc = new Scanner(System.in);
		Integer quantidade = sc.nextInt();
		sc.nextLine();
		String[] nomes = new String[quantidade];
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Nome " + (i + 1) + ": ");
			nomes[i] = sc.nextLine();
		}
		sc.close();
		
		imprimirNomes(nomes);
		imprimir(1, "gleidsn", "fariman", "isabela", "daniel", "ricardo", "andrey");
		imprimir(2, "gleidsn", "fariman", "isabela");
		imprimir(3, nomes);
		
	}

	private static void imprimir(Integer i, String... strings) {
		// TODO Auto-generated method stub
		//String[] nomes = strings;
		
	}

	private static void imprimirNomes(String[] nomesImprimir) {
		for (String nome : nomesImprimir) {
			System.out.println(nome);
		}
	}
	
	
	
	
}
