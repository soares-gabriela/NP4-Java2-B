package br.com.senaisp.bauru.gabriela.licao07.exemplos;

public class TesteJogo {

	public static void main(String[] args) {
		Cartao ct01 = new Cartao();
		System.out.println(ct01);
		Cartao ct02 = new Cartao();
		System.out.println(ct02);
//instanciando terminal
		Terminal tm = new Terminal();
//carregando saldo para os cartoes 
		tm.carregarCartao(ct01, 50);
		tm.carregarCartao(ct02, 100);
//criando duas maquinas
		MaquinaFliperama m1 = new MaquinaFliperama("MK1");
		MaquinaFliperama m2 = new MaquinaFliperama("LoL");
//usar as maquinas
		System.out.println("Jogando.... ⌛ \n\n\n");
		m1.lerCartão(ct01);
		m2.lerCartão(ct02);
		System.out.println("Segunda rodada de jogos.... ⌛ \n\n\n");
		m1.lerCartão(ct02);
		m2.lerCartão(ct01);
		System.out.println("Transferindo o saldo do cartão 1 para o 2.... ⌛ \n\n\n");
		tm.transferirCreditos(ct01, ct02);
		System.out.println("Tentar jogar com o cartão 1.... ⌛ \n\n");
		m1.lerCartão(ct01);
		System.out.println("Transferir um pouco para o cartão 1.... ⌛ \n\n");
		tm.transferirCreditos(ct02, ct01, 10);
		System.out.println("Consultar saldo de prêmios.... ⌛ \n\n\n");
		tm.consultarPremios();
		System.out.println("Resgatando um dos prêmios.... ⌛");
		tm.resgatarPremio(ct01, 1);
//criando uma maquina 
//MaquinaFliperama m1 = new MaquinaFliperama ("MK1");
//m1.lerCartão(ct01);

	}

}
