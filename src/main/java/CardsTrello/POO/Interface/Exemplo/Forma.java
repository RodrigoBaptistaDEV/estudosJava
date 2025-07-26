package main.java.CardsTrello.POO.Interface.Exemplo;
/*
Uma interface em Java define um conjunto de methods que uma classe concreta deve implementar.
É uma forma de estabelecer um contrato, onde as classes que implementam a interface concordam
em fornecer implementações para os methods declarados na interface.
*/
interface Forma {
    // method para calcular a área
    double calcularArea();

    // method para calcular o perímetro
    double calcularPerimetro();
}
