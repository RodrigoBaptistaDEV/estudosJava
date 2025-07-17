package main.java.POO.Herança.Exemplo2.exemplo3;

public class Principal {

    public static void main(String[] args) {
        // Aqui temos como exemplo, criar um objeto pessoa e rodar seu method
        System.out.println("Imprimindo dados da classe Pessoa");
        Pessoa pes = new Pessoa ("Maria da Costa", "123.456.789-00");
        System.out.println(pes.imprimeDados());

        // Agora repare que em Empregado, criamos um objeto e rodamos seu metodo,
        // que de forma sobrescrita redefine o method anterior para incluir a especificidades de Empregado
        // mas consegue atraves de super() chamar o metodo anterior em ordem e utiliza-lo em si.
        System.out.println("Imprimindo dados da classe Pessoa+Empregado ( sobrepoe mas usa o super()");
        Empregado emp = new Empregado("Joaquim Cardoso","987.654.321-11",
                5158421,3000,30);

        System.out.println(emp.imprimeDados());

        // Observação - o uso do this na herança.

        // metodo em Empregado para imprimir os dados e o salario.
        System.out.println("Ex2: Imprimindo dados de Empregado(Pessoa+Empregado) e salario");
        System.out.println(emp.imprimeDadosComSalarioMensal());

        System.out.println("Ex2: Imprimindo dados de EmpregadoHorista");
        EmpregadoHorista eh = new EmpregadoHorista("Celso Silva", "444.555.666-01",
                220, 3000, 30, 300, 200);

        System.out.println(eh.imprimeDadosComSalarioMensal());

    /*
    Quando usamos `this.calculaSalarioMensal()` dentro do method `imprimeDadosComSalarioMensal()` da classe `Empregado`,
    a palavra-chave `this` se refere ao objeto atual em tempo de execução, que no caso específico é um objeto da classe `EmpregadoHorista`.

    Isso significa que o method `calculaSalarioMensal()` será procurado e executado na classe do objeto atual, ou seja, na classe `EmpregadoHorista`.
    Essa resolução dinâmica é uma característica fundamental do polimorfismo em Java.

    Nesse caso o compilador não pode determinar antecipadamente qual implementação específica do method `calculaSalarioMensal()`
    deve ser chamada, pois ele está sobrescrito, podendo variar dependendo do tipo do objeto em tempo de execução.

    Portanto, o Java faz essa decisão durante a execução do programa, garantindo que o method adequado
    seja chamado com base no tipo real do objeto, o que no caso é a classe `EmpregadoHorista`.

    Assim, quando você usa `this` para chamar `calculaSalarioMensal()` dentro da classe `Empregado`,
    o Java entende que você quer chamar o method na classe do objeto atual, que é `EmpregadoHorista`,
    e não na classe `Empregado` a partir da qual `imprimeDadosComSalarioMensal()` é chamado.

    Isso demonstra como `this` se adapta dinamicamente ao contexto de execução em Java.
    */

    }

}
