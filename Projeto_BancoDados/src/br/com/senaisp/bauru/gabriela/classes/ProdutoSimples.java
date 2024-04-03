package br.com.senaisp.bauru.gabriela.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoSimples {
	private int id;
	private String descricao;
	private int saldo;
	private double custo;
//usando o conector para BD
	private Connection conn;

//constructor
	public ProdutoSimples() throws SQLException {

		id = 0;
		saldo = 0;
		custo = 0;
//instanciando o DriverManager
		conn = DriverManager.getConnection("jdbc:sqlite:C:\\Javalibs\\dados\\NP24_JAVA2_B.DB");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) throws Exception {
		if (id < 0) {
			throw new Exception("O id nao pode ser negativo");
		}
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	//
	public static ProdutoSimples create(String des, int sal, double cus) throws SQLException {
		ProdutoSimples ret = new ProdutoSimples();
		ret.setDescricao(des);
		ret.setCusto(cus);
		ret.setSaldo(sal);
		// gravar no banco de dados
		// preparando o comando para o banco de dados
		PreparedStatement stm = ret.conn.prepareStatement("insert into produto (descricao, saldo, custo) values(?,?,?)",
				Statement.RETURN_GENERATED_KEYS);
		// os parametros começam com 1 e nao com 0
		stm.setString(1, des);
		stm.setInt(2, sal);
		stm.setDouble(3, cus);
		// executando o comando de inserção
		int linhas = stm.executeUpdate();
		System.out.println("Adicionei " + linhas + " no banco!");
		ResultSet rs = stm.getGeneratedKeys();
		rs.next();
		try {
			ret.setId(rs.getInt(1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//
		return ret;
	}
}
