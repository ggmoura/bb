package br.gov.bb.visao;

import java.util.Scanner;

import br.gov.bb.modelo.ContaCorrente;
import br.gov.bb.modelo.banco.Conta;

public class TelaBB {

	private Scanner leitura = new Scanner(System.in);

	public void iniciarOperacao() {
		int opcao = 0;
		//[leitura] - variavel para recuperar informacoes do teclado
		Conta c = null;
		do {
			System.out.println(recuperarMenu());
			opcao = leitura.nextInt();
			switch (opcao) {
			case 1:
				c = criarConta();
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

	private Conta criarConta() {
		Conta c;
		c = new Conta();
		System.out.println(recuperarMenu());
		Integer opcao = leitura.nextInt();
		switch (opcao) {
		case 1:
			c = new ContaCorrente();
			break;

		default:
			break;
		}
		
		System.out.print("Informe o saldo da conta: ");
		Double saldo = leitura.nextDouble();
		c.depositar(saldo);
		return c;
	}

	private String recuperarMenu() {
		return "Informe:\n\t"
				+ "1 - Cadastrar Conta\n\t"
				+ "2 - Exibir dados da conta"
				+ "0 - Sair";
	}
	
	private String recuperarMenuCriarConta() {
		return null;
	}
	
}
