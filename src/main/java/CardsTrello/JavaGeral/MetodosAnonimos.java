package main.java.CardsTrello.JavaGeral;/*
 * methods Anônimos - Lambdas e Classes
 *
 * methods anônimos referem-se a methods que não possuem um nome específico e são geralmente utilizados
 * em contexto de programação funcional, particularmente em expressões lambda e classes anônimas.
 *
 * o Java tem um conceito de "methods anônimos" na forma de expressões lambda e classes anônimas.
 * Embora tecnicamente não sejam "methods anônimos" no sentido estrito, eles permitem a criação
 * de blocos de código que se comportam como methods, mas sem a necessidade de um nome explícito.
 */

// Expressões Lambda

/*
 * Introduzidas no Java 8, as expressões lambda permitem definir methods anônimos de forma concisa,
 * especialmente úteis em contextos de programação funcional, como quando se trabalha com APIs de streams
 * ou funções de ordem superior. Elas são frequentemente usadas para implementar interfaces funcionais,
 * que são interfaces com um único method abstrato.
 */

// Sintaxe de uma Expressão Lambda:
//
// (parametros) -> expressão
//
// Ou, se o corpo da lambda for mais complexo:
//
// (parametros) -> {
//     // corpo da expressão lambda
// }

/*
 * Exemplo com Interface Funcional
 *
 * Considere uma interface funcional simples:
 */

@FunctionalInterface
interface Operacao {
    int executar(int a, int b);
}

public class MetodosAnonimos {
    public static void main(String[] args) {

        /*
         * Uma expressão lambda que implementa essa interface pode ser escrita assim:
         */
        Operacao soma = (a, b) -> a + b;
        System.out.println(soma.executar(5, 3)); // Imprime 8

        /*
         * exemplo:
         *
         * // Interface funcional com um method abstrato
         *
         * @FunctionalInterface
         * interface Operacao {
         *     int executar(int a, int b);
         * }
         *
         * public class Main {
         *     public static void main(String[] args) {
         *         // Usando uma expressão lambda para definir o method 'executar'
         *         Operacao soma = (a, b) -> a + b;
         *         Operacao multiplicacao = (a, b) -> a * b;
         *
         *         System.out.println("Soma: " + soma.executar(5, 3)); // Output: Soma: 8
         *         System.out.println("Multiplicação: " + multiplicacao.executar(5, 3)); // Output: Multiplicação: 15
         *     }
         * }
         */

        Operacao multiplicacao = (a, b) -> a * b;
        System.out.println("Multiplicação: " + multiplicacao.executar(5, 3)); // Output: Multiplicação: 15
    }
}

// Classes Anônimas

/*
 * As classes anônimas são uma forma de declarar e instanciar uma classe em uma única expressão.
 * Elas são particularmente úteis para criar instâncias de classes que serão usadas apenas uma vez,
 * como implementações de interfaces ou subclasses abstratas.
 */

// Exemplo de Classe Anônima

/*
 * Suponha que temos uma interface Saudacao:
 */

interface Saudacao {
    void saudar();
}

class ExemploClasseAnonima {
    public static void main(String[] args) {
        /*
         * Podemos criar uma classe anônima que implementa essa interface assim:
         */

        Saudacao saudacao = new Saudacao() {
            @Override
            public void saudar() {
                System.out.println("Olá, mundo!");
            }
        };
        saudacao.saudar(); // Imprime "Olá, mundo!"

        /*
         * Antes do Java 8, uma forma comum de criar comportamentos similares a methods anônimos
         * era através de classes anônimas. Uma classe anônima é uma classe interna sem nome
         * e é instanciada e definida no mesmo lugar.
         *
         * Exemplo de uma classe anônima:
         */

        // Classe anônima que implementa a interface Runnable
        Runnable tarefa = new Runnable() {
            @Override
            public void run() {
                System.out.println("Tarefa executada!");
            }
        };

        // Iniciando a thread com a classe anônima
        new Thread(tarefa).start();
    }
}

