package main.java.Intermediario.Arrays;

public class ExemplosArrays {

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

//        for (int i = 0; i < fruits.length; i++) {
//            System.out.println("Fruta na posição " + i + ": " + fruits[i]);
//        }

        int i = 0;
        for ( String elementos : fruits) {
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

    public static void main(String[] args) {
        exemplo1();
        exemplo2();
        exemplo3();
        exemplo4();
        exemplo5();
    }
}

