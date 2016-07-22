package br.com.treinarminas.estudo.objeto;

public class EstudoWrapper {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		char c = 10;
		Character ch = 10;
		
		//int c = a - b;

		System.out.println(b + " " + c);
		
		
		Integer i = 1000;
		Integer j = 1000;
		//i = 1000;
		
		System.out.println(a == b);
		System.out.println(i == j);
		
		
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
