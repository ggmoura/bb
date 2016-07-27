package br.gov.bb.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import br.gov.bb.modelo.banco.Conta;

public class GravadorConta {
	
	public void gravarContas(List<Conta> contas)  {

		try {
			OutputStream os = new FileOutputStream("saida.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);

			for (Conta conta : contas) {
				bw.write(conta.toString() + "\n");
			}
			
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
