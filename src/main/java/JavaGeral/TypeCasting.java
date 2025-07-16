package main.java.JavaGeral;

public class TypeCasting {

// Exemplos

    public static void main(String[] args) {
        exemploCharComValorNumerico();
        exemploCharComOperacaoAritmetica();
        exemploConcatenacaoString();
    }

// O tipo char armazena apenas um caractere da tabela Unicode.
// Quando atribuímos um valor numérico a ele, o Java realiza uma conversão automática, conhecida como Coerção de Tipo,
// convertendo esse valor para o caractere correspondente na tabela Unicode.

    public static void exemploCharComValorNumerico() {
        char valor = 65;  // Compila!
        System.out.println(valor); // O resultado é 'A'.
    }

// Para um segundo teste, vamos tentar realizar uma operação matemática simples, adicionando 1 ao valor da variável 'valor'.
// No entanto, o código não compila porque o Java converte automaticamente o resultado da soma para o maior tipo envolvido na operação,
// que é int, e tenta atribuí-lo a uma variável do tipo char.

// Para fazer o código compilar, é necessário realizar um Type Casting Explícito do resultado da soma para o tipo char.
// Isso é feito envolvendo a expressão da soma com parênteses e prefixando-a com '(char)'.

    public static void exemploCharComOperacaoAritmetica() {
        char valor = 65;
        System.out.println(valor);

        // valor = valor + 1; // Não compila!

        valor = (char) (valor + 1);
        System.out.println(valor);
    }

// Em seguida, vamos introduzir o tipo String, destacando que é diferente dos tipos primitivos que foram usados até agora.
// Vamos criar uma variável 'palavra' do tipo String e inicializá-la com a frase "alura cursos online de tecnologia".
// Vamos imprimir essa String no console e verificar que a frase é exibida corretamente.

// Para mostrar como o Java trata automaticamente a conversão de tipos na concatenação de Strings,
// vamos concatenar a String 'palavra' com o número 2020.
// O Java realiza uma conversão automática, conhecida como Coerção de Tipo,
// convertendo o número para String e concatenando-o à String 'palavra',
// resultando na frase original seguida pelo número.

    public static void exemploConcatenacaoString() {
        String palavra = "alura cursos online de tecnologia";
        System.out.println(palavra);

        palavra = palavra + 2020;
        System.out.println(palavra);
    }

    /** Dessa maneira temos que **/

// Cast Implícito:
// Ocorre quando não há perda de dados ao converter de um tipo de dado de menor precisão para um tipo de dado de maior precisão.
// Por exemplo, ao atribuir um valor inteiro a uma variável do tipo double.

    public static void exemploIntParaDouble() {
        int numeroInteiro = 10;
        double numeroDouble = numeroInteiro; // Cast implícito de int para double
        System.out.println(numeroDouble); // Resultado: 10.0
    }

// Cast Explícito:
// Ocorre quando há risco de perda de dados ao converter de um tipo de dado de maior precisão para um tipo de dado de menor precisão.
// Nesses casos, é necessário um cast explícito para indicar ao compilador que você está ciente da possível perda de dados.
// Por exemplo, ao atribuir um valor double a uma variável do tipo int.

    public static void exemploDoubleParaInt() {
        double numeroDouble = 10.5;
        int numeroInteiro = (int) numeroDouble; // Cast explícito de double para int
        System.out.println(numeroInteiro); // Resultado: 10 (parte decimal é descartada)
    }

// Outros Exemplos:

// Cast Implícito:
// Ao converter de int para float, não há perda de precisão, pois float é capaz de representar valores inteiros.

    public static void exemploIntParaFloat() {
        int numeroInteiro = 10;
        float numeroFloat = numeroInteiro; // Cast implícito de int para float
        System.out.println(numeroFloat); // Resultado: 10.0
    }

// Cast Explícito:
// Ao converter de float para double, não há risco de perda de precisão, pois double tem maior capacidade de armazenamento que float.

    public static void exemploFloatParaDouble() {
        float numeroFloat = 10.5f;
        double numeroDouble = (double) numeroFloat; // Cast explícito de float para double
        System.out.println(numeroDouble); // Resultado: 10.5
    }

}
