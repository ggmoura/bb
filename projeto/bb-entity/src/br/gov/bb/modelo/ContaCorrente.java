package br.gov.bb.modelo;

import br.gov.bb.modelo.banco.Conta;
import br.gov.bb.modelo.banco.SaldoInsuficienteException;
import br.gov.bb.modelo.contrato.IPagavel;

public class ContaCorrente extends Conta implements IPagavel {

	private Double taxaServico;
	private Double limiteCredito;
	
	public ContaCorrente() {
		super(10D);
		limiteCredito = 300D;
	}

	@Override
	public void sacar(Double valor) throws SaldoInsuficienteException {
		if (consultarSaldo() >= valor) {
			saldo = saldo - valor;
		} else if (saldo + limiteCredito >= valor) {
			limiteCredito = limiteCredito - (valor - saldo);
			saldo = 0d;
		}
		SaldoInsuficienteException saldoInsuficienteException = new SaldoInsuficienteException();
		saldoInsuficienteException.setSaldoAtual(consultarSaldo());
		throw saldoInsuficienteException;
	}

	public Double getTaxaServico() {
		return taxaServico;
	}

	public void setTaxaServico(Double taxaServico) {
		this.taxaServico = taxaServico;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public void tarifar() {
		try {
			sacar(19d);
		} catch (SaldoInsuficienteException e) {
			System.out.println("spc");
		}
	}
	
	@Override
	public Double consultarSaldo() {
		return super.consultarSaldo() + limiteCredito;
	}
	
	@Override
	public String toString() {
		String comportamentoDoPai = super.toString();
		comportamentoDoPai = comportamentoDoPai + " " + taxaServico;
		return comportamentoDoPai;
	}
	

}
