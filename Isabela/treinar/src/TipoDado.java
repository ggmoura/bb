
public class TipoDado {
	public static void main(String[] args) {
	
			byte b = 127;
			System.out.println("Byte: " + b);
			
			short s = 500;
			System.out.println("Short: " + s);
			
			int i = 54654654;
			System.out.println("Inteiro: " + i);
			
			//Número inteiro com máscara, o sistema despreza o underline.
			int iMask = 546_546_54;
			System.out.println("Inteiro com máscara: " + iMask);
			
			//A letra l no final do número converte o número em long, pq por default eh inteiro.
			long l = 100001144444444411l;
			System.out.println("Long: " + l);
			
			//A letra f no final do número converte o número em float, pq por default eh double.
			float f = 1.65f;
			System.out.println("Float: " + f);
			
			double d = 15.25;
			System.out.println("Double: " + d);
	
			boolean verdade = true;
			System.out.println("Boolean: " + verdade);
			
			char nome = 'a';
			System.out.println("Char: " + nome);
	}
}
