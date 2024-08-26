package main.java.POO.Herança;

/*
Observe que temos a classe Empregado, um molde para criar um objeto Empregado.

A classe Empregado serve como uma classe base para representar um empregado com atributos básicos como nome e salário

Dessa forma podemos em qualquer parte do programa instanciar essa classe.
*/

public class Empregado {
    //variaveis de instancia
    private String primeiro_nome;
    private String ultimo_nome;
    private double salario;

    //construtor
    public Empregado ( String pNome, String uNome, double salario){
        this.primeiro_nome = pNome;
        this.ultimo_nome = uNome;
        this.salario = salario;
    }

    // Getter and Setters
    public String getPrimeiro_nome() {
        return primeiro_nome;
    }

    public void setPrimeiro_nome(String primeiro_nome) {
        this.primeiro_nome = primeiro_nome;
    }

    public String getUltimo_nome() {
        return ultimo_nome;
    }

    public void setUltimo_nome(String ultimo_nome) {
        this.ultimo_nome = ultimo_nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}

/*
agora imagine que precisamos criar um objeto Empregado Comissionado
uma classe seria identica ao Empregado, mais com a inserção de uma variavel nova,
o comissionado tem comissao por venda além do salário base.
* Haveria duas formas de escrever a classe EmpregadoComissionado.
1) Repetir o código da classe Empregado, adicionando código para controlar
as comissões.
2) Criar a classe EmpregadoComissionado herdando da classe Empregado.
*/