/*
 * As classes anônimas são frequentemente usadas para implementar interfaces ou estender classes
 * em situações onde o comportamento desejado é usado uma vez ou não justifica a criação de uma
 * classe nomeada separada.
 *
 * Ambas as abordagens permitem a criação de blocos de código que se comportam como methods sem
 * a necessidade de um nome explícito para o method em si.
 */

// Comparação entre Expressões Lambda e Classes Anônimas

/*
 * Expressões Lambda são mais concisas e legíveis, ideais para implementações simples de interfaces funcionais.
 * São mais concisas e preferidas quando usadas com interfaces funcionais.
 *
 * Classes Anônimas permitem maior flexibilidade, pois podem implementar múltiplos methods
 * (se a classe ou interface permitir) e manter estado, mas resultam em código mais verboso.
 * Úteis quando precisamos de mais flexibilidade, como ter mais de um method ou acessar variáveis de instância.
 *
 * Ambas as técnicas são ferramentas poderosas no Java, permitindo escrever código mais limpo e conciso,
 * especialmente ao lidar com APIs modernas e padrões de design baseados em funções.
 */

// Exemplos adicionais para consolidação

class ExemplosLambdaAvancados {
    public static void main(String[] args) {
        /*
         * Expressões lambda são uma maneira concisa de expressar methods anônimos (sem nome) em Java.
         * Elas são usadas principalmente para implementar interfaces funcionais, que têm apenas um method abstrato.
         *
         * Aqui está uma explicação passo a passo:
         */

        // Interfaces Funcionais
        // Em Java, uma interface funcional é uma interface que contém apenas um method abstrato.
        // Isso significa que podemos tratá-la como um tipo de função.

        @FunctionalInterface
        interface Operacao {
            int calcular(int a, int b);
        }

        Operacao soma = (a, b) -> a + b;
        System.out.println(soma.calcular(2, 3)); // 5

        // Sintaxe de uma Expressão Lambda: (parâmetros) -> expressão
        // Exemplo:
        // (a, b) -> a + b

        // Usando uma Expressão Lambda em Stream
        java.util.List<Integer> numeros = java.util.Arrays.asList(1, 2, 3, 4, 5);
        numeros.stream()
                .map(x -> x * 2) // Aqui, usamos uma expressão lambda para dobrar cada número
                .forEach(System.out::println);

        // Benefícios das Expressões Lambda:
        // - Código mais conciso e legível.
        // - Evita múltiplas classes anônimas.
    }
}

class ContextosUsoLambdas {
    public static void main(String[] args) {
        /*
         * Em Java, expressões lambda são utilizadas principalmente em contextos onde interfaces funcionais são esperadas.
         * Uma interface funcional é aquela que contém exatamente um method abstrato.
         * Expressões lambda permitem que você forneça implementações concisas para essas interfaces funcionais.
         */

        // Atribuição de Variáveis
        Runnable r = () -> System.out.println("Hello, lambda!");
        new Thread(r).start();

        // Passagem de Parâmetros (supondo um botão fictício):
        // button.addActionListener(e -> System.out.println("Button clicked"));

        // Retorno de methods
        java.util.Comparator<String> comparator = stringLengthComparator();
        System.out.println(comparator.compare("Olá", "Mundo!"));

        // Operações em Coleções (Streams)
        java.util.List<String> names = java.util.Arrays.asList("Alice", "Bob", "Charlie");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

        // Interfaces Funcionais Personalizadas
        @FunctionalInterface
        interface MyFunction {
            void doSomething();
        }

        MyFunction func = () -> System.out.println("Doing something");
        func.doSomething();
    }

    public static java.util.Comparator<String> stringLengthComparator() {
        return (s1, s2) -> Integer.compare(s1.length(), s2.length());
    }
}
