package main.java.Intermediario;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Manual de Exceções em Java
 * ---------------------------
 *
 * Introdução:
 * ------------
 * Exceções em Java são eventos que indicam condições anormais durante a execução de um programa.
 * Elas são usadas para lidar com erros que ocorrem durante a execução do programa, tais como
 * erros de entrada e saída, divisão por zero, entre outros.
 *
 * Tipos de Exceções:
 * -------------------
 * 1. Checked Exceptions: Exceções que o compilador obriga você a tratar ou lançar.
 * 2. Unchecked Exceptions: Exceções que o compilador não obriga você a tratar ou lançar.
 * 3. Errors: Condições graves que normalmente não são recuperáveis, como falta de memória.
 *         // Exemplo de Error:
 *         // int[] arr = new int[Integer.MAX_VALUE]; // Isso causará um OutOfMemoryError
 *
 * Hierarquia de Exceções:
 * ------------------------
 * Todas as exceções em Java são subclasses da classe java.lang.Exception.
 * - Throwable
 *   - Error
 *   - Exception
 *     - Checked Exceptions
 *     - Unchecked Exceptions (RuntimeExceptions)
 *
 * Bloco try-catch:
 * -----------------
 * O bloco try é usado para envolver o código que pode lançar uma exceção.
 * O bloco catch é usado para capturar e lidar com a exceção.
 *
 * Exemplo:
 * try {
 *     // código que pode lançar uma exceção
 * } catch (ExcecaoTipoA tipoA) {
 *     // tratamento para ExcecaoTipoA
 * } catch (ExcecaoTipoB tipoB) {
 *     // tratamento para ExcecaoTipoB
 * } finally {
 *     // bloco opcional que sempre é executado, independente de haver ou não exceção
 * }
 *
 * Lançamento de Exceções:
 * ------------------------
 * Podemos lançar uma exceção manualmente usando a palavra-chave 'throw'.
 *
 * Exemplo:
 * throw new MinhaExcecao("Mensagem de erro");
 *
 * Onde MinhaExcecao é uma classe que estende java.lang.Exception.
 *
 * Declaração de Exceções:
 * ------------------------
 * Um método pode declarar que lança uma exceção usando a palavra-chave 'throws'.
 * Isso indica que o método pode lançar a exceção, mas não trata diretamente.
 * A responsabilidade de lidar com a exceção é transferida para o método que chamou.
 *
 * Exemplo:
 * public void exemplo() throws MinhaExcecao {
 *     // Código que pode lançar MinhaExcecao
 * }
 *
 * Boas Práticas:
 * --------------
 * - Documente claramente quais exceções um método pode lançar.
 * - Não declare exceções desnecessárias apenas para evitar tratamento.
 *
 * Conclusão:
 * -----------
 * Exceções são uma parte importante da programação em Java, permitindo lidar com erros de forma estruturada
 * e robusta. Entender como trabalhar com exceções ajuda a escrever código mais seguro e confiável.
 */

public class ManualExcecoesJava {
    public static void main(String[] args) {

    }

    // 1) bloco try catch para capturar uma exceção lançada.
    public static void exemplo1(){
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro ao dividir por zero: " + e.getMessage()); //  método retorna uma mensagem descritiva da exceção.
        }
    }

    // Exemplo de método que lança uma exceção:
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    // 2) Método que possui especificação, isso obriga ser chamado em um bloco try catch.

    public static void chamador(){
            // se tentasse só exemplo teria o erro de : 'Unhandled exception: main.java.Intermediario.MinhaExcecao'
        try {
            exemplo(); // Chama o método que lança MinhaExcecao
        } catch (ExcecaoPersonal e) {
            // Trata MinhaExcecao
            System.err.println("Erro: " + e.getMessage());
        }
    }

    public static void exemplo() throws ExcecaoPersonal {
        // Código que pode lançar MinhaExcecao
        throw new ExcecaoPersonal("Exemplo de lançamento de MinhaExcecao");
    }

    public static void exemploChecked() {
        // Exemplo de Checked Exception:
            // se declararmos fora do método temos : 'Unhandled exception: java.io.FileNotFoundException'
            try {
                FileReader file = new FileReader("arquivo.txt");
            } catch (FileNotFoundException e) {
                System.out.println("Arquivo não encontrado: " + e.getMessage());
            }
    }

    public static void exemploUnchecked(){
        // Exemplo de Unchecked Exception:
            // não somos obrigados a tratar explicitamente, mas recebemos aviso.
        int[] array = {1, 2, 3};
        System.out.println(array[3]); // Isso causará um ArrayIndexOutOfBoundsException
    }

}

// Exemplo de criação de exceção própria
class ExcecaoPersonal extends Exception {
    public ExcecaoPersonal(String mensagem) {
        super(mensagem);
    }
}
