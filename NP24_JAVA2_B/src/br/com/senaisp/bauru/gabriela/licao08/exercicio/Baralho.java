package br.com.senaisp.bauru.gabriela.licao08.exercicio;

import java.util.ArrayList;
import java.util.Random;

public class Baralho {
private Carta [] bar;
private Random rnd;
private ArrayList<Integer> lstSorteados;//integer é um apoio para armazenar inteiros

public Baralho() {
	bar = new Carta[52];
	rnd = new Random ();
	lstSorteados = new ArrayList<Integer>();
//montando o baralho
	for(int np=0;np<4;np++) {
		for(int nm=0;nm<13;nm++) {
//criando a carta
			bar[np*13+nm]= new Carta (np, nm);
		}
	}
}

public Carta getCartaAleatoria() {
	int num = 0;
//laço p/ garantir que será sorteado um número q não tenha saído
	do {
		num = rnd.nextInt(52);
	}while (lstSorteados.indexOf(num)!=-1&&lstSorteados.size()<52);
//adicionando o numero na lista de sorteados	
	lstSorteados.add(num);
//retornando a carta sorteada  
	return bar [rnd.nextInt(52)];
}
}
