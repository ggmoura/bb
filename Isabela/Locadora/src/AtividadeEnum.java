public class AtividadeEnum {

	public static void main(String[] args) {

		DiaSemana[] dias = DiaSemana.values();

		int numeroDia = 6;
		
		DiaSemana dia = dias[numeroDia];
		
		System.out.print("S�bado: " + dia);
		
		System.out.println(dia.getElement());

	}

}
