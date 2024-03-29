package br.com.senaisp.bauru.gabriela.licao07.exemplos;

public class ContaBancaria {
	//Fields estaticos
		private static int ultNumero = 0;
		//Fields
		private int agencia;
		private int banco;
		private int numeroConta;
		private double saldo;
		//Constructor
		public ContaBancaria() {
			banco = 123;
			agencia = 1;
			numeroConta = ++ultNumero;
			saldo = 50;
		}
		public ContaBancaria(int ba, int ag, int nc, double sal) {
			setBanco(ba);
			setAgencia(ag);
			setNumeroConta(nc);
			setSaldo(sal);
		}
		//Métodos
		public int getAgencia() {
			return agencia;
		}
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		public int getBanco() {
			return banco;
		}
		public void setBanco(int banco) {
			this.banco = banco;
		}
		public int getNumeroConta() {
			return numeroConta;
		}
		public void setNumeroConta(int numeroConta) {
			this.numeroConta = numeroConta;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

}
