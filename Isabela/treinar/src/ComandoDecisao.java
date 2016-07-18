
public class ComandoDecisao {
	
	public static void main(String[] args) {
		int a = 4;
		int b = 32;
		
		if (a < b) {
			System.out.println("a é menor do que b" + "\n");
		} else if (a == b) {
				System.out.println("a é igual a b" + "\n");
			} else{
			System.out.println("a é maior que b" + "\n");
		}
	
	System.out.println("Comando switch case");
		
	int opcao = 2;
	
	switch (opcao) {
	case 1:
		System.out.println("Opção um selecionada");
		break;
	case 2:
		System.out.println("Opção dois selecionada");
		break;
	case 3:
		System.out.println("Opção tres selecionada");
		break;
	//a opção default pode ser omitido, não é obrigatório	
	default:
		System.out.println("Opção default");
		break;
	}
	
	System.out.println("fim do programa");
	}
}
	

