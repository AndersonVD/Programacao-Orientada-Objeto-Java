package Exercicio02;

public class NumberMain {
    public static void main(String[] args) {
        Number numero = new Number();
        numero.setNumero1(5);
        numero.setNumero2(10);

        System.out.println("Primeiro numero: " + numero.getNumero1());
        System.out.println("Segundo numero: " + numero.getNumero2());

        System.out.println(numero.verificaIntervalo(50, 100));

    }
}
