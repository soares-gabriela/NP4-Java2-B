package br.com.senaisp.bauru.gabriela.licao06.lacofor;

public class Poligonos {
	public void montarQuadrado() {
		for (int lin = 0; lin < 10; lin++) {
			for (int col = 0; col < 10; col++) {
				System.out.print("" + lin + col + " ");
			}
			System.out.println();
		}
	}

	public void montarTrianguloInferior() {
		for (int lin = 0; lin < 10; lin++) {
			for (int col = 0; col < 10; col++) {
				if (col <= lin) {
					System.out.print("" + lin + col + " ");

				} else {
					System.out.print("   ");

				}
			}
			System.out.println();
		}
	}

	public void montarTrianguloSuperior() {
		for (int lin = 0; lin < 10; lin++) {
			for (int col = 0; col < 10; col++) {
				if (col >= lin) {
					System.out.print("" + lin + col + " ");

				} else {
					System.out.print("   ");

				}
			}
			System.out.println();
		}
	}

	public void montarTrianguloDiagonal() {
		for (int lin = 0; lin < 10; lin++) {
			for (int col = 0; col < 10; col++) {
				if (col == lin) {
					System.out.print("" + lin + col + " ");

				} else {
					System.out.print("   ");

				}
			}
			System.out.println();
		}
	}

	public void montarTrianguloDiagonalInvertida() {
		for (int lin = 0; lin < 10; lin++) {
			for (int col = 0; col < 10; col++) {
				if (col + lin == 9) {
					System.out.print("" + lin + col + " ");

				} else {
					System.out.print("   ");

				}
			}
			System.out.println();
		}
	}

	public void montarX() {
		for (int lin = 0; lin < 10; lin++) {
			for (int col = 0; col < 10; col++) {
				if (col + lin == 9 || lin == col) {
					System.out.print("" + lin + col + " ");

				} else {
					System.out.print("   ");

				}
			}
			System.out.println();
		}
	}
}
