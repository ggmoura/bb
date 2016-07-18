package br.gov.bb.visao;

import java.util.Scanner;

import br.gov.bb.modelo.Conta;

public class TelaBB {

	public void iniciarOperacao() {
		int opcao = 0;
		//[leitura] - variavel para recuperar informacoes do teclado
		Scanner leitura = new Scanner(System.in);
		Conta c = null;
		do {
			System.out.println(recuperarMenu());
			opcao = leitura.nextInt();
			switch (opcao) {
			case 1:
				c = new Conta();
				System.out.print("Informe o saldo da conta: ");
				Double saldo = leitura.nextDouble();
				c.depositar(saldo);
				break;
			case 2:
				System.out.println("Saldo: " + c.consultarSaldo());
				break;

			default:
				break;
			}
			
		} while (opcao != 0);
		
		leitura.close();
		
	}

	private String recuperarMenu() {
		return "Informe:\n\t"
				+ "1 - Cadastrar Conta\n\t"
				+ "2 - Exibir dados da conta"
				+ "0 - Sair";
	}
	
}
