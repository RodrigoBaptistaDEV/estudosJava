package main.java.POO.Construtor;

/*
   Um construtor em Java é um method especial que é chamado automaticamente quando um objeto de uma classe é instanciado.
   Ele é usado para inicializar os objetos.
   É um method sem retorno que tem o mesmo nome da classe.

   Vamos abordar os seguintes pontos:

   1. Construtor padrão: um construtor padrão é aquele que não aceita nenhum argumento.
   Esse construtor é feito automaticamente de forma implicita na criação do objeto caso não exista nenhum em código.
   2. Múltiplos construtores: uma classe pode ter vários construtores com diferentes parâmetros.
   3. Uso da palavra-chave 'this' no construtor: 'this' é uma referência ao próprio objeto e é usada para distinguir entre os parâmetros do construtor e as variáveis de instância da classe.
*/
// classe
public class Celular {
    // Variáveis de instância
    private String marca;
    private String modelo;
    private int ano;

    // Construtor padrão,
    // mesmo sem declarar ele, será chamado implicitamente para inicializar os atributos do objeto.
    public Celular() {
    }

    // pode conter definições
    /*
        public Celular() {
        marca = "Indefinido";
        modelo = "Indefinido";
        ano = 0;
    }
    */

    // Construtor com parâmetros
    public Celular(String marca, String modelo, int ano) {
        // Usando 'this' para referenciar as variáveis de instância
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Encapsulamento:
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // method para imprimir os detalhes do carro
    public void imprimirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    // method main para testar a classe Carro
    public static void main(String[] args) {
        // instanciando objetos a partir da classe 'Carro'

        // Usando o construtor padrão
        Celular celular1 = new Celular();
        System.out.println("Celular 1:");
        celular1.imprimirDetalhes();

        // Usando o construtor com parâmetros
        Celular celular2 = new Celular("Samsung", "Motorola", 2022);
        System.out.println("\nCelular 2:");
        celular2.imprimirDetalhes();
    }
}

