package br.com.treinarminas.estudo.jdbc.modelo;

public enum TipoTelefone {

	CELULAR("Celular"),
	FIXO("Fixo"),
	COMERCIAL("Comercial");
	
	private TipoTelefone(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
	
	
}
