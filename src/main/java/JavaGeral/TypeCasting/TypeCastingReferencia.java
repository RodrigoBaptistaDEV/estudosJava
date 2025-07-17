package main.java.JavaGeral.TypeCasting;

// ================================================
// TYPE CASTING ENTRE TIPOS DE REFERÊNCIA (OBJETOS)
// ================================================

/*
 * O casting entre tipos de referência permite converter objetos entre superclasses e subclasses,
 * ou entre interfaces e suas implementações, desde que estejam na mesma hierarquia.
 *
 * Isso é fundamental para aproveitar o polimorfismo e a reutilização de código em Java.
 *
 * Existem dois tipos principais:
 *
 * 1. UPCASTING (CASTING IMPLÍCITO):
 *    - Converte uma subclasse para sua superclasse.
 *    - Seguro e automático, não requer cast explícito.
 *    - É comum em contextos de polimorfismo.
 *
 *      Exemplo:
 *          Animal animal = new Cachorro(); // OK
 *
 * 2. DOWNCASTING (CASTING EXPLÍCITO):
 *    - Converte uma referência de superclasse para uma subclasse.
 *    - Requer um cast explícito: (Subclasse) objeto
 *    - Pode lançar java.lang.ClassCastException em tempo de execução,
 *      se o objeto não for realmente instância da subclasse.
 *
 *      Exemplo:
 *          Animal a = new Animal();
 *          Cachorro c = (Cachorro) a; // Compila, mas lança exceção em runtime!
 *
 *    - Por isso, é recomendado usar o operador `instanceof`:
 *
 *          if (a instanceof Cachorro) {
 *              Cachorro c = (Cachorro) a;
 *          }
 *
 * ---------------------------
 * | Casting e Polimorfismo |
 * ---------------------------
 * Através do upcasting, podemos tratar vários objetos diferentes de forma genérica.
 * O Java chama automaticamente os methods sobrescritos da subclasse durante a execução.
 *
 * ---------------------------------------------------
 * | Wrappers e a classe Number                      |
 * ---------------------------------------------------
 * Tipos como Integer, Double, etc., são subclasses de Number.
 * É possível fazer casting entre Number e essas classes, mas
 * o cast incorreto entre tipos incompatíveis gera exceção.
 *
 * Exemplo:
 *      Number n = Integer.valueOf(10);
 *      Integer i = (Integer) n; // OK
 *      Double d = (Double) n;   // ERRO em runtime
 *
 * ---------------------------------------
 * | Regras gerais de casting de objetos |
 * ---------------------------------------
 * - Pode fazer casting se houver relação de herança ou interface.
 * - O compilador permite o cast, mas a execução lança exceção se for inválido.
 * - O uso de `instanceof` previne esses erros.
 *
 * -----------------------------------------------------
 * | Interface ↔ Implementação também segue as regras  |
 * -----------------------------------------------------
 * Exemplo:
 *      Operacao op = new Soma();        // Upcasting
 *      if (op instanceof Soma) {
 *          Soma s = (Soma) op;          // Downcasting
 *      }
 */

public class TypeCastingReferencia {

    public static void main(String[] args) {

        // ========== UPCASTING ==========
        Cachorro cachorro = new Cachorro();
        Animal animal = cachorro; // Upcasting: Cachorro → Animal
        animal.emitirSom();       // Saída: "Cachorro faz som" (polimorfismo)

        // ========== DOWNCASTING válido ==========
        Animal outroAnimal = new Cachorro(); // objeto é realmente um Cachorro
        Cachorro c = (Cachorro) outroAnimal; // Downcasting explícito
        c.latir();                           // Acessa method específico de Cachorro

        // ========== DOWNCASTING inválido (evitado com instanceof) ==========
        Animal generico = new Animal(); // Objeto genérico
        if (generico instanceof Cachorro) {
            Cachorro errado = (Cachorro) generico;
            errado.latir();
        } else {
            System.out.println("Downcasting inseguro evitado com instanceof.");
        }

        // ========== CASTING ENTRE WRAPPERS ==========
        Number numero = Integer.valueOf(42); // Integer é subclasse de Number
        Integer inteiro = (Integer) numero;
        System.out.println("Casting Number → Integer: " + inteiro);

        try {
            Double d = (Double) numero; // Compila, mas gera ClassCastException em runtime
        } catch (ClassCastException e) {
            System.out.println("Erro no cast de Integer para Double: " + e.getMessage());
        }

        // ========== INTERFACE E IMPLEMENTAÇÃO ==========
        Operacao op = new Soma(); // Upcasting automático
        op.executar();            // Polimorfismo

        if (op instanceof Soma) {
            Soma s = (Soma) op;   // Downcasting seguro
            s.executar();
        }
    }
}

// ==========================
// CLASSES DE APOIO AO MANUAL
// ==========================

class Animal {
    public void emitirSom() {
        System.out.println("Animal faz som");
    }
}

class Cachorro extends Animal {
    public void emitirSom() {
        System.out.println("Cachorro faz som");
    }

    public void latir() {
        System.out.println("Cachorro: Au au!");
    }
}

class Gato extends Animal {
    public void emitirSom() {
        System.out.println("Gato faz som");
    }

    public void miar() {
        System.out.println("Gato: Miau!");
    }
}

// ==========================
// INTERFACE E IMPLEMENTAÇÃO
// ==========================

interface Operacao {
    void executar();
}

class Soma implements Operacao {
    public void executar() {
        System.out.println("Executando soma!");
    }
}
