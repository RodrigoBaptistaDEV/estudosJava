package main.java.POO.Polimorfismo;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal meuAnimal;

        // Polimorfismo de Variavel
        // capacidade de uma variável de referência de um tipo mais genérico (como uma superclasse ou interface)
        // referenciar objetos de tipos mais específicos (subclasses).

        meuAnimal = new Gato();
        meuAnimal.fazerSom();  // Saída: Gato faz: Miau!

        /*
        Polimorfismo aplicado ( Objeto + método) :
        capacidade de objetos de diferentes classes derivadas serem tratados como objetos de uma classe base comum,
        e a chamada aos métodos serem resolvidas em tempo de execução com base na classe real do objeto.

        uma referência do tipo de uma classe mãe pode apontar para uma instância de uma classe filha.
        O método específico que será chamado é determinado em tempo de execução com base na instância real do objeto.
        */

        /*
        Graças ao polimorfismo, quando você chama gato.fazerSom(), o método fazerSom() da classe Gato é chamado,
        mesmo que a referência gato seja do tipo Animal.
        O Java determina, em tempo de execução, que a implementação de fazerSom() da classe Gato deve ser chamada:
        */

    }



}
