package br.com.treinarminas.estudo.jdbc;

import br.com.treinarminas.estudo.jdbc.modelo.Operadora;
import br.com.treinarminas.estudo.jdbc.modelo.TipoTelefone;

public class TesteEnumOperadora {

	public static void main(String[] args) {
		System.out.println(TipoTelefone.CELULAR);
		System.out.println(TipoTelefone.COMERCIAL);
		System.out.println(TipoTelefone.FIXO);
		
		Operadora.OI.setValorMinuto(2.5);
		System.out.println(Operadora.OI.getValorMinuto());
	}
	
}
