package main.java.exerciciosPOO.exercicios1a5;

public class AlunosMatriculados {
    private Integer matricula;
    private String nome;
    private Float notaProva1;
    private Float notaProva2;
    private Integer notaTrabalho1;
    private Integer notaTrabalho2;

    public AlunosMatriculados(Integer matricula, String nome, Float notaProva1, Float notaProva2, Integer notaTrabalho1, Integer notaTrabalho2) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho1 = notaTrabalho1;
        this.notaTrabalho2 = notaTrabalho2;
    }

    public Float calculaMediaFinal(){
        return ((this.notaProva1 * (3)) + (this.notaProva2 * (3)) + (this.notaTrabalho1 * 2) + (this.notaTrabalho2 * 2))/4;
    }

    public Float calculaComplementarParaFinal(){
        return (100 - (this.calculaMediaFinal()))/2 ;
    }

}
