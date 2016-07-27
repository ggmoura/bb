package br.gov.bb.modelo.banco;

public class SaldoInsuficienteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private Double saldoAtual;
	
	private Long codigoErro;

	public Double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(Double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public Long getCodigoErro() {
		return codigoErro;
	}

	public void setCodigoErro(Long codigoErro) {
		this.codigoErro = codigoErro;
	}
	
	

}
