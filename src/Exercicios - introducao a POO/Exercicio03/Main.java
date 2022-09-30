// Faça um programa que tenha uma função para calcular as quatro operações 
// básicas de 2 números

package Exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        Scanner entrada = new Scanner(System.in);
        // System.out.println("Digite a o peração: ");

        System.out.println("Digite o número para a o peração: ");
        numero1 = entrada.nextInt();
        System.out.println("Agora digite o segundo número: ");
        numero2 = entrada.nextInt();
        System.out.println("Resultado da soma: " + soma(numero1, numero2));
        System.out.println("Resultado da subtração: " + subtrai(numero1, numero2));
        System.out.println("Resultado da divisão: " + divide(numero1, numero2));
        System.out.println("Resultado da multiplicação: " + multiplica(numero1, numero2));
        entrada.close();
    }

    public static int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int subtrai(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplica(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static int divide(int numero1, int numero2) {
        return numero1 / numero2;
    }
}
