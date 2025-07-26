package main.java.CardsTrello.JavaGeral.ManipulacaoTextos;

public class StringBuilderManual {

    public static void main(String[] args) {
        //
        // =========================================================
        // MANUAL: MANIPULANDO STRINGS COM STRINGBUILDER EM JAVA
        // =========================================================
        //
        // INTRODUÇÃO:
        // A classe StringBuilder é usada para criar e manipular strings mutáveis.
        // Diferente da classe String, que é imutável, o StringBuilder permite que
        // seu conteúdo seja alterado sem criar novos objetos, sendo ideal para
        // operações intensivas de concatenação e edição de texto.
        //

        // ===== Criando um StringBuilder =====
        // Podemos criar um StringBuilder vazio ou com valor inicial.
        StringBuilder sb1 = new StringBuilder();               // StringBuilder vazio
        StringBuilder sb2 = new StringBuilder("Inicial");      // StringBuilder com conteúdo inicial
        System.out.println("sb1: '" + sb1 + "'");
        System.out.println("sb2: '" + sb2 + "'");

        // ===== append() =====
        // Adiciona valores ao final do conteúdo.
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");     // Resultado: "Hello World"
        sb.append(123);          // Resultado: "Hello World123"
        System.out.println("append: " + sb);

        // ===== insert(int offset, String str) =====
        // Insere conteúdo na posição especificada.
        StringBuilder sbInsert = new StringBuilder("Hello");
        sbInsert.insert(5, " World"); // Resultado: "Hello World"
        System.out.println("insert: " + sbInsert);

        // ===== delete(int start, int end) =====
        // Remove a sequência entre os índices start e end (exclusivo).
        StringBuilder sbDelete = new StringBuilder("Hello World");
        sbDelete.delete(5, 11); // Resultado: "Hello"
        System.out.println("delete: " + sbDelete);

        // ===== deleteCharAt(int index) =====
        // Remove o caractere no índice informado.
        StringBuilder sbCharDel = new StringBuilder("Hello");
        sbCharDel.deleteCharAt(1); // Resultado: "Hllo"
        System.out.println("deleteCharAt: " + sbCharDel);

        // ===== replace(int start, int end, String str) =====
        // Substitui o trecho entre start e end por uma nova string.
        StringBuilder sbReplace = new StringBuilder("Hello World");
        sbReplace.replace(6, 11, "Java"); // Resultado: "Hello Java"
        System.out.println("replace: " + sbReplace);

        // ===== reverse() =====
        // Inverte o conteúdo.
        StringBuilder sbReverse = new StringBuilder("Hello");
        sbReverse.reverse(); // Resultado: "olleH"
        System.out.println("reverse: " + sbReverse);

        // ===== substring(int start, int end) =====
        // Retorna uma nova String com o trecho entre os índices.
        StringBuilder sbSub = new StringBuilder("Hello World");
        String sub = sbSub.substring(6, 11); // Resultado: "World"
        System.out.println("substring: " + sub);

        // ===== toString() =====
        // Converte o conteúdo para uma String imutável.
        StringBuilder sbToString = new StringBuilder("Hello");
        String result = sbToString.toString(); // "Hello"
        System.out.println("toString: " + result);

        // ===== setLength(int newLength) =====
        // Define o novo tamanho da string. Trunca ou adiciona espaço.
        StringBuilder sbSetLen = new StringBuilder("Hello");
        sbSetLen.setLength(3); // Resultado: "Hel"
        System.out.println("setLength: " + sbSetLen);

        // ===== capacity() =====
        // Retorna a capacidade interna do buffer.
        StringBuilder sbCap = new StringBuilder();
        int capacity = sbCap.capacity(); // Padrão: 16
        System.out.println("capacity: " + capacity);

        // ===== length() =====
        // Retorna o comprimento atual da string.
        StringBuilder sbLen = new StringBuilder("Hello");
        int length = sbLen.length(); // Resultado: 5
        System.out.println("length: " + length);

        // ===== indexOf(String str) =====
        // Retorna o índice da primeira ocorrência da substring.
        StringBuilder sbIndex = new StringBuilder("Hello World");
        int index = sbIndex.indexOf("World"); // Resultado: 6
        System.out.println("indexOf: " + index);

        // ===== indexOf(String str, int fromIndex) =====
        // Busca a substring a partir de fromIndex.
        StringBuilder sbIndex2 = new StringBuilder("Hello World World");
        int index2 = sbIndex2.indexOf("World", 7); // Resultado: 12
        System.out.println("indexOf from 7: " + index2);

        // ===== charAt(int index) =====
        // Retorna o caractere no índice informado.
        StringBuilder sbChar = new StringBuilder("Hello");
        char c = sbChar.charAt(1); // Resultado: 'e'
        System.out.println("charAt(1): " + c);

        // ===== methods Não Disponíveis Diretamente em StringBuilder =====
        //
        // Alguns methods comuns da classe String NÃO estão presentes diretamente em StringBuilder.
        // Exemplos desses methods incluem:
        //
        // - contains(String)
        // - startsWith(String)
        // - endsWith(String)
        // - matches(String regex)
        //
        // Para utilizá-los, é necessário converter o conteúdo do StringBuilder para String.
        //
        // Exemplo:
        // StringBuilder sb = new StringBuilder("Hello World");
        // String str = sb.toString();
        // boolean containsHello = str.contains("Hello"); // Uso do method da classe String
        //
        // Apesar disso, muitos methods úteis como indexOf() e charAt() já estão disponíveis
        // diretamente em StringBuilder.
        //
        // A conversão é necessária apenas para methods específicos da API String que não fazem
        // parte da API de StringBuilder.
        //
        // Esses methods são amplamente utilizados para modificar, manipular e realizar validações,
        // buscas e comparações em conteúdo textual.

        StringBuilder sbConvert = new StringBuilder("Hello World");
        String str = sbConvert.toString();
        boolean contains = str.contains("Hello");
        System.out.println("contains(\"Hello\")? " + contains);

        // ===== Exemplo prático: caracteres em índices alternados (pares) =====
        //
        // Aqui está um exemplo utilizando StringBuilder para criar uma nova string
        // com os caracteres dos índices pares, partindo do primeiro:
        //
        // stringBits("Hello")       → "Hlo"
        // stringBits("Hi")          → "H"
        // stringBits("Heeololeo")   → "Hello"
        //

        String resultBits1 = stringBits("Hello");
        String resultBits2 = stringBits("Hi");
        String resultBits3 = stringBits("Heeololeo");

        System.out.println("stringBits(\"Hello\") → " + resultBits1);
        System.out.println("stringBits(\"Hi\") → " + resultBits2);
        System.out.println("stringBits(\"Heeololeo\") → " + resultBits3);
    }

    // method utilitário: retorna uma nova string contendo apenas os caracteres em índices pares
    public static String stringBits(String str) {
        if (str.length() <= 1) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (i % 2 == 0) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}

