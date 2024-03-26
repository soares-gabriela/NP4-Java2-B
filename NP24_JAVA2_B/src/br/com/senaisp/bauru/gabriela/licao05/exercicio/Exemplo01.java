package br.com.senaisp.bauru.gabriela.licao05.exercicio;

public class Exemplo01 {

	public static void main(String[] args) {
int idade = 15;
boolean bPoderDirigir = (idade >= 18|| idade <= 65);//ou
						//idade >=18 && idade <= 65
System.out.println("Você " + bPoderDirigir + " dirigir");
	}

}
