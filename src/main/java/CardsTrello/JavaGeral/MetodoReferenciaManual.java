package main.java.CardsTrello.JavaGeral;

import java.util.*;
import java.util.stream.Collectors;

/*
 * Em Java, o símbolo :: é usado para referenciar methods.
 * Esse conceito é conhecido como "referência de method" e foi introduzido no Java 8
 * como parte das expressões lambda e dos methods de referência, que são recursos poderosos
 * para trabalhar com funções de forma mais concisa e flexível.
 *
 * Essencialmente, a referência de method permite tratar um method como um valor
 * que pode ser passado, armazenado ou retornado.
 * Isso torna o código mais conciso e legível, especialmente ao trabalhar com expressões lambda e interfaces funcionais.
 */
public class MetodoReferenciaManual {

    public static void main(String[] args) {

        /*
         * Para entender melhor, imagine que você tem uma interface funcional que define um method.
         *
         * interface Calculadora {
         *     int calcular(int a, int b);
         * }
         *
         * Agora, suponha que você tenha uma classe com methods estáticos que correspondem ao method da interface funcional:
         *
         * class Operacoes {
         *     static int soma(int a, int b) {
         *         return a + b;
         *     }
         *
         *     static int subtracao(int a, int b) {
         *         return a - b;
         *     }
         * }
         *
         * Usando a referência de method, você pode fazer referência diretamente aos methods soma e subtracao:
         */

        Calculadora calculadoraSoma = Operacoes::soma;
        Calculadora calculadoraSubtracao = Operacoes::subtracao;

        /*
         * Aqui, Operacoes::soma e Operacoes::subtracao são referências de method
         * para os methods estáticos soma e subtracao da classe Operacoes.
         *
         * Agora, calculadoraSoma e calculadoraSubtracao são objetos que implementam
         * a interface Calculadora e podem ser usados da mesma forma que qualquer outra
         * implementação dessa interface.
         */

        int resultadoSoma = calculadoraSoma.calcular(5, 3);           // resultadoSoma é 8
        int resultadoSubtracao = calculadoraSubtracao.calcular(5, 3); // resultadoSubtracao é 2

        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Subtração: " + resultadoSubtracao);

        /*
         * Vamos expandir esse conceito com outro exemplo:
         *
         * Suponha que você tenha uma lista de números inteiros e deseje filtrar apenas os números pares.
         * Aqui está como você poderia fazer isso usando referência de method:
         */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numerosPares = numeros.stream().filter(Utilidades::ehPar).collect(Collectors.toList());

        System.out.println("Números pares: " + numerosPares); // [2, 4, 6, 8, 10]

        /*
         * Na linha acima, Utilidades::ehPar é uma referência ao method ehPar da classe Utilidades.
         * Este method recebe um número inteiro e retorna verdadeiro se ele for par.
         *
         * Ao usar filter(Utilidades::ehPar), você está indicando para o filtro que ele deve considerar
         * o method ehPar para cada elemento da stream.
         * Isso é como se você estivesse dizendo: "Para cada elemento, aplique a função ehPar e mantenha
         * apenas aqueles para os quais o resultado seja verdadeiro".
         *
         * Se você tentasse usar filter(Utilidades.ehPar()), isso resultaria em um erro,
         * pois Utilidades.ehPar() seria interpretado como uma chamada direta ao method,
         * enquanto filter(Utilidades::ehPar) está indicando para o filtro que ele deve
         * usar o method ehPar como critério de filtragem.
         */


        /*
         * Vendo novamente para fixar:
         *
         * Imagine que você está organizando uma lista de pessoas com seus respectivos nomes.
         * Você deseja filtrar essa lista para encontrar todas as pessoas cujos nomes começam com a letra "A".
         */

        List<String> listaDeNomes = Arrays.asList("Ana", "Maria", "João", "Antônio", "Amanda");
        List<String> nomesComA = listaDeNomes.stream().filter(NomeUtils::comecaComA).collect(Collectors.toList());

        System.out.println("Nomes que começam com A: " + nomesComA); // [Ana, Antônio, Amanda]

        /*
         * Na linha acima, NomeUtils::comecaComA é uma referência ao method comecaComA da classe NomeUtils.
         * Este method recebe uma string e retorna verdadeiro se ela começar com a letra "A".
         *
         * Em contrapartida, se você tentasse usar filter(NomeUtils.comecaComA()), isso resultaria em um erro,
         * porque comecaComA() seria interpretado como uma chamada direta ao method,
         * enquanto filter(NomeUtils::comecaComA) está indicando para o filtro que ele deve usar o method
         * comecaComA como critério de filtragem.
         *
         * Portanto, a referência de method permite passar um method como argumento para outro method,
         * sem executá-lo imediatamente, tornando o código mais flexível e modular.
         */
    }

    // Interface funcional
    interface Calculadora {
        int calcular(int a, int b);
    }

    // Classe com methods estáticos que implementam operações
    static class Operacoes {
        static int soma(int a, int b) {
            return a + b;
        }

        static int subtracao(int a, int b) {
            return a - b;
        }
    }

    // Classe utilitária para números
    static class Utilidades {
        public static boolean ehPar(int numero) {
            return numero % 2 == 0;
        }
    }

    // Classe utilitária para nomes
    static class NomeUtils {
        public static boolean comecaComA(String nome) {
            return nome.startsWith("A");
        }
    }
}
