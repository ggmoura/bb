package br.gov.bb.visao;

import java.util.Scanner;

import br.gov.bb.modelo.Cliente;
import br.gov.bb.modelo.ContaCorrente;
import br.gov.bb.modelo.ContaInvestimento;
import br.gov.bb.modelo.ContaPoupanca;
import br.gov.bb.modelo.ContaSalario;
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
		Conta c = null;
		System.out.println(recuperarMenuCriarConta());
		Integer opcao = leitura.nextInt();
		switch (opcao) {
		case 1:
			c = new ContaCorrente();
			criarConta((ContaCorrente)c);
			break;
		case 2:
			c = new ContaPoupanca();
			criarConta((ContaPoupanca)c);
			break;
		case 3:
			c = new ContaInvestimento();
			criarConta((ContaInvestimento)c);
			break;
		case 4:
			c = new ContaSalario();
			criarConta((ContaSalario)c);
			break;

		default:
			break;
		}

		return c;
	}

	private void criarConta(Conta c) {
		System.out.print("Informe o nome do titular: ");
		leitura.nextLine();
		String nome = leitura.nextLine();
		c.cliente = new Cliente();
		c.cliente.setNome(nome);
		System.out.print("Informe o cpf do titular: ");
		c.cliente.setCpf(leitura.nextLong());
		System.out.print("Informe o saldo da conta: ");
		Double saldo = leitura.nextDouble();
		c.depositar(saldo);
	}
	private void criarConta(ContaCorrente c) {
		criarConta((Conta)c);
		System.out.print("Informe o valor da taxa de serviço: ");
		c.taxaServico = leitura.nextDouble();
	}
	private void criarConta(ContaPoupanca c) {
		
	}
	private void criarConta(ContaInvestimento c) {
		
	}
	private void criarConta(ContaSalario c) {
		
	}
	
	private String recuperarMenu() {
		return "Informe:\n\t"
				+ "1 - Cadastrar Conta\n\t"
				+ "2 - Exibir dados da conta\n\t"
				+ "0 - Sair";
	}
	
	private String recuperarMenuCriarConta() {
		return "Informe:\n\t"
				+ "1 - Conta Corrente\n\t"
				+ "2 - Conta Poupança";
	}
	
}
