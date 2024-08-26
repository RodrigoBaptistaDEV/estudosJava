package main.java.POO.Herança.Exemplo2.exemplo3;

/*
Criamos a classe Horista, que é uma Pessoa e que é um Empregado.
Portanto queremos aquir imprimir no console, dados de Pessoa  + dados Empregado + dados Horista;
*/
public class EmpregadoHorista extends Empregado{
    // atributos novos de EmpregadoHorista, diferenciando Empregado e de Pessoa.
    private double quantidade_horas_trabalhadas;
    private double valor_hora;

    public EmpregadoHorista(String nome, String cpf, int matricula, double salario_fixo, double dias_trabalhados, double quantidade_horas_trabalhadas, double valor_hora) {
        super(nome, cpf, matricula, salario_fixo, dias_trabalhados);
        // aqui o super é para acessar o construtor de Empregado, que acessará o construtor de Pessoa tbm.

        this.quantidade_horas_trabalhadas = quantidade_horas_trabalhadas;
        this.valor_hora = valor_hora;
    }

    public double getQuantidade_horas_trabalhadas() {
        return quantidade_horas_trabalhadas;
    }

    public void setQuantidade_horas_trabalhadas(double quantidade_horas_trabalhadas) {
        this.quantidade_horas_trabalhadas = quantidade_horas_trabalhadas;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }

    // iremos aqui sobrepor o metodo calculaSalario de Empregado, pois aqui será especifico
    public double calculaSalarioMensal(){
        return super.getSalario_fixo() +
                (this.getQuantidade_horas_trabalhadas() * this.getValor_hora());

    }

    // sobrepomos a impressao de salario de Empregado, adicionando o corpo especifico.
    public String imprimeDadosComSalarioMensal(){
        return super.imprimeDadosComSalarioMensal() +
                "Qtdede Horas trab: " + this.getQuantidade_horas_trabalhadas() + "\n" +
                "Valor Hora: " + this.getValor_hora();
    }
}
