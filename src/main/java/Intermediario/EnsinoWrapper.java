package main.java.Intermediario;

import java.util.ArrayList;
import java.util.List;

public class EnsinoWrapper {
    // Wrappers em Java


// Em Java, os "Wrappers" são classes que encapsulam (ou "empacotam") tipos de dados primitivos em objetos.
// Cada tipo primitivo tem sua classe wrapper correspondente. Estas classes estão localizadas no pacote java.lang.

// Tipos primitivos e seus wrappers correspondentes:
// - int -> Integer
// - char -> Character
// - boolean -> Boolean
// - byte -> Byte
// - short -> Short
// - long -> Long
// - float -> Float
// - double -> Double

// Vamos explorar as principais características e funcionalidades dos wrappers.

// 1. Auto-boxing e Auto-unboxing
// Java oferece a funcionalidade de auto-boxing e auto-unboxing para simplificar o uso dos wrappers.
// Auto-boxing é o processo de conversão automática de um tipo primitivo para seu tipo wrapper correspondente.
// Auto-unboxing é o processo inverso, onde um objeto wrapper é convertido automaticamente para seu tipo primitivo correspondente.

    int primitivo = 10;  // Tipo primitivo int
    Integer objetoWrapper = primitivo;  // Auto-boxing: int para Integer

    int primitivoDesempacotado = objetoWrapper;  // Auto-unboxing: Integer para int



// 2. methods úteis das classes wrapper
// As classes wrapper fornecem methods úteis para manipulação e conversão de dados.

    String numeroComoString = "123";

    // Convertendo uma string para um tipo primitivo usando methods das classes wrapper
    int numero = Integer.parseInt(numeroComoString);  // Converte a string "123" para o tipo primitivo int
    double numeroDouble = Double.parseDouble("123.45");  // Converte a string "123.45" para o tipo primitivo double

    // Convertendo um tipo primitivo para uma string
    String stringDeNumero = Integer.toString(456);  // Converte o int 456 para a string "456"
    String stringDeDouble = Double.toString(456.78);  // Converte o double 456.78 para a string "456.78"

// 3. Comparação de valores
// É possível comparar valores primitivos usando operadores de comparação como ==, <, >, etc.
// Para objetos wrapper, é recomendado o uso de methods como equals() para comparação de valores.

    Integer numero1 = 100;
    Integer numero2 = 100;

    public void func1(){
        if (numero1.equals(numero2)) {  // Utiliza o method equals() para comparar valores de objetos wrapper
            System.out.println("Os valores são iguais.");
        } else {
            System.out.println("Os valores são diferentes.");
        }
    }

    // Comparação de valores primitivos
    int a = 5;
    int b = 5;

    public void func2(){
        if (a == b) {
            System.out.println("Os valores primitivos são iguais.");
        } else {
            System.out.println("Os valores primitivos são diferentes.");
        }
    }



// 4. Wrappers e Collections
// Wrappers são úteis quando trabalhamos com coleções (como List, Set, etc.), pois estas coleções funcionam com objetos e não com tipos primitivos.

    public void func3(){
        List<Integer> listaDeInteiros = new ArrayList<>();
        listaDeInteiros.add(1);  // Auto-boxing: adiciona um int como um Integer
        listaDeInteiros.add(2);

        for (Integer numeroLista : listaDeInteiros) {
            System.out.println(numeroLista);  // Auto-unboxing: imprime o valor int de cada Integer na lista
        }
    }

// 5. Constantes MIN_VALUE e MAX_VALUE
// Cada classe wrapper tem constantes que representam os valores mínimo e máximo que o tipo primitivo correspondente pode ter.

    public void func4(){
        System.out.println("Valor mínimo de um int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo de um int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de um double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo de um double: " + Double.MAX_VALUE);
    }


// 6. Exemplo de uso de Boolean wrapper
// A classe Boolean oferece methods estáticos para trabalhar com valores booleanos.

    Boolean verdadeiro = Boolean.TRUE;
    Boolean falso = Boolean.FALSE;

    public void func5(){
        if (Boolean.parseBoolean("true")) {
            System.out.println("A string 'true' foi convertida para o valor booleano verdadeiro.");
        }
    }


// 7. Wrappers e Nullability
// Um dos benefícios dos wrappers é que eles podem ser nulos, enquanto os tipos primitivos não podem.

    Integer numeroNulo = null;

    // Comparando valores nulos
    Integer valor1 = null;
    Integer valor2 = 10;

    public void func6(){
        if (numeroNulo == null) {
            System.out.println("O objeto Integer está nulo.");
        }

        if (valor1 == null) {
            System.out.println("valor1 é nulo.");
        } else {
            System.out.println("valor1 não é nulo.");
        }

        if (valor2 != null) {
            System.out.println("valor2 não é nulo.");
        }
    }


// Isso é especialmente útil em contextos como bancos de dados, onde um valor pode estar ausente ou não definido.

// Este manual abrange os conceitos essenciais dos wrappers em Java. Os wrappers são uma parte importante da linguagem e facilitam a manipulação de tipos primitivos como objetos, além de oferecerem funcionalidades adicionais e integração com as coleções do Java.

}
