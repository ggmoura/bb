package br.gov.bb.visao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.gov.bb.modelo.Cliente;
import br.gov.bb.modelo.ContaCorrente;
import br.gov.bb.modelo.ContaInvestimento;
import br.gov.bb.modelo.ContaPoupanca;
import br.gov.bb.modelo.ContaSalario;
import br.gov.bb.modelo.banco.Conta;
import br.gov.bb.modelo.banco.SaldoInsuficienteException;
import br.gov.bb.modelo.contrato.ICaptalizavel;
import br.gov.bb.modelo.contrato.IPagavel;

public class TelaBB {

	private Scanner leitura = new Scanner(System.in);
	private List<Conta> contas = new ArrayList<>();

	public void iniciarOperacao() {
		int opcao = 0;
		Conta conta = null;
		do {
			System.out.println(recuperarMenu());
			opcao = leitura.nextInt();
			switch (opcao) {
			case 1:
				conta = criarConta();
				contas.add(conta);
				break;
			case 2:
				exibirDadosDaConta();
				break;
			case 3:
				tarifar();
				break;
			case 4:
				captalizar();
				break;
			case 5:
				efetuarSaque();
				break;
			case 6:
				editarTaxaRendimento();
				break;

			default:
				break;
			}
			
		} while (opcao != 0);
		
		leitura.close();
		
	}

	private void editarTaxaRendimento() {
		System.out.print("Informe o valor da nova taxa de rendimento: ");
		Float novaTaxa = leitura.nextFloat();
		leitura.nextLine();
		ContaPoupanca.setTaxaRendimento(novaTaxa);
	}

	private void exibirDadosDaConta() {
		Conta c = recuperarConta();
		System.out.println(c);
	}
	
	private Conta recuperarConta() {
		Integer i = 0;
		for (Conta conta : contas) {
			System.out.println("Conta numero " + (i++) + 
					" - " + conta.getCliente().getNome());
		}
		
		System.out.print("Informe o numero da conta da qual deseja exibir os dados: ");
		Integer index = leitura.nextInt();
		leitura.nextLine();
		return contas.get(index);
	}

	private void efetuarSaque() {
		Conta c = recuperarConta();
		System.out.print("Informe o valor a ser sacado: ");
		Double valor = leitura.nextDouble();
		try {
			c.sacar(valor);
		} catch (SaldoInsuficienteException e) {
			JOptionPane.showMessageDialog(null, "nao rolou, SEU SALDO É " + e.getSaldoAtual());
		}
	}

	private void tarifar() {
		for (Conta conta : contas) {
			if (conta != null && conta instanceof IPagavel) {
				((IPagavel) conta).tarifar();
			}			
		}
		
	}
	
	private void captalizar() {
		for (Conta conta : contas) {
			if (conta != null && conta instanceof ICaptalizavel) {
				((ICaptalizavel) conta).captalizar();
			}			
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
		System.out.print("Informe o dia do rendimento: ");
		c.diaRendimento = leitura.nextInt();
		leitura.nextLine();
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
				+ "6 - Editar Taxa Rendimento\n\t"
				+ "0 - Sair";
	}
	
	private String recuperarMenuCriarConta() {
		return "Informe:\n\t"
				+ "1 - Conta Corrente\n\t"
				+ "2 - Conta Poupança";
	}
	
}
