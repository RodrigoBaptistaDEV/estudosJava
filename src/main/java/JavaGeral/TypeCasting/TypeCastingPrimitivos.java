package main.java.JavaGeral.TypeCasting;

public class TypeCastingPrimitivos {

    //* * TYPE CASTING COM TIPOS PRIMITIVOS
    /*
     *
     * Casting (ou coerção de tipo) é a conversão de um tipo de dado em outro.
     * Isso é necessário quando:
     * - Desejamos atribuir um valor de um tipo para outro diferente.
     * - Precisamos realizar operações entre diferentes tipos.
     *
     * Existem dois tipos principais:
     *
     * 1. CASTING IMPLÍCITO (WIDENING):
     *    - Ocorre automaticamente, quando não há risco de perda de dados.
     *    - Envolve a conversão de um tipo menor para um tipo maior.
     *    - Exemplo: int → long → float → double
     *
     * 2. CASTING EXPLÍCITO (NARROWING):
     *    - É necessário quando há risco de perda de dados.
     *    - Envolve a conversão de um tipo maior para um tipo menor.
     *    - Deve ser feito manualmente, usando: (tipoDesejado) valor
     *
     * ATENÇÃO:
     * - O compilador exige cast explícito sempre que houver possível perda de informação.
     * - Quando a operação envolve múltiplos tipos, o Java promove o tipo resultante para o mais abrangente.
     * - String é uma exceção, pois é uma classe, e concatenações envolvem conversão automática para texto.
     *
     * -------------------------------------------------------------
     * |   DE/PARA  | byte | short | char | int | long | float | double |
     * |------------|------|-------|------|-----|------|-------|--------|
     * | byte       |  --  | Impl  | Impl | Impl| Impl | Impl  | Impl   |
     * | short      | (b)  |  --   | Impl | Impl| Impl | Impl  | Impl   |
     * | char       | (b)  | (s)   |  --  | Impl| Impl | Impl  | Impl   |
     * | int        | (b)  | (s)   | (c)  | --  | Impl | Impl  | Impl   |
     * | long       | (b)  | (s)   | (c)  | (i) | --   | Impl  | Impl   |
     * | float      | (b)  | (s)   | (c)  | (i) | (l)  | --    | Impl   |
     * | double     | (b)  | (s)   | (c)  | (i) | (l)  | (f)   | --     |
     * -------------------------------------------------------------
     * Legenda: Impl = Casting Implícito | (x) = Casting Explícito
     *
     */

    public static void main(String[] args) {
        exemploCastingImplicito();
        exemploCastingExplicito();
        exemploPerdaDePrecisao();
        exemploCharComValorNumerico();
        exemploCharComOperacaoAritmetica();
        exemploConcatenacaoString();
        exemploCastingEntrePrimitivos();
    }

    // 1. Casting Implícito: sem perda de dados.
    public static void exemploCastingImplicito() {
        int inteiro = 42;
        double convertido = inteiro;  // Conversão implícita de int para double
        System.out.println("Casting Implícito (int → double): " + convertido); // Saída: 42.0
    }

    // 2. Casting Explícito: possível perda de dados.
    public static void exemploCastingExplicito() {
        double flutuante = 42.75;
        int inteiro = (int) flutuante; // Conversão explícita de double para int
        System.out.println("Casting Explícito (double → int): " + inteiro); // Saída: 42
    }

    // 3. Exemplo com perda de precisão: casting com truncamento.
    public static void exemploPerdaDePrecisao() {
        int valorGrande = 150;
        byte valorPequeno = (byte) valorGrande; // byte vai de -128 a 127
        System.out.println("Casting com estouro (int → byte): " + valorPequeno); // Saída: -106
    }

    // 4. char com valor numérico
    public static void exemploCharComValorNumerico() {
        char letra = 66; // Código Unicode do caractere 'B'
        System.out.println("char com valor numérico: " + letra); // Saída: B
    }

    // 5. char com operação aritmética
    public static void exemploCharComOperacaoAritmetica() {
        char letra = 'C'; // 'C' = 67
        letra = (char) (letra + 3); // Soma 3 → 70 → 'F'
        System.out.println("char com operação e cast explícito: " + letra); // Saída: F
    }

    // 6. Casting automático em concatenação de Strings
    public static void exemploConcatenacaoString() {
        String texto = "Curso Java ";
        int ano = 2025;
        texto = texto + ano; // Casting implícito de int para String
        System.out.println("Concatenação com String: " + texto); // Saída: Curso Java 2025
    }

    // 7. Outros exemplos entre tipos primitivos
    public static void exemploCastingEntrePrimitivos() {
        byte b = 10;
        short s = b; // implícito

        int i = s; // implícito
        long l = i; // implícito
        float f = l; // implícito
        double d = f; // implícito

        System.out.println("byte → short → int → long → float → double: " + d);

        // Casting explícito reverso
        double valorDouble = 99.99;
        int valorInt = (int) valorDouble;
        byte valorByte = (byte) valorInt;

        System.out.println("double → int (explícito): " + valorInt); // 99
        System.out.println("int → byte (explícito): " + valorByte);  // Pode haver truncamento
    }

}
