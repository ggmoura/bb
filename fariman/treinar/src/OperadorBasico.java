
public class OperadorBasico {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int soma = a + b;
		
		System.out.println("Soma de a + b = " + soma);
		
		int d = 50;
		int e = 20;
		int subtracao = d - e;
		
		System.out.println("d = " + d + "\n" + "e = " + e);
		System.out.println("Subtra��o entre d - e = " + subtracao);
		int multiplicacao = a * b;
		System.out.println("a * b = " + multiplicacao);// Posso colocar as vari�veis com os operadores conforme esse exemplo
		System.out.println("a * b = " + multiplicacao);// selecione a * b e d� alt shift L da� cria uma variavel
		
		System.out.println("b / a  = " + b/a);
		System.out.println("b / a  = " + a/b);// Arredondou os valores
		System.out.println("b / a  = " + (float)a/b);// Considerou os decimais - acrescenta o float
		
		System.out.println("d % e = " + d % e);// Uso do Mod %
		
		int w = 5;
		w++;
		System.out.println(w);
		w++;
		System.out.println(w);
		
		w--;
		System.out.println(w);
		w--;
		System.out.println(w);
		
		//int inc =20;
		//int vinteEUm = inc++;
		//System.out.println(vinteEUm);// p�s incremento - atribui o valor 20 s� depois soma para 21
		
		int inc =20;
		int vinteEUm = ++inc;
		System.out.println(vinteEUm);// pr� incremento - j� vai atrivuir o valor somado
		inc++;// esse mostra o pr�-incremento somado mais um, ou seja 21 + 1 = 22
		System.out.println(inc);// Isso ainda mostraria o pr� incremento
		
		boolean aDiferenteB = a != b;
		boolean aIgualB = a == b;
		boolean aMenorB = a < b;
		boolean aMaiorB = a > b;
		boolean aMaiorOuIagualAB = a >= b;
		boolean aMenorOuIagualAB = a <= b;
	
		// Operadores relacionais == !=  > < >= <= Igual, diferente, menor, maior, menor igual, maior igual
		
		System.out.println(" a = " + a + " b = " + b + "\n");
		System.out.println("a == b " + aIgualB);
		System.out.println("a != b " + aDiferenteB);
		System.out.println("a < b " + aMenorB);
		System.out.println("a > b " + aMaiorB);
		System.out.println("a >= b " + aMaiorOuIagualAB);
		System.out.println("a <= b " + aMenorOuIagualAB);
		
		// Operadores E &&  --- Ou ||
		
		System.out.println("d =" + d + " e =" + e + "\n");
		
		boolean operadorE = aIgualB && a == b;
		System.out.println("aIgualB && aMaiorOuIgualAB " + operadorE);
		
		boolean operadorOu = aIgualB || aMaiorOuIagualAB;
		System.out.println("aIgualB || aMaiorOuIgualAB " + operadorOu);
		
		
		// Operador NOT !
		
		boolean not = !aIgualB;
		System.out.println(" nega��o " + not);
		
		int g = 0;
		g =  g + 2;
		System.out.println("[g = g + 2] " + g);
		g = g + 2;
		System.out.println("[g = g + 2] " + g);
		g += 2;// Melhor forma de fazer 
		System.out.println(" [g += 2] " + g);
		
		g *= 3;
		System.out.println(" [g *= 3] " + g);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
