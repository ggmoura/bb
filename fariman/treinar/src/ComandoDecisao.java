
public class ComandoDecisao {

	public static void main(String[] args) {
		
		int a = 40;
		int b = 32;
		
		if (a < b) {
			System.out.println("a � menor do que b");		
		}else {
			
			if (a == b) {
				System.out.println(" a � igual a b");
				
			}else {
				System.out.println(" a � maior que b ");
			}
			
			System.out.println("a � maior ou igual a  b");		
		}
		
		System.out.println("Fim do Programa");
		
	// ELSE IF
		
	
	if (a < b) {
		System.out.println("a � menor do que b");		
	}else if (a == b) {
			System.out.println(" a � igual a b");		
		}else {
			System.out.println(" a � maior que b ");	
		System.out.println("a � maior ou igual a  b");		
		}
		System.out.println("Fim do Programa");
		
		// USO DO SWITCH CASE
		
		int opcao = 2;
		
		switch (opcao) {
		case 1:
			System.out.println("Op��o um selecionada");
			break;	
		case 2:
			System.out.println("Op��o dois selecionada");
			break;	
		case 3:
			System.out.println("Op��o tr�s selecionada");
			break;
			
		default:// podemos omitir esse default se quiser
			System.out.println("Op��o default");
			break;
		}
		
		
		
}
	
}
