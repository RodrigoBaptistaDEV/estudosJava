package main.java.Intermediario;

/**
 * Manual de Generics em Java
 *
 * Este manual fornece uma explicação detalhada sobre Generics em Java, incluindo definições,
 * exemplos de uso e melhores práticas.
 */

public class GenericsManual {

    /*
      Definição de Generics

      Generics permitem a criação de classes, interfaces e métodos que operam com tipos
      específicos, permitindo reutilização de código com tipos variados.

      Quando você define uma classe ou método com Generics em Java,
      o tipo especificado entre os sinais de menor e maior (<>) é substituído pelo tipo real
      quando você instancia a classe ou chama o método.

      Essa substituição ocorre em tempo de compilação e é conhecida como "type erasure" (apagamento de tipo).
      Durante a compilação, o compilador remove as informações sobre os tipos genéricos, substituindo-os pelos tipos reais
      conforme especificado na instância da classe ou na chamada do método.

     */

    /*
      Sintaxe Básica

      A declaração de um tipo genérico é feita utilizando o símbolo "<>" após o nome da classe,
      interface ou método, seguido do nome do tipo genérico.

      Exemplo:

       public class Lista<T> {
            private T[] elementos;
            // ...
       }

        public class Caixa<T> {
            private T conteudo;
            // ...
        }
     */

    /*
      Uso de Generics

      1. Permite criar estruturas de dados flexíveis e seguras em relação aos tipos.

      Exemplo:
        Caixa<Integer> caixaDeInteiro = new Caixa<>();
        caixaDeInteiro.setConteudo(10);
        Integer valor = caixaDeInteiro.getConteudo();

      2. Proporciona type safety durante a compilação, evitando casts desnecessários e
         possíveis ClassCastExceptions em tempo de execução.

      Exemplo:
        Lista<String> listaDeString = new Lista<>();
        listaDeString.adicionar("Exemplo");
        String item = listaDeString.obter(0);
     */

    /*
      Wildcards

      O "?" em Generics é chamado de wildcard e é utilizado para representar um tipo desconhecido.
      Ele permite que você escreva código genérico que possa ser aplicado a qualquer tipo específico.

      Wildcards permitem a flexibilidade ao trabalhar com tipos genéricos, permitindo a
      especificação de tipos desconhecidos ou desconhecidos.

      Exemplo:

        public void imprimirLista(Lista<?> lista) {
            for (Object item : lista) {
                System.out.println(item);
            }
        }
        A assinatura do método imprimirLista utiliza um wildcard <?>.
        Isso significa que o método pode receber uma lista de qualquer tipo.
        Dentro do método, o loop for itera sobre os elementos da lista, tratando-os como objetos (Object),
        já que o tipo exato dos elementos é desconhecido.

     */

        /*
          Restrições (bounded wildcards)

          Restrições podem ser aplicadas aos wildcards para limitar os tipos aceitos.

          Exemplo:
            public void processarLista(Lista<? extends Number> lista) {
                // ...
            }
         */

    /*
      Hierarquia de Tipos em Generics

      Tipos genéricos não têm hierarquia entre si, mas podem ser subtipos de seus tipos base.

      Exemplo:
        Lista<Integer> listaDeInteiro = new Lista<>();
        // Não é possível atribuir a lista de inteiro a uma lista de número
        Lista<Number> listaDeNumero = listaDeInteiro; // Erro de compilação
     */

    /*
      Erasure

      Durante a compilação, as informações sobre os tipos genéricos são removidas em um
      processo chamado erasure, resultando em código que manipula objetos de tipo raw.

      Exemplo:
        public class Lista<T> {
            private T[] elementos;
            // ...
        }
        // Após a compilação, a declaração de T é substituída por Object:
        public class Lista {
            private Object[] elementos;
            // ...
        }
     */

    /**
     * Considerações Finais
     *
     * Generics são uma poderosa ferramenta em Java para escrever código mais flexível,
     * seguro e reutilizável. Entender como aplicá-los corretamente pode melhorar
     * significativamente a qualidade e a robustez do seu código.
     */

    public static void main(String[] args) {
        // Exemplo de uso
        Caixa<Integer> caixaDeInteiro = new Caixa<>();
        caixaDeInteiro.setConteudo(10);
        Integer valor = caixaDeInteiro.getConteudo();
        System.out.println("Valor na caixa: " + valor);
    }
}

/**
 * Classe de Exemplo: Caixa<T>
 *
 * Esta classe representa uma caixa que pode conter qualquer tipo de objeto.
 */
class Caixa<T> {
    private T conteudo;

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
}

