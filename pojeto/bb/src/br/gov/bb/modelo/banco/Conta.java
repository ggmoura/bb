package br.gov.bb.modelo.banco;

import br.gov.bb.modelo.Cliente;

public abstract class Conta {

	//TODO falar sobre final
	//FIXME aqui a regra eh clara cruzeir tem mais titulos
	//XXX alguem tem que arrumar isso rapidinho
	public Integer numeroConta;
	protected Double saldo;
	public Cliente cliente;

	public Conta() {
		saldo = 0d;
	}
	
	public Conta(Double saldo) {
		this();
	}
	
	public Conta(Double saldo, Cliente cliente) {
		this(saldo);
		this.cliente = cliente;
	}
	
	public final void depositar(Double saldo) {
		this.saldo += saldo;
	}

	public Double consultarSaldo() {
		return this.saldo;
	}
	
	public abstract Boolean sacar(Double valor);
	
}
