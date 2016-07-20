package br.gov.bb.visao;

import java.util.Scanner;

import br.gov.bb.modelo.Cliente;
import br.gov.bb.modelo.ContaCorrente;
import br.gov.bb.modelo.ContaInvestimento;
import br.gov.bb.modelo.ContaPoupanca;
import br.gov.bb.modelo.ContaSalario;
import br.gov.bb.modelo.banco.Conta;
import br.gov.bb.modelo.contrato.ICaptalizavel;
import br.gov.bb.modelo.contrato.IPagavel;

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
			case 3:
				tarifar(c);
				break;
			case 4:
				captalizar(c);
				break;
			case 5:
				efetuarSaque(c);
				break;

			default:
				break;
			}
			
		} while (opcao != 0);
		
		leitura.close();
		
	}

	private void efetuarSaque(Conta c) {
		System.out.print("Informe o valor a ser sacado: ");
		Double valor = leitura.nextDouble();
		String mensagem = c.sacar(valor) ? "Rolou" : "foi triste!";
		System.out.println(mensagem);
	}

	private void tarifar(Conta c) {
		if (c instanceof IPagavel) {
			((IPagavel) c).tarifar();
		}
	}
	
	private void captalizar(Conta c) {
		if (c instanceof ICaptalizavel) {
			((ICaptalizavel) c).captalizar();
		}
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
		c.setTaxaServico(leitura.nextDouble());
	}
	private void criarConta(ContaPoupanca c) {
		criarConta((Conta)c);
		//TODO - cadastrar conta Poupanca
	}
	private void criarConta(ContaInvestimento c) {
		criarConta((Conta)c);
		//TODO - cadastrar conta Poupanca		
	}
	private void criarConta(ContaSalario c) {
		criarConta((Conta)c);
		//TODO - cadastrar conta salario
	}
	
	private String recuperarMenu() {
		return "Informe:\n\t"
				+ "1 - Cadastrar Conta\n\t"
				+ "2 - Exibir dados da conta\n\t"
				+ "3 - Tarifar contas\n\t"
				+ "4 - Captalizar contas\n\t"
				+ "5 - Sacar\n\t"
				+ "0 - Sair";
	}
	
	private String recuperarMenuCriarConta() {
		return "Informe:\n\t"
				+ "1 - Conta Corrente\n\t"
				+ "2 - Conta Poupança";
	}
	
}
