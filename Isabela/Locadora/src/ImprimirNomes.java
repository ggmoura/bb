import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ImprimirNomes {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();
		Map<Character, List<String>> mapNomes = new HashMap();

		Scanner leitura = new Scanner(System.in);

		String nome = null;

		do {
			System.out.print("Informe o nome ou sair: ");
			nome = leitura.nextLine();
			if (!nome.equals("sair")) {
				nomes.add(nome);
			}
		} while (!nome.equalsIgnoreCase("sair"));

		leitura.close();
		System.out.println(nomes);
		Character primeiraLetra = null;
		List<String> value = null;

		for (String nomeTemp : nomes) {
			primeiraLetra = nomeTemp.charAt(0);
			if (mapNomes.containsKey(primeiraLetra)) {
				value = new ArrayList<String>();
				mapNomes.put(primeiraLetra, value);
			}
			mapNomes.get(primeiraLetra).add(nomeTemp);
		}
		System.out.println(mapNomes);

	}
}
