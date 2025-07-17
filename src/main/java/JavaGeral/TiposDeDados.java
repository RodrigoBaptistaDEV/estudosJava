package main.java.JavaGeral;

import main.java.JavaGeral.estudoEnum.Enum.DiaDaSemana;
import main.java.exercicios.exerciciosPOO.exercicios1a5.Pessoa;

import java.util.*;

public class TiposDeDados {

	//* ------------------------------------------------------------
	//* 1) TIPOS PRIMITIVOS
	//* ------------------------------------------------------------
	/*
	 * Em Java, existem exatamente 8 tipos primitivos:
	 *
	 * 1. boolean  - 1 bit  - verdadeiro ou falso
	 * 2. byte     - 8 bits - valores de -128 a 127
	 * 3. short    - 16 bits - valores de -32.768 a 32.767
	 * 4. int      - 32 bits - valores inteiros em torno de ±2 bilhões
	 * 5. long     - 64 bits - valores inteiros muito grandes (sufixo L)
	 * 6. float    - 32 bits - ponto flutuante (sufixo f)
	 * 7. double   - 64 bits - ponto flutuante de maior precisão
	 * 8. char     - 16 bits - representa um caractere Unicode (aspas simples)
	 *
	 * Valores padrão quando são atributos de uma classe:
	 * boolean  -> false
	 * byte     -> 0
	 * short    -> 0
	 * int      -> 0
	 * long     -> 0L
	 * float    -> 0.0f
	 * double   -> 0.0d
	 * char     -> '\u0000'
	 *
	 * Observação: variáveis locais não inicializadas causam erro de compilação.
	 */

	// Exemplos práticos dos 8 tipos primitivos:
	boolean ativo = true;
	byte nivel = 120;
	short populacaoCidade = 25000;
	int idade = 28;
	long populacaoMundial = 8000000000L;
	float temperatura = 36.6f;
	double pi = 3.141592653589793;
	char inicial = 'R';

	//* ------------------------------------------------------------
	//* 2) TIPOS DE DADOS DE REFERÊNCIA
	//* ------------------------------------------------------------
	/*
	 * Diferente dos primitivos, os tipos de dados de referência não armazenam valores diretamente,
	 * mas sim uma referência (ponteiro) para um objeto localizado na memória heap.
	 *
	 * Os principais tipos de referência incluem:
	 * - Classes: estruturas com atributos e methods definidos pelo programador.
	 * - Interfaces: contratos de methods para implementação por classes.
	 * - Arrays: estruturas de dados fixas que armazenam múltiplos elementos.
	 * - Strings: classe especial que representa sequências de caracteres.
	 * - Wrappers: versões em objeto dos tipos primitivos (ex: Integer, Double).
	 * - Enums: tipos definidos por um conjunto fixo de constantes nomeadas.
	 * - Coleções: estruturas da biblioteca java.util como List, Set, Map.
	 *
	 * Características gerais:
	 * - Armazenam endereços de memória, não valores diretamente.
	 * - Valor padrão: null (quando não inicializados).
	 * - Permitem o uso de methods, herança, polimorfismo e encapsulamento.
	 * - Necessitam de instanciamento (exceto literais como String).
	 */

	// String
	String saudacao = "Olá, Java!";

	// Array
	int[] numeros = {1, 2, 3, 4};

	// Enum
	DiaDaSemana hoje = DiaDaSemana.QUINTA;

	// Classe definida pelo usuário
	Pessoa pessoa1 = new Pessoa("Rodrigo");

	// Interface
		// Exemplo: uso de uma interface como tipo de referência

		// A classe String implementa a interface Comparable<String>
		// Ou seja, objetos do tipo String podem ser atribuídos a variáveis do tipo Comparable<String>
			String nome1 = "Java";
			Comparable<String> comparador = nome1;

			// Mesmo a variável sendo do tipo da interface, conseguimos usar methods definidos nela.
		// Nesse caso, compareTo é um method da interface Comparable.
			int resultado = comparador.compareTo("Kotlin");

		// Isso funciona porque a classe real por trás da interface é String, que implementa esse method.
		// O resultado será um número negativo, pois "Java" < "Kotlin" em ordem alfabética.


	// Wrapper
	Integer idadeWrapper = 30;

	// Coleções
	List<String> nomes = new ArrayList<>();
	Set<String> linguagens = new HashSet<>();
	Map<String, Integer> pontuacoes = new HashMap<>();

