public class Aprovado {
	public static void main(String[] args) {

		int nota = 55;
		
		if (nota < 40) {
			System.out.println("reprovado");
		} else if (nota < 60) {
			System.out.println("recuperação");
		}else {
			System.out.println("Aprovado");
		}

	}
}
