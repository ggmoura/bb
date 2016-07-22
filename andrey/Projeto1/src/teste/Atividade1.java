package teste;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out
				.print("Informe a quantidade de nomes que deseja cadastrar: ");
		int opcao = leitura.nextInt();
		leitura.nextLine();

		String[] cadastros = new String[opcao];

		for (int i = 0; i < cadastros.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º nome: ");
			cadastros[i] = leitura.nextLine();
		}
		leitura.close();

		for (String cadastro : cadastros) {
			System.out.println(cadastro);
		}

	}
}
