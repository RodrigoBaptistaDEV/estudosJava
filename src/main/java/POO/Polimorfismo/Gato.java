package main.java.POO.Polimorfismo;

// Classe filha Gato que sobrescreve o método fazerSom
class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Gato faz: Miau!");
    }
}