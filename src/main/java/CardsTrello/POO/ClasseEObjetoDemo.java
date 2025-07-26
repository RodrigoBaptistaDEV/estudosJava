package main.java.CardsTrello.POO;

/*
 * CLASSES E OBJETOS EM JAVA
 *
 * Em programação orientada a objetos (POO), uma classe é a estrutura que define um tipo de dado
 * com atributos (características) e methods (comportamentos). Podemos pensar em uma classe
 * como um *molde* que será usado para criar objetos.
 *
 * Os objetos, por sua vez, são instâncias de uma classe — ou seja, são entidades reais criadas
 * a partir do molde definido pela classe. Cada objeto terá seus próprios valores de atributos,
 * mas compartilhará a estrutura e os methods definidos pela classe.
 *
 * As classes em Java são definidas usando a palavra-chave `class`, seguidas pelo nome da classe,
 * e possuem corpo delimitado por chaves `{}`. Dentro da classe definimos:
 *
 * - Atributos: variáveis que representam o estado ou características.
 * - methods: funções que representam ações ou comportamentos.
 *
 * EXEMPLO CONCEITUAL:
 * Imagine que queremos representar um "Carro". Podemos ter atributos como "cor", "modelo" e "ano",
 * e methods como "acelerar", "frear" e "buzinar".
 */

// Definição da classe Carro
class Carro {
    // Atributos (características do objeto)
    String modelo;
    String cor;
    int ano;

    // method (comportamento do objeto)
    void buzinar() {
        System.out.println("Biiiii!");
    }

    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
}

/*
 * Para criar um objeto a partir de uma classe, usamos o operador `new`. Isso aloca espaço na memória
 * e retorna uma referência ao novo objeto.
 *
 * Uma vez criado, podemos acessar os atributos e methods do objeto usando a notação ponto (`.`).
 *
 * Abaixo está um exemplo prático de como criar e usar objetos da classe Carro.
 */

public class ClasseEObjetoDemo {
    public static void main(String[] args) {
        // Criação de objeto (instância da classe Carro)
        Carro carro1 = new Carro();
        carro1.modelo = "Civic";
        carro1.cor = "Preto";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.modelo = "Corolla";
        carro2.cor = "Branco";
        carro2.ano = 2022;

        // Chamando methods dos objetos
        carro1.buzinar();
        carro1.exibirInformacoes();

        System.out.println();

        carro2.buzinar();
        carro2.exibirInformacoes();
    }
}

/*
 * RESULTADO ESPERADO:
 * Biiiii!
 * Modelo: Civic
 * Cor: Preto
 * Ano: 2020
 *
 * Biiiii!
 * Modelo: Corolla
 * Cor: Branco
 * Ano: 2022
 *
 * OBJETOS E INTERAÇÃO
 *
 * Objetos podem interagir entre si por meio de chamadas de methods. Isso permite que um objeto
 * altere seu estado interno ou o de outro objeto. Também é possível que objetos contenham outros
 * objetos como atributos, o que facilita a modelagem de estruturas mais complexas.
 *
 * CONCLUSÃO:
 * - Classe → define o tipo de dado, estrutura e comportamento.
 * - Objeto → é a instância concreta de uma classe.
 *
 * A programação orientada a objetos com Java é baseada na criação e interação de objetos
 * como forma de organizar e estruturar o código de maneira reutilizável, modular e clara.
 */
