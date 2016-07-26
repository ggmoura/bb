package br.com.treinarminas.estudo.collection.ordenacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacao {

	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("James", "Larry", "Tom", "Lacy", "Isabela", "Gleidson");
		
		Collections.sort(nomes);
		
		//System.out.println(nomes);
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa());
		pessoas.get(0).nome = "Amanda";
		pessoas.get(0).idade = 12;
		pessoas.get(0).peso = 37;
		
		pessoas.add(new Pessoa());
		pessoas.get(1).nome = "Nathalia";
		pessoas.get(1).idade = 9;
		pessoas.get(1).peso = 25;
		
		
		Collections.sort(pessoas);
		System.out.println(pessoas);
		
		CriterioNomePessoa criterioNome = new CriterioNomePessoa();
		Collections.sort(pessoas, criterioNome);
		
		System.out.println(pessoas);
		
		Collections.sort(pessoas, new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.peso.compareTo(o2.peso);
			}
		});
		
		
		
	}

//  
//	private static void test(Integer str1, String... str2) {
//		System.out.println(str1);
//		for (String string : str2) {
//			
//		}
//	}

	
	
	

}
