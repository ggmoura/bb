package teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AtividadeMap {
	// Criar um programa que le do teclado letras e separar pela primeira letra
	// dos nomes
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nome = null;
		List<String> nomes = new ArrayList<>();

		Map<Character, List<String>> mapNomes = new HashMap<>();
		do {
			System.out.print("Informe o nome ou [siar]");
			nome = sc.nextLine();
			if (!nome.equalsIgnoreCase("Sair")) {
				nomes.add(nome);
			}
		} while (!nome.equalsIgnoreCase("Sair"));
		sc.close();
		System.out.println(nomes);
		Character primeiraLetra = null;
		List<String> value = null;

		for (String nomeTempo : nomes) {
			primeiraLetra = nomeTempo.charAt(0);
			if (!mapNomes.containsKey(primeiraLetra)) {
				value = new ArrayList<String>();
				mapNomes.put(primeiraLetra, value);
			}
			mapNomes.get(primeiraLetra).add(nomeTempo);
		}
		System.out.println(mapNomes);
	}
}
