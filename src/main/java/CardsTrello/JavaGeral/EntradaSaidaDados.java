package main.java.CardsTrello.JavaGeral;

import javax.swing.*;
import java.util.Scanner;

// Novas importações para leitura/escrita em arquivos
import java.io.*;

public class EntradaSaidaDados {

	public static void main(String[] args) {

		// SCANNER

		// method Scanner:
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
		Com o objeto criado, conseguimos acessar o method next() para armazenar em uma variavel o valor capturado.

		Na saida,
		A expressão 'System.out.println' é uma chamada ao method println do objeto out, que é uma instância da classe PrintStream.
		O method println é usado para imprimir uma linha de texto no console.
		Estamos chamando o method println do objeto out da classe System.
		*/


		// JOPTIONPANE

		// method JOptionPane:
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


		// LEITURA E ESCRITA EM ARQUIVO TEXTO

		// Escrevendo em arquivo texto:
		// 1. Criar objeto FileWriter ou BufferedWriter.
		// 2. Usar write() para escrever dados.
		// 3. Fechar o arquivo com close() ou usar try-with-resources.

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("saida.txt"));
			bw.write("Linha 1 escrita no arquivo.");
			bw.newLine(); // Para quebrar linha.
			bw.write("Linha 2 escrita no arquivo.");
			bw.close();
			System.out.println("\nDados escritos no arquivo com sucesso!");
		} catch (IOException e) {
			System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
		}

		// Lendo de arquivo texto:
		// 1. Criar objeto FileReader ou BufferedReader.
		// 2. Usar readLine() dentro de um loop.
		// 3. Fechar o arquivo após leitura.

		try {
			BufferedReader br = new BufferedReader(new FileReader("saida.txt"));
			String linha;
			System.out.println("\nConteúdo do arquivo:");
			while ((linha = br.readLine()) != null) {
				System.out.println("Lido: " + linha);
			}
			br.close();
		} catch (IOException e) {
			System.err.println("Erro ao ler o arquivo: " + e.getMessage());
		}


		// ESCRITA E LEITURA DE ARQUIVO BINÁRIO

		// FileOutputStream e FileInputStream permitem gravar e ler bytes diretamente.
		// Úteis para arquivos binários como imagens ou objetos serializados.

		try {
			FileOutputStream fos = new FileOutputStream("dados.bin");
			fos.write(123); // Escreve um único byte (exemplo)
			fos.write(255); // Outro byte (valor máximo)
			fos.close();
			System.out.println("\nArquivo binário criado.");
		} catch (IOException e) {
			System.err.println("Erro ao escrever arquivo binário: " + e.getMessage());
		}

		try {
			FileInputStream fis = new FileInputStream("dados.bin");
			int b1 = fis.read();
			int b2 = fis.read();
			fis.close();
			System.out.println("Bytes lidos do binário: " + b1 + " e " + b2);
		} catch (IOException e) {
			System.err.println("Erro ao ler arquivo binário: " + e.getMessage());
		}

		in.close(); // Fecha o Scanner no final do programa
	}
}
