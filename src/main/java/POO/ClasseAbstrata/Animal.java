package main.java.POO.ClasseAbstrata;

// Definindo a classe abstrata Animal

/*
As classes abstratas são utilizadas quando queremos criar uma classe que não pode ser instanciada
diretamente e que pode conter methods abstratos (sem implementação) e methods concretos (com implementação).
Classes que estendem uma classe abstrata devem implementar todos os methods abstratos.
*/
// definimos a classe com a palavra 'abstract'
abstract class Animal {
    // Atributo comum a todos os animais
    private String nome;

    // Construtor da classe abstrata
    public Animal(String nome) {
        this.nome = nome;
    }

    // method concreto: PODE ser utilizado diretamente pelas subclasses
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    // method abstrato: DEVE ser implementado pelas subclasses
    public abstract void fazerSom();

    // Getter para o nome
    public String getNome() {
        return nome;
    }
}