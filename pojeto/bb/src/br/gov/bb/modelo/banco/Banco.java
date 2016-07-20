package br.gov.bb.modelo.banco;

public class Banco {

	public final Integer HORA_ABERTURA;
	
	public Banco() {
		this(10, Boolean.TRUE);
		naoRola();
	}
	
	public Banco(Integer horaAbertura) {
		this.HORA_ABERTURA = horaAbertura; 
	}
	
	public Banco(Integer horaAbertura, Boolean pedalada) {
		this.HORA_ABERTURA = horaAbertura; 
	}
	
	void naoRola() {
		//horaAbertura = 3;
	}
	
}
