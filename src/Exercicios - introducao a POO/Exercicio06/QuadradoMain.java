package Exercicio06;

public class QuadradoMain {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        int lado = 10;
        quadrado.setLado(lado);
        quadrado.getLado();
        quadrado.CalcArea();
        System.out.println("A área do quadrado é " + quadrado.CalcArea());
    }
}
