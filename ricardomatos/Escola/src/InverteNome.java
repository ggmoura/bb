import java.util.Scanner;

public class InverteNome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		String nome = leitura.nextLine();
		leitura.close();
		for (int i = nome.length() - 1; i >= 0; i--) {
			System.out.print(nome.charAt(i));
		}

	}

}
