package br.gov.bb.modelo.banco;

import br.gov.bb.modelo.Cliente;

public abstract class Conta {

	//TODO falar sobre final
	//FIXME aqui a regra eh clara cruzeir tem mais titulos
	//XXX alguem tem que arrumar isso rapidinho
	private Integer numeroConta;
	protected Double saldo;
	public Cliente cliente;

	public Conta() {
		saldo = 0d;
	}
	
	public Conta(Double saldo, Cliente cliente) {
		this.cliente = cliente;
	}
	
	public final void depositar(Double saldo) {
		this.saldo += saldo;
	}

	public Double consultarSaldo() {
		return this.saldo;
	}
	
	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return numeroConta + ";" + cliente.getNome() + ";" + saldo;
	}
	
	public abstract void sacar(Double valor) throws SaldoInsuficienteException;
	
}
