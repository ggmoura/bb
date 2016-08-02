package br.com.rubs.jogodasenha.heranca;

public class TesteHeranca {

	public static void main(String[] args) {
		ClasseFilha cf = null;
		cf = new ClasseFilha();
		ClassePai cp = new ClassePai();
		ClassePai cpf = new ClasseFilha();
		System.out.println(((ClasseFilha)cpf).nome);
		cpf = new ClassePai();
		//nao eh possivel converter a classe pai em filho
		//System.out.println(((ClasseFilha)cpf).nome);
		//ClasseFilha naoCompila = new ClassePai();
		
		cf.imprimir();
		cp.imprimir();
		cpf.imprimir();
		
		
	}
	
}
