
public class Exercicio01 {

	public static void main(String[] args) {
		
		int nota = 60;
		
		if (nota <= 39) {
			System.out.println("Reprovado");
		} else if (nota > 39 && nota <= 59 ) {
			System.out.println("Recuperação");			
		}else {
			System.out.println("Aprovado");
		}
		System.out.println();
		
	}
	
}
