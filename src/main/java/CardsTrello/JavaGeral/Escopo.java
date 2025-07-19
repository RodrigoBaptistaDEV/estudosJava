package main.java.CardsTrello.JavaGeral;

/*
 * ESCOPOS EM JAVA
 *
 * Em Java, o "escopo" define a visibilidade e o tempo de vida de variáveis, methods e classes.
 * O escopo determina onde no código esses elementos podem ser referenciados.
 *
 * Existem diferentes tipos de escopo:
 *
 * 1. Escopo de Classe (ou Instância):
 *    Variáveis ou methods declarados fora de methods, mas dentro da classe.
 *    São acessíveis por toda a classe.
 *
 * 2. Escopo de method:
 *    Variáveis declaradas dentro de um method só existem e são visíveis dentro deste method.
 *
 * 3. Escopo de Bloco:
 *    Variáveis dentro de blocos `{}` como if, for, while, etc. visíveis apenas dentro desse bloco.
 *
 * 4. Escopo de Parâmetro:
 *    Parâmetros de methods são acessíveis apenas dentro do corpo do method.
 *
 * 5. Escopo de Variável Local:
 *    Variáveis declaradas dentro de qualquer bloco (inclusive methods) e que só existem ali.
 */

public class Escopo {

    // 1. Escopo de Classe (ou de Instância)
    int variavelDeClasse = 100;

    // method com parâmetros e variáveis locais
    public void exemploDeMetodo(int parametroMetodo) {
        // 2. Escopo de method
        int variavelDeMetodo = 10;

        // A variável de classe está acessível aqui
        System.out.println("Classe: " + variavelDeClasse);

        // O parâmetro também está acessível aqui
        System.out.println("Parâmetro: " + parametroMetodo);

        // 3. Escopo de Bloco
        if (variavelDeMetodo > 5) {
            int variavelDeBloco = 50;
            System.out.println("Dentro do bloco IF: " + variavelDeBloco);
        }

        // System.out.println(variavelDeBloco); // Erro: variavelDeBloco não é visível aqui

        // 4. Variável Local em outro bloco
        for (int i = 0; i < 3; i++) {
            int loopLocal = i * 2;
            System.out.println("For loop: " + loopLocal);
        }

        // System.out.println(loopLocal); // Erro: loopLocal só existe dentro do for
    }

    public static void main(String[] args) {
        Escopo exemplo = new Escopo();

        // 5. Escopo Local no method main
        int escopoMain = 999;
        System.out.println("Main: " + escopoMain);

        exemplo.exemploDeMetodo(42);

        // System.out.println(variavelDeMetodo); // Erro: variavelDeMetodo é local ao method exemploDeMetodo
    }
}
