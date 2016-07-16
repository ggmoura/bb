package br.gov.bb.visao;

import java.util.Scanner;

public class TelaBB {

	public void iniciarOperacao() {
		int opcao = 0;
		//[leitura] - variavel para recuperar informacoes do teclado
		Scanner leitura = new Scanner(System.in);
		do {
			System.out.println("Informe:\n\t1 - Cadastrar Conta\n\t0 - Sair");
			opcao = leitura.nextInt();
		} while (opcao != 0);
		
		leitura.close();
		
	}
	
}
