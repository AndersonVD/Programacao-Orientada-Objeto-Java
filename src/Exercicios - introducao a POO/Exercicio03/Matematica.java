package Exercicio03;

public class Matematica {
    int numero1;
    int numero2;

    public void setNumero1(int numero1) {
        if (numero1 == (int) numero1)
            this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        if (numero2 == (int) numero2)
            this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public int soma() {
        return (numero1 + numero2);
    }

    public int subtrai() {
        return (numero1 - numero2);
    }

    public int multiplica() {
        return (numero1 * numero2);
    }

    public int divide() {
        return (numero1 / numero2);
    }
}