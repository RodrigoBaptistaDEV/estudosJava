// ==============================================
// HERANÇA EM JAVA - EXPLICAÇÃO TEÓRICA
// ==============================================

/*
 * Herança é um dos pilares da Programação Orientada a Objetos (POO).
 * Ela permite que uma classe (filha ou subclasse) herde atributos e methods de outra classe (mãe ou superclasse).
 *
 * A ideia é evitar duplicação de código, centralizando comportamentos e propriedades comuns em uma classe base.
 * Isso cria um relacionamento do tipo "é um" — por exemplo: um Mamífero "é um" Animal.
 *
 * Realizamos herança em Java com a palavra-chave `extends`.
 *
 * Uma classe filha herda:
 * - Todos os atributos e methods públicos e protegidos da classe mãe.
 * - A funcionalidade herdada de qualquer ancestral da mãe.
 *
 * REGRAS:
 * - Java **não suporta herança múltipla direta** entre classes.
 * - Uma superclasse pode ter várias subclasses.
 * - Uma subclasse **pode sobrescrever** (override) methods da mãe para comportamento específico.
 * - A subclasse **pode adicionar** novos atributos e methods.
 * - A subclasse **não pode remover** funcionalidades herdadas.
 * - Apenas membros `private` não são visíveis nas filhas.
 *
 * TIPOS DE IMPLEMENTAÇÃO EM HERANÇA:
 * - Recursiva: herança direta de atributos e methods.
 * - Sobreposta (override): redefine methods da mãe.
 * - Nova: define novos methods ou atributos.
 *
 * VANTAGENS:
 * - Organização e estrutura lógica do código.
 * - Reaproveitamento de código comum.
 * - Redução de redundância.
 * - Suporte a polimorfismo.
 */

// ==============================================
// CLASSE BASE - SUPERCLASSE
// ==============================================

class Animal {
    protected String nome;
    protected int idade;

    public void emitirSom() {
        System.out.println("Animal faz um som genérico.");
    }

    public void dormir() {
        System.out.println("Animal está dormindo.");
    }
}

// ==============================================
// CLASSES FILHAS - SUBCLASSES
// ==============================================

class Mamifero extends Animal {
    private String tipoDePelo;

    public Mamifero(String nome, int idade, String tipoDePelo) {
        this.nome = nome;
        this.idade = idade;
        this.tipoDePelo = tipoDePelo;
    }

    public void amamentar() {
        System.out.println(nome + " está amamentando.");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " emite som de mamífero.");
    }
}

class Ave extends Animal {
    private double envergaduraAsa;

    public Ave(String nome, int idade, double envergaduraAsa) {
        this.nome = nome;
        this.idade = idade;
        this.envergaduraAsa = envergaduraAsa;
    }

    public void voar() {
        System.out.println(nome + " está voando com envergadura de " + envergaduraAsa + " metros.");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " emite som de ave.");
    }
}

class Peixe extends Animal {
    private String tipoDeEscama;

    public Peixe(String nome, int idade, String tipoDeEscama) {
        this.nome = nome;
        this.idade = idade;
        this.tipoDeEscama = tipoDeEscama;
    }

    public void nadar() {
        System.out.println(nome + " está nadando.");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz bolhas (peixe não vocaliza).");
    }
}

// ==============================================
// SOBRESCRITA DE methodS - EXPLICAÇÃO TEÓRICA
// ==============================================

/*
 * A sobrescrita (override) de methods em Java permite que a subclasse forneça uma
 * nova implementação para um method já definido na superclasse.
 *
 * É usada para alterar ou especializar o comportamento de methods herdados.
 *
 * REGRAS DA SOBRESCRITA:
 * - A assinatura do method deve ser exatamente a mesma (nome, tipo de retorno, parâmetros).
 * - A visibilidade do method sobrescrito não pode ser mais restrita que a original.
 *   Exemplo: se o method na mãe é `public`, a filha deve usar `public`.
 * - Pode lançar menos exceções ou nenhuma. Não pode lançar mais do que a mãe.
 * - É comum (mas não obrigatório) usar a anotação `@Override` como boa prática.
 *
 * REGRA DE OURO:
 * - A visibilidade na sobrescrita **não pode diminuir**, só pode ser igual ou maior.
 */

