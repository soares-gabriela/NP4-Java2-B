package br.com.senaisp.bauru.gabriela.secao05;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExemploScanner02 {

	public static void main(String[] args) {
		Scanner scn;
		String data = JOptionPane.showInputDialog(null, "Digite uma data", "Sistema de data",
				JOptionPane.QUESTION_MESSAGE);
		scn = new Scanner(data);
		scn.useDelimiter("/");
		int dia, mes, ano;
		dia = scn.nextInt();
		mes = scn.nextInt();
		ano = scn.nextInt();
		System.out.println(dia + " de " + mes + " de " + ano);
		scn.close();
	}

}
