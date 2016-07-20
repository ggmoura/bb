package br.gov.bb.modelo;

import br.gov.bb.modelo.banco.Conta;
import br.gov.bb.modelo.contrato.ICaptalizavel;

public class ContaPoupanca extends Conta implements ICaptalizavel {

	public Float taxaRendimento;

	@Override
	public Boolean sacar(Double valor) {
		return null;
	}
	@Override
	public void captalizar() {
		depositar(saldo * 0.01);
	}
}