// ==============================================
// EXEMPLO DE SOBRESCRITA PRÁTICO
// ==============================================

class Veiculo {
    public void liga() {
        System.out.println("Veículo ligado.");
    }
}

class Carro extends Veiculo {
    @Override
    public void liga() {
        System.out.println("Carro ligado com ignição eletrônica.");
    }
}

// ==============================================
// USO DO super() EM HERANÇA - EXPLICAÇÃO TEÓRICA
// ==============================================

/*
 * A palavra-chave `super` em Java é utilizada para referenciar diretamente a superclasse (classe mãe).
 *
 * Ela possui três principais usos:
 *
 * 1. `super()` — chamada explícita ao construtor da superclasse.
 *    - Deve ser a primeira instrução no construtor da subclasse.
 *    - É usada para inicializar atributos herdados quando a superclasse possui construtores parametrizados.
 *
 * 2. `super.metodo()` — chamada a um method da superclasse.
 *    - Utilizado principalmente quando um method foi sobrescrito na subclasse, mas ainda se deseja acessar o comportamento original da superclasse.
 *
 * 3. `super.atributo` — acesso direto a um atributo da superclasse quando há conflito de nomes.
 *
 * Isso permite que a subclasse **estenda** o comportamento herdado, em vez de apenas substituí-lo.
 */

// ==============================================
// EXEMPLO 1: Uso de super() para chamar construtor da superclasse
// ==============================================

class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Pessoa criada: " + nome);
    }
}

class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String cargo) {
        super(nome); // chama o construtor da superclasse Pessoa
        this.cargo = cargo;
        System.out.println("Funcionario criado: " + nome + ", cargo: " + cargo);
    }
}

// ==============================================
// EXEMPLO 2: Uso de super.metodo() para acessar method da mãe
// ==============================================

class Computador {
    public void ligar() {
        System.out.println("Computador está ligando...");
    }
}

class Notebook extends Computador {
    @Override
    public void ligar() {
        super.ligar(); // chama o method da superclasse
        System.out.println("Notebook com bateria está ligando.");
    }
}

// ==============================================
// EXEMPLO 3: Uso de super.atributo para resolver conflito de nomes
// ==============================================

class Pai {
    String nome = "Pai";
}

class Filho extends Pai {
    String nome = "Filho";

    public void imprimeNomes() {
        System.out.println("Nome do filho: " + nome);
        System.out.println("Nome do pai com super: " + super.nome);
    }
}

// ==============================================
// CLASSE PRINCIPAL - TESTES FINAIS
// ==============================================

public class ManualHeranca {
    public static void main(String[] args) {
        // Testes de herança e sobrescrita
        Mamifero m1 = new Mamifero("Leão", 5, "curto");
        m1.emitirSom();
        m1.amamentar();
        m1.dormir();

        Ave a1 = new Ave("Águia", 3, 2.1);
        a1.emitirSom();
        a1.voar();
        a1.dormir();

        Peixe p1 = new Peixe("Tilápia", 1, "lisa");
        p1.emitirSom();
        p1.nadar();
        p1.dormir();

        Animal generico = new Mamifero("Gato", 2, "macio");
        generico.emitirSom(); // Polimorfismo

        // Sobrescrita com veículos
        Veiculo v = new Veiculo();
        v.liga();

        Carro c = new Carro();
        c.liga();

        Veiculo v2 = new Carro();
        v2.liga();

        // super() no construtor
        Funcionario f1 = new Funcionario("João", "Desenvolvedor");

        // super.metodo()
        Notebook nb = new Notebook();
        nb.ligar();

        // super.atributo
        Filho filho = new Filho();
        filho.imprimeNomes();
    }
}
