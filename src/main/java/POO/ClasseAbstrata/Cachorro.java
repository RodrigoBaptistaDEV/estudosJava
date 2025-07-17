package main.java.POO.ClasseAbstrata;

public class Cachorro extends Animal {
    // Construtor da classe Cachorro
    public Cachorro(String nome) {
        super(nome);
        // herdando a classe abstrata animal devemos cumprir seu construtor também.
    }

    // Implementação obrigatória do method abstrato fazerSom
    @Override
    public void fazerSom() {
        System.out.println(getNome() + " faz: Au Au!");
    }
}
