package br.com.senaisp.bauru.gabriela.secao03;

public class Variables03 {

    public static void main(String[] args) {
        
        boolean bool = true;
        //booleano sempre é true ou false
        
        int intVar1 = 1;
        int intVar2 = 2;
        int intVar3 = 3;
    
        double doubleVar1, doubleVar2, doubleVar3, doubleVar4;
        doubleVar1 = 1.1;
        doubleVar2 = 2.1;
        doubleVar3 = 3.1;
        doubleVar4 = 4.1;
        
    
        String stringVar1 = "1";
        String stringVar2 = "2";

        //Don't edit these print statements
        System.out.println("bool = "        +bool);
        System.out.println("intVar1 = "     +intVar1);
        System.out.println("intVar2 = "     +intVar2);
        System.out.println("intVar3 = "     +intVar3);
        System.out.println("doubleVar1 = "  +doubleVar1);
        System.out.println("doubleVar2 = "  +doubleVar2);
        System.out.println("doubleVar3 = "  +doubleVar3);
        System.out.println("doubleVar4 = "  +doubleVar4);
        System.out.println("stringVar1 = "  +(stringVar1 +1));
        System.out.println("stringVar2 = "  +(stringVar2 +2));
      //aqui ao invés de somar 1+1, vai concatenar o 1 com o 1 (1&1)
      //trata-se de uma operação matematica com uma variavel String
      // nao existe forma de calcular string e int
    }
}
