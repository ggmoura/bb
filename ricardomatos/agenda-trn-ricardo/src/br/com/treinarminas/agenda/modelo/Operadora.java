package br.com.treinarminas.agenda.modelo;

public enum Operadora {

	OI(),
	VIVO(),
	CLARO(1.45),
	TIM(0.89);
	
	private Operadora() {
	}

	private Operadora(Double valorMinuto) {
		this.valorMinuto = valorMinuto;
	}

	private Double valorMinuto;

	public Double getValorMinuto() {
		return valorMinuto;
	}

	public void setValorMinuto(Double valorMinuto) {
		this.valorMinuto = valorMinuto;
	}

}
