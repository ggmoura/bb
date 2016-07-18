package javabasico;

public class ComandoDecisao {
	public static void main(String[] args) {
		int a = 4;
		int b = 32;
		if (a < b) { System.out.println("a é menor que b"); 
					}
		else { 
			System.out.println("a maior ou igual a b");
					}
		int opcao = 7;
		
		switch (opcao) {
		case 1:
			System.out.println("opcao eh um");
			break;
		case 2:
			System.out.println("opcao eh dois");
			break;
		}
	}
}

