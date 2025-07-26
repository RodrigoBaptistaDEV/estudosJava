package main.java.CardsTrello.POO;

/**
 * ========================================
 * Instanciação e Inicialização em POO Java
 * ========================================
 *
 * Neste arquivo, você encontrará:
 * 1. Conceito de Instanciação em Java
 * 2. Conceito de Inicialização
 * 3. Diferença entre variáveis de referência e objetos
 * 4. Atribuição de valores e uso de construtores
 * 5. Alocação de memória e valores padrão
 *
 * Todos os exemplos são executáveis e a teoria está comentada.
 */

// 1. CLASSE MODELO PARA EXEMPLOS
class Pessoa {

    // Variáveis de instância
    String nome;
    int idade;

    // Construtor padrão
    public Pessoa() {
        // Não faz nada explicitamente, apenas permite a criação da instância
    }

    // Construtor com parâmetros
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // method para exibir dados
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

// CLASSE PRINCIPAL DO ARQUIVO
public class InstanciacaoPOO {

    public static void main(String[] args) {

        /**
         * =====================================
         * 1. Instanciação
         * =====================================
         *
         * Instanciar uma classe é criar um objeto na memória baseado nela.
         * Em Java, isso é feito com o operador `new`, que:
         * - Aloca espaço na memória para o objeto
         * - Executa o construtor da classe
         * - Retorna uma referência ao novo objeto
         */

        // Exemplo de instanciação usando o construtor padrão:
        Pessoa pessoa1 = new Pessoa();

        /**
         * =====================================
         * 2. Inicialização
         * =====================================
         *
         * Após instanciar, o objeto pode (ou deve) ser inicializado.
         * Atribuímos valores às variáveis de instância como abaixo:
         */

        pessoa1.nome = "João";
        pessoa1.idade = 30;

        pessoa1.exibirDados();

        /**
         * =====================================
         * 3. Instanciação com Construtor Personalizado
         * =====================================
         *
         * Podemos inicializar os atributos já no momento da criação do objeto,
         * usando um construtor com parâmetros.
         */

        Pessoa pessoa2 = new Pessoa("Maria", 25);
        pessoa2.exibirDados();

        /**
         * =====================================
         * 4. Memória e Dados
         * =====================================
         *
         * Cada vez que usamos `new`, um novo espaço na memória é reservado.
         * Mesmo que duas instâncias tenham os mesmos valores, são objetos distintos.
         */

        Pessoa pessoa3 = new Pessoa("João", 30);

        // Comparando referências (endereços na memória)
        System.out.println("pessoa1 == pessoa3? " + (pessoa1 == pessoa3)); // false

        /**
         * =====================================
         * 5. Valores Padrão
         * =====================================
         *
         * Se não inicializarmos as variáveis, elas assumem valores padrão:
         * - int → 0
         * - String (ou qualquer objeto) → null
         */

        Pessoa pessoa4 = new Pessoa();
        pessoa4.exibirDados(); // nome: null, idade: 0

        /**
         * =====================================
         * Conclusão
         * =====================================
         *
         * - Instanciação: Criação do objeto na memória
         * - Inicialização: Atribuição de valores às variáveis do objeto
         * - Java usa `new` para instanciar
         * - Objetos têm valores padrão, mas devem ser inicializados para uso seguro
         * - Construtores são úteis para inicializar de forma mais controlada
         */
    }
}
