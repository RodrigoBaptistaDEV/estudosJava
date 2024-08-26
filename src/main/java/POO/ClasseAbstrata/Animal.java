package main.java.POO.ClasseAbstrata;

// Definindo a classe abstrata Animal

/*
As classes abstratas são utilizadas quando queremos criar uma classe que não pode ser instanciada
diretamente e que pode conter métodos abstratos (sem implementação) e métodos concretos (com implementação).
Classes que estendem uma classe abstrata devem implementar todos os métodos abstratos.
*/
// definimos a classe com a palavra 'abstract'
abstract class Animal {
    // Atributo comum a todos os animais
    private String nome;

    // Construtor da classe abstrata
    public Animal(String nome) {
        this.nome = nome;
    }

    // Método concreto: PODE ser utilizado diretamente pelas subclasses
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    // Método abstrato: DEVE ser implementado pelas subclasses
    public abstract void fazerSom();

    // Getter para o nome
    public String getNome() {
        return nome;
    }
}