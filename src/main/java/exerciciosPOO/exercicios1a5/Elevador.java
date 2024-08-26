package main.java.exerciciosPOO.exercicios1a5;

/*
4. Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um
prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o
térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também
disponibilizar os seguintes métodos:
a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no
prédio (os elevadores sempre começam no térreo e vazio);
b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
e. Desce: para descer um andar (não deve descer se já estiver no térreo);
*/

public class Elevador {

    short andarAtual;
    short totalAndares;
    short capacidadeElevador;
    short qtdPresentes;

    public void informar(){
        System.out.println("Capacidade do Elevador: " + this.capacidadeElevador + "\n"
                + "Total de Andares: " + this.totalAndares + "\n"
                + "Andar atual: " + this.andarAtual + "\n"
                + "Quantidade de Presentes: " + this.qtdPresentes + "\n");
    }

    public void inicializar(short capacidadeEscolhida, short qtdeDeAndaresEscolhida){
        this.capacidadeElevador = capacidadeEscolhida;
        this.totalAndares = qtdeDeAndaresEscolhida;
        this.andarAtual = 0;
        this.qtdPresentes = 0;

        this.informar();
    }

    public void entrar(short quantidadePessoas){

        if((this.qtdPresentes + quantidadePessoas) > this.capacidadeElevador){
            System.out.println("Essa quantidade excede a capacidade do elevador " + "\n");
        } else {
            this.qtdPresentes += quantidadePessoas;
            System.out.println("Entraram as pessoas, temos agora " + this.qtdPresentes+ "\n");
        }

    }

    public void sair(short quantidadePessoas){

        if(this.qtdPresentes > 0){
            this.qtdPresentes -= quantidadePessoas;
            System.out.println("Sairam as pessoas, agora temos " + this.qtdPresentes + "\n");
        } else {
            System.out.println("Está vazio " + "\n");
        }

    }

    public void subir(){

        if(this.andarAtual == this.totalAndares){
            System.out.println("Já está no ultimo andar " + "\n");
        } else {
            this.andarAtual += 1;
            System.out.println("Foi para o andar" + this.andarAtual + "\n");
        }
    }

    public void descer(){
        if(this.andarAtual == 0){
            System.out.println("Já está no térreo " + "\n");
        } else {
            this.andarAtual -= 1;
            System.out.println("Foi para o andar" + this.andarAtual + "\n");
        }
    }

}
