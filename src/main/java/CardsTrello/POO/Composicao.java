package main.java.CardsTrello.POO;

// ==========================================================
// COMPOSIÇÃO EM PROGRAMAÇÃO ORIENTADA A OBJETOS (POO) - JAVA
// ==========================================================
//
// DEFINIÇÃO
// ---------
// Composição é uma forma de associação entre classes, onde
// uma classe é composta por uma ou mais instâncias de outras.
// É um relacionamento do tipo "tem-um" (has-a), e representa
// uma forte dependência entre o objeto contêiner e os objetos
// componentes.
//
// O objeto contêiner é responsável pela criação e destruição
// dos objetos componentes. Quando o contêiner deixa de existir,
// os componentes também deixam.
//
// Características principais:
// - Controle total do ciclo de vida dos componentes.
// - Forte dependência entre o contêiner e os componentes.
// - Encapsulamento e modularidade.
// - Favorece reutilização e composição de comportamento.
//
// Exemplo típico: Um Carro "tem um" Motor e quatro Rodas.
// Se o Carro for destruído, não faz sentido as Rodas ou o Motor existirem sozinhos.
//
// A seguir, exemplos práticos de composição.
// -----------------------------------------------------------

// Classe Motor - componente
class Motor {
    private int cilindrada;

    public Motor(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void ligar() {
        System.out.println("Motor ligado!");
    }

    public void desligar() {
        System.out.println("Motor desligado!");
    }
}

// Classe Carro - contêiner que compõe Motor
class CarroSimples {
    private String marca;
    private String modelo;
    private Motor motor;

    public CarroSimples(String marca, String modelo, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        // composição: o carro cria e mantém o motor
        this.motor = new Motor(cilindrada);
    }

    public void ligarCarro() {
        System.out.println("Ligando o carro " + marca + " " + modelo);
        motor.ligar(); // delega a responsabilidade ao componente
    }

    public void desligarCarro() {
        System.out.println("Desligando o carro " + marca + " " + modelo);
        motor.desligar();
    }
}

// Segundo exemplo: Carro com múltiplos componentes

// Componente Motor com modelo e potência
class MotorAvancado {
    private String modelo;
    private int potencia;

    public MotorAvancado(String modelo, int potencia) {
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public void exibirInfo() {
        System.out.println("Motor: " + modelo + " - " + potencia + " cv");
    }
}

// Componente Roda
class Roda {
    private String tipo;
    private int tamanho;

    public Roda(String tipo, int tamanho) {
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    public void exibirInfo() {
        System.out.println("Roda: " + tipo + " - " + tamanho + " polegadas");
    }
}

// CarroAvancado compõe MotorAvancado e 4 Rodas
class CarroAvancado {
    private MotorAvancado motor;
    private Roda[] rodas;

    public CarroAvancado(String modeloMotor, int potenciaMotor, String tipoRoda, int tamanhoRoda) {
        this.motor = new MotorAvancado(modeloMotor, potenciaMotor);

        this.rodas = new Roda[4];
        for (int i = 0; i < 4; i++) {
            this.rodas[i] = new Roda(tipoRoda, tamanhoRoda);
        }
    }

    public void exibirDetalhes() {
        System.out.println("=== Detalhes do Carro ===");
        motor.exibirInfo();
        for (int i = 0; i < rodas.length; i++) {
            System.out.print("Roda " + (i + 1) + ": ");
            rodas[i].exibirInfo();
        }
    }
}

// Classe Main para testes
public class Composicao {
    public static void main(String[] args) {

        // Exemplo 1: Composição simples
        CarroSimples meuCarro = new CarroSimples("Toyota", "Corolla", 2000);
        meuCarro.ligarCarro();
        meuCarro.desligarCarro();

        System.out.println("\n");

        // Exemplo 2: Composição com múltiplos componentes
        CarroAvancado carroCompleto = new CarroAvancado("VTEC", 150, "Esportiva", 17);
        carroCompleto.exibirDetalhes();
    }
}

/*
Saída esperada:

Ligando o carro Toyota Corolla
Motor ligado!
Desligando o carro Toyota Corolla
Motor desligado!


=== Detalhes do Carro ===
Motor: VTEC - 150 cv
Roda 1: Roda: Esportiva - 17 polegadas
Roda 2: Roda: Esportiva - 17 polegadas
Roda 3: Roda: Esportiva - 17 polegadas
Roda 4: Roda: Esportiva - 17 polegadas
*/

// ==============================================
// CONCLUSÃO
// ==============================================
// A Composição é um princípio de design que promove reutilização,
// modularidade e encapsulamento. Ao montar objetos complexos com
// base em componentes menores e reutilizáveis, seu sistema se
// torna mais flexível e fácil de manter.
// Evite herança excessiva quando composição for mais adequada.
// Use composição para representar relações de "parte-tdo" reais.
//
