// Faça um Programa que pergunte quanto você ganha por hora e o número de
// horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
// mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8%
// para o INSS e 5% para o sindicato, faça um programa que nos dê:
// - Salário bruto.
// - Quanto pagou ao INSS.
// - Quanto pagou ao sindicato.
// - O salário líquido.
// Calcule os descontos e o salário líquido, conforme a tabela abaixo:
// + Salário Bruto : R$
// - IR (11%) : R$
// - INSS (8%) : R$
// - Sindicato ( 5%) : R$
// = Salário Liquido : R$
// Obs.: Salário Bruto - Descontos = Salário Líquido
// Utilize métodos para calcular cada um dos descontos, o total de descontos e
// o salário líquido.

package Exercicio04;

import java.util.Scanner;

public class FolhaMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Folha folha = new Folha();

        System.out.println("Quanto você ganha por hora?");
        folha.setSalario(scan.nextDouble());

        System.out.println("Quantas horas você trabalhou no mês?");
        folha.setHoras(scan.nextInt());

        System.out.println("Salário bruto: R$" + folha.getSalarioBruto());
        System.out.println("IR: R$" + folha.getDescIr());
        System.out.println("INSS: R$" + folha.getDescInss());
        System.out.println("Sindicato: R$" + folha.getDescSindicato());
        System.out.println("Salário líquido: R$" + folha.getSalarioLiquido());
        scan.close();
    }
}
