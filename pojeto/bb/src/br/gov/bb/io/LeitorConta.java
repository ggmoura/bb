package br.gov.bb.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import br.gov.bb.modelo.Cliente;
import br.gov.bb.modelo.ContaCorrente;
import br.gov.bb.modelo.ContaPoupanca;
import br.gov.bb.modelo.banco.Conta;

public class LeitorConta {

	public List<Conta> recuperarContas() {
		
		List<Conta> contas = new ArrayList<Conta>();
		try {
			InputStream is = new FileInputStream("saida.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String contaStr = br.readLine(); // primeira linha

			while (contaStr != null) {
				contas.add(buildConta(contaStr));
				contaStr = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.println("zica");
		}
		return contas;
		
	}

	private Conta buildConta(String contaStr) {
		String[] contaArray = contaStr.split(";");
		
		try {
			Conta c = (Conta) Class.forName(contaArray[0]).newInstance();
			c.setCliente(new Cliente());
			c.getCliente().setNome(contaArray[2]);
			c.depositar(Double.valueOf(contaArray[3]));
			
			if (c instanceof ContaCorrente) {
				build((ContaCorrente)c, contaArray);
			} else if (c instanceof ContaPoupanca) {
				build((ContaPoupanca)c, contaArray);				
			}
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private void build(ContaCorrente cc, String[] array) {
		cc.setTaxaServico(Double.valueOf(array[4]));
	}
	private void build(ContaPoupanca cc, String[] array) {
		//cc.setTaxaServico(Double.valueOf(array[4]));
	}
	
}
