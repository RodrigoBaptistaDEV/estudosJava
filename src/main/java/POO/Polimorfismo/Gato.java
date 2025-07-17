package main.java.POO.Polimorfismo;

// Classe filha Gato que sobrescreve o method fazerSom
class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Gato faz: Miau!");
    }
}