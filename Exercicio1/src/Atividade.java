import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int LIN = 4;
        int COL = 4;
        int maior = 0;
        int menor = 0;
        int soma = 0;

        int[][] alunos = new int[LIN][COL];

        for (int x = 0; x < LIN; x++) {
            System.out.println();
            for (int col = 0; col < COL; col++)
                System.out.print()
            soma = soma + alunos[x];
            if (x == 0) {
                maior = alunos[x];
                menor = alunos[x];
            } else {
                if (alunos[x] > maior) {
                    maior = alunos[x];
                }
                if (alunos[x] < menor) {
                    menor = alunos[x];
                }
            }
        }
        System.out.println("O menor aluno tem " + menor + "= ");
        System.out.println("O maior aluno tem " + maior + "= ");

        entrada.close();
    }
}
