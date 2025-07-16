package main.java.JavaGeral;

import javax.swing.*;
import java.util.Scanner;

public class EntradaSaidaDados {

	public static void main(String[] args) {

	// SCANNER

		// Método Scanner:
		// 1. Criar um objeto da classe Scanner passando como parametro "System.in".
		// 2. Criar variável que receberá o valor escaneado.
		// 3. Saída pelo println.

		System.out.println("Entre a raça e a idade"); // Avisar ao console para não ficar em branco.
		Scanner in = new Scanner(System.in); // Cria o Scanner.
		String raça = in.next(); // Armazena na variável o valor digitado.
		int idade = in.nextInt(); // Pode especificar tipos de entrada para continuar.

		System.out.println("A raça é " + raça + " e a idade é " + idade); // Saída de dados no output.

		/*
		Explicação -
		Na entrada,
		Criamos um objeto da classe Scanner, passando para seu construtor um input stream como requisitado.
		Esse input stream é a variavel de instancia/atributo "in" da classe System.
		Com o objeto criado, conseguimos acessar o método next() para armazenar em uma variavel o valor capturado.

		Na saida,
		A expressão 'System.out.println' é uma chamada ao método println do objeto out, que é uma instância da classe PrintStream.
		O método println é usado para imprimir uma linha de texto no console.
		Estamos chamando o método println do objeto out da classe System.
		*/


	// JOPTIONPANE

		// Método JOptionPane:
		// 1. Armazenar o input em uma variável.
		// 2. Saída de dados por painel de mensagem.

		String palavra2 = JOptionPane.showInputDialog("Digite uma palavra"); // Armazena o input em uma variável.

		JOptionPane.showMessageDialog(null, "Você digitou: " + palavra2); // Saída de dados pelo JOptionPane.

		// Outra entrada de dados via JOptionPane.
		int idade3;
		idade3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa"));
		JOptionPane.showMessageDialog(null, "A pessoa tem " + idade3 + " anos de idade");

		// JOptionPane tem tipos de mensagem.
		JOptionPane.showMessageDialog(null, "Teste", "Informação!!", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Teste", "Mensagem de Erro!!", JOptionPane.ERROR_MESSAGE);

	// FORMATAÇÃO DE SAÍDA PELO PRINTF

		// Observação: Podemos formatar a saída usando o printf.
		// Utilizamos o símbolo % para definir onde entra uma variável.
		// No final das aspas, colocamos as variáveis que aparecem em sequência.
		// Podemos usar:
		//   %d para inteiros,
		//   %f para double e float,
		//   %b para boolean,
		//   %c para caractere,
		//   %s para string.
		// Para %f, usamos o .N para indicar o número de casas decimais.

		String nome2 = "Nicolas";
		int idade2 = 30;
		float altura2 = 1.893f;
		float peso2 = 82.55f;
		System.out.printf("%s tem %d anos, %.2f de altura e pesa %.1f kg", nome2, idade2, altura2, peso2);
	}
}
