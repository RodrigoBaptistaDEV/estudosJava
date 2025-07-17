package main.java.POO.ClasseAbstrata;

// Classe principal para demonstrar as implementações
public class Principal {
    public static void main(String[] args) {
        // Criando instância de Cachorro com o tipo Cachorro
        Cachorro cachorro = new Cachorro("Rex");

        cachorro.comer(); // Por conta da herança podemos usar o method da superclasse.
        cachorro.fazerSom(); // method da classe abstrata implementado na classe Cachorro.

        // Criando instancia de Gato com o tipo Animal
        Animal gato = new Gato("Mimi");

        // method concreto comer da classe Animal, acessado diretamente por herança.
        gato.comer();

        /*
        O method comer() é concreto na classe Animal e não é sobrescrito na classe Gato.
        Quando você chama gato.comer(), o method comer() da classe Animal é chamado diretamente,
        pois ele já tem uma implementação que é herdada pela classe Gato:
        */



        // method abstrato da classe Animal, é substituido por polimorfismo.
        gato.fazerSom();

        /*
        method fazerSom da classe Animal,
        pelo polimorfismo dinamico
        em tempo de execução é substituido pelo method da classe Gato que o sobrescreve.
        */
    }
}
