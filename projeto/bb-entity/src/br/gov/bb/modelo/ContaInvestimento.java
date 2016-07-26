package br.gov.bb.modelo;

import br.gov.bb.modelo.banco.Conta;
import br.gov.bb.modelo.banco.SaldoInsuficienteException;
import br.gov.bb.modelo.contrato.ICaptalizavel;
import br.gov.bb.modelo.contrato.IPagavel;

public class ContaInvestimento extends Conta implements ICaptalizavel, IPagavel {

	public Float taxaRendimento;
	public Double taxaServico;
	
	public void sacar(Double valor) throws SaldoInsuficienteException {
		//TODO - implementar
	}

	@Override
	public void tarifar() {
		try {
			sacar(10d);
		} catch (SaldoInsuficienteException e) {
			System.out.println("spc");
		}
	}

	@Override
	public void captalizar() {
		depositar(saldo * 0.05);
	}
	
	
}
