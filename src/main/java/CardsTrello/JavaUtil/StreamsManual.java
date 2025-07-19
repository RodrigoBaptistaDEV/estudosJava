package main.java.CardsTrello.JavaUtil;

/*
 * Manual sobre Streams em Java (java.util.stream)
 *
 * As Streams em Java foram introduzidas no Java 8 como parte da biblioteca de
 * Streams (java.util.stream). Elas permitem processar coleções de objetos de forma
 * funcional e declarativa. Streams são sequências de elementos que suportam operações
 * agregadas e sequenciais.
 *
 * Aqui está um guia passo a passo explicando os conceitos e o uso de Streams em Java.
 */

import java.util.*;
import java.util.stream.*;

public class StreamsManual {
    public static void main(String[] args) {
        // Vamos começar criando uma lista de exemplo para uso nos exemplos seguintes
        List<String> palavras = Arrays.asList("cachorro", "gato", "elefante", "girafa", "tigre", "leão");
            // method Arrays.asList obrigatorio pra inicializar a lista diretamente.

        /*
         * 1. Criação de Streams
         *
         * Podemos criar streams de várias formas:
         * a) A partir de coleções (Collection)
         * b) A partir de arrays
         * c) Usando methods estáticos como Stream.of()
         */

            // a) Criação a partir de uma coleção
                Stream<String> streamDePalavras = palavras.stream();

            // b) Criação a partir de um array
                String[] array = {"um", "dois", "três"};
                Stream<String> streamDeArray = Arrays.stream(array);

            // c) Criação usando Stream.of()
                Stream<String> streamDeValores = Stream.of("a", "b", "c");

        /*
         * 2. Operações Intermediárias
         *
         * Operações intermediárias transformam uma stream em outra stream.
         * Elas são "lazy", ou seja, só são executadas quando uma operação terminal é invocada.
         */

            // Exemplo de uso de filter para filtrar palavras que começam com 'g'
            Stream<String> streamFiltrada = streamDePalavras.filter(s -> s.startsWith("g"));

                /*
                o filtro recebe um predicado, um criterio de escolha para o elemento, passamos uma função pra ele.
                dessa forma colocamos uma expressão lambda para tornar o código conciso.

                se fizessemos em separado por exemplo

                // Definindo a função separadamente

                    public static boolean minhaFuncao(String s) {
                        return s.startsWith("g");
                    }

                // Usando a função no method filter()

                    Stream<String> streamFiltrada = streamDePalavras.filter(StreamsManual::minhaFuncao);
                    // ( :: ) referencia de method, indicamos para o filtro que deve aplicar em cada elemento minhaFuncao();

                "para cada elemento s da stream, verifique se s começa com 'g'".

                essa expressão lambda é usada como um predicado para o method filter() da stream.

                O filter() então usa esse predicado para filtrar os elementos da stream,
                mantendo apenas aqueles para os quais o predicado retorna true, ou seja, aqueles que começam com 'g'.
                */


            // Exemplo de uso de map para transformar cada palavra em sua versão maiúscula

                Stream<String> streamMaiusculas = palavras.stream().map(String::toUpperCase);

                /*
                .map() é uma operação de stream que permite transformar cada elemento da stream de acordo com uma função especificada.

                String::toUpperCase é o method de referência que estamos passando para o map.
                toUpperCase() é um method da classe String - converte todas as letras de uma string em maiúsculas.

                Ao usar String::toUpperCase, estamos essencialmente dizendo ao map que para cada elemento da stream
                de entrada (no caso, a stream palavras), aplique o method toUpperCase() da classe String a esse elemento.

                Então, se palavras é uma lista de strings, streamMaiusculas conterá uma nova stream onde cada string
                foi transformada para que todas as letras estejam em maiúsculas.
                */


            // Exemplo de uso de sorted para ordenar as palavras

                Stream<String> streamOrdenada = palavras.stream().sorted();

        /*
         * 3. Operações Terminais
         *
         * Operações terminais produzem um resultado ou um efeito colateral.
         * Elas são necessárias para que as operações intermediárias sejam executadas.
         */

            // A) Exemplo de uso de collect para coletar os resultados em uma lista:

                List<String> listaFiltrada = streamFiltrada.collect(Collectors.toList());

                /*
                O method `collect()` é usado para coletar os elementos de um fluxo (stream) em uma coleção ou em outro tipo de estrutura de dados.
                Ele é uma operação terminal que permite que você converta os elementos de um fluxo em uma forma desejada, como uma lista, um conjunto, um mapa, etc.
                O method `Collectors.toList()` é um coletor pré-definido que cria uma lista contendo os elementos do fluxo.
                Quando você passa `Collectors.toList()` como argumento para o method `collect()`, você está instruindo o Java a coletar os elementos do fluxo em uma lista.
                Em resumo, o method `collect(Collectors.toList())` está coletando os elementos de um fluxo em uma lista. Isso é útil quando você precisa trabalhar com os elementos do fluxo em uma estrutura de lista para posterior manipulação ou processamento.
                */

                /*
                geralmente fazemos o processo inteiro em uma unica linha

                List<String> listaFiltrada = streamDePalavras.filter(s -> s.startsWith("g")).collect(Collectors.toList());
                */

            // B) Exemplo de uso de forEach para imprimir cada palavra:

                streamMaiusculas.forEach(System.out::println);

                    /*
                    estamos dizendo para o  para o forEach da stream que, para cada elemento na stream,
                    chame o method println de System.out e passe o elemento como argumento.
                    */

            // C) Exemplo de uso de count para contar o número de elementos:

                long quantidadeDePalavras = palavras.stream().count();

        /*
         * 4. Operações de Redução
         *
         * As operações de redução combinam os elementos de uma stream em um único resultado.
         */

            // Exemplo de uso de reduce para concatenar todas as palavras
            Optional<String> concatenado = palavras.stream().reduce((s1, s2) -> s1 + ", " + s2);

            // Exemplo de uso de findFirst para encontrar o primeiro elemento
            Optional<String> primeiro = palavras.stream().findFirst();

        /*
         * 5. Parallel Streams
         *
         * Streams paralelas podem ser usadas para dividir o trabalho em múltiplos núcleos de CPU.
         */

            // Criação de uma stream paralela a partir de uma coleção
            Stream<String> streamParalela = palavras.parallelStream();

            // Exemplo de uso de forEachOrdered para garantir ordem de execução em uma stream paralela
            streamParalela.forEachOrdered(System.out::println);

        /*
         * 6. Outras operações úteis
         */

            // Exemplo de uso de distinct para remover duplicatas
                List<String> palavrasComDuplicatas = Arrays.asList("cachorro", "gato", "gato", "elefante");
                List<String> semDuplicatas = palavrasComDuplicatas.stream().distinct().collect(Collectors.toList());

            // Exemplo de uso de limit para limitar o número de elementos
                List<String> primeirasDuasPalavras = palavras.stream().limit(2).collect(Collectors.toList());

            // Exemplo de uso de skip para pular os primeiros n elementos
                List<String> pulandoDuas = palavras.stream().skip(2).collect(Collectors.toList());

            // Exemplo de uso de anyMatch para verificar se algum elemento atende a um critério
                boolean existeElefante = palavras.stream().anyMatch(s -> s.equals("elefante"));

            // Exemplo de uso de allMatch para verificar se todos os elementos atendem a um critério
                boolean todosTemQuatroLetras = palavras.stream().allMatch(s -> s.length() == 4);

            // Exemplo de uso de noneMatch para verificar se nenhum elemento atende a um critério
                boolean nenhumComecaComZ = palavras.stream().noneMatch(s -> s.startsWith("z"));
    }
}

