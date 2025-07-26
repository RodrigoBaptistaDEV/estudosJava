package main.java.CardsTrello.POO.ClasseAbstrata;

// =============================================================
// CLASSES ABSTRATAS EM JAVA - EXPLICAÇÃO E EXEMPLOS PRÁTICOS
// =============================================================

/*
 * DEFINIÇÃO
 *
 * Uma classe abstrata é uma classe que não pode ser instanciada diretamente.
 * Seu principal objetivo é servir como uma superclasse para outras classes.
 * Pode conter:
 * - methods concretos (com implementação)
 * - methods abstratos (sem implementação)
 *
 * Ela fornece uma estrutura comum para as subclasses e pode implementar comportamento compartilhado.
 */

abstract class Animal {

    // method concreto: tem implementação e pode ser reutilizado pelas subclasses
    public void respirar() {
        System.out.println("Respirando...");
    }

    // method abstrato: obriga subclasses a fornecerem uma implementação
    public abstract void fazerSom();
}

/*
 * CARACTERÍSTICAS DAS CLASSES ABSTRATAS
 *
 * - NÃO PODEM SER INSTANCIADAS:
 *     Ex: Animal a = new Animal(); // ERRO de compilação
 *
 * - PODEM TER methodS CONCRETOS E ABSTRATOS:
 *     methods concretos fornecem comportamento reutilizável.
 *     methods abstratos definem um contrato a ser seguido pelas subclasses.
 *
 * - PODEM TER ATRIBUTOS E CONSTRUTORES:
 *     Construtores são úteis para inicialização de atributos nas subclasses.
 */

class Cachorro extends Animal {

    // Implementação do method abstrato da superclasse
    @Override
    public void fazerSom() {
        System.out.println("Latido");
    }
}

class Gato extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }
}

/*
 * EXEMPLO DE USO: Instanciando e utilizando as subclasses
 */
public class TesteAbstrata {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.respirar();   // method herdado da classe abstrata
        cachorro.fazerSom();   // method implementado na subclasse

        Gato gato = new Gato();
        gato.respirar();       // herdado
        gato.fazerSom();       // method próprio da subclasse

        // Demonstração de polimorfismo:
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();
        a1.fazerSom(); // Latido
        a2.fazerSom(); // Miau
    }
}

/*
 * VANTAGENS DAS CLASSES ABSTRATAS
 *
 * 1. REUSO DE CÓDIGO:
 *    methods concretos evitam duplicação nas subclasses.
 *
 * 2. DESIGN ORIENTADO A OBJETOS:
 *    Permitem criar hierarquias claras e consistentes.
 *
 * 3. POLIMORFISMO:
 *    Podemos utilizar referências da classe abstrata para acessar qualquer subclasse.
 *    Ex: Animal a = new Cachorro();
 *
 * DIFERENÇA ENTRE CLASSES ABSTRATAS E INTERFACES:
 *
 * CLASSE ABSTRATA:
 * - Pode ter methods concretos e abstratos
 * - Pode ter atributos, construtores e methods estáticos
 * - Suporta herança simples: apenas uma superclasse por vez
 *
 * INTERFACE:
 * - Originalmente só methods abstratos (até Java 7)
 * - Desde Java 8: permite methods default e estáticos com corpo
 * - Não possui construtores nem atributos de instância (apenas constantes)
 * - Suporta múltiplas implementações (herança múltipla via interfaces)
 */

/*
 * CONCLUSÃO
 *
 * As classes abstratas são um recurso essencial para abstração e estruturação
 * de sistemas orientados a objetos. Elas permitem que você defina comportamentos
 * esperados em subclasses, sem abrir mão da reutilização de código.
 *
 * Saber usá-las corretamente facilita a manutenção, extensão e clareza dos sistemas Java.
 */

