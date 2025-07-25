package main.java.exercicios.exerciciosPOO.exercicios1a5;

/*
2. Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
número da conta, nome do correntista e saldo. Os methods são os seguintes: alterarNome, depósito e
saque; A inicialização do objeto terá saldo como opcional, sendo seu valor default zero e os demais atributos são obrigatórios.
*/

public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;

    // Construtor
    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    // Construtor com saldo opcional
    public ContaCorrente(int numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0; // saldo default zero
    }

    // method para alterar o nome do correntista
    public void alterarNome(String novoNome) {
        this.nomeCorrentista = novoNome;
    }

    // method para realizar depósito
    public void deposito(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso." + "\n");
    }

    // method para realizar saque
    public void saque(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso." + "\n");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque." + "\n");
        }
    }

    // method para obter o saldo da conta
    public double getSaldo() {
        return saldo;
    }

    // method para obter o número da conta
    public int getNumeroConta() {
        return numeroConta;
    }

    // method para obter o nome do correntista
    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    // method para imprimir informações da conta
    public void imprimirInfo() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome do Correntista: " + nomeCorrentista);
        System.out.println("Saldo: " + saldo + "\n");
    }

}
