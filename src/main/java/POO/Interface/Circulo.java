package main.java.POO.Interface;

// Implementação da interface para um círculo
public class Circulo implements Forma{
    private double raio;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Implementação do method para calcular a área do círculo
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    // Implementação do method para calcular o perímetro do círculo
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
