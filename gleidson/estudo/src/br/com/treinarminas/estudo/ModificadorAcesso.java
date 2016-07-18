package br.com.treinarminas.estudo;

import br.com.treinarminas.estudo.acesso.ClassePai;
import br.com.treinarminas.estudo.acesso.ModificadorDefault;

public class ModificadorAcesso extends ClassePai {

	public void imprimir() {
		System.out.println(sobrenome);
	}
	
	public static void main(String[] args) {
		ModificadorDefault mDefault = new ModificadorDefault();
		
	}
	
}
