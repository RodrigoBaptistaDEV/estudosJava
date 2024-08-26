package main.java.POO.Herança.Exemplo2;

public class Principal {

    public static void main(String[] args) {
        // criamos objetos de cada classe

        // Classe nomeObjeto = new ConstrutorClasse(argumentos);
        Bidimensional dois = new Bidimensional(1,2);
        Tridimensional tres = new Tridimensional(1,2,3);

        // podemos acessar em dois somente os métodos declarados em sua classe
        // System.out.println(dois.toString());

        // podemos acessar em tres os métodos de sua classe e da superclasse
        // o método acessado em override corresponde ao declarado na filha, que sobrepos a superclasse
        System.out.println(tres.toString());
    }

}
