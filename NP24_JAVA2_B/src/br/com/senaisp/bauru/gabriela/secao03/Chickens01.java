package br.com.senaisp.bauru.gabriela.secao03;

public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here ->     C E N Á R I O   1
		//int eggsPerChicken = 5, chickenCount = 3, totalEggs = 0; 
        //Put yout code here ->     C E N Á R I O   2
    	int eggsPerChicken = 4, chickenCount = 8, totalEggs = 0; 
		// Na segunda-feira Mr. Brown recolhe os ovos
		totalEggs += eggsPerChicken * chickenCount++;
		// Na terça-feira Mr. Brown ganha 1 galinha pela manhã
		// chickenCount++; // no caso, para poupar linha de codigo, podemos
		// fazer a adição na lkinha 8, se adicionarmos o ++ no final da variavel, a
		// soma será PÓS operação.
		totalEggs += eggsPerChicken * chickenCount;
		// Na quarta-feira pela manhã, um animal come metade das galinhas
		chickenCount /= 2;
		totalEggs += eggsPerChicken * chickenCount;
		System.out.println(totalEggs);
	}
}
