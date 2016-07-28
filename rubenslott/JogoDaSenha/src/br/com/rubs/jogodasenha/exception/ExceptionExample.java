package br.com.rubs.jogodasenha.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import javax.management.RuntimeErrorException;
import javax.swing.JOptionPane;

import br.com.rubs.jogodasenha.collection.Pessoa;

public class ExceptionExample {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Integer i = null;
		try {
			System.out.println("begin");
			i = sc.nextInt();
			System.out.println("end");
			System.out.println(i);
		} catch (InputMismatchException e) {
			JOptionPane.showMessageDialog(null, "Deu zica...");
		} finally {
			sc.close();			
		}
		//mil linhas de codigo a baixo
	}

}
