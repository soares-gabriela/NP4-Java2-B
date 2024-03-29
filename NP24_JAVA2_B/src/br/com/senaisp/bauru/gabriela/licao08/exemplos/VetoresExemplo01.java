package br.com.senaisp.bauru.gabriela.licao08.exemplos;

public class VetoresExemplo01 {

	public static void main(String[] args) {
//vetor é uma matirz bidimensional 
		// criando um vetor de 50 posições inteiras
		int[][]idades = new int[50][10];
		// criando de frma estática vetores
		String[] cores = { "Azul", "Amarelo", "Vermelho", "Verde" };
		cores[2] = "Laranja";
		// essa linha representa o mesmo que a anterior
		String[] cor_n = new String[4];
		cor_n[0] = "Azul";
		cor_n[1] = "Amarelo";
		cor_n[2] = "Vermelho";
		cor_n[3] = "Verde";
		//cor_n[4] = "Roxo";//ArrayIndexOutOfBounds
		// utilizando o for in
		for (String item : cores) {
			System.out.println(item);
		}
	}
}
