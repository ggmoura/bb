
public class ComandoDecisao {
	
	public static void main(String[] args) {
		int a = 4;
		int b = 32;
		
		if (a < b) {
			System.out.println("a � menor do que b" + "\n");
		} else if (a == b) {
				System.out.println("a � igual a b" + "\n");
			} else{
			System.out.println("a � maior que b" + "\n");
		}
	
	System.out.println("Comando switch case");
		
	int opcao = 2;
	
	switch (opcao) {
	case 1:
		System.out.println("Op��o um selecionada");
		break;
	case 2:
		System.out.println("Op��o dois selecionada");
		break;
	case 3:
		System.out.println("Op��o tres selecionada");
		break;
	//a op��o default pode ser omitido, n�o � obrigat�rio	
	default:
		System.out.println("Op��o default");
		break;
	}
	
	System.out.println("fim do programa");
	}
}
	

