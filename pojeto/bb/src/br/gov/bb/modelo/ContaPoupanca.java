package br.gov.bb.modelo;

import br.gov.bb.modelo.banco.Conta;
import br.gov.bb.modelo.contrato.ICaptalizavel;

public class ContaPoupanca extends Conta implements ICaptalizavel {

	private static Float taxaRendimento;
	public Integer diaRendimento;

	@Override
	public Boolean sacar(Double valor) {
		return null;
	}
	@Override
	public void captalizar() {
		depositar(saldo * taxaRendimento);
	}
	
	@Override
	public String toString() {
		String comportamentoDoPai = super.toString();
		comportamentoDoPai = comportamentoDoPai + " " + diaRendimento;
		return comportamentoDoPai;
	}
	public static Float getTaxaRendimento() {
		return taxaRendimento;
	}
	public static void setTaxaRendimento(Float taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}
	
	
	
}
