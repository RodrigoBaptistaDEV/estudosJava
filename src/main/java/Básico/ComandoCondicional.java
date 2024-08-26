package main.java.Básico;

public class ComandoCondicional {

	public static void main(String[] args) {

	// IF

		// if -usada para executar um bloco de código se uma condição for verdadeira
                    /*
                        if (condição) {
                            código a ser executado se a condição for verdadeira
                        }
                    */

		int num1 = 10, num2 = 30;
		if (num1 < num2) {
			System.out.println("if normal - numero 1 é menor que numero 2");
		}


	// Estrutura "if-else": É usada para executar um bloco de código se uma condição for verdadeira e outro bloco de código se a condição for falsa.
                    /*
                        if (condição) {
                           código a ser executado se a condição for verdadeira
                        } else {
                           código a ser executado se a condição for falsa
                        }
                    */

		if (num1 > num2) {
			System.out.println("if com else - numero 1 é maior que numero 2");
		} else {
			System.out.println("if com else - numero 1 é menor que numero 2");
		}


	// Estrutura "if-else if-else": É usada para avaliar múltiplas condições e executar diferentes blocos de código com base nessas condições. A sintaxe básica é:

                    /*
                        if (condição1) {
                            // código a ser executado se a condição1 for verdadeira
                         } else if (condição2) {
                            // código a ser executado se a condição2 for verdadeira
                         } else {
                            // código a ser executado se nenhuma das condições anteriores for verdadeira
                         }
                     */

		// condição composta - situação num1 < num2
		if (num1 > num2) {
			System.out.println("Condição composta 1 - numero 1 é maior que numero 2");
		} else if (num1 < num2) {
			System.out.println("Condição composta 1 - numero 1 é menor que numero 2");
		} else {
			System.out.println("Condição composta 1 - numero 1 é igual ao numero 2");
		}

		// condição composta - situação num1 = num2
		num1 = 10;
		num2 = 10;
		if (num1 > num2) {
			System.out.println("Condição composta 2 - numero 1 é maior que numero 2");
		} else if (num1 < num2) {
			System.out.println("Condição composta 2 - numero 1 é menor que numero 2");
		} else {
			System.out.println("Condição composta 2 - numero 1 é igual ao numero 2");
		}

	/*
	Obs:
		Repare que no IF as verificações são independentes
	*/
		int hora = 10;

		if(hora < 12){
			System.out.println("cumpriu a condição deste if 1");
		}

		if(hora < 18){
			System.out.println("cumpriu a condição deste if 3");
		}

		if(hora <= 23){
			System.out.println("cumpriu a condição deste if 3");
		}

	/*
		Então para criar relações utilizamos o if-else
	*/

		int hora2 = 23;

		if(hora2 < 12){
			System.out.println("cumpriu a condição deste if 1 parando aqui");
		} else if (hora2 < 18){
			System.out.println("nao cumpriu a condição do if 1 então veio para cá, se cumpriu essa condição ok");
		} else if (hora2 <= 23){
			System.out.println("nao cumpriu os outros ifs e portanto é maior ou igual a 18 caindo para essa verificação");
		}

	/*
		O exemplo do cáculo de imc é interessante por mostrar como devemos adequar o range de numeros para cada situação

		abaixo do peso -> imc abaixo de 18.5
		peso normal -> imc entre 18.5 e 25
		sobrepeso -> imc de 25 para 30
		obesidade -> imc maior que 30
	*/
		int imc = 27;

		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Peso normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obesidade");
		}


	// Estrutura "switch": É usada para avaliar uma expressão e executar um bloco de código correspondente a um valor específico.

					/*
                        switch (variavel) {
                           case valor1:
                              código a ser executado se a expressão for igual a valor1
                              break;
                           case valor2:
                              código a ser executado se a expressão for igual a valor2
                              break;
                           default:
                              código a ser executado se a expressão não corresponder a nenhum dos valores anteriores
                              break;
                        }
                    */

		// comando condicional SWITCH

		char opcao = '4';

		switch (opcao) {
			case '1': {
				System.out.println("Chame programa de inclusão");
				break;
			}
			case '2': {
				System.out.println("Chame programa de Alteração");
				break;
			}
			case '3': {
				System.out.println("Chame programa de Exclusão");
				break;
			}
			case '4': {
				System.out.println("Chame programa de Consulta");
				break;
			}
		}

		//break é usada para sair do bloco switch. Sem o break, o código continuaria a ser executado até encontrar um break ou até o final do bloco switch, o que pode não ser o comportamento desejado.

		// a partir do java 12 temos a Switch Expressions

		/*
		String mensagem = switch (diaDaSemana) {
			case 1 -> "Domingo";
			case 2 -> "Segunda-feira";
			case 3 -> "Terça-feira";
			case 4 -> "Quarta-feira";
			case 5 -> "Quinta-feira";
			case 6 -> "Sexta-feira";
			case 7 -> "Sábado";
			default -> "Dia inválido";
		};
		*/

	}
}
