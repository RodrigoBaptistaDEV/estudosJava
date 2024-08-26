package main.java.POO.Interface;
/*
Uma interface em Java define um conjunto de métodos que uma classe concreta deve implementar.
É uma forma de estabelecer um contrato, onde as classes que implementam a interface concordam
em fornecer implementações para os métodos declarados na interface.
*/
interface Forma {
    // Método para calcular a área
    double calcularArea();

    // Método para calcular o perímetro
    double calcularPerimetro();
}
