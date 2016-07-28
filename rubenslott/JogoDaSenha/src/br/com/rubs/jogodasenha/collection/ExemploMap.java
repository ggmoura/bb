package br.com.rubs.jogodasenha.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ExemploMap {

	public static void main(String[] args) {
		Map<Long, Pessoa> diplomasMap = new HashMap<>();
		
		diplomasMap.put(1L, new Pessoa("Isabela"));
		diplomasMap.put(2L, new Pessoa("Gleidson"));
		diplomasMap.put(3L, new Pessoa("Fariman"));
		
		System.out.println("Informe uma chave [1, 2, 3]");
		Scanner sc = new Scanner(System.in);
		Long chave = sc.nextLong();
		sc.close();
		Pessoa pessoa = diplomasMap.get(chave);
		System.out.println(pessoa.nome);
		
		Set<Long> chaves = diplomasMap.keySet();
		System.out.println(chaves);
		
		for (Long key : chaves) {
			diplomasMap.get(key);
		}
		
		Set<Entry<Long, Pessoa>> objetos = diplomasMap.entrySet();
		for (Entry<Long, Pessoa> entry : objetos) {
			System.out.println("Chave: " + entry.getKey() + " Valor: " + entry.getValue());
		}
		
		//verifica se contem a chave
		Boolean containsKey = diplomasMap.containsKey(10L);
		System.out.println(containsKey);
		
	}
	
}
