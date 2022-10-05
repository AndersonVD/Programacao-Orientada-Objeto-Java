// O cardápio de uma lanchonete é o seguinte:
// Especificação Código Preço
// Cachorro Quente 100 R$ 1,20
// Bauru Simples 101 R$ 1,30
// Bauru com ovo 102 R$ 1,50
// Hambúrguer 103 R$ 1,20
// Cheeseburguer 104 R$ 1,30
// Refrigerante 105 R$ 1,00
// Faça um programa que leia o código dos itens pedidos e as quantidades 
// desejadas. Calcule e mostre o valor a ser pago por item (preço * quantidade)
// e o total geral do pedido. Considere que o cliente deve informar quando o 
// pedido deve ser encerrado.
// Entrada
// O arquivo de entrada contém vários casos de teste. Cada caso de teste é 
// composto por dois valores inteiros correspondentes ao código e à quantidade 
// de um item conforme tabela acima.
// Saída
// O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor 
// a ser pago, com 2 casas após o ponto decimal.
// Exemplo de Entrada	Exemplo de Saída
// 100 2
// 101 1
// 102 1
// 103 2
// 104 1
// 105 1
// 0 2
// Total: R$ 10.80
// 100 1
// 102 2
// 103 1
// 104 2
// 105 1
// 0 4
// Total: R$ 12.40

package Exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod, quant;
        double total = 0;
        while (true) {
            cod = sc.nextInt();
            quant = sc.nextInt();
            if (cod == 0) {
                break;
            }
            switch (cod) {
                case 100:
                    total += quant * 1.2;
                    break;
                case 101:
                    total += quant * 1.3;
                    break;
                case 102:
                    total += quant * 1.5;
                    break;
                case 103:
                    total += quant * 1.2;
                    break;
                case 104:
                    total += quant * 1.3;
                    break;
                case 105:
                    total += quant * 1;
                    break;
            }
        }
        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();
    }
}