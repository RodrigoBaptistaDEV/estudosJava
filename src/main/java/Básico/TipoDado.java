package main.java.Básico;

public class TipoDado {

	public static void main(String[] args) {

	// VARIAVEIS

		// podemos instanciar ( separar espaço na memória) e inicializar ( declarar valores)
		// as variaveis são inicializados completamente pelo combo tipo-nome-valor
		//Podemos declarar variáveis de vários jeitos :

		// Instanciando e inicializando na mesma linha
		int num1 = 10;
		int num2 = 20, num3 = 5;

		// Instanciando em uma linha e inicializando na outra
		int num4, num5;
		num4 = 10;
		num5 = 10;

	// TIPOS DE DADOS

	//prmitivos (são oito)

		// numeros inteiros ( bits 8,16,32,64 = byte,short,int,long;

			// 1- Byte, inteiros de -128 ate 127.
			byte numero1 = 10;
			// 2 - short, de -2,147 bilhoes ate 2,147 bilhoes.
			int numero2 = 1000000;
			// 3 - long, de -9,223quintilhoes e 9,223 quintilhoes
			long numero3 = 3000000000L;

		// numeros de ponto flutuante (decimais), ( bits 32 , 64 = float, double)

			// 1- float, precisao simples, até 7 dígitos decimais de precisão
			float numero1f = 3.1415f;
			// 2 double, precisao dupla, até 15 dígitos decimais de precisão
			double numero2d = 3.14159265358979323846;

		// char - representa caracter unicode de 16 bits

			char letra1 = 'A';

		// boolean - valor de lógica booleana, verdadeiro ou falso;

			boolean valorb = true;

	// não primitivos (dados de referencia)

                /* os tipos de dados não primitivos não possuem um valor padrão.
                        Quando você declara uma variável você precisa inicializá-la com um valor,
                        ou atribuir a ela uma referência a um objeto existente, antes de utilizá-la em seu programa.
                        String, Arrays , List,Map , Set e outras classes de coleções,Enums
                 */

		// string - sequência de caracteres alfanuméricos
		String nome = "João";

	}

}
