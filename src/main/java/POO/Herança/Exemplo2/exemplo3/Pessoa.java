package main.java.POO.Herança.Exemplo2.exemplo3;

// nessa mesma linha, vejamos este seguinte exemplo
// temos uma classe criada normalmente

// aqui queremos criar um objeto pessoa, que tenha como method imprimir no console suas variaveis, os dados da pessoa.
public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String imprimeDados(){
        return "Nome: " + this.getNome() + "\n" +
                "CPF: " + this.getCpf() + "\n";
    }

}
