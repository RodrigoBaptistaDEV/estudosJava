package main.java.CardsTrello.POO;

// Encapsulamento.java

/*
 * ============================================
 * CONCEITO DE ENCAPSULAMENTO EM JAVA
 * ============================================
 *
 * O encapsulamento é um dos pilares da Programação Orientada a Objetos (POO),
 * e tem como princípio central o controle do acesso aos atributos e methods de uma classe.
 *
 * Isso é feito por meio da definição de atributos como "privados" (private),
 * sendo acessados e modificados apenas por methods "públicos" (public), chamados de getters e setters.
 *
 * Os três principais benefícios do encapsulamento são:
 *
 * 1. Independência: a classe controla seu comportamento interno,
 *    sem que outras classes dependam de sua implementação.
 *
 * 2. Simplicidade: fornece uma interface simples e clara para uso,
 *    escondendo a complexidade interna.
 *
 * 3. Segurança: protege os dados contra alterações indevidas,
 *    garantindo consistência e validade.
 *
 * VANTAGENS:
 * - Flexibilidade para alterar a implementação interna sem afetar outras partes do sistema.
 * - Maior controle sobre a integridade dos dados.
 * - Facilidade para aplicar validações e lógica de negócio centralizada.
 *
 */

public class Encapsulamento {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("123456-7", "João da Silva");

        // Tentativa de acessar diretamente os atributos falha (são privados)
        // conta.saldo = 1000.0; // Erro de compilação

        // Acesso correto via methods públicos
        conta.depositar(500.0);
        conta.sacar(100.0);
        System.out.println("Saldo atual: " + conta.getSaldo());

        // Tentativa de saque inválido
        conta.sacar(1000.0);

        // Modificando nome com validação
        conta.setTitular("Maria Oliveira");
        System.out.println("Novo titular: " + conta.getTitular());

        // Tentativa de definir nome inválido
        conta.setTitular("");
    }
}

/*
 * CLASSE CONTA BANCÁRIA
 *
 * Esta classe ilustra o uso completo do encapsulamento:
 * - Atributos privados
 * - methods públicos (getters/setters)
 * - Lógica de validação nos methods públicos
 */

class ContaBancaria {

    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.setTitular(titular); // usa setter com validação
        this.saldo = 0.0;
    }

    // Getter para saldo (somente leitura externa)
    public double getSaldo() {
        return this.saldo;
    }

    // Getter para titular
    public String getTitular() {
        return this.titular;
    }

    // Setter com validação para titular
    public void setTitular(String titular) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Erro: nome de titular inválido.");
        }
    }

    // method público para depósito (lógica de validação incluída)
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: valor de depósito inválido.");
        }
    }

    // method público para saque (com verificação de saldo)
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor de saque inválido.");
        } else if (valor > this.saldo) {
            System.out.println("Erro: saldo insuficiente.");
        } else {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }
}

/*
 * ============================================
 * GETTERS E SETTERS EM JAVA
 * ============================================
 *
 * Getters:
 * - methods públicos para obter valores de atributos privados.
 * - Nome padrão: get + NomeDoAtributo
 * - Ex: getIdade(), getSaldo(), getNome()
 *
 * Setters:
 * - methods públicos para modificar valores de atributos privados.
 * - Nome padrão: set + NomeDoAtributo
 * - Ex: setIdade(int idade), setNome(String nome)
 *
 * Por que usar?
 * - Permitem encapsular regras e validações.
 * - Evitam acessos diretos e desorganizados aos atributos.
 * - Mantêm a integridade dos dados da classe.
 *
 */

