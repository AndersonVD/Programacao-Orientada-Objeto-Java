public class Ex2NumberMain {
    public static void main(String[] args) {
        Ex2Number numero = new Ex2Number();
        numero.setNumero1(5);
        numero.setNumero2(10);

        System.out.println("Primeiro numero: " + numero.getNumero1());
        System.out.println("Segundo numero: " + numero.getNumero2());

        System.out.println(numero.verificaIntervalo(50, 100));

    }
}
