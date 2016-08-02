package br.com.treinarminas.estudo.thread;

public class MeuPrograma {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();

		GeraPDF gerapdf = new GeraPDF(sb);
		Thread threadDoPdf = new Thread(gerapdf);
		threadDoPdf.start();

		BarraDeProgresso barraDeProgresso = new BarraDeProgresso(sb);
		Thread threadDaBarra = new Thread(barraDeProgresso);
		threadDaBarra.start();
		
		System.out.println(sb);

	}
}