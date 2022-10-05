// Crie uma classe que modele uma pessoa:
// Atributos: nome, idade, peso e altura
// Métodos: Envelhercer, engordar, emagrecer, crescer.
// Obs: Por padrão a cada ano que nossa pessoa envelhece e se a idade dela 
// for menor que 21 anos ela deve crescer 0,5 cm por ano.

package Exercicio07;

public class Pessoa {

    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public int envelhercer() {
        if (idade < 21) {
            altura += 0.5;
        }
        return idade++;
    }

    public int engordar() {
        return (int) (peso += 1);
    }

    public int emagrecer() {
        return (int) (peso -= 1);
    }

    public int crescer() {
        return (int) (altura += 0.5);
    }
}
