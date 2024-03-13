package br.com.senaisp.bauru.gabriela.secao02;

public class Text03 {
	public static void drawLegs() {
		System.out.println("     ||     ||      ");
		System.out.println("     ||     ||      ");
		System.out.println("    (||)   (||)     ");
	}

	public static void main(String[] args) {
		System.out.println("   /\\         /\\   ");
		System.out.println("  /  \\_______/  \\  ");
		System.out.println(" /               \\ ");
		System.out.println("(  /\\         /\\  )");
		System.out.println("====     V     ====");
		System.out.println("======(__|__)======");
		System.out.println("  (             )  ");
		System.out.println("   (___________)   ");
		drawLegs();
					// quando tem um desvio (no caso aqui onde chamamos o metodo drawlegs), a
					// execução
					//pula para o desvio: ele volta la em cima no inicio do cod. onde descrevemos 
					//todo o metodo drawlegs
	}
}
