package br.com.treinarminas.estudo.thread;

public class BarraDeProgresso implements Runnable {
	
	private StringBuffer sb;

	public BarraDeProgresso(StringBuffer sb) {
		super();
		this.sb = sb;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			sb.append("b:....... " + i + "\n");
		}
	}
}