	//* ------------------------------------------------------------
	//* 3) DIFERENÇA REAL ENTRE TIPOS PRIMITIVOS E DE REFERÊNCIA
	//* ------------------------------------------------------------
	/*
	 * //* DIFERENÇA FUNDAMENTAL
	 * Em Java, a diferença essencial entre tipos primitivos e tipos de referência
	 * está no modelo de memória e na forma como os valores são armazenados:
	 *
	 * - Tipos primitivos armazenam o valor diretamente (na stack, via registro ou slot fixo).
	 * - Tipos de referência armazenam um ponteiro que referencia um objeto criado na heap.
	 *
	 * ▸ Primitivos carregam o DADO.
	 * ▸ Referências carregam o ENDEREÇO de um OBJETO que contém o dado.
	 *
	 *
	 * //* COPIANDO VARIÁVEIS (comportamento de atribuição)
	 *
	 * // PRIMITIVOS: cópia de valor
	 * int x = 10;
	 * int y = x;
	 * x = 20;
	 * // y permanece 10, pois a cópia é independente.
	 *
	 * // REFERÊNCIA: cópia de ponteiro
	 * Pessoa p1 = new Pessoa("Ana");
	 * Pessoa p2 = p1;
	 * p1.nome = "Lia";
	 * // p2.nome também será "Lia", pois ambas apontam para o mesmo objeto.
	 *
	 *
	 * //* NULL
	 *
	 * - Somente tipos de referência podem ser null.
	 * - Tipos primitivos NÃO podem ser null.
	 *
	 * // Exemplo:
	 * String texto = null;   // válido
	 * int idade = null;      // erro de compilação
	 *
	 *
	 * //* IDENTIDADE vs VALOR
	 *
	 * - Primitivos não têm identidade. Dois inteiros com valor 100 são sempre "iguais".
	 * - Tipos de referência têm identidade (endereço de memória).
	 *
	 * Integer a = new Integer(100);
	 * Integer b = new Integer(100);
	 * a == b         ➜ false  (endereços diferentes)
	 * a.equals(b)    ➜ true   (valores iguais)
	 *
	 * Integer a = 5;       // aponta para Integer@0xABC
	 * Integer b = a;       // b também aponta para Integer@0xABC
	 * a = 10;              // a agora aponta para Integer@0xDEF
	 * // b ainda aponta para o objeto antigo (valor 5)
	 *
	 *
	 * //* MUTABILIDADE
	 *
	 * A mutabilidade de um tipo de dado não está ligada ao fato de ser primitivo ou de referência.
	 * Todos os tipos primitivos são imutáveis.
	 * Tipos de referência, por outro lado, podem ser **imutáveis** ou **mutáveis**, dependendo da implementação da classe.
	 *
	 * Exemplos por categoria:
	 *
	 * - Classes:
	 *   → Pode ser mutável ou imutável. Ex: uma classe Pessoa com atributos editáveis é mutável.
	 *
	 * - Interfaces:
	 *   → Não define mutabilidade diretamente. Depende da implementação concreta da classe.
	 *
	 * - Arrays:
	 *   → Mutáveis. Permitem alterar seus elementos após a criação.
	 *     Ex: int[] numeros = {1, 2, 3};  numeros[0] = 99;
	 *
	 * - Strings:
	 *   → Imutáveis. Toda modificação gera um novo objeto.
	 *     Ex: String nome = "Ana"; nome = nome + " Maria"; // novo objeto criado
	 *
	 * - Wrappers:
	 *   → Imutáveis. Integer, Double, Boolean etc. não permitem alteração do valor interno.
	 *     Ex: Integer a = 5; a = 10; // novo objeto é criado
	 *
	 * - Enums:
	 *   → Imutáveis por natureza. Representam constantes fixas em tempo de execução.
	 *     Ex: DiaDaSemana.SEGUNDA não pode ser alterado.
	 *
	 * - Coleções (List, Set, Map):
	 *   → Mutáveis por padrão. Permitem adicionar, remover ou alterar elementos.
	 *     Ex: List<String> nomes = new ArrayList<>(); nomes.add("Rodrigo");
	 *
	 * 		Obs: É possível tornar coleções imutáveis usando `Collections.unmodifiableList()`, `List.of()`, etc.
	 *
	 * //* TABELA DE DIFERENÇAS
	 *
	 * | Aspecto              | Primitivo         | Referência (Objeto)         |
	 * |----------------------|-------------------|------------------------------|
	 * | Armazenamento        | Valor direto       | Endereço p/ objeto na heap   |
	 * | Pode ser null        | Não                | Sim                          |
	 * | Possui methods       | Não                | Sim                          |
	 * | Mutabilidade         | Imutável (fixo)    | Pode ser mutável ou não      |
	 * | Participa de herança | Não                | Sim                          |
	 * | Comparação           | == (valor direto)  | == (referência) ou .equals() |
	 * | Exemplo              | int, char, boolean | String, Integer, List        |
	 *
	 *
	 * //* CONCLUSÃO
	 *
	 * ▸ Primitivos guardam valores diretamente.
	 * ▸ Referências guardam ponteiros para objetos.
	 *
	 * ▸ Isso afeta o comportamento ao copiar, comparar, atribuir e tratar null.
	 * ▸ Wrappers se comportam “parecido” com primitivos, mas ainda são objetos.
	 * ▸ Mutabilidade não é o critério definidor dessa diferença.
	 */
}
