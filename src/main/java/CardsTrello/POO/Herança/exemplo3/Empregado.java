package main.java.CardsTrello.POO.Herança.exemplo3;


// agora com a herança temos uma classe que é uma Pessoa.

// o objetivo desta classe é criar um Objeto empregado, preenchendo os atributos deste objeto.
// Empregado, além de ser uma pessoa tem seus atributos proprios que definem sua existencia.

public class Empregado extends Pessoa {
    // atributos novos de Empregado, diferenciando de Pessoa.
    private int matricula;
    private double salario_fixo;
    private double dias_trabalhados;

    public Empregado(String nome, String cpf, int matricula, double salario_fixo, double dias_trabalhados) {
        super(nome,cpf); // para construir um Empregado, instanciamos a classe Pessoa + Empregado;
        this.salario_fixo = salario_fixo;
        this.matricula = matricula;
        this.dias_trabalhados = dias_trabalhados;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario_fixo() {
        return salario_fixo;
    }

    public void setSalario_fixo(double salario_fixo) {
        this.salario_fixo = salario_fixo;
    }

    public double getDias_trabalhados() {
        return dias_trabalhados;
    }

    public void setDias_trabalhados(double dias_trabalhados) {
        this.dias_trabalhados = dias_trabalhados;
    }

    public double calculaSalarioMensal(){
        return (this.getSalario_fixo() / 30) * this.getDias_trabalhados();
    }

    /*
    Aqui na classe Empregado, imprimimos o dado do Empregado em geral, incluindo seus dados Pessoais
    Portanto devemos utilizar a palavra Super() para rodar o method da superclasse primeiro,
    */

    /*
        o que seria o metodo de empregado isolado:

        public String imprimeDados(){
            return "Matricula: " + this.getMatricula() + "\n" +
                    "Salario Fixo: " + this.getSalario_fixo() + "\n" +
                    "Dias trabalhador: " + this.getDias_trabalhados() +"\n";
        }

     */
    public String imprimeDados(){
        String dadosPessoa = super.imprimeDados();
        return dadosPessoa +
                "Matricula: " + this.getMatricula() + "\n" +
                "Salario Fixo: " + this.getSalario_fixo() + "\n" +
                "Dias trabalhador: " + this.getDias_trabalhados() +"\n";

        /*
        ou tbm chamar o metodo direto ->
                return super.imprimeDados() +
                "Matricula: " + this.getMatricula() + "\n" +
                "Salario Fixo: " + this.getSalario_fixo() + "\n" +
                "Dias trabalhador: " + this.getDias_trabalhados() +"\n";
        */
    }

    // Observação - o uso do this na herança.
    // aqui vamos puxar o resultado do metodo e concatenar com o salario mensal,
    public String imprimeDadosComSalarioMensal(){
        String dadosAnteriores = this.imprimeDados();
        return dadosAnteriores + "Salário Mensal: " + this.calculaSalarioMensal()+"\n";
    }

}
