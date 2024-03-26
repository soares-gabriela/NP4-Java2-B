package br.com.senaisp.bauru.gabriela.licao05.exercicio;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código da cor ( 1, 2 ou 3): ");
		int codigo = sc.nextInt();
		String cor = "Cor inválida";

		switch (codigo) {
		case 1 -> cor = "Próxima luz do semáforo será verde";
		case 2 -> cor = "Próxima luz do semáforo será amarelo";
		case 3 -> cor = "Próxima luz do semáforo será vermelho";
		}
		
		//outra forma de usar o switch
		/*
		 * switch (codigo) { 
		 * case 1 : cor = "Próxima luz do semáforo será verde"; break;
		 * case 2 : cor = "Próxima luz do semáforo será amarelo"; break;
		 * case 3 : cor = "Próxima luz do semáforo será vermelho";break; }
		 */
		
		if (codigo == 1) {
			cor = "Próxima luz do semáforo será verde";
		} else if (codigo == 2) {
			cor = "Próxima luz do semáforo será amarelo";
		} else if (codigo == 3) {
			cor = "Próxima luz do semáforo será vermelho";
		}
		System.out.println(cor);
		sc.close();
	}
}
