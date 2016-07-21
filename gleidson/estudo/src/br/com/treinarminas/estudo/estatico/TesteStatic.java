package br.com.treinarminas.estudo.estatico;

public class TesteStatic {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca();
		
		System.out.println(ContaPoupanca.taxaRendimento);

		ContaPoupanca c1 = new ContaPoupanca();
		c1.nomeProprietario = "Gleidson";
		ContaPoupanca c2 = new ContaPoupanca();
		c2.nomeProprietario = "Maria Sophia";
		
		System.out.println(c1.taxaRendimento);
		c1.taxaRendimento = 0.009f;
		c1 = new ContaPoupanca();
		System.out.println(c2.taxaRendimento);
		
	}
	
}
