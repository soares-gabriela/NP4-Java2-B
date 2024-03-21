package br.com.senaisp.bauru.gabriela.secao05;

import javax.swing.JOptionPane;

public class ProjetoSecao3 {

	public static void main(String[] args) {
		
		String[] opcoes1 = { "Sim", "Claro que sim", "Obviamente"};
		String string = (String) JOptionPane.showInputDialog(null, "Você joga League of Legends??",
				"Titulo", JOptionPane.CANCEL_OPTION, null, opcoes1, opcoes1[0]);
		// pergunta 1
		String vlr1 = JOptionPane.showInputDialog("Qual é o seu nome de invocador no League of Legends?");
		// pergunta 2
		String vlr2 = JOptionPane.showInputDialog("Quantas vezes você já divou a torre inimiga achando que ia dar?");
		// pergunta 3
		String vlr3 = JOptionPane.showInputDialog("Qual seu maior número de abates?");
		// pergunta 4
		String[] opcoes2 = { "Rakan", "Blitzcrank", "Warwick", "Twisted Fate" };
		// int escolha = JOptionPane.showOptionDialog(null, "Qual campeão você
		// escolheria para um duelo de dança?", "Lista de opções",
		// JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes,
		// opcoes[2]);
		String escolhas = (String) JOptionPane.showInputDialog(null, "Qual campeão você escolheria para um duelo de dança?",
				"Titulo", 2, null, opcoes2, opcoes2[2]);
		String vlr4 = JOptionPane.showInputDialog("Se você fosse um champion, qual você seria?");
		
		
	}

}
