package main.java.CardsTrello.POO;

/**
 * ======================================
 * Tópico: Uso da palavra-chave "this" em Java
 * ======================================
 *
 * Em Java, "this" é uma referência ao objeto atual. Ela é usada dentro de methods ou construtores 
 * para se referir a variáveis de instância ou invocar membros da classe.
 *
 * Situações comuns de uso:
 * 1. Diferenciar variáveis de instância de parâmetros com o mesmo nome.
 * 2. Invocar methods da mesma instância.
 * 3. Invocar outros construtores da mesma classe.
 * 4. Retornar a própria instância para encadeamento de methods (method fluente).
 * 5. Passar a instância atual como argumento a outro method.
 */

public class ThisKeywordExamples {

    /**
     * ==========================================================
     * 1. Diferenciar variáveis de instância e parâmetros locais
     * ==========================================================
     *
     * Quando o parâmetro do method/contrutor possui o mesmo nome
     * da variável de instância, usamos "this" para esclarecer que
     * queremos referenciar o atributo do objeto.
     */

    static class Person {
        private String name;

        public Person(String name) {
            this.name = name; // "this.name" é o atributo da instância
        }
    }

    /**
     * ===================================
     * 2. Chamar methods da própria classe
     * ===================================
     *
     * "this" pode ser usado para chamar outro method não-estático
     * da mesma classe. É opcional, mas útil para clareza.
     */

    static class MethodCaller {
        public void method1() {
            System.out.println("Dentro do method1()");
        }

        public void method2() {
            this.method1(); // chamada explícita usando "this"
        }
    }

    /**
     * ======================================
     * 3. Chamada de outro construtor com this()
     * ======================================
     *
     * Podemos usar "this()" para invocar outro construtor da
     * mesma classe. Isso ajuda a reutilizar código e centralizar lógica.
     * Deve ser a primeira instrução no construtor.
     */

    static class Rectangle {
        private int width;
        private int height;

        public Rectangle() {
            this(0, 0); // chama o outro construtor
        }

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }

    /**
     * ===================================
     * 4. Referência ao objeto atual
     * ===================================
     *
     * Podemos usar "this" para acessar membros da instância atual
     * e compará-los com outra instância, por exemplo.
     */

    static class ComparablePerson {
        private String name;
        private int age;

        public ComparablePerson(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void compareAge(ComparablePerson other) {
            if (this.age < other.age) {
                System.out.println(this.name + " é mais jovem que " + other.name);
            } else if (this.age > other.age) {
                System.out.println(this.name + " é mais velho que " + other.name);
            } else {
                System.out.println(this.name + " tem a mesma idade que " + other.name);
            }
        }
    }

    /**
     * ===========================================
     * 5. Usar "this" para passar a instância atual
     * ===========================================
     *
     * Podemos passar "this" como argumento para outro method
     * ou classe, como forma de referenciar a própria instância.
     */

    static class MyClass {
        private int[] numbers;

        public MyClass() {
            this.initializeArray(this);
        }

        private void initializeArray(MyClass instance) {
            instance.numbers = new int[10];
        }
    }

    /**
     * ===============================================
     * 6. Retornar a própria instância (method fluente)
     * ===============================================
     *
     * Muito utilizado em builders e methods encadeados.
     */

    static class Fluent {
        private int value;

        public Fluent setValue(int value) {
            this.value = value;
            return this; // permite encadeamento de chamadas
        }

        public Fluent printValue() {
            System.out.println("Valor: " + this.value);
            return this;
        }
    }

    // ============================
    // method principal (main)
    // ============================
    public static void main(String[] args) {
        // Exemplo 1
        Person p = new Person("João");

        // Exemplo 2
        MethodCaller caller = new MethodCaller();
        caller.method2();

        // Exemplo 3
        Rectangle rect = new Rectangle();

        // Exemplo 4
        ComparablePerson alice = new ComparablePerson("Alice", 30);
        ComparablePerson bob = new ComparablePerson("Bob", 25);
        alice.compareAge(bob);

        // Exemplo 5
        MyClass obj = new MyClass();

        // Exemplo 6
        Fluent fluent = new Fluent();
        fluent.setValue(42).printValue().setValue(100).printValue();
    }
}

