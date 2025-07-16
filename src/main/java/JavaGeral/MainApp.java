package main.java.JavaGeral;

public class MainApp {

/*

Em Java, a execução de um programa começa pelo método main.
Este método é o ponto de entrada principal para qualquer programa Java e é onde a execução do programa realmente inicia.
Quando você executa um programa Java, o sistema Java procura pelo método main para começar a execução.

O método main é o ponto de entrada principal em Programas de Linha de Comando.
Quando você executa um programa Java a partir da linha de comando, o sistema Java procura pelo método main e inicia a execução a partir dele.

"Programas de linha de comando" referem-se a aplicativos que são executados a partir da linha de comando ou terminal de um sistema operacional.
Esses programas interagem com o usuário por meio de comandos inseridos manualmente no terminal.
Em um programa de linha de comando, o usuário fornece instruções diretamente digitando comandos no prompt do terminal.
Esses comandos podem incluir argumentos que modificam o comportamento do programa.
A execução desses programas geralmente começa a partir da chamada de um executável específico associado ao programa.
Um exemplo simples de um programa de linha de comando pode ser um utilitário que realiza operações de manipulação de arquivos,
onde o usuário digita comandos como "copiar", "mover", "listar" ou outros diretamente no terminal.
Por outro lado, em aplicações não destinadas à execução a partir da linha de comando,
o usuário pode interagir com a aplicação por meio de uma interface gráfica, uma API web, ou outros meios.
Nesses casos, a execução do programa pode ser iniciada de maneiras diferentes,
e pode não haver uma entrada de linha de comando principal, como o método main, para controlar o fluxo de execução.
Em vez disso, a aplicação pode ser iniciada e gerenciada por um servidor, um framework específico ou um ambiente de execução específico.

*/

    public static void main(String[] args) {
        System.out.println("hello world!");
    }

/*

public:
Este modificador de acesso indica que o método main é acessível de qualquer classe.
É necessário que o método main seja público para que o sistema Java possa chamá-lo.

static:
Este modificador indica que o método main pertence à classe em si, em vez de pertencer a instâncias da classe.
Isso significa que você pode chamar o método main sem criar uma instância da classe.

void:
O método main não retorna nenhum valor. A palavra-chave void é usada para indicar que o método não retorna nada.

main:
Este é o nome do método. Este nome é convencional e é o que o sistema Java procura quando inicia a execução do programa.

String[] args:
Este é um parâmetro que representa uma matriz de strings.
Quando você executa um programa Java a partir da linha de comando, você pode passar argumentos para o programa.
Esses argumentos são armazenados como strings em um array e são passados para o método main.
Este é o mecanismo pelo qual você pode interagir com o seu programa Java a partir da linha de comando.

*/

}
