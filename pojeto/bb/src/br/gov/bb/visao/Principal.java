package br.gov.bb.visao;

import br.gov.bb.modelo.banco.IConstante;

public class Principal {
	public static void main(String[] args) {
		System.out.println(IConstante.IMensagem.MENSAGEM_BOAS_VINDAS);
		
		TelaBB tela = new TelaBB();
		tela.iniciarOperacao();
		System.out.println("Obrigada, volte sempre!");
	}
}
