package br.senai.sp.bauru.gabriela.licao07.exemplos;

public class ContaBancaria {
	//fields estaticos 
	public static int ultNumero = 0;
	//fields
		private int agencia;
		private int banco;
		private int numeroConta;
		private double saldo;
		//constructor
		public ContaBancaria() {
			banco = 123;
			agencia = 1;
			numeroConta = 0;
			saldo = 50;
		}
		public ContaBancaria (int ba, int ag, int nc, double sal) {
			setBanco(ba);
			setAgencia(ag);
			setNumeroConta(nc);
			setSaldo(sal);
		}
		
		//metodos
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
