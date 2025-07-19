package main.java.CardsTrello.JavaGeral.Wrappers;// Arquivo: WrappersEmJava.java
// ------------------------------------------------------------
// MANUAL DE CLASSES WRAPPER EM JAVA
// ------------------------------------------------------------
// Autor: Rodrigo (estudo dirigido em Java)
// Objetivo: Explicar profundamente o conceito de wrappers, suas vantagens,
// limitações, methods utilitários e aplicações práticas no contexto Java moderno.
// ------------------------------------------------------------

import java.util.*;

public class WrappersEmJava {

    public static void main(String[] args) {
        introducaoTeorica();
        tiposPrimitivosEBasicoDeWrappers();
        autoboxingEUnboxing();
        metodosUtilitariosWrappers();
        colecoesComWrappers();
        nullabilidadeComWrappers();
        constantesWrappers();
        comparacoesWrappers();
        operacoesAltoNivelComWrappers();
    }

    /**
     * Explicação teórica sobre tipos primitivos e objetos.
     */
    public static void introducaoTeorica() {
        /*
         * Em Java, existem dois grandes grupos de tipos de dados:
         *
         * 1. Tipos Primitivos: São os tipos básicos e mais eficientes.
         *    Exemplos: int, char, boolean, byte, short, long, float, double.
         *
         *    - São rápidos, pois trabalham diretamente com valores na memória.
         *    - Não possuem methods, pois não são objetos.
         *    - Não podem ser nulos (ou seja, sempre têm um valor padrão).
         *
         * 2. Objetos: São instâncias de classes.
         *    - Possuem methods, atributos e são manipuláveis com orientação a objetos.
         *
         * Para usar os primitivos em estruturas que exigem objetos (como coleções),
         * Java fornece as CLASSES WRAPPER.
         *
         * Essas classes "empacotam" (wrap) o tipo primitivo, transformando-o em objeto.
         */

        // Relação de tipos primitivos e suas classes wrapper:
        // ---------------------------------------------------
        // int     -> Integer
        // char    -> Character
        // boolean -> Boolean
        // byte    -> Byte
        // short   -> Short
        // long    -> Long
        // float   -> Float
        // double  -> Double

        // Exemplo de autoboxing (conversão implícita de primitivo para wrapper)
        Integer numeroObjeto = 10;
        Character letraObjeto = 'A';
        Boolean verdadeiroObjeto = true;

        // Criando objeto e testando sua classe
        Integer intWrapped = 5215;
        System.out.println("Classe de intWrapped: " + intWrapped.getClass());
    }

    /**
     * Demonstra a criação de tipos primitivos e seus wrappers equivalentes.
     */
    public static void tiposPrimitivosEBasicoDeWrappers() {
        // Tipos primitivos comuns
        int primitivo = 42;
        char letra = 'Z';
        boolean logico = true;

        // Wrappers equivalentes — agora como objetos
        Integer inteiroObj = Integer.valueOf(primitivo); // boxing explícito
        Character letraObj = letra;                      // autoboxing
        Boolean logicoObj = Boolean.valueOf(logico);     // boxing explícito

        System.out.println("Tipo primitivo int: " + primitivo);
        System.out.println("Objeto Integer: " + inteiroObj);
        System.out.println("Objeto Character: " + letraObj);
        System.out.println("Objeto Boolean: " + logicoObj);
    }

    /**
     * Explica e demonstra Autoboxing e Unboxing.
     */
    public static void autoboxingEUnboxing() {
        /*
         * Desde o Java 5, temos:
         * - Autoboxing: conversão automática de primitivo → objeto
         * - Unboxing: conversão automática de objeto wrapper → primitivo
         */

        // Autoboxing
        Integer wrapper = 99; // int -> Integer automaticamente

        // Unboxing
        int primitivo = wrapper; // Integer -> int automaticamente

        System.out.println("Autoboxing: int -> Integer: " + wrapper);
        System.out.println("Unboxing: Integer -> int: " + primitivo);
    }

    /**
     * Demonstra os principais methods utilitários das classes wrapper.
     */
    public static void metodosUtilitariosWrappers() {
        // Conversão de String para tipo primitivo
        int numero = Integer.parseInt("123"); // parseXxx retorna tipo primitivo
        double pi = Double.parseDouble("3.14");
        boolean ativo = Boolean.parseBoolean("true");

        // valueOf retorna objeto wrapper
        Integer objInt = Integer.valueOf("456");
        Double objDouble = Double.valueOf(2.71);

        // Converte wrapper para tipo primitivo
        int n = objInt.intValue();      // Integer → int
        double d = objDouble.doubleValue(); // Double → double

        // toString para representação textual
        String texto = objInt.toString(); // "456"

        System.out.println("parseInt: " + numero);
        System.out.println("valueOf: " + objInt);
        System.out.println("toString: " + texto);
        System.out.println("intValue: " + n);
    }

    /**
     * Mostra a importância dos wrappers em coleções Java.
     */
    public static void colecoesComWrappers() {
        /*
         * Coleções em Java, como List, Set e Map, só aceitam objetos (não tipos primitivos).
         * Para isso, utilizamos os wrappers.
         */
        List<Integer> lista = new ArrayList<>();
        lista.add(10); // autoboxing: int → Integer
        lista.add(20);
        lista.add(30);

        for (Integer i : lista) {
            System.out.println("Elemento na lista: " + i); // unboxing ao imprimir
        }
    }

    /**
     * Demonstra a vantagem de wrappers aceitarem null.
     */
    public static void nullabilidadeComWrappers() {
        /*
         * Tipos primitivos não podem ser nulos. Já wrappers podem.
         * Isso é útil para representar "ausência de valor".
         */
        Integer idade = null;

        if (idade == null) {
            System.out.println("Idade não foi informada.");
        }
    }

    /**
     * Constantes e verificações utilitárias dos wrappers.
     */
    public static void constantesWrappers() {
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Double.isNaN(0.0/0.0): " + Double.isNaN(0.0 / 0.0));
        System.out.println("Double.isFinite(3.14): " + Double.isFinite(3.14));
    }

    /**
     * Demonstra methods de comparação e igualdade.
     */
    public static void comparacoesWrappers() {
        Integer x = 100;
        Integer y = 200;

        System.out.println("x.equals(y): " + x.equals(y));
        System.out.println("x.compareTo(y): " + x.compareTo(y));
        System.out.println("Integer.compare(300, 100): " + Integer.compare(300, 100));
    }

    /**
     * Exemplo moderno com Stream API (Java 8+).
     */
    public static void operacoesAltoNivelComWrappers() {
        /*
         * A API de Streams exige objetos. Wrappers permitem uso funcional e elegante.
         */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int soma = numeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Soma com Stream: " + soma);
    }
}
