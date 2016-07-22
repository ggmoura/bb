package br.gov.bb.modelo;

import br.gov.bb.modelo.banco.Conta;
import br.gov.bb.modelo.contrato.ICaptalizavel;
import br.gov.bb.modelo.contrato.IPagavel;

public class ContaInvestimento extends Conta implements ICaptalizavel, IPagavel {

	public Float taxaRendimento;
	public Double taxaServico;
	
	public Boolean sacar(Double valor) {
		
		return Boolean.FALSE;
	}

	@Override
	public void tarifar() {
		sacar(10d);
	}

	@Override
	public void captalizar() {
		depositar(saldo * 0.05);
	}
	
	
}
