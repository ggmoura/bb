
public class TipoDado {
	
	public static void main(String[] args) {
	
		byte b = 127;
		System.out.println("byte:" + b);
		
		short s = 5000;
		System.out.println("Short:" + s);
		
		int i = 565465465;
		//numero inteiro com mascara
		int iMask = 5_654_654_65;
		System.out.println("int :" + i);
		System.out.println("int com mascara:" + iMask);
		
		//a letra "L" converte o numero que por default eh inteiro em long
		long l = 214748364865465545L;
		System.out.println("Long:" + l);
		
		float f = 10.0F;
		
		System.out.println("float:" + f);
		
		double d = 10.0;
		
		System.out.println("Double:" + d);
		
		boolean verdade = true;
		boolean falso = false;
		System.out.println("boolean:" + verdade);
		System.out.println("boolean:" + falso);
		
		//char letra = 'a';----- Apenas desabilitei para testar o comando debaixo
		//System.out.println("char:" + letra);
		
		char letra = 64;// Aqui utilizamos numeros que aparecem outros caracteres
		System.out.println("char:" + letra);// exemplo 64 é igual o @
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
