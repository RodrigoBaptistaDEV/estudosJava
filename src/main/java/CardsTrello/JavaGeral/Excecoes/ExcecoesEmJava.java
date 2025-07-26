package main.java.CardsTrello.JavaGeral.Excecoes;
/*
 * ExcecoesEmJava.java
 *
 * Este arquivo demonstra conceitos fundamentais sobre exceções em Java,
 * com explicações teóricas em comentários e exemplos de código descomentados para facilitar o estudo.
 */

import java.io.IOException;

// 1. O que são exceções em Java?
// Em Java, uma exceção representa uma condição anormal que ocorre durante a execução do programa.
// Pode ser causada por erros lógicos, como acessar um índice inválido de array, ou problemas externos como falha de leitura de arquivo.

// 2. Como as exceções são representadas?
// Em Java, as exceções são objetos que herdam da classe Throwable.
// Throwable tem duas subclasses principais: Exception e Error.
// - Exception: Usada para representar erros que podem ser tratados.
// - Error: Usada para indicar problemas graves do sistema, como OutOfMemoryError.


// 3. Criando exceções personalizadas
class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}

// 4. Lançando exceções
class ExemploLancamento {
    public static void main(String[] args) {
        try {
            throw new MinhaExcecao("Ocorreu um erro!");
        } catch (MinhaExcecao e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}

// 5. Capturando e tratando exceções
class ExemploTratamento {
    public void executar() {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Vai lançar ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice inválido: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exceção genérica: " + e.getMessage());
        } finally {
            System.out.println("Bloco finally executado.");
        }
    }
}

// 6. Propagando exceções
class ExemploPropagacao {
    public void metodoA() throws MinhaExcecao {
        throw new MinhaExcecao("Erro propagado");
    }

    public void metodoB() {
        try {
            metodoA();
        } catch (MinhaExcecao e) {
            System.out.println("Exceção tratada no method B: " + e.getMessage());
        }
    }
}

// 7. Boas práticas
// - Capture exceções específicas ao invés de Exception genérica.
// - Forneça mensagens claras de erro.
// - Feche recursos no bloco finally ou use try-with-resources.

class ExemploBoasPraticas {
    public void lerArquivo() {
        try {
            throw new IOException("Falha ao abrir arquivo");
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}

// 8. Controle de Exceções em Java
// - throw: Lança uma exceção.
// - catch: Captura uma exceção.
// - throws: Especifica que um method pode lançar exceções.

class ExemploControle {

    public void metodoComThrow() {
        throw new IllegalArgumentException("Valor inválido");
    }

    public void metodoComThrows() throws MinhaExcecao {
        throw new MinhaExcecao("Erro controlado via throws");
    }

    public void executar() {
        // Captura de exceção com try-catch
        try {
            metodoComThrow();
        } catch (IllegalArgumentException e) {
            System.out.println("Capturada IllegalArgumentException: " + e.getMessage());
        }

        // Tratando exceção propagada
        try {
            metodoComThrows();
        } catch (MinhaExcecao e) {
            System.out.println("Capturada MinhaExcecao: " + e.getMessage());
        }
    }
}

// 9. Exceções verificadas vs não verificadas

class ExemploTipos {

    // Exceção verificada - precisa ser tratada ou declarada com throws
    public void metodoVerificado() throws IOException {
        throw new IOException("Exceção verificada");
    }

    // Exceção não verificada - RuntimeException
    public void dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        System.out.println("Resultado: " + (a / b));
    }
}

public class ExcecoesEmJava {
    public static void main(String[] args) {
        ExemploTratamento et = new ExemploTratamento();
        et.executar();

        ExemploPropagacao ep = new ExemploPropagacao();
        ep.metodoB();

        ExemploBoasPraticas ebp = new ExemploBoasPraticas();
        ebp.lerArquivo();

        ExemploControle ec = new ExemploControle();
        ec.executar();

        ExemploTipos tipos = new ExemploTipos();
        try {
            tipos.metodoVerificado();
        } catch (IOException e) {
            System.out.println("IOException tratada: " + e.getMessage());
        }

        tipos.dividir(10, 2);
        // tipos.dividir(10, 0); // Descomente para testar exceção não verificada
    }
}
