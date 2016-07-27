package teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AtividadeIO {

	// Criar um programa que le do teclado letras e separar pela primeira letra
	// dos nomes
	public static void main(String[] args) throws IOException {

		List<String> nomes = new ArrayList<>();

		InputStream is = new FileInputStream("nomes.txt");// Lê em Bits
		InputStreamReader isr = new InputStreamReader(is);// transforma a leitura para Bats
		BufferedReader br = new BufferedReader(isr);//Lê linha à linha do a

		String s = br.readLine();

		while (s != null) {
			nomes.add(s);
			s = br.readLine();

		}
		Map<Character, List<String>> mapNomes = new HashMap<>();

		System.out.println(nomes);
		Character primeiraLetra = null;
		List<String> value = null;

		br.close();
		for (String nomeTempo : nomes) {
			primeiraLetra = nomeTempo.charAt(0);
			if (!mapNomes.containsKey(primeiraLetra)) {
				value = new ArrayList<String>();
				mapNomes.put(primeiraLetra, value);
			}
			mapNomes.get(primeiraLetra).add(nomeTempo);
		}
		System.out.println(mapNomes);
	}
}
