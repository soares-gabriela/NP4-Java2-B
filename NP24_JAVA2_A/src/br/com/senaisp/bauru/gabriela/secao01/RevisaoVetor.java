package br.com.senaisp.bauru.gabriela.secao01;

import java.util.Scanner;

public class RevisaoVetor {

	//colocando dados na memória
	public static void main(String[] args) {
		String [] nomes = new String [10];
		//cria uma variavel com 10 espaços de memoria
		Scanner scn = new Scanner(System.in);
		//"in" pois faz a captura pelo teclado
		for (int i=0;i<10;i++) {
			System.out.println("Digite o nome " + (i+1)+ ":");
			nomes [i] = scn.nextLine();
			
		}
		//listando nomes
		for(String nome : nomes) {//for each
			System.out.println(nome);
		}
		scn.close();
	}

}
