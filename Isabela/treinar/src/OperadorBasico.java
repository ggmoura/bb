
public class OperadorBasico {
	
	public static void main(String[] args) {
		
		//Soma
		int a = 10;
		int b = 20;
		
		int soma = a + b;
		
		System.out.println("a = " + a + "\n" + "b = " + b);
		System.out.println("Soma de a + b = " + soma);
		
		//Subtração
		int d = 50;
		int e = 20;
		
		int subtracao = d - e;
		
		System.out.println("d = " + d + "\n" + "e = " + e);
		System.out.println("Subtração de d - e = " + subtracao);
		
		//Multiplicação e Divisão
		System.out.println("a * b = " + a * b);
		
		//casting - é uma conversão de dados no meio do código, neste exemplo converti a variável 'a' para float apenas para esse caso
		System.out.println("b / a = " + (float) b / a);
		
		//Módulo
		System.out.println("d % e = " + d % e);
		
		int w = 5;
		w++;
		System.out.println(w);
		w++;
		System.out.println(w);
		w--;
		System.out.println(w);
		w--;
		System.out.println(w);
		
		int inc = 20;
		int vinteEUm = ++inc;
		System.out.println("sleep...");
		System.out.println(vinteEUm);
		inc++;
		System.out.println(inc);
		
		//exemplo mod
		int minutos = 185;
		System.out.println(minutos / 60 + " horas e " + minutos % 60 + " minutos");
		
		//Resultado de uma Comparação
		boolean igual = a == b;
		boolean diferente = a != b;
		boolean maiorigual = a >= b;
		boolean menorigual = a <= b;
		
		System.out.println("a == b " + igual);
		System.out.println("a != b " + diferente);
		System.out.println("a >= b " + maiorigual);
		System.out.println("a <= b " + menorigual);
		
		System.out.println("d = " + d + " e = " + e + "\n");
		
		boolean operadorE = igual && maiorigual;
		System.out.println("igual && maiorigual " + operadorE);
	 	
		boolean operadorOu = igual || maiorigual;
		System.out.println("igual || maiorigual " + operadorOu);
		
		//inverter valor da variável
		boolean not = !igual;
		System.out.println("Negação: " + not);
		
		int g = 0;
		g = g + 2;
		System.out.println("[g = g + 2] = " + g);
		g = g + 2;
		System.out.println("[g = g + 2] = " + g);
		//g+=2 é a mesma coisa que g=g+2
		g += 2;
		System.out.println("[g += 2] = " + g);
		
		g*=3;
		System.out.println("[g *= 3] = " + g);
	}
}
