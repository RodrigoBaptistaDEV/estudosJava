package main.java.CardsTrello.POO.Polimorfismo;

/**
 * ManualPolimorfismo.java
 *
 * Este arquivo é um guia completo sobre Polimorfismo em Java,
 * incluindo explicações teóricas detalhadas nos comentários e 
 * exemplos de código prontos para execução.
 *
 * Polimorfismo é um dos quatro pilares da Programação Orientada a Objetos (POO),
 * junto com encapsulamento, herança e abstração.
 *
 * O termo significa “muitas formas” e se refere à capacidade de uma variável, função
 * ou objeto assumir múltiplas formas, geralmente relacionadas por herança ou interface.
 */

///////////////////////////////
// Polimorfismo em Variáveis //
///////////////////////////////

/**
 * Uma variável de referência de um tipo genérico (como uma superclasse ou interface)
 * pode apontar para objetos de classes mais específicas (subclasses).
 *
 * A chamada de method é resolvida em tempo de execução com base na classe real 
 * do objeto referenciado.
 */

class Animal {
    public void fazerSom() {
        System.out.println("Animal faz um som");
    }
}

class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Gato faz: Miau!");
    }
}

class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Cachorro faz: Au Au!");
    }
}

public class ManualPolimorfismo {
    public static void main(String[] args) {

        // Polimorfismo com variáveis de instância
        Animal meuAnimal;

        meuAnimal = new Gato();
        meuAnimal.fazerSom(); // Saída: Gato faz: Miau!

        meuAnimal = new Cachorro();
        meuAnimal.fazerSom(); // Saída: Cachorro faz: Au Au!

        ////////////////////////////////
        // Polimorfismo em methods   //
        ////////////////////////////////

        // Polimorfismo Estático (Sobrecarga)
        Calculadora calc = new Calculadora();
        System.out.println(calc.soma(2, 3));           // Saída: 5
        System.out.println(calc.soma(2.5, 3.5));       // Saída: 6.0
        System.out.println(calc.soma(1, 2, 3));        // Saída: 6

        ////////////////////////////////
        // Polimorfismo Dinâmico     //
        ////////////////////////////////

        Animal a1 = new Gato();
        Animal a2 = new Cachorro();
        a1.fazerSom();  // Saída: Gato faz: Miau!
        a2.fazerSom();  // Saída: Cachorro faz: Au Au!

        // Polimorfismo com method genérico
        animalSound(a1); // Saída: Gato faz: Miau!
        animalSound(a2); // Saída: Cachorro faz: Au Au!
    }

    // method genérico utilizando polimorfismo de objeto
    public static void animalSound(Animal animal) {
        animal.fazerSom();
    }
}

////////////////////////////////////
// Classe para Polimorfismo Estático
////////////////////////////////////

/**
 * A classe Calculadora demonstra a sobrecarga de methods:
 * methods com o mesmo nome mas com assinaturas diferentes.
 * Isso é resolvido em tempo de compilação (polimorfismo estático).
 */
class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    public double soma(double a, double b) {
        return a + b;
    }

    public int soma(int a, int b, int c) {
        return a + b + c;
    }
}

/**
 * Resumo:
 *
 * Polimorfismo em Variáveis:
 * - Uma variável de uma superclasse pode referenciar objetos de subclasses diferentes.
 *
 * Polimorfismo em methods:
 * - Sobrecarga (estático): diferentes assinaturas de methods com mesmo nome.
 * - Sobrescrita (dinâmico): subclasses fornecem implementação específica para methods herdados.
 *
 * Polimorfismo em Objetos:
 * - Permite que objetos de subclasses sejam tratados como objetos da superclasse.
 * - A resolução de methods ocorre em tempo de execução.
 *
 * Relação entre Polimorfismo Dinâmico e Polimorfismo de Objeto:
 * - O polimorfismo dinâmico é a técnica (sobrescrita) que permite o polimorfismo de objeto,
 *   que é a capacidade de tratar múltiplos objetos de subclasses por uma referência comum.
 */

