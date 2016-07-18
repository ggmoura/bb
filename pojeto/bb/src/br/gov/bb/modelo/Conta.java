package br.gov.bb.modelo;

public class Conta {

	public Integer numeroConta;
	private Double saldo;
	public Cliente cliente;
	
	public void depositar(Double saldo) {
		this.saldo += saldo;
	}

	public Double consultarSaldo() {
		return this.saldo;
	}
	
}
