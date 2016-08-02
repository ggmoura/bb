package br.com.treinarminas.estudo.gc;

import br.com.treinarminas.estudo.collection.Pessoa;

public class TesteGC {

	public static void main(String[] args) throws InterruptedException {
		Pessoa p = new Pessoa();
		
		System.out.println(p);
		
		
		
		p = null;
		System.gc();
		
		Thread.sleep(5000);
		
	}
	
	
	
}
