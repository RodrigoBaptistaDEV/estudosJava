package main.java.CardsTrello.JavaGeral.Arrays;

import java.util.Arrays;

public class ManualArrays {

    // ---------------------------------------------------------------
    // TEORIA SOBRE ARRAYS EM JAVA
    // ---------------------------------------------------------------

    /*
     * Em Java, um array é uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo.
     * Cada elemento é acessado por um índice numérico que começa em 0.
     * Arrays são estruturas ESTÁTICAS: seu tamanho é fixo após a criação.
     *
     * Exemplo de declaração e inicialização:
     * int[] meuArray = new int[5];  // Cria um array com 5 inteiros inicializados com 0
     * int[] outroArray = { 1, 2, 3, 4, 5 };  // Inicialização direta
     *
     * Acesso a elementos:
     * int primeiro = meuArray[0];
     * int valorNaMatriz = minhaMatriz[1][2];
     */

    public static void exemplo1() {
        // Declarando e inicializando um array de inteiros
        int[] numbers = {10, 20, 30, 40, 50};

        // Acessando e imprimindo elementos do array usando índices
        System.out.println("Exemplo 1:");
        System.out.println("Primeiro elemento: " + numbers[0]); // Saída: 10
        System.out.println("Segundo elemento: " + numbers[1]);  // Saída: 20
        System.out.println("Terceiro elemento: " + numbers[2]);  // Saída: 30

        // Modificando um elemento do array
        numbers[2] = 35; // Mudando o valor do terceiro elemento para 35
        System.out.println("Novo valor do terceiro elemento: " + numbers[2]); // Saída: 35
        System.out.println();
    }

    public static void exemplo2() {
        // Declarando e inicializando um array de strings
        String[] fruits = {"Maçã", "Banana", "Laranja", "Manga"};

        // Percorrendo o array e imprimindo cada elemento
        System.out.println("Exemplo 2:");

        int i = 0;
        for (String elemento : fruits) {
            System.out.println("Fruta na posição " + i + ": " + fruits[i]);
            i++;
        }

        System.out.println();
    }

    public static void exemplo3() {
        // Declarando e inicializando um array de double
        double[] temperatures = {23.5, 18.2, 25.0, 19.8, 21.1};

        // Usando um loop for-each para percorrer o array
        System.out.println("Exemplo 3:");
        for (double temp : temperatures) {
            System.out.println("Temperatura: " + temp);
        }
        System.out.println();
    }

    public static void exemplo4() {
        // Declarando e inicializando um array de inteiros
        int[] numbers = {5, 8, 12, 3, 7, 9, 1, 15};

        // Variáveis para armazenar o maior e o menor valor
        int max = numbers[0];
        int min = numbers[0];

        // Percorrendo o array para encontrar o maior e o menor valor
        System.out.println("Exemplo 4:");
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maior valor: " + max); // Saída: 15
        System.out.println("Menor valor: " + min); // Saída: 1
        System.out.println();
    }

    public static void exemplo5() {
        // Declarando e inicializando um array de inteiros
        int[] numbers = {10, 20, 30, 40, 50};

        // Variável para armazenar a soma dos elementos
        int sum = 0;

        // Percorrendo o array e somando os elementos
        System.out.println("Exemplo 5:");
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Soma de todos os elementos: " + sum); // Saída: 150
        System.out.println();
    }

    public static void exemplo6Matriz() {
        // Exemplo de matriz (array bidimensional)
        int[][] matriz = new int[3][4]; // 3 linhas e 4 colunas

        matriz[0][0] = 1;
        matriz[1][2] = 5;
        matriz[2][3] = 9;

        System.out.println("Exemplo 6 - Matriz Bidimensional:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void exemplo7Media() {
        // Calculando a média de um array
        int[] notas = {7, 8, 9, 10};

        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }

        double media = (double) soma / notas.length;

        System.out.println("Exemplo 7 - Média:");
        System.out.println("Média das notas: " + media); // Saída: 8.5
        System.out.println();
    }

    public static void exemplo8CloneECopy() {
        // Clonando um array
        int[] original = {1, 2, 3, 4, 5};
        int[] clone = original.clone();

        // Cópia parcial com Arrays.copyOf
        int[] parcial = Arrays.copyOf(original, 3); // Pega os 3 primeiros

        System.out.println("Exemplo 8 - Clone e Cópia:");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Clone: " + Arrays.toString(clone));
        System.out.println("Parcial (3 primeiros): " + Arrays.toString(parcial));
        System.out.println();
    }

    public static void exemplo9Ordenacao() {
        int[] baguncado = {42, 13, 7, 99, 1};

        // Ordenando com Arrays.sort
        Arrays.sort(baguncado);

        System.out.println("Exemplo 9 - Ordenação:");
        System.out.println("Array ordenado: " + Arrays.toString(baguncado)); // [1, 7, 13, 42, 99]
        System.out.println();
    }

    public static void exemplo10AdicionarElemento() {
        // Adicionando elemento ao final do array
        int[] array = {1, 2, 3};
        int novoElemento = 4;

        // Expande o array em +1 posição
        array = Arrays.copyOf(array, array.length + 1);

        // Adiciona o novo elemento na última posição
        array[array.length - 1] = novoElemento;

        System.out.println("Exemplo 10 - Adicionando elemento no final:");
        System.out.println("Array resultante: " + Arrays.toString(array)); // [1, 2, 3, 4]
        System.out.println();
    }

    public static void exemplo11InverterArray() {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Exemplo 11 - Antes de inverter:");
        System.out.println(Arrays.toString(array));

        inverterArray(array); // Inversão in-place

        System.out.println("Depois de inverter:");
        System.out.println(Arrays.toString(array)); // [50, 40, 30, 20, 10]
        System.out.println();
    }

    // method utilitário para inverter um array in-place
    public static void inverterArray(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void exemplo12TransformarEmLista() {
        // Transformando array em lista para operações mais ricas com Collections
        String[] nomes = {"Ana", "Bruno", "Carlos"};

        // Cria uma lista fixa com base no array
        java.util.List<String> lista = Arrays.asList(nomes);

        System.out.println("Exemplo 12 - Arrays.asList:");
        System.out.println("Lista criada: " + lista);

        // OBS: Arrays.asList retorna uma lista de tamanho fixo, mas permite methods como contains, indexOf, etc.
        System.out.println("Contém 'Bruno'? " + lista.contains("Bruno"));
        System.out.println();

        // Se precisar adicionar/remover elementos: crie nova ArrayList
        java.util.List<String> listaMutavel = new java.util.ArrayList<>(lista);
        listaMutavel.add("Daniela");

        System.out.println("Lista mutável com novo elemento: " + listaMutavel);
        System.out.println();
    }


    public static void main(String[] args) {
        exemplo1();
        exemplo2();
        exemplo3();
        exemplo4();
        exemplo5();
        exemplo6Matriz();
        exemplo7Media();
        exemplo8CloneECopy();
        exemplo9Ordenacao();
        exemplo10AdicionarElemento();
        exemplo11InverterArray();
        exemplo12TransformarEmLista();
    }

}
