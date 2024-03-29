package br.com.senaisp.bauru.gabriela.licao07.exemplos;

public class Terminal {
	private int nId = 0;
	private CategoriaPremio categoria01;
	private CategoriaPremio categoria02;
	private CategoriaPremio categoria03;
	private int numeroTerminal;

//constructor
	public Terminal() {
		numeroTerminal = ++nId;
		categoria01 = new CategoriaPremio("Gold", 25);
		categoria02 = new CategoriaPremio("Silver", 50);
		categoria03 = new CategoriaPremio("Bronze", 75);
	}

	public CategoriaPremio getCategoria01() {
		return categoria01;
	}

	public CategoriaPremio getCategoria02() {
		return categoria02;
	}

	public CategoriaPremio getCategoria03() {
		return categoria03;
	}

	public int getNumeroTerminal() {
		return numeroTerminal;
	}

//metodos
	public void consultarSaldoCartao(Cartao ct) {
		System.out.println("Operação: Saldo do Cartão");
		System.out.println("-".repeat(20));
		System.out.println(ct);
		System.out.println("-".repeat(20));
	}

	public void carregarCartao(Cartao ct, int valor) {
		System.out.println("Operação: carregar saldo cartão.");
		System.out.println("-".repeat(20));
		int nrCreditos = valor * 2;
		// atribuindo os creditos
		ct.setCreditos(ct.getCreditos() + nrCreditos);
		// mostrando o saldo do cartao
		System.out.println(ct);
		System.out.println("-".repeat(20));
	}

//transferir parcial
	public void transferirCreditos(Cartao ori, Cartao des, int qtde) {
		System.out.println("Operação: Transferência de Créditos");
		System.out.println("-".repeat(20));
		if (ori.getCreditos() >= qtde && qtde > 0) {// posso trocar
			int vlr = ori.getCreditos() - qtde;
			// ajustando o saldo
			ori.setCreditos(vlr);
			// transferindo os creditos
			des.setCreditos(des.getCreditos() + qtde);
		} else {
			System.out.println("Créditos insuficientes ou qtde. zero!");
		}
		// mostrando os saldos
		System.out.println("Cartão Origem: ");
		System.out.println(ori);
		System.out.println("Cartão Destino: ");
		System.out.println(des);
		System.out.println("-".repeat(20));
	}

	// transferir na totalidade
	public void transferirCreditos(Cartao ori, Cartao des) {
		transferirCreditos(ori, des, ori.getCreditos());
	}

	public void consultarPremios() {
		System.out.println("Operação: Constultar Pêmios");
		System.out.println("=".repeat(20));
		System.out.println(categoria01);
		System.out.println(categoria02);
		System.out.println(categoria03);
		System.out.println("=".repeat(20));
	}

	public void resgatarPremio(Cartao ct, int nrCategoria) {
		CategoriaPremio apoio = null;
		switch (nrCategoria) {
		case 1:
			apoio = categoria01;
			break;
		case 2:
			apoio = categoria02;
			break;
		case 3:
			apoio = categoria03;
			break;
		default:
			System.out.println("Categria Inválida");
		}
		if(apoio !=null) {
			int qtdeNTicket = apoio.getQtdeTickets();
			if (ct.getTickets()>=qtdeNTicket && apoio.getSaldoPremio()>=1) {//posso trocar
				//debitando os tickets do cartao
				ct.setTickets(ct.getTickets()-qtdeNTicket);
				
				apoio.setSaldoPremio(apoio.getSaldoPremio()-1);
			}else {
				System.out.println("Sem saldo de " + "tickets ou premios!");
			}
			System.out.println("Prêmios: ");
			System.out.println(categoria01);
			System.out.println(categoria02);
			System.out.println(categoria03);
			System.out.println("Saldo cartão");
			System.out.println(ct);
		}//if da categoria
	}//fim do metodo
}//fim da classe
