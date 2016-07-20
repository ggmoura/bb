package br.com.treinarminas.estudo.array;

public class TesteArray {

	
	public static void main(String[] args) {
		Integer[] idades = new Integer[10];
		idades[0] = 99;
		idades[1] = 88;
		idades[2] = 77;
		idades[3] = 66;
		idades[4] = 55;
		idades[5] = 44;
		idades[6] = 33;
		idades[7] = 22;
		idades[8] = 11;
		idades[9] = 00;
		
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		
		
	}
	
}
