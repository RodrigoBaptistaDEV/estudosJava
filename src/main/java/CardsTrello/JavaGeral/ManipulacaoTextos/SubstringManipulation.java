package main.java.CardsTrello.JavaGeral.ManipulacaoTextos;

/*
 * ============================================
 * MANUAL DE MANIPULAÇÃO DE STRINGS EM JAVA
 * ============================================
 *
 * Tema: Remoção de caracteres e manipulação de substrings
 *
 * Este arquivo contém:
 * - Explicação teórica detalhada em comentários
 * - Exemplos práticos descomentados
 * - Implementações didáticas
 */

public class SubstringManipulation {

    /*
     * -------------------------------------------------------------
     * 1. REMOVENDO UM CARACTERE ESPECÍFICO USANDO SUBSTRING
     * -------------------------------------------------------------
     *
     * O method substring(int beginIndex, int endIndex) da classe String
     * permite extrair parte de uma string, sendo:
     *
     * - beginIndex: índice inicial (inclusivo)
     * - endIndex: índice final (exclusivo)
     *
     * Exemplo: "hello".substring(0, 2) → "he" (índices 0 e 1, mas não o 2)
     *
     * Aplicação:
     * Se queremos remover um caractere de uma string na posição `n`,
     * basta construir uma nova string composta por:
     * - A parte antes de `n`: substring(0, n)
     * - A parte depois de `n`: substring(n+1)
     *
     * A junção dessas partes nos dá a string sem o caractere em `n`.
     */

    public static String missingChar(String str, int n) {
        // Aqui extraímos a parte frontal da string: do início até o índice `n` (excluindo o próprio `n`)
        String front = str.substring(0, n);

        // Aqui pegamos a parte final da string: do índice `n+1` até o fim da string
        // Isso exclui o caractere na posição `n`, que é o objetivo
        String back = str.substring(n + 1, str.length());

        // Finalmente, concatenamos as duas partes: início + final
        return front + back;
    }

    // Exemplos com saída esperada:
    public static void exemploMissingChar() {
        System.out.println(missingChar("kitten", 1)); // Esperado: "ktten"
        System.out.println(missingChar("kitten", 0)); // Esperado: "itten"
        System.out.println(missingChar("kitten", 4)); // Esperado: "kittn"
    }

    /*
     * -------------------------------------------------------------
     * 2. EXTRAINDO O "MEIO" DE UMA STRING
     * -------------------------------------------------------------
     *
     * Objetivo: remover o primeiro e o último caractere da string.
     *
     * Solução: usar substring(1, str.length() - 1)
     * Isso pega do segundo caractere (índice 1) até o penúltimo caractere,
     * pois o índice final é exclusivo.
     *
     * Exemplo: "Java".substring(1, 3) → "av"
     */

    public static String midSubstring(String str) {
        // Se a string for muito curta, não há meio. Retorna string vazia.
        if (str.length() <= 2) return "";

        // Retorna todos os caracteres entre o primeiro e o último
        return str.substring(1, str.length() - 1);
    }

    public static void exemploMidSubstring() {
        System.out.println(midSubstring("Java"));   // Esperado: "av"
        System.out.println(midSubstring("String")); // Esperado: "trin"
    }

    /*
     * -------------------------------------------------------------
     * 3. TROCANDO O PRIMEIRO E O ÚLTIMO CARACTERE
     * -------------------------------------------------------------
     *
     * Problema: dada uma string, trocar os caracteres nas posições extremas.
     *
     * Solução:
     * - Se a string tiver tamanho 0 ou 1, retornamos como está.
     * - Pegamos o "meio" com substring(1, str.length() - 1)
     * - Retornamos: último + meio + primeiro
     */

    public static String frontBack(String str) {
        // Checagem para strings pequenas: nada a trocar
        if (str.length() <= 1) return str;

        // Extrai a parte do meio, sem o primeiro e último caracteres
        String mid = str.substring(1, str.length() - 1);

        // Retorna o último caractere + meio + primeiro caractere
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

    public static void exemploFrontBack() {
        System.out.println(frontBack("code")); // Esperado: "eodc"
        System.out.println(frontBack("a"));    // Esperado: "a"
        System.out.println(frontBack("ab"));   // Esperado: "ba"
    }

    /*
     * -------------------------------------------------------------
     * method PRINCIPAL PARA TESTES (main)
     * -------------------------------------------------------------
     *
     * Aqui chamamos os exemplos demonstrando na prática os comportamentos
     * explicados acima.
     */
    public static void main(String[] args) {
        System.out.println("== Removendo caractere ==");
        exemploMissingChar();

        System.out.println("\n== Extraindo meio ==");
        exemploMidSubstring();

        System.out.println("\n== Trocando extremos ==");
        exemploFrontBack();
    }
}

