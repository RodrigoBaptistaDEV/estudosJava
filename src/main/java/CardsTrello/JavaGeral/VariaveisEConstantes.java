package main.java.CardsTrello.JavaGeral;

/*
 * Esta classe explica de forma prática e comentada os conceitos de:
 * - O que são variáveis e constantes
 * - Declaração
 * - Instanciação
 * - Inicialização
 * - Atribuição e Reatribuição
 * - Diferença entre Variáveis e Constantes
 */

public class VariaveisEConstantes {

    public static void main(String[] args) {

        /*
         * ===============================
         * 0. O QUE SÃO VARIÁVEIS E CONSTANTES
         * ===============================
         *
         * VARIÁVEL:
         * ----------
         * É um espaço na memória destinado a armazenar dados temporários durante a execução do programa.
         * O valor pode mudar conforme a lógica do sistema.
         *
         * Exemplo de uso: guardar a idade de um usuário, o saldo de uma conta, o nome de um cliente, etc.
         *
         * CONSTANTE:
         * -----------
         * É um valor fixo, imutável, que não pode ser alterado após a atribuição inicial.
         * Ideal para representar informações que não mudam: PI, limites, chaves fixas, etc.
         */

        /*
         * ===============================
         * 1. DECLARAÇÃO
         * ===============================
         *
         * Informar ao compilador que a variável ou constante existirá.
         * Consiste em especificar o tipo e o nome.
         */

        int numero;
        String mensagem;

        /*
         * ===============================
         * 2. INSTANCIAÇÃO
         * ===============================
         *
         * Refere-se ao momento em que a variável ganha existência e espaço na memória.
         * Em tipos primitivos, isso ocorre automaticamente ao declarar.
         * Em tipos de referência (ex: String), também pode envolver o uso de `new`.
         */

        /*
         * ===============================
         * 3. INICIALIZAÇÃO
         * ===============================
         *
         * Atribuir um valor inicial à variável.
         * Pode ser feita junto da declaração ou depois.
         */

        numero = 100;
        mensagem = "Variável inicializada";

        int idade = 25;
        String nome = "João";
        double salario = 3250.75;
        boolean ativo = true;

        /*
         * ===============================
         * 4. ATRIBUIÇÃO E REATRIBUIÇÃO
         * ===============================
         *
         * ATRIBUIÇÃO: definir um valor inicial para uma variável.
         * REATRIBUIÇÃO: alterar o valor já definido anteriormente.
         */

        numero = 200;

        /*
         * ===============================
         * 5. IMPRESSÃO DOS VALORES
         * ===============================
         */
        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Ativo: " + ativo);
        System.out.println("Número: " + numero);
        System.out.println("Mensagem: " + mensagem);

        /*
         * ===============================
         * 6. VARIÁVEIS
         * ===============================
         *
         * Características:
         * - Mutáveis: o valor pode mudar.
         * - Associadas a um tipo: int, double, String, boolean, etc.
         * - Possuem escopo: só são acessíveis dentro do bloco onde foram declaradas.
         */

        int contador = 0;
        contador = contador + 1;

        /*
         * ===============================
         * 7. CONSTANTES
         * ===============================
         *
         * Características:
         * - Imutáveis: não podem ser modificadas após a atribuição.
         * - Definidas com a palavra-chave `final`.
         * - Convenção: nome em letras maiúsculas e underscores.
         */

        final double PI = 3.14159;
        final int ANO_ATUAL = 2025;

        System.out.println("Constante PI: " + PI);
        System.out.println("Ano Atual: " + ANO_ATUAL);

        // Tentativa de reatribuição (causa erro):
        // PI = 3.14;

        // Constantes de classe:
        System.out.println("INSTITUIÇÃO: " + INSTITUICAO);
        System.out.println("LIMITE_USUARIOS: " + LIMITE_USUARIOS);

        /*
         * ===============================
         * 8. RESUMO COMPARATIVO
         * ===============================
         *
         * VARIÁVEIS:
         * - São mutáveis
         * - Usadas para armazenar dados que mudam
         * - Podem ser declaradas, inicializadas e reatribuídas
         *
         * CONSTANTES:
         * - São imutáveis (usam `final`)
         * - Representam valores fixos
         * - Atribuídas apenas uma vez
         */
    }

    // Constantes de classe (boas práticas: static final + UPPER_CASE)
    public static final String INSTITUICAO = "ShuffleUp Academy";
    public static final int LIMITE_USUARIOS = 1000;
}
