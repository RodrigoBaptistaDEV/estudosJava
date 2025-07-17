package main.java.JavaGeral;

public class ComandoCondicional {

	public static void main(String[] args) {

		// ================================
		// IF
		// ================================
		// Estrutura "if":
		// Usada para executar um bloco de código se uma condição for verdadeira.
        /*
            if (condição) {
                código a ser executado se a condição for verdadeira
            }
        */

		int num1 = 10, num2 = 30;

		if (num1 < num2) {
			System.out.println("if normal - numero 1 é menor que numero 2");
		}

		// ================================
		// IF-ELSE
		// ================================
		// Estrutura "if-else":
		// Executa um bloco se a condição for verdadeira e outro se for falsa.
        /*
            if (condição) {
                código se verdadeira
            } else {
                código se falsa
            }
        */

		if (num1 > num2) {
			System.out.println("if com else - numero 1 é maior que numero 2");
		} else {
			System.out.println("if com else - numero 1 é menor que numero 2");
		}

		// ================================
		// IF-ELSE IF-ELSE
		// ================================
		// Avalia múltiplas condições sequencialmente.
        /*
            if (condição1) {
                código se condição1 verdadeira
            } else if (condição2) {
                código se condição2 verdadeira
            } else {
                código se nenhuma for verdadeira
            }
        */

		// Condição composta - situação: num1 < num2
		if (num1 > num2) {
			System.out.println("Condição composta 1 - numero 1 é maior que numero 2");
		} else if (num1 < num2) {
			System.out.println("Condição composta 1 - numero 1 é menor que numero 2");
		} else {
			System.out.println("Condição composta 1 - numero 1 é igual ao numero 2");
		}

		// Condição composta - situação: num1 = num2
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

		if (hora < 12) {
			System.out.println("cumpriu a condição deste if 1");
		}

		if (hora < 18) {
			System.out.println("cumpriu a condição deste if 3");
		}

		if (hora <= 23) {
			System.out.println("cumpriu a condição deste if 3");
		}

        /*
            Para criar relações encadeadas usamos o if-else
        */
		int hora2 = 23;

		if (hora2 < 12) {
			System.out.println("cumpriu a condição deste if 1 parando aqui");
		} else if (hora2 < 18) {
			System.out.println("nao cumpriu a condição do if 1 então veio para cá, se cumpriu essa condição ok");
		} else if (hora2 <= 23) {
			System.out.println("nao cumpriu os outros ifs e portanto é maior ou igual a 18 caindo para essa verificação");
		}

        /*
            Exemplo de cálculo de IMC com ranges adequados:
            - abaixo do peso -> imc < 18.5
            - peso normal -> imc entre 18.5 e 25
            - sobrepeso -> imc de 25 a 30
            - obesidade -> imc > 30
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

		// ================================
		// SWITCH
		// ================================
		// Estrutura "switch":
		// Avalia uma expressão e executa um bloco correspondente ao valor.
        /*
            switch (variavel) {
                case valor1:
                    código se igual a valor1
                    break;
                case valor2:
                    código se igual a valor2
                    break;
                default:
                    código se não houver correspondência
                    break;
            }
        */

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

        /*
            Obs:
            - "break" é usado para sair do bloco switch.
            - Sem o break, o código continua executando os próximos cases (fall-through).
        */

		// A partir do Java 12, temos Switch Expressions:
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
