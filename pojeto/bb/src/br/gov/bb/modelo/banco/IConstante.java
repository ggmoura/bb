package br.gov.bb.modelo.banco;


public interface IConstante {

	Integer HORA_ABERTURA = 10;
	String NOME_BANCO = "Banco do Brasil";
	
	interface  IMensagem {
		String MENSAGEM_ERRO = "Deu zica...";
		String MENSAGEM_BOAS_VINDAS = "Bem vindo ao Banco do Brasil";
	}

}
