package br.com.treinarminas.estudo;

public class EstudoWrapper {

	public static void main(String[] args) {
		int a = 9;
		int b = 5;
		
		int c = a - b;

		System.out.println(b + " " + c);
		
		
		Integer i = 1000;
		Integer j = i;
		i = 1000;
		
		
		int maiorQue = i.compareTo(j);
		if (maiorQue == 0) {
			System.out.println("sao iguais");
		} else if (maiorQue > 0) {
			System.out.println("i é maior");
		} else {
			System.out.println("j é maior");
		}
		
		System.out.println(a == b);
		System.out.println(i == j);
		
		Integer d = new Integer(10);
		Integer f = new Integer(10);
		
		System.out.println(d.intValue() == f.intValue());
		
		
		
	}
	
}
