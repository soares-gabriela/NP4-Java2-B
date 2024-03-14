package br.com.senaisp.bauru.gabriela.secao01;

import java.util.Scanner;

public class RevisaoExcecao {
							// T R A T A M E N T O D E E X C E Ç Ã O
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int valor = 0;
		do {
			System.out.println("Digite um valor: ");

			try {
				valor = scn.nextInt();
			} catch (Exception e) {// EXEPTION É GENERICO, VAI TRATAR QQR ERRO
				System.out.println("Você não digitou um número. Tente novamente!");
				scn.nextLine(); // essa linha vai capturar o enter
			}
			// O ERRO OCORRERÁ AQUI (É ONDE OBTEM O VALOR)

		} while (valor < 100);
		scn.nextLine();// para capturar o enter do nextInt
		System.out.println("Deseja continuar? (S/N):");
		String cont = scn.nextLine();
		System.out.println("Você digitou " + cont);
		scn.close();
	}

}
