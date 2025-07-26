package main.java.CardsTrello.JavaGeral.ManipulacaoTextos;

/*
 * ================================================================
 * MANUAL: Manipulação de Strings em Java
 * ================================================================
 *
 * Manipular strings em Java é uma tarefa comum e há várias maneiras
 * de realizar essa tarefa de forma eficiente. A seguir, explicações
 * completas nos comentários e exemplos descomentados.
 */

public class ManipulacaoStrings {

    public static void main(String[] args) {

        /*
         * =======================================================
         * 1. CLASSE STRING
         * =======================================================
         * A classe String em Java é imutável. Isso significa que,
         * uma vez criada, seu conteúdo não pode ser alterado.
         * Toda modificação retorna uma nova instância.
         * É recomendada para manipulações simples.
         */

        // Concatenação usando concat() e operador +
        String nome = "João";
        String sobrenome = "Silva";
        String completo1 = nome.concat(" ").concat(sobrenome);  // Usando concat()
        String completo2 = nome + " " + sobrenome;              // Usando operador +
        System.out.println(completo1);
        System.out.println(completo2);

        // Subcadeia usando substring()
        String saudacao = "Olá Mundo";
        String sub = saudacao.substring(0, 3); // "Olá"
        System.out.println(sub);

        // Substituição usando replace() e replaceAll()
        String frase = "Hoje é sexta-feira";
        String novaFrase = frase.replace("sexta", "sábado"); // "Hoje é sábado-feira"
        System.out.println(novaFrase);

        // Comparação: equals(), equalsIgnoreCase(), compareTo()
        String a = "java";
        String b = "Java";
        boolean igual = a.equals(b);                 // false
        boolean igualIgnoraCase = a.equalsIgnoreCase(b); // true
        int comparacao = a.compareTo(b);             // valor negativo
        System.out.println(igual);
        System.out.println(igualIgnoraCase);
        System.out.println(comparacao);

        // Divisão usando split()
        String csv = "maçã,banana,laranja";
        String[] frutas = csv.split(",");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // Tamanho usando length()
        int tamanho = nome.length(); // 4
        System.out.println(tamanho);

        // Conversão para maiúsculas e minúsculas
        String maiuscula = nome.toUpperCase(); // "JOÃO"
        String minuscula = sobrenome.toLowerCase(); // "silva"
        System.out.println(maiuscula);
        System.out.println(minuscula);

        /*
         * =======================================================
         * 2. CLASSES StringBuilder e StringBuffer
         * =======================================================
         * Usadas para manipulação eficiente de strings mutáveis.
         * StringBuilder -> não sincronizado, mais rápido.
         * StringBuffer  -> sincronizado, seguro para threads.
         */

        // Usando StringBuilder
        StringBuilder sb = new StringBuilder("Olá");
        sb.append(" Mundo");              // "Olá Mundo"
        sb.insert(3, ",");                // "Olá, Mundo"
        sb.delete(3, 4);                  // "Olá Mundo"
        sb.replace(4, 9, "Java");         // "Olá Java"
        sb.reverse();                     // "avaJ álO"
        sb.reverse();                     // Volta ao normal
        System.out.println(sb.toString());

        // Usando StringBuffer (sintaxe idêntica ao StringBuilder)
        StringBuffer sbf = new StringBuffer("Olá");
        sbf.append(" Mundo");
        sbf.replace(4, 9, "Java");
        System.out.println(sbf.toString());

        /*
         * =======================================================
         * 3. Classe StringTokenizer (LEGADO)
         * =======================================================
         * Quebra a string em tokens. Menos usada atualmente.
         * split() é preferível.
         */

        java.util.StringTokenizer tokenizer = new java.util.StringTokenizer("Um exemplo simples");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        /*
         * =======================================================
         * 4. Manipulação Avançada
         * =======================================================
         */

        // Expressões Regulares usando matches()
        String cpf = "123-45-6789";
        String padrao = "\\d{3}-\\d{2}-\\d{4}";
        boolean valido = cpf.matches(padrao); // true
        System.out.println(valido);

        // Formatação usando String.format()
        String nomePessoa = "Maria";
        int idade = 28;
        String formatado = String.format("Nome: %s, Idade: %d", nomePessoa, idade);
        System.out.println(formatado);

        /*
         * =======================================================
         * 5. Conversão de String para Tipos Primitivos
         * =======================================================
         */

        // Conversão para inteiro e double
        String numeroStr = "42";
        int inteiro = Integer.parseInt(numeroStr);
        double decimal = Double.parseDouble("3.14");
        System.out.println(inteiro);
        System.out.println(decimal);

        /*
         * =======================================================
         * Exemplo Prático Final: Trocar Primeira e Última Letras
         * =======================================================
         */

        String original = "código";
        if (original.length() > 1) {
            String troca = original.charAt(original.length() - 1) +
                    original.substring(1, original.length() - 1) +
                    original.charAt(0);
            System.out.println(troca); // "ódigoc"
        }

        /*
         * =======================================================
         * Exemplo: Remover um caractere na posição n
         * =======================================================
         */

        String texto = "banana";
        int n = 3; // remover 'a'
        String resultado = texto.substring(0, n) + texto.substring(n + 1);
        System.out.println(resultado); // "banna"
    }
}
