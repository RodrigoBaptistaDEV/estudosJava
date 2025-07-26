package main.java.CardsTrello.POO.ClasseAbstrata.Exemplo;

public class Gato extends Animal{
    // Construtor da classe Gato
    public Gato(String nome) {
        super(nome);
    }

    // Implementação do method abstrato fazerSom
    @Override
    public void fazerSom() {
        System.out.println(getNome() + " faz: Miau!");
    }
}
