// Crie uma classe que modele um quadrado:
// Atributos: Tamanho do lado
// Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área;

package Exercicio06;

public class Quadrado {

    private int lado;

    public void setLado(int lado) {
        if (lado == (int) lado) {
            this.lado = lado;
        }
    }

    public int getLado() {
        return lado;
    }

    public int CalcArea() {
        return lado * lado;
    }
}