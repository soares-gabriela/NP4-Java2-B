package br.com.senaisp.bauru.gabriela.secao04;

public class ConversaoTipos01 {

	public static void main(String[] args) {
int num1 = 55_555;
int num2= 66_666;
long num3;
num3 = 1L * num1 * num2;//aqui estamos forçando a variavel converter para numero lL (long)
System.out.println(num3);
System.out.println(Integer.MAX_VALUE);//MASX_VALUE: LIMITE DO INTEIRO
	}

}
