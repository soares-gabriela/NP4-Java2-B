package br.com.senaisp.bauru.gabriela.licao05.exercicio;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Digite o valor da cor em nm:");
double nmCor = sc.nextDouble();
String cor = "Não é uma cor visível no espectro";
if (nmCor>=380 && nmCor<450) {
	cor = "A cor é Violeta";
}else if (nmCor>=450 && nmCor<495) {
	cor = "A cor é Azul";
}else if (nmCor>=495 && nmCor<570) {
	cor = "A cor é Verde";	
}else if (nmCor>=570 && nmCor<590) {
	cor = "A cor é Amarelo";	
}else if (nmCor>=590 && nmCor<620) {
	cor = "A cor é Laranja";	
}else if (nmCor>=620 && nmCor<750) {
	cor = "A cor é Vermelho";	
}
System.out.println(cor);
}
}
