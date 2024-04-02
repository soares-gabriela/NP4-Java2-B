package br.com.senaisp.bauru.gabriela.licao08.exercicio;

public class Carta {
	private String[] naipes = { "♦️", "♠️", "♥", "♣" };
	private String[] numeros = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	private int naipe;
	private int valor;
	private String numero;

// constructor
	public Carta(int nap, int num) {
// tratando o naipe para que seja de 0 a 3
		if (nap < 0 || nap > 3) {
			throw new RuntimeException("Os naipes devem ser de 0 a 3");
		}

// tratando o número para que seja de 0 a 12
		if (num < 0 || num > 12) {
			throw new RuntimeException("Os números devem ser de 0 a 12");
// o metodo throw força a criação de um erro
		}
//atribuindo os fields
		naipe = nap;
		valor = num;
		numero = numeros[num];// índice
	}

	// getters and setters
	public String getNaipe() {
		return naipes[naipe];
	}

	public String getNumero() {
		return numero;
	}

	public int getValor() {
		return valor > 9 ? 10 : valor + 1;
	}

	@Override
	public String toString() {
		String apoio = "╔═════╗\n"
				     + "║##   ║\n"
				     + "║  §  ║\n"
				     + "║   ##║\n"
					 + "╚═════╝\n";
		String br = valor == 9 ? "" : " ";//lembrando q 9 é índice
		apoio = apoio.replaceFirst("##", getNumero()+ br);
		apoio = apoio.replace("§", getNaipe());
		apoio = apoio.replaceFirst("##", br +getNumero());//substitui só a primeira ocorrencia
		return apoio;
	}
}
