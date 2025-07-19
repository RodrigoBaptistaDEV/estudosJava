package main.java.CardsTrello.JavaGeral;

/*
 * A Notação de Ponto em Java
 *
 * A notação de ponto (.) é uma das construções sintáticas mais importantes da linguagem Java.
 * Ela permite o acesso a atributos, methods e classes internas de maneira simples e direta.
 *
 * Pode ser usada em dois contextos principais:
 * 1. Acesso direto a membros de classes ou objetos (atributos e methods)
 * 2. Encadeamento de chamadas (method chaining)
 *
 * Importância:
 * - Essencial para programação orientada a objetos (POO)
 * - Amplamente usada em bibliotecas e APIs Java
 * - Base para leitura e escrita de expressões complexas
 */
public class NotacaoPonto {

    // -----------------------------
    // 1. ACESSO DIRETO A MEMBROS
    // -----------------------------

    /*
     * Membros estáticos são acessados diretamente pela classe, sem necessidade de instanciar um objeto.
     * A notação de ponto permite referenciar esses membros diretamente pelo nome da classe.
     *
     * Exemplos clássicos:
     * - Math.PI (constante)
     * - System.out.println() (acesso a membros encadeados estáticos)
     */
    public static void membrosEstaticos() {
        // Acesso a constante estática da classe Math
        double pi = Math.PI;
        System.out.println("Valor de PI: " + pi); // Saída esperada: 3.141592653589793

        // Acesso a membro estático de classe interna
        ClasseExterna.ClasseInterna.metodoEstatico(); // Saída: method estático chamado!
        System.out.println("Variável estática: " + ClasseExterna.ClasseInterna.variavelEstatica); // Saída: Sou estática!

        // Encadeamento com method estático
        // staticMethod() retorna uma String, que é encadeada com toUpperCase()
        String resultado = MyClass.staticMethod().toUpperCase(); // "HELLO"
        System.out.println("method estático encadeado: " + resultado);
    }

    /*
     * Quando trabalhamos com instâncias (objetos), a notação de ponto permite acessar
     * os atributos e methods de cada objeto.
     *
     * Importante:
     * - O objeto deve estar instanciado (com new) antes do uso.
     * - Acesso direto a atributos públicos (evitar em produção, preferir encapsulamento)
     */
    public static void membrosDeInstancia() {
        // methods de instância da classe String
        String mensagem = "Olá, mundo!";
        int tamanho = mensagem.length(); // length() retorna o número de caracteres
        System.out.println("Tamanho da mensagem: " + tamanho);

        // Criação de um objeto do tipo Pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "João"; // Acesso direto ao atributo público
        System.out.println("Nome da pessoa: " + pessoa.nome);

        // Acesso encadeado a objetos internos (composição)
        pessoa.endereco = new Endereco("Rua das Flores", "São Paulo");
        System.out.println("Rua: " + pessoa.endereco.getRua());
        System.out.println("Cidade: " + pessoa.endereco.getCidade());
    }

    // -------------------------------------------
    // 2. ENCADEAMENTO DE NOTAÇÃO DE PONTO (CHAINING)
    // -------------------------------------------

    /*
     * Encadeamento simples de methods e atributos
     * Mesmo que não seja method chaining, estamos usando retorno de method diretamente
     */
    public static void chainingSimples() {
        Person person = new Person(30);
        int doubleAge = person.getAge() * 2; // getAge() retorna int, que é usado na mesma linha
        System.out.println("Idade dobrada: " + doubleAge);
    }

    /*
     * StringBuilder é uma classe projetada para method chaining
     * Cada method retorna a própria instância (this)
     */
    public static void chainingStringBuilder() {
        // Versão tradicional, sem encadeamento
        StringBuilder sb = new StringBuilder();
        sb.append("Olá");
        sb.append(" ");
        sb.append("mundo");
        String resultado = sb.toString();
        System.out.println("Sem chaining: " + resultado);

        // Com method chaining — encadeamento direto de chamadas
        String resultadoChaining = new StringBuilder()
                .append("Olá")
                .append(" ")
                .append("mundo")
                .toString();
        System.out.println("Com chaining: " + resultadoChaining);
    }

    /*
     * Chaining com classe customizada: Calculator
     * Cada method aritmético retorna o próprio objeto, permitindo sequência de chamadas.
     *
     * Esse padrão é comum em Builders, APIs fluentes e pipelines de transformação.
     */
    public static void chainingCustom() {
        int resultado = new Calculator()
                .add(5)        // soma 5 ao total
                .subtract(3)   // subtrai 3 do total
                .getResult();  // retorna resultado final
        System.out.println("Resultado do cálculo: " + resultado); // Saída esperada: 2
    }

    public static void main(String[] args) {
        membrosEstaticos();
        membrosDeInstancia();
        chainingSimples();
        chainingStringBuilder();
        chainingCustom();
    }
}

// --------------------
// Classes auxiliares
// --------------------

/*
 * Classe com classe interna estática para demonstrar notação de ponto em estruturas aninhadas
 */
class ClasseExterna {
    static class ClasseInterna {
        static String variavelEstatica = "Sou estática!";
        static void metodoEstatico() {
            System.out.println("method estático chamado!");
        }
    }
}

class MyClass {
    public static String staticMethod() {
        return "Hello";
    }
}

class Pessoa {
    String nome; // campo público (por simplicidade)
    Endereco endereco;
}

/*
 * Exemplo clássico de composição: Pessoa possui Endereco
 */
class Endereco {
    private String rua;
    private String cidade;

    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }
}

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

/*
 * Exemplo de classe com method encadeável
 * Cada method retorna a própria instância (this) para permitir o chaining
 */
class Calculator {
    private int result = 0;

    public Calculator add(int value) {
        result += value;
        return this;
    }

    public Calculator subtract(int value) {
        result -= value;
        return this;
    }

    public int getResult() {
        return result;
    }
}
