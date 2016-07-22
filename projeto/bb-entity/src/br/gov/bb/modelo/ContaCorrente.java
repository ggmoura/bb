package br.gov.bb.modelo;

import br.gov.bb.modelo.banco.Conta;
import br.gov.bb.modelo.contrato.IPagavel;

public class ContaCorrente extends Conta implements IPagavel {

	private Double taxaServico;
	private Double limiteCredito;
	
	public ContaCorrente() {
		super(10D);
		limiteCredito = 300D;
	}

	@Override
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (consultarSaldo() >= valor) {
			saldo = saldo - valor;
			sacou = Boolean.TRUE;
		} else if (saldo + limiteCredito >= valor) {
			limiteCredito = limiteCredito - (valor - saldo);
			saldo = 0d;
			sacou = Boolean.TRUE;
		}
		return sacou;
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
		sacar(19d);
	}
	
	@Override
	public Double consultarSaldo() {
		// TODO Auto-generated method stub
		return super.consultarSaldo();
	}
	
	@Override
	public String toString() {
		String comportamentoDoPai = super.toString();
		comportamentoDoPai = comportamentoDoPai + " " + taxaServico;
		return comportamentoDoPai;
	}
	

}
