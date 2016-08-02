package br.com.rubs.jogodasenha.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoverElemento {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 5 nomes: ");
		for (int i = 0; i < 2; i++) {
			pessoas.add(new Pessoa(sc.nextLine()));
		}
		System.out.print("Digite o nome a ser removido: ");
		String nome = sc.nextLine();
		sc.close();
		
		Pessoa removido = new Pessoa(nome);
		
		System.out.println(pessoas.size());
		Boolean removeu = pessoas.remove(removido);
		System.out.println(removeu);
		
		
		Set<Pessoa> set = new HashSet<>();
		set.add(new Pessoa("Isabela"));
		set.add(new Pessoa("Isabela"));
		
		System.out.println(set.size());
		
	}
	
}
