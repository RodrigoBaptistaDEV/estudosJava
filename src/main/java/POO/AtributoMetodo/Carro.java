package main.java.POO.AtributoMetodo;

// ATRIBUTOS E methodS
public class Carro {
    // Atributos da classe Carro
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double velocidadeAtual;

    // Construtor da classe Carro
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeAtual = 0; // Inicialmente o carro está parado
    }

    // method para acelerar o carro
    public void acelerar(double velocidade) {
        this.velocidadeAtual += velocidade;
    }

    // method para frear o carro
    public void frear(double velocidade) {
        this.velocidadeAtual -= velocidade;
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0; // Garante que a velocidade não seja negativa
        }
    }

    // method para exibir o estado atual do carro
    public void exibirEstado() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + " km/h");
    }

    // method principal

    /*
    Neste exemplo, a classe Carro possui os atributos marca, modelo, ano, cor e velocidadeAtual.
    Durante a execução do programa, esses atributos podem mudar de valor, refletindo diferentes estados do objeto Carro.
    Por exemplo, ao chamar os methods acelerar() e frear(), o valor do atributo velocidadeAtual é alterado,
    demonstrando assim o estado dinâmico do objeto ao longo da execução.
    O method exibirEstado() mostra o estado atual do carro, exibindo os valores de todos os atributos.
    */


    public static void main(String[] args) {
        // Criando um objeto carro

        // Classe nomeObjeto = new ConstrutorClasse(argumentos);
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, "Prata");

        // Exibindo o estado inicial do carro
        System.out.println("Estado inicial do carro:");
        meuCarro.exibirEstado();

        // Acelerando o carro
        meuCarro.acelerar(50);
        System.out.println("\nCarro acelerando...");
        meuCarro.exibirEstado();

        // Freando o carro
        meuCarro.frear(20);
        System.out.println("\nCarro freando...");
        meuCarro.exibirEstado();
    }
}

