package br.com.senaisp.bauru.gabriela.licao07.exemplos;

import java.util.Random;

public class MaquinaFliperama {
	private Random rnd;
	private int custoCredito;
	private String nomeJogo;

//constructor
	public MaquinaFliperama(String nome) {
		nomeJogo = nome;
		rnd = new Random();
		custoCredito = rnd.nextInt(5) + 1;

	}

//metodos
	public int getCustoCredito() {
		return custoCredito;
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void lerCartão(Cartao ct) {
		if (custoCredito <= ct.getCreditos()) {
			int cr = ct.getCreditos() - custoCredito;
			ct.setCreditos(cr);
			// ganhando os tickets
			cr = ct.getTickets() + rnd.nextInt(10) + 1;
			ct.setTickets(cr);
		} else {
			System.out.println("Que pena! Seus créditos acabaram. =(");
		}
		// mostrando os creditos
		System.out.println(ct);
	}
}
