package br.com.senaisp.bauru.gabriela.licao07.exemplos;

public class Exemplo01 {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		c1.setAgencia(1900);
		c1.setBanco(341);
		c1.setNumeroConta(12345);
		c1.setSaldo(-10);
		ContaBancaria c2 = c1;//igualando endereço de memoria
		System.out.println(c1);
		c2.setSaldo(50);
		System.out.println(c1.getSaldo());
		adicionarValor(c1,100.00);
		System.out.println(c1.getSaldo());
	}

	
	private static void adicionarValor(ContaBancaria ca1, double d) {
	//ca1.setSaldo(ca1.getSaldo() + d);
	ca1.setSaldo(ca1.getSaldo() + d);
	}
}
