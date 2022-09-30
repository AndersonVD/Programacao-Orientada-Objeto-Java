package Excercicio01;
// Faça um programa que peça ao usuário nome e sobrenome separadamente

// e após junte-os com a mensagem “Seu nome completo é: Nome
// SobreNome”;

public class Pessoa {

    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        setNome(nome);
        setSobrenome(sobrenome);
    }

    public void setNome(String nome) {
        if (nome.length() > 0)
            ;
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        if (sobrenome.length() > 0)
            ;
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String nomeCompleto() {
        return nome + " " + sobrenome;
    }
}
