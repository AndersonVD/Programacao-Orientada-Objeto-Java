// Faça um programa que mostre os números que constam no intervalo entre
// dois números que serão informados, se o usuário entrar com os valores em
// ordem inversa o programa deve fazer dar um aviso ao usuário que irá fazer
// a inversão.

public class Ex2Number {

    private int numero1;
    private int numero2;

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public String verificaIntervalo(int numero1, int numero2) {
        if (numero1 > numero2) {
            return "Por favor inserir um valor inverso";
        } else {
            int result = 0;
            for (int i = numero1; i < numero2; i++) {
                result = i;
            }
            // String intervalo = String.valueOf(result);
            return "O intervalo definido é: " + String.valueOf(result);
        }
    }

}
