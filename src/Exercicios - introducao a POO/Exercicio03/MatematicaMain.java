// Faça um programa que tenha uma função para calcular as quatro operações 
// básicas de 2 números

// package Exercicio03;

public class MatematicaMain {
    public static void main(String[] args) {

        Matematica calculo = new Matematica();

        calculo.setNumero1(10);
        calculo.setNumero2(20);

        System.out.println("Primeiro numero: " + calculo.getNumero1());
        System.out.println("Segundo numero: " + calculo.getNumero2());

        System.out.println("Resultado da soma: " + calculo.multiplica());
        System.out.println("Resultado da subtração: " + calculo.subtrai());
        System.out.println("Resultado da multiplicação: " + calculo.multiplica());
        System.out.println("Resultado da divisão: " + calculo.divide());
    }

}
