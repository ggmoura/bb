package teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class InverterNome {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("Inverte_Nome.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String s = br.readLine(); // primeira linha

		System.out.println(s);
		br.close();

		StringBuilder sb = new StringBuilder();
		System.out.println(s.length());

		int x = s.length();
		while (x > 0) {
			System.out.println(s.charAt(x - 1));
			sb.append(s.charAt(x - 1));
			x--;
		}
		System.out.println(sb);

		OutputStream os = new FileOutputStream("Inverte_Nome.txt",
				Boolean.FALSE);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("\n" + sb);
		bw.close();

	}
}
