package main.java.CardsTrello.JavaGeral;

public class Literal {

	public static void main(String[] args) {

		// Em Java, um "literal" refere-se a uma representação específica de um valor constante em código-fonte.
		// Em outras palavras, é uma forma de expressar valores de dados de maneira direta e sem a necessidade de calcular ou processar.
		// Existem vários tipos de literais em Java, dependendo do tipo de dado que estão representando.
		//
		// 1. Literal de Inteiro:
		//    int numero = 42; // 42 é um literal de inteiro
		//
		// 2. Literal de Ponto Flutuante:
		//    double numeroDecimal = 3.14; // 3.14 é um literal de ponto flutuante
		//
		// 3. Literal de Caractere:
		//    char caractere = 'A'; // 'A' é um literal de caractere
		//
		// 4. Literal de String:
		//    String texto = "Olá, mundo!"; // "Olá, mundo!" é um literal de string
		//
		// 5. Literal de Booleano:
		//    boolean condicao = true; // true é um literal booleano
		//
		// 6. Literal de Long:
		//    long numeroLongo = 123456789L; // 123456789L é um literal longo
		//
		// 7. Literal de Hexadecimal (Inteiro):
		//    int hexadecimal = 0xFF; // 0xFF é um literal de inteiro em hexadecimal
		//
		// 8. Literal de Octal (Inteiro):
		//    int octal = 075; // 075 é um literal de inteiro em octal
		//
		// 9. Literal de Binário (Inteiro):
		//    int binario = 0b1010; // 0b1010 é um literal de inteiro em binário

		int numero;
		String cadeiaCaracteres;
		char caracter;
		boolean certoOuErrado;
		
		numero = 20;
		cadeiaCaracteres = "** Java Fundamentos";
		caracter = 'N';
		certoOuErrado = false;
		
		System.out.println(" O valor de numero é : " + numero);
		System.out.println(" O valor de cadeiaCaracteres é : " + cadeiaCaracteres);
		System.out.println(" O valor de caracter é : " + caracter);
		System.out.println(" O valor de certoOuErrado é : " + certoOuErrado);

	}

}
