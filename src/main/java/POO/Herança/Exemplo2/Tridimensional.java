package main.java.POO.Herança.Exemplo2;


//Tridimensional herda a classe bidimensional com a palavra reservada “extends”
public class Tridimensional extends Bidimensional{
    // atributo próprio de tridimensional
    // variavel de instancia nova
    private double coordenada_z;


    /*
    Por conta da herança ao criamos um novo construtor temos que incluir o construtor da superclasse,
    portanto Tridimensional usa o “super” para quando o valor for atribuído no objeto ele mandar para classe
    de cima (BiDimensional);
    */

    public Tridimensional(double x, double y, double z){
        super(x, y);
        this.setCoordenada_z(z);
    }

    public double getCoordenada_z() {
        return coordenada_z;
    }

    public void setCoordenada_z(double coordenada_z) {
        this.coordenada_z = coordenada_z;
    }

    // sobreposição/sobrescrita de código. O method toString por ter o mesmo nome na classe mãe o sobrepõe
    // Sobrepor um method é conhecido como "redefinir" o method.
    // Redefinindo um method a filha fornece sua própria implementação personalizada do method.

    /*
    public String toString(){
        return "Eu sou um ponto tridimensional" + "\n" +
                "minha coordenada X é " + getCoordenada_x() +"\n"+
                "minha coordenada Y é " + getCoordenada_y() +"\n"+
                "minha coordenada Z é " + getCoordenada_z() +"\n";
    }
    */

    // com o method super() podemos ainda acessar os metodos da classe mae
    public String toString(){
        String retorno = super.toString();
        // significa que rodaremos primeiro o method da mãe.

        return retorno + "Com mais uma condiçao temos um ponto tridimensional" + "\n" +
                "minha coordenada X é " + getCoordenada_x() +"\n"+
                "minha coordenada Y é " + getCoordenada_y() +"\n"+
                "minha coordenada Z é " + getCoordenada_z() +"\n";
    }

}
