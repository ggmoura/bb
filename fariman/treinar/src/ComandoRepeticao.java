import jdk.nashorn.internal.ir.WhileNode;

public class ComandoRepeticao {

	public static void main(String[] args) {

		// USO DO WHILE

		int x = 10;

		// while( x < 20 ) {
		// System.out.println("Valor de x : " + x );
		// x++;
		// System.out.println("\n");// Inseriu quebra de linha
		// }

		// ABAIXO EXEMPLO DE INCREMENTO

		// while( x < 20 ) {
		// System.out.println("Valor de x : " + ++x ); // pré incremento
		// }

		// ABAIXO UM LOOP INFINITO

		// while (true){
		// System.out.println("Para Sempre"); // esse bloco todo fica em um loop
		// infinito
		// }

		// USO DO " DO WHILE "

		String nome = "Fariman";
		x = 1;
		// exemplo 1
		// do{
		// System.out.print("Valor do x : " + x );
		// x++;
		// System.out.print("\n");
		// }while( x < 20 );
		// }
		// Segundo exemplo imprime o nome , quebra de linha
//		 do {
//		 System.out.print("Nome : " + x + " - " + nome);
//		 x++;
//		 System.out.print("\n");
//		 } while (x <= 10);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " - Fariman");
			
		}
		
	}

}
