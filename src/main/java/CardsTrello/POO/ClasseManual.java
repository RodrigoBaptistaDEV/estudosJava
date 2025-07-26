package main.java.CardsTrello.POO;

/**
 * Manual: Classe - Componentes Essenciais e Nomenclatura
 * Linguagem: Java
 * Estilo: Estudo orientado com explicações comentadas e exemplos de código descomentados
 */

public class ClasseManual {

    /*
     * =========================================================
     * O QUE É UMA CLASSE?
     * ---------------------------------------------------------
     * Uma classe é a definição de um tipo de objeto. Ela serve
     * como um molde (template) a partir do qual objetos são criados.
     *
     * Componentes básicos de uma classe:
     * - Nome (segue convenção PascalCase em Java)
     * - Atributos (estado)
     * - methods (comportamento)
     * - Construtores (opcional)
     * - Modificadores de acesso (public, private, etc.)
     *
     * Exemplo de uma classe simples:
     */

    class Pessoa {
        // Atributos (estado)
        String nome;
        int idade;

        // Construtor
        Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        // method (comportamento)
        void apresentar() {
            System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
        }
    }

    /*
     * =========================================================
     * ATRIBUTOS
     * ---------------------------------------------------------
     * Atributos são variáveis de instância de uma classe.
     * Representam o estado de um objeto. São definidos com tipos
     * primitivos ou objetos e podem ter diferentes modificadores
     * de acesso.
     *
     * Exemplo:
     */

    class Carro {
        String marca;
        String modelo;
        int ano;
        String cor;
        int velocidadeAtual;

        void acelerar(int incremento) {
            velocidadeAtual += incremento;
        }
    }

    /*
     * =========================================================
     * PROPRIEDADES
     * ---------------------------------------------------------
     * Em Java, propriedades são comumente implementadas por meio
     * de methods getters e setters. Isso permite encapsulamento.
     *
     * Atributo: campo interno da classe.
     * Propriedade: acesso controlado ao atributo.
     *
     * Exemplo:
     */

    class Produto {
        private String nome;
        private double preco;

        // Getter (propriedade de leitura)
        public String getNome() {
            return nome;
        }

        // Setter (propriedade de escrita)
        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            if (preco > 0) {
                this.preco = preco;
            }
        }
    }

    /*
     * =========================================================
     * method
     * ---------------------------------------------------------
     * method é uma função que está associada a uma classe.
     * Descreve um comportamento ou ação. Pode receber parâmetros
     * e retornar valores. Pode também ser void (sem retorno).
     *
     * Exemplo:
     */

    class Calculadora {
        // method que retorna a soma de dois inteiros
        int somar(int a, int b) {
            return a + b;
        }

        // method void (sem retorno)
        void imprimirResultado(int resultado) {
            System.out.println("Resultado: " + resultado);
        }
    }

    /*
     * =========================================================
     * FUNÇÃO vs method
     * ---------------------------------------------------------
     * Em Java, usamos o termo "method", pois funções sempre estão
     * dentro de classes. Em linguagens como Python ou C, funções
     * podem existir fora de classes.
     *
     * Exemplo:
     * - method em Java: sempre definido dentro de uma classe.
     */

    // Em Java, mesmo o "main" é um method:
    public static void main(String[] args) {
        Pessoa p = new ClasseManual().new Pessoa("João", 30);
        p.apresentar();

        Carro c = new ClasseManual().new Carro();
        c.marca = "Toyota";
        c.modelo = "Corolla";
        c.ano = 2021;
        c.cor = "Prata";
        c.velocidadeAtual = 0;
        c.acelerar(20);
        System.out.println("Velocidade atual do carro: " + c.velocidadeAtual + " km/h");

        Produto produto = new ClasseManual().new Produto();
        produto.setNome("Camiseta");
        produto.setPreco(59.90);
        System.out.println("Produto: " + produto.getNome() + " - R$" + produto.getPreco());

        Calculadora calc = new ClasseManual().new Calculadora();
        int resultado = calc.somar(10, 5);
        calc.imprimirResultado(resultado);
    }

    /*
     * =========================================================
     * DEFINIÇÕES COMPLEMENTARES
     * ---------------------------------------------------------
     * - Parâmetros: variáveis que o method espera receber
     * - Argumentos: valores reais passados na chamada do method
     *
     * Exemplo:
     * public int somar(int a, int b)  --> a e b são parâmetros
     * calc.somar(10, 5)              --> 10 e 5 são argumentos
     */

}

