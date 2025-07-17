package main.java.JavaGeral.estudoEnum;

public class Enum {

    /*
    Em Java, ENUMS (abreviação de "enumerations")
    são tipos de dados especiais que permitem definir um conjunto fixo de constantes nomeadas.
    Eles são úteis quando você tem um conjunto finito de valores que uma variável pode ter.

    */

    /*
    Na prática, um ENUM em Java é de fato uma classe especial que armazena um conjunto de valores constantes.
    São tipos de dados definidos globalmente em uma classe ou em um arquivo separado.

    Você não pode declarar um ENUM dentro de um method como faria com uma variável.
    ENUMS em Java são definidos em nível de classe, o que significa que eles são membros de uma classe e podem
    ser acessados por todos os methods dessa classe (e por outras classes, se forem públicos ou protegidos).
    */

    // EXEMPLO 1

    public enum DiaDaSemana {
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO,
        DOMINGO
    }

    public void acessandoDiaDaSemana(){
        DiaDaSemana dia = DiaDaSemana.SEGUNDA;
        System.out.println("Hoje é " + dia);
    }

    /*
     cada parte do ENUM é considerada uma constante do tipo DiaDaSemana.
     Embora possa parecer uma string quando você imprime o valor, internamente,
     cada constante é uma instância do tipo DiaDaSemana.

     A variável dia não está armazenando uma string;
     ela está armazenando uma instância do tipo DiaDaSemana que representa o dia da semana "SEGUNDA".

     essas variaveis portanto assum tipo de objeto, com as funções caracteristicas deste.
    */

    // EXEMPLO 2

    /*
    você pode usar um ENUM como tipo de atributo em uma classe.
    Isso é uma prática comum e pode ser muito útil para representar propriedades
    que têm um conjunto fixo de valores possíveis.
    */

    private String nome;
    private int idade;
    private Genero genero; // variavel do tipo enum Genero, enum importado de outro arquivo.
    private Profissao profissao; // variavel do tipo enum profissao, enum deste mesmo arquivo.
    enum Profissao {
        CARPINTEIRO,
        PROFESSOR
    }

    /*
    Neste exemplo, a classe Pessoa tem um atributo genero do tipo Genero, que é o ENUM definido dentro da própria classe.
    Quando você cria uma instância de Pessoa, você pode passar um valor do ENUM Genero como um dos argumentos,
    */

    // Pessoa pessoa = new Pessoa("Maria", 30, Pessoa.Genero.FEMININO);

    // EXEMPLO 3

    /*
    Se você deseja associar valores a cada constante em um ENUM, você deve definir atributos para armazenar esses valores
    e um construtor para inicializá-los. Em seguida, pode adicionar methods para acessar esses valores.
    */
    // Escolhendo o mês de fevereiro
    public void testeFuncao(){
        Mes mesEscolhido = Mes.FEVEREIRO;
        // Imprimindo o valor associado a fevereiro (2)
        System.out.println("O valor associado a FEVEREIRO é: " + mesEscolhido.getValor());
    }

}
