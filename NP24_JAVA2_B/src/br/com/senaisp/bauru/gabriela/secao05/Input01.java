package br.com.senaisp.bauru.gabriela.secao05;

import javax.swing.JOptionPane;

public class Input01 {
	public static void main(String[] args) {
		// Create a JOptionPane.
		// Store the input as a String and print it.
		String xVlr = JOptionPane.showInputDialog("Digite um valor inteiro");
		JOptionPane.showMessageDialog(null, xVlr);

		// Parse the input as an int.
		// Print its value +1
JOptionPane.showMessageDialog(null, Integer.parseInt(xVlr)+1);
		
		// Try creating a dialog, parsing it, and initializing an int in a single line.
		// You should have only one semicolon (;) in this line.
int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
JOptionPane.showMessageDialog(null, valor);
	}
}
