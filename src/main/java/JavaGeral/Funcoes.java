package main.java.JavaGeral;

public class Funcoes {

/*
Em Java, funções são chamadas de methods.
Um method é um bloco de código que realiza uma tarefa específica
e pode ser reutilizado em diferentes partes do programa.
*/

/*

A declaração completa de um method (função) em Java inclui quatro partes principais:

1 - Modificador de Acesso:

    Indica a visibilidade do method.
    Pode ser public, private, protected ou deixado em branco (o que significa que tem acesso ao pacote).
    Isso determina onde o method pode ser acessado.

2 - Modificadores de Estado ou Modificadores de Comportamento,:

    Modificadores de Estado ---> Controlam o estado ou a modificação de variáveis e methods.
    static: Associa o membro à classe em vez de a instâncias individuais.
    final: Indica que o membro não pode ser alterado (constante no caso de variáveis, method não pode ser sobrescrito no caso de methods).

    Modificadores de Comportamento ---> Controlam o comportamento e a implementação dos methods.
    abstract: Indica que o method não tem implementação na classe atual e deve ser implementado pelas subclasses.
    native: Indica que a implementação do method é fornecida em código nativo (fora do Java).
    strictfp: Garante precisão consistente em operações de ponto flutuante.

3- Tipo de Retorno:

    Indica o tipo de dado que o method retorna.
    Pode ser qualquer tipo de dado válido em Java (int, double, String, etc.) ou void se o method não retornar nenhum valor.

4- Nome do Method:

    O identificador que você escolhe para a função.
    Deve seguir as convenções de nomenclatura Java. Este é o nome que você usa para chamar o method.

*/


// 1 MODIFICADOR DE ACESSO

    void metodoPadrao() {
        // (Nenhum Modificador): Se nenhum modificador de acesso for especificado, o method pode ser acessado apenas por classes do mesmo pacote.
    }
    public void metodoPublico() {
        // public: O method pode ser acessado de qualquer lugar.
    }

    private void metodoPrivado() {
        // private: O method só pode ser acessado dentro da própria classe.
    }

    protected void metodoProtegido() {
        //  protected: O method pode ser acessado por classes do mesmo pacote e por subclasses (mesmo que estejam em pacotes diferentes).
    }

// 2 MODIFICADORES DE ESTADO OU COMPORTAMENTO

    // conforme cada caracteristica e função especifica.

    // Um method estático pertence à classe, não a instâncias específicas, e pode ser chamado diretamente na classe, sem criar um objeto.
    static void metodoEstatico() {
        System.out.println("method estático.");
    }

    // um method é marcado como final, ele não pode ser sobrescrito por subclasses.
    // Isso significa que a implementação do method na classe atual é a versão final e não pode ser modificada nas subclasses.
    final void metodoFinal() {
        // Implementação do method final
    }

// 3 TIPO DE RETORNO

    // para methods não void, é necessário ter uma instrução de return com um valor compatível com o tipo de retorno
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
        // Não há instrução de retorno, pois o method é void
    }
    public int somarExemplo(int a, int b) {
        return a + b;
    }

// 4 NOME DA FUNÇÃO

    /*
    a. CamelCase:
    Use o estilo CamelCase para nomes de methods.
    Comece com uma letra minúscula e capitalize a primeira letra de cada palavra subsequente.
    Exemplo: calcularSaldo, imprimirMensagem.

    b. Verbo + Substantivo:
    Dê nomes descritivos que incluam um verbo seguido por um substantivo.
    Isso ajuda a expressar claramente a ação realizada pelo method.
    Exemplo: calcularSalario, enviarEmail.

    c. Evite Abreviações Excessivas:
    Evite abreviações excessivas e use nomes significativos que descrevam a funcionalidade do method.
     Nomes claros aumentam a legibilidade do código. Exemplo: calcularImposto em vez de calcImp.

    d.Evite Nomes Genéricos:
    Evite nomes muito genéricos como funcao, processar, etc.
    Tente ser específico sobre o que o method faz. Exemplo: processarPagamento em vez de processar.

    e.Escolha Nomes Intuitivos:
    Escolha nomes que sejam intuitivos e que forneçam uma boa compreensão da funcionalidade do method.
    Isso facilita o entendimento do código por outros desenvolvedores.
    */

    public void calcularSaldoConta() {
        // Implementação do method
    }

    public String gerarRelatorioFinanceiro() {
        // Implementação do method
        return "Relatório gerado com sucesso.";
    }

// EXEMPLOS GERAIS DE FUNÇÃO E COMO CHAMA-LAS

    // Exemplo de função sem retorno (void)
    public static void saudacao() {
        System.out.println("Olá! Bem-vindo à função de saudação.");
    }

    // Exemplo de função com retorno
    public static int somar(int a, int b) {
        return a + b;
    }

    // Exemplo de função com modificadores de acesso
    private static double calcularMedia(double[] valores) {
        if (valores.length == 0) {
            return 0.0;
        }

        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }

        return soma / valores.length;
    }

    // Exemplo de função com parâmetros e retorno condicional
    public static String verificarParOuImpar(int numero) {
        if (numero % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }
    }

    // Exemplo de função principal ( ver como chamar outras funções em geral)
    public static void main(String[] args) {
        // Chamando a função de saudação
        saudacao();

        // Chamando a função de soma
        int resultadoSoma = somar(10, 5);
        System.out.println("Resultado da soma: " + resultadoSoma);

        // Chamando a função para calcular a média
        double[] valores = { 3.5, 4.0, 5.5 };
        double media = calcularMedia(valores);
        System.out.println("Média dos valores: " + media);

        // Chamando a função para verificar se um número é par ou ímpar
        int numero = 7;
        String resultadoParOuImpar = verificarParOuImpar(numero);
        System.out.println("O número " + numero + " é: " + resultadoParOuImpar);
    }


    // OBS - a utilização do Return

        /*
        O `return` em Java é uma instrução que serve para encerrar a execução de um method e, opcionalmente, retornar um valor.
        Quando você chama `return` dentro de um method, a execução desse method é interrompida e o controle é devolvido ao ponto onde o method foi chamado.
        */

        /*
        Se um method tem um tipo de retorno não-`void`, você precisa fornecer um valor de retorno compatível com esse tipo, por exemplo:
        */

            public int soma(int a, int b) {
                return a + b; // Retorna a soma de 'a' e 'b'
            }

        /*
        Se o method tem tipo de retorno `void`, você pode usar `return` sozinho para simplesmente encerrar a execução do method, sem retornar nenhum valor:
        */

            public void olaMundo() {
                System.out.println("Olá, mundo!");
                return; // Não está retornando nenhum valor, apenas encerrando a execução do method
            }


        /*
        o return não encerra a execução do programa, ele sai do method e volta pra onde foi chamado.
        Se por exemplo não tem nada na função que o chamou, como main(){funçãoChamada()} então o programa é encerrado.
        */

        /*
        Ainda, atente-se que:
        return é uma instrução que encerra a execução do method onde está sendo chamado, não importa onde esteja no method.
        Uma vez que a execução chega ao return, não importa se está dentro de um switch, um if, um loop ou qualquer outro bloco de código,
        o method será encerrado imediatamente e o controle será devolvido ao ponto onde o method foi chamado.
        */

}
