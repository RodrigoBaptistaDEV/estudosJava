package main.java.POO.Herança.Exemplo2;


/*
Temos o seguinte código base:
Classe Bidimensional com variável , está encapsulada, portanto, para a
alteração precisamos usar os métodos set (que recebe os argumentos para declarar na variável) e para
acessar(puxar o valor) temos o método get.

Temos o construtor de um objeto que nos permite no programa principal criar um objeto com o modelo
criado, passando os argumentos.

No final temos um método independente que mostra uma mensagem
*/

public class Bidimensional {
    // atributos da classe
    // variaveis de instancia
    private double coordenada_x;
    private double coordenada_y;

    // construtor - método com parametros
    // this. referenciando as proprias variaveis da classe
    public Bidimensional(double coordenada_x, double coordenada_y) {
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
    }

    //getters and setters
    public double getCoordenada_x() {
        return coordenada_x;
    }

    public void setCoordenada_x(double coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public double getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_y(double coordenada_y) {
        this.coordenada_y = coordenada_y;
    }

    // um método de instancia da classe
    public String toString(){
        return "Eu sou um ponto bidimensional" + "\n" +
                "minha coordenada X é " + getCoordenada_x() +"\n"+
                "minha coordenada Y é " + getCoordenada_y() +"\n";
    }

}


