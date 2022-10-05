package Exercicio07;

public class PessoaMain {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setIdade(20);
        pessoa.setPeso(80);
        pessoa.setAltura(1.80);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Envelhecer: " + pessoa.envelhercer());
        System.out.println("Engordar: " + pessoa.engordar());
        System.out.println("Emagrecer: " + pessoa.emagrecer());
        System.out.println("Crescer: " + pessoa.crescer());
    }
}
