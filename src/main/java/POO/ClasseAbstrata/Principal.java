package main.java.POO.ClasseAbstrata;

// Classe principal para demonstrar as implementações
public class Principal {
    public static void main(String[] args) {
        // Criando instância de Cachorro com o tipo Cachorro
        Cachorro cachorro = new Cachorro("Rex");

        cachorro.comer(); // Por conta da herança podemos usar o método da superclasse.
        cachorro.fazerSom(); // Método da classe abstrata implementado na classe Cachorro.

        // Criando instancia de Gato com o tipo Animal
        Animal gato = new Gato("Mimi");

        // método concreto comer da classe Animal, acessado diretamente por herança.
        gato.comer();

        /*
        O método comer() é concreto na classe Animal e não é sobrescrito na classe Gato.
        Quando você chama gato.comer(), o método comer() da classe Animal é chamado diretamente,
        pois ele já tem uma implementação que é herdada pela classe Gato:
        */



        // método abstrato da classe Animal, é substituido por polimorfismo.
        gato.fazerSom();

        /*
        método fazerSom da classe Animal,
        pelo polimorfismo dinamico
        em tempo de execução é substituido pelo método da classe Gato que o sobrescreve.
        */
    }
}
