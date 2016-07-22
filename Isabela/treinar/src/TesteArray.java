import java.util.Scanner;

public class TesteArray {

	public static void main(String[] args) {
		
		Integer i = null;
		Scanner leitura = new Scanner(System.in);
		System.out.print("Digite a quantidade de nomes que deseja digitar: ");
		i = leitura.nextInt();
		leitura.nextLine();

		String[] nomes = new String[i];
		
		for (int j = 0; j < nomes.length; j++) {
			System.out.print("Digite o " + (j + 1) + "° nome: ");
			nomes[j] = leitura.nextLine();
		}
		
		leitura.close();
		System.out.println("nomes digitados\n\n");
		
		for (int j = 0; j < nomes.length; j++) {
			System.out.println(nomes[j]);
		}
		
	}
	
}
