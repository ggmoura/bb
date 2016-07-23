import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImprimirNomes {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();

		Scanner leitura = new Scanner(System.in);

		String nome = null;

		do {

			System.out.print("Informe o nome ou sair: ");
			nome = leitura.nextLine();
			if (!nome.equals("sair")) {
				nomes.add(nome);
			}
		} while (!nome.equals("sair"));
		
		System.out.println(nomes);
		
	}
}
