package br.com.treinarminas.estudo.modelo;

public class TesteEnum {

	public static void main(String[] args) {
		System.out.println(DiaSemana.QUI.getAtribuicao());
		
		DiaSemana[] dias = DiaSemana.values();
		
		for (DiaSemana diaSemana : dias) {
			System.out.println(diaSemana.getAtribuicao());
		}
		
		DiaSemana quarta = dias[3];
		System.out.println("Exempolo toString: "+ quarta);
		
	}
	
}
