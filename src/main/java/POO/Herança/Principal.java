package main.java.POO.Herança;

public class Principal {

    public static void main(String[] args){

        // criamos um objeto da classe filha, declarando argumentos para o construtor.

        EmpregadoComissionado ec = new EmpregadoComissionado("Carla", "Silva", 3000, 1.10);
        ec.adicionarUnidades(5);

        // o objeto herdado portanto constitui uma soma do código da classe pai e classe filha,
        // possuindo os metodos dos dois.

        System.out.println("Primeiro nome: " + ec.getPrimeiro_nome());
        System.out.println("Ultimo nome: " + ec.getUltimo_nome());
        System.out.println("Salario base: " + ec.getSalario());
        System.out.println("Total Pago " + ec.calculaPagamento());
    }

    /*
    Assim temos a herança aplicada:

    - Reutilização de Código:
    A herança permite que uma nova classe reutilize o código já existente em uma classe base.
    Isso significa que não é necessário escrever novamente os methods e atributos que já foram definidos na superclasse.

    - Hierarquia e Especialização:
    A herança permite a criação de uma hierarquia de classes, onde as subclasses especializam ou extendem o comportamento
    das superclasses. Isso reflete a ideia de "é um" (is-a relationship).
    Por exemplo, Cachorro é um tipo de Animal, então faz sentido que Cachorro herde de Animal.

    -Facilita a Manutenção e Extensão:
    Quando o comportamento compartilhado está em uma superclasse, m
    udanças nesse comportamento precisam ser feitas apenas uma vez na superclasse.
    Isso facilita a manutenção e a extensão do código.
    Se uma nova funcionalidade precisa ser adicionada a todos os Animais, ela pode ser adicionada diretamente na classe filha.

    - Redução de Redundância:
    A herança elimina a duplicação de código ao permitir que as subclasses reutilizem o código da superclasse.
    Isso leva a um código mais limpo e menos propenso a erros, j
    á que não há necessidade de duplicar a lógica em várias classes.

    - Organização Natural e Clareza:
    A herança permite organizar as classes de forma hierárquica, o que pode tornar o código mais intuitivo
    e refletir melhor as relações do mundo real.
    Isso pode ajudar outros desenvolvedores a entender rapidamente a estrutura e as responsabilidades das várias classes em um sistema.
    */

}
