package br.com.treinarminas.estudo.collection;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("a");
		set.add("1");
		set.add("ç");
		set.add("5");
		set.add("a");
		
		System.out.println(set);
		
		
	}
	
}
