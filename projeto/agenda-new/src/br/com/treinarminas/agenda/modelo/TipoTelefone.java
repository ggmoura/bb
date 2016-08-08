package br.com.treinarminas.agenda.modelo;

public enum TipoTelefone {

	CELULAR("Celular"),
	RESIDENCIAL("Residencial"),
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
	
	
}
