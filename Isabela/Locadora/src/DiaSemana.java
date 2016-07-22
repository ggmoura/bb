

public enum DiaSemana {

	DOM("Ir a igreja"),
	SEG("Trabalhar"),
	TER("Cinema"),
	QUA("Folga"),
	QUI("Balada"),
	SEX("Tomar Engove"),
	SAB("Tomar banho");
	
	private DiaSemana(String atribuicao) {
		this.atribuicao = atribuicao;
	}
	
	private String atribuicao;
	
	public String getAtribuicao() {
		return atribuicao;
	}
	
	@Override
	public String toString() {
		return atribuicao;
	}
	
}
