package br.com.rubs.jogodasenha.exception;

import java.util.Random;

public class ExceptionTryCatch {

	
	public static void main(String[] args) {
		chefeMandaPagarConta();
		System.out.println("tow feliz...");
	}
	
	private static void chefeMandaPagarConta() {

		try {
			secretariaMandaPagarConta();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("nao sei o que rolou, nas nao esto nem ai...");
		} catch (Exception e) {
			System.out.println("nao sei o que rolou");
		}
		
	}
	
	private static void secretariaMandaPagarConta() throws Exception {

//		try {
			motoboyPagarConta();
			System.out.println("motoboy pagou a conta...");
//		} catch (Exception e) {
//			System.out.println("pagar no banco");
//		}

	}
	
	private static void motoboyPagarConta() throws Exception {
		Random r = new Random();
		Boolean condicao = r.nextBoolean();
		condicao = Boolean.TRUE;
		if (condicao) {
			System.out.println("Paguei...");
			Integer[] vetor = {};
			System.out.println(vetor[0]);
		} else {
			throw new IllegalArgumentException("codigo de barras invalido");
		}
		
	}
	
}
