package main.java.CardsTrello.POO;

/*
 * ============================================
 * CONSTRUTORES EM JAVA - EXPLICAÇÃO COMPLETA
 * ============================================
 *
 * Em Java, um construtor é um method especial que é invocado automaticamente
 * quando um objeto é criado a partir de uma classe. Sua principal função é
 * inicializar os atributos da classe com valores padrão ou fornecidos pelo programador.
 *
 * Um construtor:
 * - É definido pelo nome da classe.
 * - Pode ter zero ou mais parâmetros.
 * - Pode ser sobrecarregado.
 * - Não possui tipo de retorno, nem mesmo void.
 * - É chamado automaticamente pelo operador 'new'.
 *
 * Se nenhum construtor for declarado, o compilador cria um construtor padrão (sem parâmetros).
 *
 * Exemplos de uso incluem:
 * - Inicialização de variáveis de instância com valores padrão ou fornecidos.
 * - Validação de dados de entrada.
 * - Execução de tarefas necessárias para o funcionamento correto do objeto.
 *
 * A seguir, veremos implementações práticas com explicações no estilo manual.
 */

public class ConstrutorManual {
    public static void main(String[] args) {
        // Criação de objeto usando o construtor com parâmetros
        Pessoa3 pessoa1 = new Pessoa3("João", 30);
        System.out.println("Pessoa:");
        pessoa1.imprimir();

        /*
         * A classe Carro demonstra:
         * - Construtor padrão (sem argumentos).
         * - Construtor com parâmetros.
         * - Sobrecarga de construtores.
         * - Uso de 'this' para distinguir entre atributos e parâmetros.
         */
        Carro1 carro1 = new Carro1();  // Construtor padrão
        System.out.println("\nCarro 1:");
        carro1.imprimirDetalhes();

        Carro1 carro2 = new Carro1("Toyota", "Corolla", 2022);  // Construtor com parâmetros
        System.out.println("\nCarro 2:");
        carro2.imprimirDetalhes();

        /*
         * A classe MyClass demonstra como sobrecarregar um construtor
         * para permitir atributos opcionais (versão com e sem argumento adicional).
         */
        MyClass obj1 = new MyClass(10);                  // Construtor com apenas o obrigatório
        MyClass obj2 = new MyClass(20, "opcional");      // Construtor com atributo opcional

        /*
         * A classe Celular mostra o construtor padrão explícito (poderia ser implícito)
         * e o uso de construtor com parâmetros.
         */
        Celular celular1 = new Celular();  // Construtor padrão
        System.out.println("\nCelular 1:");
        celular1.imprimirDetalhes();

        Celular celular2 = new Celular("Samsung", "Motorola", 2022);  // Com parâmetros
        System.out.println("\nCelular 2:");
        celular2.imprimirDetalhes();
    }
}

/*
 * Classe Pessoa — exemplo básico de classe com dois atributos.
 * O construtor recebe os valores iniciais e atribui usando 'this'.
 */
class Pessoa3 {
    private String nome;
    private int idade;

    public Pessoa3(String nome, int idade) {
        // A palavra-chave 'this' se refere ao objeto atual da classe.
        // Usada para distinguir atributos da classe de parâmetros.
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

/*
 * Classe Carro — demonstra construtor padrão e com parâmetros,
 * uso de 'this', e encapsulamento com getters/setters.
 */
class Carro1 {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor padrão (sem parâmetros)
    public Carro1() {
        // Inicializa com valores padrão
        marca = "Indefinido";
        modelo = "Indefinido";
        ano = 0;
    }

    // Construtor com parâmetros
    public Carro1(String marca, String modelo, int ano) {
        // 'this' distingue os atributos da classe dos parâmetros
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void imprimirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

/*
 * Classe MyClass — demonstra  sobrecarga para maior flexibilidade.
 */
class MyClass {
    private int atributoObrigatorio;
    private String atributoOpcional;

    public MyClass(int atributoObrigatorio, String atributoOpcional) {
        this.atributoObrigatorio = atributoObrigatorio;
        this.atributoOpcional = atributoOpcional;
    }

    public MyClass(int atributoObrigatorio) {
        this.atributoObrigatorio = atributoObrigatorio;
        this.atributoOpcional = "Padrão"; // valor padrão atribuído internamente
    }
}

/*
 * Classe Celular — reforça os conceitos:
 * - Construtor padrão implícito ou explícito.
 * - Construtor parametrizado.
 * - Encapsulamento com methods de acesso.
 */
class Celular {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor padrão — mesmo sem implementação, seria gerado automaticamente
    public Celular() {}

    // Construtor com parâmetros
    public Celular(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Encapsulamento

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void imprimirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

