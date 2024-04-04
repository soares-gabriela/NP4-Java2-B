package br.com.senaisp.bauru.gabriela.testers;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.senaisp.bauru.gabriela.classes.ProdutoSimples;

public class TesteProdutoSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.println("Menu");
			System.out.println("1 - Criar Produto");
			System.out.println("2 - Consultar Produto");
			System.out.println("3 - Alterar Produto");
			System.out.println("4 - Excluir Produto");
			System.out.println("9 - Fim");
			op = sc.nextInt();
			switch (op) {
			case 1 -> criarProduto(sc);
			case 2 -> consultarProduto(sc);
			case 3 -> alterarProduto(sc);
			case 4 -> excluirProduto(sc);
			case 9 -> System.out.println("Bye!");
			default -> System.out.println("Opção inválida!");
			}
		} while (op != 9);
	}

	private static void excluirProduto(Scanner sc) {
	}

	private static void alterarProduto(Scanner sc) {
	}

	private static void consultarProduto(Scanner sc) {
		sc.nextLine();
		System.out.println("Consulta de produtos");
		System.out.println("Digite o código do produto a pesquisar: ");
		int cod = sc.nextInt();
		try {
			ProdutoSimples prd = ProdutoSimples.findByPK(cod);
			// mostrando o produto
			System.out.println(prd);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
//pausa para voltar para o menu
		System.out.println("Digite para voltar ao menu");
		sc.nextLine();// captura o ultimo enter numerico
		sc.nextLine();// pausa para voltar
	}

	private static void criarProduto(Scanner sc) {
		System.out.println("Cadastramento de produto");
		System.out.println("Digite a descrição do produto:");
		String des = sc.nextLine();
		System.out.println("Digite o saldo do produto:");
		int sal = sc.nextInt();
		System.out.println("Digite o custo do produto:");
		double cus = sc.nextDouble();
		try {
			// criando oproduto
			ProdutoSimples prd = ProdutoSimples.create(des, sal, cus);
			// mostrando o produto
			System.out.println(prd);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		// pausa para voltar ao menu
		System.out.println("Digite enter para voltar ao menu");
	}
}