package br.com.senaisp.bauru.gabriela.testers;

import java.sql.SQLException;

import br.com.senaisp.bauru.gabriela.classes.ProdutoSimples;

public class TesteProdutoSimples {

	public static void main(String[] args) {
/*ProdutoSimples prd = new ProdutoSimples();
try {
prd.setId(10);
}catch (Exception e) {
	System.out.println(e.getMessage());
}
System.out.println(prd.getId());
*/
		try {
		ProdutoSimples prd = ProdutoSimples.create("Lápis", 20, 1.20);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}

}
