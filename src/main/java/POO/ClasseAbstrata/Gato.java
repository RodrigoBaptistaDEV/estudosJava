package main.java.POO.ClasseAbstrata;

public class Gato extends Animal{
    // Construtor da classe Gato
    public Gato(String nome) {
        super(nome);
    }

    // Implementação do método abstrato fazerSom
    @Override
    public void fazerSom() {
        System.out.println(getNome() + " faz: Miau!");
    }
}