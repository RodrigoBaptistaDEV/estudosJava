package main.java.JavaGeral;

public class LacoRepeticao {

	public static void main(String[] args) {

		/*

		1. Laço "for" (laço de repetição com variável de controle):
			É usado quando se sabe quantas vezes o bloco de código precisa ser executado.

			for (inicialização; condição; atualização) {
				bloco de código a ser repetido ;
			}

		*/

		System.out.println("Comando FOR");
		int qtdVezes = 0;
		for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
			System.out.println("Estou fazendo a " + qtdVezes1 + " vez");
			qtdVezes = qtdVezes1;
		}
		System.out.println("Sai do laço e executei " + (qtdVezes) + " vezes");

		for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
			System.out.println("Estou fazendo a " + qtdVezes1 + "vez");
			if (qtdVezes1 == 5) {
				System.out.println("Parei na " + qtdVezes1 + "vez");
				break;
			}
		}

		/*

		2. Laço "while" (laço pré testado/ com teste no início) :
			É usado quando não se sabe quantas vezes o bloco de código precisa ser executado.

				inicialização
				while (condição) {
				bloco de código a ser repetido;
				atualização;
				}
		 */

		System.out.println("Comando WHILE");
		qtdVezes = 1;
		
		while (qtdVezes <= 10) {
			System.out.println("Estou fazendo a " + qtdVezes + " vez");
			qtdVezes++; // qtdVezes = qtdVezes + 1
		}
		System.out.println("Sai do laço e executei " + (qtdVezes-1) + " vezes");

		/*

		3. Laço "do-while" (laço pós testado/com teste no final) :
		É semelhante ao "while", mas garante que o bloco de código seja executado pelo menos uma vez, mesmo se a condição for falsa.

			inicialização
			do {
				bloco de código a ser repetido;
				atualização;
			} while (condição);

		*/

		System.out.println("Comando DO ...WHILE");
		qtdVezes = 1; 
		do {
			System.out.println("Estou fazendo a " + qtdVezes + " vez");
			qtdVezes++; // qtdVezes = qtdVezes + 1
		} while (qtdVezes <= 10);
		System.out.println("Sai do laço e executei " + (qtdVezes-1) + " vezes");

		/*

		4. ForEach  - usado para percorrer elementos em uma coleção;

			for (tipo elemento : coleção) {
				bloco de código a ser repetido;
			}

		*/

		String[] nomes = {"Alice", "Bob", "Charlie", "David"};

		System.out.println("Comando FOR EACH");
		for (String nome : nomes) {
			System.out.println("Nome: " + nome);
		}


	// laço aninhado

	/*
	Neste exemplo, há um loop for externo que itera três vezes e um loop for interno que também itera três vezes
	para cada iteração do loop externo.
	O resultado será a execução do código dentro do loop interno três vezes para cada iteração do loop externo.
	Isso cria um padrão de repetição aninhado, uma estrutura está contida dentro de outra, como caixas aninhadas uma dentro da outra.
	*/

		for (int i = 1; i <= 3; i++) {
			System.out.println("Iteração externa " + i);

			for (int j = 1; j <= 3; j++) {
				System.out.println("  Iteração interna " + j);
			}
		}

	}
}
