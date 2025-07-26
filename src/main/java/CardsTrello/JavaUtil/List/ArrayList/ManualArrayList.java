package main.java.CardsTrello.JavaUtil.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ================================
 * TÓPICO: ArrayList em Java
 * ================================
 *
 * ArrayList é uma implementação da interface List que faz parte do pacote java.util.
 * Ele armazena elementos de forma dinâmica em uma lista ordenada.
 *
 * ➤ Vantagens:
 *   - Tamanho dinâmico (cresce/diminui conforme necessidade).
 *   - Acesso rápido via índice.
 *   - methods convenientes para adicionar, remover e buscar elementos.
 *
 * ➤ Declaração básica:
 *     ArrayList<Tipo> nome = new ArrayList<>();
 *
 * ➤ methods mais comuns:
 *   - add(E elemento)                  → adiciona no final
 *   - add(int index, E elemento)      → adiciona em índice específico
 *   - get(int index)                  → retorna o elemento no índice
 *   - set(int index, E elemento)      → substitui o elemento no índice
 *   - remove(int index)               → remove o elemento no índice
 *   - size()                          → número de elementos
 *   - isEmpty()                       → true se estiver vazia
 *   - clear()                         → remove todos os elementos
 *   - contains(Object elemento)       → true se contiver o elemento
 *   - indexOf(Object elemento)        → índice da primeira ocorrência
 *
 * Abaixo estão exemplos práticos com explicações nos comentários.
 */

public class ManualArrayList {

    public static void main(String[] args) {

        // -----------------------------
        // EXEMPLO 1: Criação e adição
        // -----------------------------

        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        System.out.println("Lista de frutas: " + frutas);  // [Maçã, Banana, Laranja]

        // -----------------------------
        // EXEMPLO 2: Acesso e modificação
        // -----------------------------

        String primeiraFruta = frutas.get(0);
        System.out.println("Primeira fruta: " + primeiraFruta); // Maçã

        frutas.set(1, "Abacaxi");
        System.out.println("Após alteração: " + frutas);  // [Maçã, Abacaxi, Laranja]

        // -----------------------------
        // EXEMPLO 3: Remoção e tamanho
        // -----------------------------

        frutas.remove(2);  // remove "Laranja"
        System.out.println("Após remoção: " + frutas);  // [Maçã, Abacaxi]

        int tamanho = frutas.size();
        System.out.println("Tamanho da lista: " + tamanho);  // 2

        // -----------------------------
        // EXEMPLO 4: Verificação e limpeza
        // -----------------------------

        boolean contem = frutas.contains("Maçã");  // true
        System.out.println("Contém Maçã? " + contem);

        frutas.clear();
        System.out.println("Lista após clear(): " + frutas);  // []

        boolean vazia = frutas.isEmpty();  // true
        System.out.println("Está vazia? " + vazia);

        // -----------------------------
        // EXEMPLO 5: Inicialização direta com elementos
        // -----------------------------

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Numeros: " + numeros);

        // -----------------------------
        // EXEMPLO 6: Lista Bidimensional (List<List<Integer>>)
        // -----------------------------

        List<List<Integer>> matriz = new ArrayList<>();

        List<Integer> linha1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> linha2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        List<Integer> linha3 = new ArrayList<>(Arrays.asList(7, 8, 9));

        matriz.add(linha1);
        matriz.add(linha2);
        matriz.add(linha3);

        System.out.println("Primeira linha: " + matriz.get(0));       // [1, 2, 3]
        System.out.println("Elemento [0][0]: " + matriz.get(0).get(0));  // 1

        // Exibição da matriz
        System.out.println("Matriz completa:");
        for (List<Integer> linha : matriz) {
            for (Integer valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}

