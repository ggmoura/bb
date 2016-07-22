public class AtividadeEnum {

	public static void main(String[] args) {

		DiaSemana[] dias = DiaSemana.values();

		int numeroDia = 6;
		
		DiaSemana dia = dias[numeroDia];
		
		System.out.print("Sábado: " + dia);
		
		System.out.println(dia.getElement());

	}

}
