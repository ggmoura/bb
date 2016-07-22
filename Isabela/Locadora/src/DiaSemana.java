

public enum DiaSemana {

	DOM("Ir a igreja", "10481"),
	SEG("Trabalhar", "10482"),
	TER("Cinema", "10483"),
	QUA("Folga", "10484"),
	QUI("Balada", "10485"),
	SEX("Tomar Engove", "10487"),
	SAB("Tomar banho", "10488");
	
	private DiaSemana(String atribuicao, String element) {
		this.atribuicao = atribuicao;
		this.element = element;
	}
	
	private String atribuicao;
	private String element;
	
	public String getAtribuicao() {
		return atribuicao;
	}
	
	@Override
	public String toString() {
		return atribuicao;
	}
	
	public String getElement() {
		return element;
	}
	
	
}
