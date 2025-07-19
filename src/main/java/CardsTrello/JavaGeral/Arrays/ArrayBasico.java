package main.java.CardsTrello.JavaGeral.Arrays;

public class ArrayBasico {
    public static void main(String[] args) {

//
/*
Arrays são objetos especiais que podem conter múltiplos elementos do mesmo tipo.
Dessa maneira, posto que nós temos o processo de instanciar ( alocar espaço na memoria) e inicializar ( atribuir valor)
dados que possuem tipos definidos (int, char, boolean) como podemos ver em :

    int numero; // instaciação
    numero = 10; // inicialização

No array, nós instanciamos o Array - uma variavel que representa um conjunto de elementos do mesmo tipo e inicializamos
seus elementos, cada elemento sendo um dado que possui um tipo definido.

Portanto um array em java possui 4 caracteristicas : tipo, nome, tamanho, valor dos elementos.

Na criação desses dados atraves de um array teriamos então a seguinte logica:
- instanciação de uma variavel do tipo array.

    int[] meuArray; // uma variavel que representa um conjunto de dados do tipo int

- instaciação dos elementos que estão na variavel array ( definição do tamanho do array ).
    Como aqui eu tenho uma variavel, a sintaxe cria pra mim uma forma de indicar que os elementos serão instanciados.
    Ou seja, como esses elementos serão atribuidos valor zero.
    A sintaxe cria aqui a definição do tamanho do array. Ela entende o numero de elementos que deve atribuir valor zero.

    meuArray = new int[10]; // instancio 10 elementos no meu array com valor zero.

- inicialização dos elementos deste array.
    meuArray[0] = 100; // com os elementos criados posso atribuir valor, acesso pelo indice, o indice começa em 0.


Assim podemos:

1) Instanciar o array e instaciar seus elementos em linhas diferentes.
2) Instanciar o array e instaciar seus elementos na mesma linhas.
3) Instanciar vários arrays e seus elementos na mesma linhas.

De outro lado, podemos criar um array, inicializando diretamente os elementos do array. Nesse caso utilizamos o {}
para atribuição de valores. O tamanho do array será definido pelo numero de posições entendidos.

*/

    // EXEMPLOS

    // 1) Instanciar o array e instaciar seus elementos em linhas diferentes
        int[] meuArray;
        meuArray = new int[10];

    // 2) Instanciar o array e instaciar seus elementos na mesma linhas.
        int[] numeros = new int[4];

    // 3) Instanciar vários arrays e seus elementos na mesma linhas;
        int[] numeros3 = new int[44], numeros4 = new int[23];

            // nesse sentido devemos depois inicializar os elementos do array

            // Inicialização de cada um dos elementos, acessamos pelo indice.
            meuArray[0] = 100;
            meuArray[1] = 85;
            meuArray[2] = 88;
            meuArray[3] = 93;
            meuArray[4] = 123;
            meuArray[5] = 952;
            meuArray[6] = 344;
            meuArray[7] = 233;
            meuArray[8] = 622;
            meuArray[9] = 8522;

            // Aviso: o índice 10 está fora dos limites do array (0-9)
            // Ao tentar acessar meuArray[10], causará uma exceção ArrayIndexOutOfBoundsException
            // System.out.println(meuArray[10]);

            // Impressão de valores específicos do array
            System.out.println("Valor na posição 9: " + meuArray[9]);
            System.out.println("Valor na posição 2: " + meuArray[2]);


        // X) Criação inicializando diretamente os elementos do array
        int[] iniciaValores = {12, 32, 54, 6, 8, 89, 64, 64, 6};
        // minha variavel iniciaValores portanto é um array de 9 elementos do tipo integer.

    }
}
