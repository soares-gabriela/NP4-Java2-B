
public class Shape {
//nao é static void main pq é uma classe
	public void criarRetangulo(int lar, int alt) {// metodo
		if (lar <= 0 || alt <= 0) {
			System.out.println("Não temos como fazer a figurinha!");
		} else {
			// aqui começa o cód
			for (int lin = 1; lin <= alt; lin++) {// laço 1 -> linhas
				for (int col = 1; col <= lar; col++) {// laço 2 -> colunas
					if (lin == 1 || lin == alt || col == lar || col == 1) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					} // fim do else
				} // fim do col
				System.out.println();
			} // fim do for lin
		} // fim do else
	}// fim do retangulo

	public void criarTriangulo(int lar, int alt) {// metodo

		if (lar <= 0 || alt <= 0) {
			System.out.println("Não temos como fazer a figurinha!");
		} else {
			// aqui começa o cód
			for (int lin = 1; lin <= alt; lin++) {// laço 1 -> linhas
				for (int col = 1; col <= lar; col++) {// laço 2 -> colunas
					if (col == 1 || col == lin || lin == alt) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					} // fim do else
				} // fim do col
				System.out.println();
			} // fim do for lin
		} // fim do else
	}// fim do triangulo
}
