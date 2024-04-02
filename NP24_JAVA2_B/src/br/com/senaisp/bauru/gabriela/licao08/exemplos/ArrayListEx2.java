package br.com.senaisp.bauru.gabriela.licao08.exemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class ArrayListEx2 {
	public static void main(String args[]) {
		ArrayList<Integer> lstInt = new ArrayList<Integer>();
		Random rnd = new Random();
//adicionando valores aleatorios de 1 a 200 na lista
		for (int i = 0; i < 100; i++) {
			lstInt.add(rnd.nextInt(200) + 1);
		}
// listar os valores gerados
		for (int it : lstInt) {
			System.out.println(it);
		}
// utilizando o iterator
		Iterator<Integer> iter = lstInt.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		//removendo os pares => isso pode dar problemas
		//pq eu perco a referencia de indices
		
		/*for (int it : lstInt) {
			if (it % 2 == 0) {
//removendo o item par
				lstInt.remove(it);
			}
		}
		*/
		
		for(int i=lstInt.size()-1;i>=0;i--) {
			if (lstInt.get(i)%2==0) {
				lstInt.remove(i);
			}
		}
// listando o resultante depois de retirar os valores
//utilizando o listIterator
			System.out.println("Listando o final");
			ListIterator<Integer> lsIt = lstInt.listIterator();
			while (lsIt.hasNext()) {
				System.out.println(lsIt.next());//volta um índice);
			}
			System.out.println("Mostrando o último valor novamente");
			System.out.println(lsIt.previous());//volta um indice
		}
	}

