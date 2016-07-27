/**
 * Jogo da Senha - Consiste em adivinhar uma senha composta de 4 letras geradas pelo programa.
 * @author : Rubens Lott de Almeida Cunha
 */

package br.com.rubs.jogodasenha;

/**
 * Importando Bibliotecas
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class JogoDaSenha {
	static String senhaParte1;
	static String senhaParte2;
	static String senhaParte3;
	static String senhaParte4;

	static int letrasCertas = 0;
	
	static List<String> senhas = new ArrayList<String>();

	public static void main(String[] args) {
		boolean acertou = false;

		//Carregando senhas válidas.
		try {
			CarregaSenha();
		} catch (IOException e1) {
			JOptionPane.showMessageDialog(null, "Impossível ler arquivo de senhas!!!");
			System.exit(0);
		}

		Date hoje = new Date();
		Integer QtdeSenhas = senhas.size();

		SimpleDateFormat formatadorHoje = new SimpleDateFormat("EEEE, dd 'de' MMMMM 'de' YYYY");
		SimpleDateFormat formatadorAgora = new SimpleDateFormat("HH:mm");
		JOptionPane.showMessageDialog(null, "Olá!\nHoje é " + formatadorHoje.format(hoje) + ".\n" + "Agora são "
				+ formatadorAgora.format(hoje) + "hs.\n"
				+ "Este é um joguinho de senha bem bacaninha!\nA senha é uma palavra de 4 letras e você terá que adivinhar qual é a sua senha...\nVamos lá?\nBoa sorte!!!");

		int continua;
		do {
			String texto = "";
			String[] tentativas = new String[10];
			int[] acertos = new int[10];

			Integer senhaNro = 0;
			boolean numeroValido = false;

			while (numeroValido == false) {
				try {
					senhaNro = 0;
					senhaNro = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Digite um número entre 1 e " + QtdeSenhas + ", ou 0 para sair."));
					numeroValido = true;
				} catch (NumberFormatException e) {
					senhaNro = 9999;
					JOptionPane.showMessageDialog(null, "Digite apenas NÚMEROS ou 0 para sair!!!");
				}

				if (senhaNro == 0) {
					System.exit(0);
				}

				if ((senhaNro < 1 || senhaNro > QtdeSenhas) && senhaNro != 9999) {
					numeroValido = false;
					JOptionPane.showMessageDialog(null, "Número " + senhaNro + " inválido!!!");
				}
			}

			// PROCESSAMENTO E SAÍDA
			int indexador = senhaNro;
			String senhaSelecionada = senhas.get(indexador);
			int tentativaNro = 0;

			senhaParte1 = senhaSelecionada.substring(0, 1);
			senhaParte2 = senhaSelecionada.substring(1, 2);
			senhaParte3 = senhaSelecionada.substring(2, 3);
			senhaParte4 = senhaSelecionada.substring(3, 4);

			Date inicio = new Date();
			String textoInicio = "Início do jogo às " + formatadorAgora.format(inicio) + "hs.\n";

			JOptionPane.showMessageDialog(null,
					"Sua senha foi selecionada...\nPrepare-se para entrar com as suas tentativas...\nSão apenas 10!\nBoa sorte!!!");

			do {
				tentativaNro++;
				String tentativa = JOptionPane.showInputDialog(null,
						textoInicio + texto + "\nDigite sua " + tentativaNro + "ª tentativa: (4 letras)");

				try {

					if (tentativa.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Você deve digitar 4 letras!!!");
						tentativaNro--;
					} else if (tentativa.length() != 4) {
						JOptionPane.showMessageDialog(null, "Preste atenção... apenas 4 letras!!!");
						tentativaNro--;
					} else {

						tentativa = tentativa.toUpperCase();
						tentativas[tentativaNro - 1] = tentativa;

						if (tentativa.equals(senhaSelecionada)) {
							Date fim = new Date();
							texto = textoInicio + "Fim do jogo às " + formatadorAgora.format(fim) + "hs.";

							JOptionPane.showMessageDialog(null, texto + "\nParabéns!!!\nVocê acertou a senha "
									+ senhaSelecionada + " em " + tentativaNro + " tentativas!!!");
							acertou = true;
							tentativaNro = 10;
						} else {
							ArrayList<String> tentativaParte = new ArrayList<String>();
							tentativaParte.add(tentativa.substring(0, 1));
							tentativaParte.add(tentativa.substring(1, 2));
							tentativaParte.add(tentativa.substring(2, 3));
							tentativaParte.add(tentativa.substring(3, 4));

							letrasCertas = 0;

							// // Testando 1ª letra da tentativa
							VerificaTentativa(tentativaParte, 0);

							// Testando 2ª letra da tentativa
							if (!tentativaParte.get(1).equals(tentativaParte.get(0))) {
								VerificaTentativa(tentativaParte, 1);
							}

							// Testando 3ª letra da tentativa
							if (!tentativaParte.get(2).equals(tentativaParte.get(0))
									&& !tentativaParte.get(2).equals(tentativaParte.get(1))) {
								VerificaTentativa(tentativaParte, 2);
							}
							// Testando 4ª letra da tentativa
							if (!tentativaParte.get(3).equals(tentativaParte.get(0))
									&& !tentativaParte.get(3).equals(tentativaParte.get(1))
									&& !tentativaParte.get(3).equals(tentativaParte.get(2))) {
								VerificaTentativa(tentativaParte, 3);
							}
							acertos[tentativaNro - 1] = letrasCertas;

							texto = "Tentativas:\n";

							for (int i = 0; i < tentativaNro; i++) {
								if (acertos[i] == 0) {
									texto = texto + (i + 1) + "ª tentativa - " + tentativas[i]
											+ " - nenhuma letra correta;\n";
								} else if (acertos[i] == 1) {
									texto = texto + (i + 1) + "ª tentativa - " + tentativas[i] + " - " + acertos[i]
											+ " letra correta;\n";
								} else {
									texto = texto + (i + 1) + "ª tentativa - " + tentativas[i] + " - " + acertos[i]
											+ " letras corretas;\n";
								}
							}
						}
					}
				} catch (NullPointerException e) {
					System.exit(0);
				}

			} while (tentativaNro != 10);

			if (!acertou) {
				Date fim2 = new Date();
				texto = "Fim do jogo às " + formatadorAgora.format(fim2) + "hs.";

				JOptionPane.showMessageDialog(null,
						textoInicio + texto + "\nQue pena... Você não conseguiu!!!\nA senha era " + senhaSelecionada
								+ "...\nNão desanime... Tente novamente!");
			}

			Object[] options = { "Continuar", "Sair" };
			continua = JOptionPane.showOptionDialog(null, "Deseja jogar novamente?", "Se gostou jogue mais uma vez...",
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		} while (continua == 0);
	}

	private static void CarregaSenha() throws IOException {
		InputStream is = new FileInputStream("senhas.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String s = br.readLine(); // primeira linha

		while (s != null) {
			senhas.add(s);
			s = br.readLine();
		}
		br.close();
	}

	private static void VerificaTentativa(ArrayList<String> tentativaParte, Integer i) {
		if (tentativaParte.get(i).equals(senhaParte1)) {
			letrasCertas++;
		} else if (tentativaParte.get(i).equals(senhaParte2)) {
			letrasCertas++;
		} else if (tentativaParte.get(i).equals(senhaParte3)) {
			letrasCertas++;
		} else if (tentativaParte.get(i).equals(senhaParte4)) {
			letrasCertas++;
		}
	}
}
