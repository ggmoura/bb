package br.com.treinarminas.estudo.thread;


public class GeraPDF implements Runnable  {
	
	private StringBuffer sb;

	public GeraPDF(StringBuffer sb) {
		super();
		this.sb = sb;
	}
	@Override
	public void run() {
		exec();
	}
	private void exec() {
		for (int i = 0; i < 100000; i++) {
			synchronized (sb) {
				sb.append("a: " + i + "\n");				
			}
		}
	}
}
