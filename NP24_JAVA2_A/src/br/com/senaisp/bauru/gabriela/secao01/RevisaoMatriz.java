package br.com.senaisp.bauru.gabriela.secao01;

import java.util.Scanner;

public class RevisaoMatriz {

	public static void main(String[] args) {
		char[][] acentos = new char[9][9];
		// linha e coluna -> MATRIZ DE 2 DIMENSÕES
		// aqui estamos criando uma matriz de 81 variaveis
		Scanner scn = new Scanner(System.in);
		// inicializando os acentos com _
		for (int lin = 0; lin < 9; lin++) {
			for (int col = 0; col < 9; col++) {
				acentos[lin][col] = '_';

			}
		}
		// reserva de lugar
		for (int lin = 0; lin < 9; lin++) {
			for (int col = 0; col < 9; col++) {
				System.out.print(acentos[lin][col] + " ");
				// aspas duplas representa uma string unindo textos
				// aspas simples representa caractere numérico
			}
			System.out.println();
		}
		// Solicitando posição
		System.out.println("Digite a posição desejada: ");
		System.out.println("Fileira: ");
		int fil = scn.nextInt();
		System.out.println("Poltrona: ");
		int pol = scn.nextInt();
		// marcando os acentos
		acentos[fil - 1][pol - 1] = 'x';
		// aqui subtraímos 1 pq no java a contagem começa pelo 0
		for (int lin = 0; lin < 9; lin++) {
			for (int col = 0; col < 9; col++) {
				System.out.print(acentos[lin][col] + " ");
			}
			System.out.println();
		}
		scn.close();
	}
}
