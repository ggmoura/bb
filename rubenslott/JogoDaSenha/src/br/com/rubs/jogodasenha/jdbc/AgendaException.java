package br.com.rubs.jogodasenha.jdbc;

public class AgendaException extends Exception {

	private static final long serialVersionUID = 1L;

	private Integer codigoMotivo;

	public Integer getCodigoMotivo() {
		return codigoMotivo;
	}

	public void setCodigoMotivo(Integer codigoMotivo) {
		this.codigoMotivo = codigoMotivo;
	}

}
