package main.java.CardsTrello.JavaUtil.List;

// ManualOrdenacaoListas.java

import java.util.*;

// Este manual explica como ordenar listas em Java usando a classe ArrayList.
// Embora ArrayList não possua um method sort diretamente, ela herda esse method da interface List,
// e também pode ser ordenada com o method estático Collections.sort().

// Ambos os methods funcionam com base na ordem natural dos elementos (quando eles implementam Comparable)
// ou utilizando um Comparator customizado.

// Vamos cobrir os seguintes tópicos:
// 1. Ordenação com Collections.sort()
// 2. Ordenação com List.sort()
// 3. Ordenação alfabética (Strings)
// 4. Ordenação numérica (Integer)
// 5. Ordem reversa
// 6. Ordenação de objetos personalizados (com Comparator)
// 7. Ordenação com múltiplos critérios (thenComparing)

public class ManualOrdenacaoListas {

    // Exemplo 1: Collections.sort() com ordem natural e ordem reversa
    public static void exemplo1_CollectionsSort() {
        ArrayList<String> list = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("cherry");

        // Ordenação por ordem natural (alfabética)
        Collections.sort(list);
        System.out.println("Ordem natural (Collections.sort): " + list); // [apple, banana, cherry]

        // Ordenação reversa
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Ordem reversa (Collections.sort): " + list); // [cherry, banana, apple]
    }

    // Exemplo 2: List.sort() com ordem natural e ordem reversa
    public static void exemplo2_ListSort() {
        ArrayList<String> list = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("cherry");

        // Ordem natural
        list.sort(null);
        System.out.println("Ordem natural (List.sort): " + list); // [apple, banana, cherry]

        // Ordem reversa
        list.sort(Collections.reverseOrder());
        System.out.println("Ordem reversa (List.sort): " + list); // [cherry, banana, apple]
    }

    // Exemplo 3: Ordenação alfabética
    public static void exemplo3_OrdemAlfabetica() {
        ArrayList<String> list = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("cherry");

        // String implementa Comparable, ordem natural é alfabética
        Collections.sort(list);
        System.out.println("Ordem alfabética: " + list); // [apple, banana, cherry]
    }

    // Exemplo 4: Ordenação numérica
    public static void exemplo4_OrdemNumerica() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(1);

        // Integer implementa Comparable, ordem natural é crescente
        Collections.sort(list);
        System.out.println("Ordem numérica: " + list); // [1, 2, 5, 9]
    }

    // Exemplo 5: Ordem reversa para Strings e Integers
    public static void exemplo5_OrdemReversa() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("banana");
        stringList.add("apple");
        stringList.add("cherry");

        stringList.sort(Collections.reverseOrder());
        System.out.println("String ordem reversa: " + stringList); // [cherry, banana, apple]

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(2);
        intList.add(9);
        intList.add(1);

        intList.sort(Collections.reverseOrder());
        System.out.println("Integer ordem reversa: " + intList); // [9, 5, 2, 1]
    }

    // Classe auxiliar para próximos exemplos
    static class Pessoa {
        String nome;
        int idade;

        Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        @Override
        public String toString() {
            return nome + " (" + idade + ")";
        }
    }

    // Exemplo 6: Ordenação de objetos por atributo
    public static void exemplo6_OrdenacaoPorAtributo() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 30));
        pessoas.add(new Pessoa("Carlos", 25));
        pessoas.add(new Pessoa("Beatriz", 28));

        // Ordenando por nome
        pessoas.sort(Comparator.comparing(p -> p.nome));
        System.out.println("Ordenado por nome: " + pessoas);

        // Ordenando por idade
        pessoas.sort(Comparator.comparingInt(p -> p.idade));
        System.out.println("Ordenado por idade: " + pessoas);
    }

    // Classe auxiliar para ordenação com múltiplos critérios
    static class Person {
        String name;
        int age;
        double salary;

        public Person(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public int getAge() { return age; }
        public double getSalary() { return salary; }
        public String getName() { return name; }

        @Override
        public String toString() {
            return name + " - Age: " + age + ", Salary: " + salary;
        }
    }

    // Exemplo 7: Ordenação com múltiplos critérios usando thenComparing()
    public static void exemplo7_MultiplosCriterios() {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30, 50000),
                new Person("Bob", 25, 55000),
                new Person("Charlie", 30, 40000),
                new Person("David", 25, 50000)
        );

        // Ordenar por idade, depois salário, depois nome
        people.sort(Comparator.comparingInt(Person::getAge)
                .thenComparingDouble(Person::getSalary)
                .thenComparing(Person::getName));

        System.out.println("Ordenação múltiplos critérios:");
        people.forEach(System.out::println);
    }

    public static void main(String[] args) {
        exemplo1_CollectionsSort();
        exemplo2_ListSort();
        exemplo3_OrdemAlfabetica();
        exemplo4_OrdemNumerica();
        exemplo5_OrdemReversa();
        exemplo6_OrdenacaoPorAtributo();
        exemplo7_MultiplosCriterios();
    }
}

