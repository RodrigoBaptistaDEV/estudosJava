package main.java.CardsTrello.JavaGeral.ManipulacaoTextos;

// ===========================================================
// 📘 Manual Completo: Manipulando Textos em Java — Character e String
// ===========================================================

// 1. VISÃO GERAL
// -----------------------------------------------------------
// A linguagem Java possui duas classes principais para lidar com textos:
// - Character: manipula caracteres individuais do tipo char.
// - String: manipula sequências de caracteres (palavras, frases, etc).
// Ambas pertencem ao pacote java.lang, importado automaticamente.

public class TextoJavaManual {
    public static void main(String[] args) {

        // 2. PONTOS EM COMUM
        // -----------------------------------------------------------
        // Ambas as classes permitem manipulação de letras, números e símbolos
        // com suporte completo a Unicode e methods para comparação e transformação.

        System.out.println(Character.toUpperCase('a'));         // → 'A'
        System.out.println("abc".toUpperCase());               // → "ABC"
        System.out.println(Character.toString('z'));           // → "z"
        System.out.println("abc".equals("abc"));               // → true

        // 3. CLASSE CHARACTER
        // -----------------------------------------------------------
        // Character encapsula o tipo primitivo 'char' e fornece methods
        // para analisar e transformar caracteres individuais.

        // ⚠️ IMPORTANTE:
        // -----------------------------------------------------------
        // O construtor `Character(char)` foi descontinuado desde o Java 9
        // e está marcado para remoção futura.
        // Em vez disso, use:
        // - Autoboxing:     Character ch = 'a';
        // - Ou:             Character ch = Character.valueOf('a');
        //
        // O uso abaixo serve apenas como exemplo didático do funcionamento.

        Character ch = new Character('a'); // ⚠️ DEPRECATED desde Java 9

        // methods Estáticos
        System.out.println(Character.isDigit('5'));            // true
        System.out.println(Character.isLetter('a'));           // true
        System.out.println(Character.isLetterOrDigit('1'));    // true
        System.out.println(Character.isWhitespace(' '));       // true
        System.out.println(Character.isUpperCase('A'));        // true
        System.out.println(Character.isLowerCase('a'));        // true
        System.out.println(Character.toUpperCase('a'));        // 'A'
        System.out.println(Character.toLowerCase('A'));        // 'a'
        System.out.println(Character.getNumericValue('5'));    // 5
        System.out.println(Character.isAlphabetic('A'));       // true
        System.out.println(Character.charCount(0x1F600));      // 2 (emoji 😀)

        // methods de Instância
        System.out.println(ch.charValue());                    // 'a'
        System.out.println(ch.equals(new Character('a')));     // true
        System.out.println(ch.compareTo('b'));                 // negativo (ordem alfabética)

        // 4. CLASSE STRING
        // -----------------------------------------------------------
        // String é uma sequência de caracteres imutável. Muito usada
        // para lidar com textos, frases e palavras.

        // Criando Strings
        String nome = "João";
        String sobrenome = new String("Silva");

        // methods Comuns
        System.out.println("java".length());                   // 4
        System.out.println("java".charAt(1));                  // 'a'
        System.out.println("java".toUpperCase());              // "JAVA"
        System.out.println("JAVA".toLowerCase());              // "java"
        System.out.println("banana".substring(1, 4));          // "ana"
        System.out.println("a".equals("A"));                   // false
        System.out.println("a".equalsIgnoreCase("A"));         // true
        System.out.println("banana".contains("na"));           // true
        System.out.println("banana".replace("a", "o"));        // "bonono"
        String[] partes = "a,b,c".split(",");
        for (String parte : partes) {
            System.out.println(parte);                         // "a", "b", "c"
        }
        System.out.println("  abc  ".trim());                  // "abc"

        // 5. DIFERENÇAS RESUMIDAS
        // -----------------------------------------------------------
        // Character → representa um único caractere
        // String    → representa textos inteiros (imutáveis)
        // Usos distintos, mas complementares.

        // 6. USO COMBINADO
        // -----------------------------------------------------------
        // Usamos String e Character juntos para fazer análises char por char

        String texto = "Abc123";
        for (char c : texto.toCharArray()) {
            if (Character.isDigit(c)) {
                System.out.println(c + " é um dígito.");
            } else if (Character.isLetter(c)) {
                System.out.println(c + " é uma letra.");
            }
        }

        // 7. CONCLUSÃO
        // -----------------------------------------------------------
        // Saber manipular Character e String te dá controle total sobre
        // qualquer processamento textual em Java — de validações simples
        // até transformações complexas em textos.
    }
}
