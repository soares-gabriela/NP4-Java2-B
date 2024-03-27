package br.com.senaisp.bauru.gabriela.licao06.lacowhile;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc = 0;
//while !( opc >=1 && opc<=15/*   condição   */) {//negando a condição
		while (opc < 1 || opc > 15/* condição */) {
			// bloco de execução
			System.out.println("Digite um valor entre 1 e 15: ");
			opc = sc.nextInt();
		}
		System.out.println("FIm do jogo!");
		do {
			System.out.println("Digite um valor de 5 a 10: ");
			opc = sc.nextInt();
		} while (opc < 5 || opc > 10);
		sc.close();
	}

}
