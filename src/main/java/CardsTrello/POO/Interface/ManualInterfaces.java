package main.java.CardsTrello.POO.Interface;

// ManualInterfaces.java
// Manual completo sobre interfaces em Java

// ==============================
// DEFINIÇÃO E PROPÓSITO
// ==============================

// Uma interface em Java é um tipo de referência semelhante a uma classe,
// mas serve para declarar methods abstratos (sem implementação) e constantes.
// Desde o Java 8, interfaces podem conter methods default (com implementação) e methods estáticos.
// Interfaces são usadas para abstração e para permitir herança múltipla (múltiplas interfaces).

interface Animal {
    // Tods os methods são implicitamente public e abstract
    void emitirSom();

    // Constantes são public static final por padrão
    int NUMERO_DE_OLHOS = 2;

    // method default (Java 8+)
    default void dormir() {
        System.out.println("Dormindo como um animal...");
    }

    // method estático (Java 8+)
    static void respirar() {
        System.out.println("Respirando...");
    }
}

// ==============================
// IMPLEMENTAÇÃO DE INTERFACES
// ==============================

// Uma classe deve implementar todos os methods da interface, a menos que seja abstrata.

class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Latido: Au Au!");
    }

    // Pode usar method default sem sobrescrever
    // Pode sobrescrever se quiser, como abaixo:
    @Override
    public void dormir() {
        System.out.println("Cachorro dormindo enrolado...");
    }
}

// Herança de múltiplas interfaces

interface Corredor {
    void correr();
}

interface Nadador {
    void nadar();
}

class Atleta implements Corredor, Nadador {
    @Override
    public void correr() {
        System.out.println("Correndo 10km...");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando 1km...");
    }
}

// ==============================
// BENEFÍCIOS DAS INTERFACES
// ==============================

// - Abstração: oculta implementação, mostrando apenas o que deve ser feito
// - Herança múltipla: Java não permite herança múltipla entre classes, mas permite entre interfaces
// - Polimorfismo: podemos tratar objetos diferentes por meio de uma interface comum

public class ManualInterfaces {
    public static void main(String[] args) {
        // Usando interface com polimorfismo
        Animal meuAnimal = new Cachorro();
        meuAnimal.emitirSom();
        meuAnimal.dormir();

        // Acessando method estático diretamente da interface
        Animal.respirar();

        // Herança múltipla via interfaces
        Atleta atleta = new Atleta();
        atleta.correr();
        atleta.nadar();

        // Acesso à constante da interface
        System.out.println("Número de olhos (interface): " + Animal.NUMERO_DE_OLHOS);
    }
}

// ==============================
// RESTRIÇÕES E CONSIDERAÇÕES
// ==============================

// - Uma classe que implementa uma interface deve obrigatoriamente implementar todos os seus methods (exceto se for abstrata)
// - Interfaces não herdam implementações, apenas assinaturas de methods
// - Interfaces podem estender outras interfaces, combinando múltiplos contratos

interface SerVivo {
    void alimentar();
}

interface Mamifero extends SerVivo {
    void amamentar();
}

class Gato implements Mamifero {
    @Override
    public void alimentar() {
        System.out.println("Gato comendo ração.");
    }

    @Override
    public void amamentar() {
        System.out.println("Gato amamentando filhotes.");
    }
}
