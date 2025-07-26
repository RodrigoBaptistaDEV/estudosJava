package main.java.CardsTrello.JavaUtil;

import java.util.*;

/**
 * ===================================================
 * MANUAL COMPLETO SOBRE A INTERFACE ITERATOR EM JAVA
 * ===================================================
 *
 * Introdução:
 * A interface Iterator faz parte da Java Collection Framework.
 * Ela é usada para percorrer coleções de forma sequencial sem expor
 * a estrutura interna da coleção. Muito útil para leitura e, com cuidado, modificação de elementos.
 *
 * Interface Iterator - methods principais:
 *
 * - boolean hasNext(): Retorna true se houver outro elemento para iterar.
 * - E next(): Retorna o próximo elemento. Lança NoSuchElementException se não houver elementos.
 * - void remove(): Remove o último elemento retornado por next(). Só pode ser chamado uma vez por chamada a next().
 *
 * Iterator é particularmente útil quando você precisa iterar e remover elementos de coleções ao mesmo tempo.
 */

public class ManualIterator {
    public static void main(String[] args) {
        System.out.println("== Exemplo 1: Iterator com remoção segura ==");
        exemploComRemocao();

        System.out.println("\n== Exemplo 2: Iteração simples passo a passo ==");
        exemploIteracaoSimples();

        System.out.println("\n== Exemplo 3: Uso com Set ==");
        exemploComSet();
    }

    /**
     * =====================================================
     * EXEMPLO 1 - Iterator com remoção segura
     * =====================================================
     * Demonstra uso de hasNext(), next() e remove().
     * Remove o item "Banana" da lista durante a iteração.
     */
    public static void exemploComRemocao() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);

            if (fruit.equals("Banana")) {
                iterator.remove(); // Remoção segura
            }
        }

        System.out.println("List after removal: " + fruits);

        /*
         * Saída esperada:
         * Apple
         * Banana
         * Cherry
         * List after removal: [Apple, Cherry]
         */
    }

    /**
     * =====================================================
     * EXEMPLO 2 - Iteração simples com explicação passo a passo
     * =====================================================
     * Mostra como o iterator se move pela lista, e como
     * next() avança o cursor interno.
     */
    public static void exemploIteracaoSimples() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        Iterator<String> iterator = fruits.iterator();

        /*
         * O Iterator começa em uma posição "virtual" antes do primeiro elemento.
         * Após cada chamada a next(), ele avança uma posição:
         *
         * Estado inicial:         [ * , Apple, Banana, Cherry]
         * Após 1ª chamada next(): [Apple, * , Banana, Cherry]
         * Após 2ª chamada next(): [Apple, Banana, * , Cherry]
         * Após 3ª chamada next(): [Apple, Banana, Cherry, * ]
         */

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        /*
         * Saída esperada:
         * Apple
         * Banana
         * Cherry
         */
    }

    /**
     * =====================================================
     * EXEMPLO 3 - Uso com Set
     * =====================================================
     * Iterator pode ser usado com qualquer tipo que implemente Collection.
     * Neste exemplo, percorremos um Set.
     */
    public static void exemploComSet() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            Integer num = it.next();
            System.out.println("Número: " + num);
        }

        /*
         * A ordem da saída pode variar, pois Set não garante ordem.
         */
    }

    /**
     * =====================================================
     * DETALHES INTERNOS - Como funciona o Iterator internamente
     * =====================================================
     *
     * A chamada fruits.iterator() retorna uma instância da classe interna
     * privada da ArrayList chamada "Itr", que implementa Iterator<E>.
     * Essa classe possui:
     *
     * - cursor: índice do próximo elemento a ser retornado por next()
     * - lastRet: índice do último elemento retornado (-1 se nenhum)
     * - expectedModCount: usado para detectar modificações externas
     *
     * O method remove() apenas funciona se next() tiver sido chamado antes.
     * Se você alterar a lista diretamente durante a iteração (fora do Iterator),
     * será lançada ConcurrentModificationException.
     */
}
