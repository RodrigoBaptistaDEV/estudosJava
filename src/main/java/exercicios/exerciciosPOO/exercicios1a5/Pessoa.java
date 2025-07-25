package main.java.exercicios.exerciciosPOO.exercicios1a5;

/*
1. Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
altura. Crie os methods públicos necessários para getters e setters e também um method para imprimir
todos dados de uma pessoa. Crie um method para calcular a idade da pessoa
*/

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private float altura;

    public Pessoa(String nome, String dataNascimento, float altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void imprimeDadosPessoa(){
        System.out.println("Dados de " + this.nome +
                "\n" + "Data de nascimento: " + this.dataNascimento +
                "\n" + "altura: " +this.altura);
    }

}
