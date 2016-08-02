package br.com.rubs.jogodasenha.character;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class InverteNome {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("nome_a_inverter.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String s = br.readLine(); // primeira linha

		System.out.println(s);
		br.close();

		StringBuilder sb = new StringBuilder();
		System.out.println(s.length());

		int x = s.length();
		while (x > 0) {
			//System.out.println(s.charAt(x - 1));
			sb.append(s.charAt(x - 1));
			x--;
		}
		System.out.println(sb);

		OutputStream os = new FileOutputStream("nome_a_inverter.txt",Boolean.TRUE);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("\n" + sb);
		bw.close();
		
		//System.out.println("\n" + sb.reverse());
	}
}
