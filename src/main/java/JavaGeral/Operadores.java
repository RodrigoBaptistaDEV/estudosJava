package main.java.JavaGeral;

public class Operadores {
    public static void main(String[] args) {

    // 1) Aritméticos - operações matematicas

        int num1, num2, num3;

        // soma
        num1 = 10;
        num2 = 20;
        num3 = num1 + num2;
        System.out.println("O resultado da soma : " + num3);

        // subtracao
        num1 = 10;
        num2 = 20;
        num3 = num1 - num2;
        System.out.println("O resultado da subtracao : " + num3);

        // multiplicacao
        num1 = 10;
        num2 = 20;
        num3 = num1 * num2;
        System.out.println("O resultado da multiplicacao : " + num3);

        // divisao
        num1 = 20;
        num2 = 2;
        num3 = num1 / num2;
        System.out.println("O resultado da divisao : " + num3);
        System.out.println("----------------------------------");

        int a = 5;
        int b = 10;
        int c = 20;
        int d = 3;
        int r;

        r = a + b; //(15)
        r = b - a; //(5)
        r = a * b; //(50)
        r = c / a; //(4)
        r = c % d; //(2)

        // ordem de preferencia é * / % + - =

        r = a * b + c; //(70)
        r = a * b % c; //(10)

        // tais operadores podem ser resumidos em sua atribuição
        // colocamos o operador antes do sinal de igual formando um operador de tarefa
        // o operador de tarefa já atribui na variavel o resultado da operação

        byte cl, dl, el, fl, gl;
        cl = 3;
        dl = 5;
        el = 4;
        fl = 6;
        gl = 12;

        cl += 7; // 10
        dl -= 4; // 1
        el *= 5; // 20
        fl /= 3; // 2
        gl %= 9; // 3

    // 1.1)  atribuição de valor em 1 - Incremento e Decremento

        // Pós-Incremento e Pós-Decremento:

        // Pós-Incremento (x++): O valor atual de x é utilizado na expressão, e após isso, x é incrementado por 1.

        int xA = 5;
        int primeiraExpressao = xA++;
        System.out.println("Resultado: " + primeiraExpressao); // Saída: 5
        System.out.println("Valor de xA após pós-incremento: " + xA); // Saída: 6

        // Pós-Decremento (x--): O valor atual de x é utilizado na expressão, e após isso, x é decrementado por 1.

        int yA = 8;
        int primeiraExpressaoA = yA--;
        System.out.println("Resultado: " + primeiraExpressaoA); // Saída: 8
        System.out.println("Valor de x após pós-decremento: " + yA); // Saída: 7

        // Pré-Incremento e Pré-Decremento:

        // Pré-Incremento (++x): x é incrementado por 1 antes de ser utilizado na expressão.

        int xB = 3;
        int primeiraExpressaoB = ++xB;
        System.out.println("Resultado: " + primeiraExpressaoB); // Saída: 4
        System.out.println("Valor de x após pré-incremento: " + xB); // Saída: 4

        // Pré-Decremento (--x): x é decrementado por 1 antes de ser utilizado na expressão.

        int yB = 10;
        int primeiraExpressaoC = --yB;
        System.out.println("Resultado: " + primeiraExpressaoC); // Saída: 9
        System.out.println("Valor de x após pré-decremento: " + yB); // Saída: 9


        /*
        perceba que quando se trata de pré-incremento (++x) e pré-decremento (--x),
        eles realizam a mesma operação que x += 1 e x -= 1, respectivamente.
        */

        // Aplicações:

        /*
        Em expressões mais complexas, a escolha entre pré e pós-incremento/decremento pode afetar o resultado final.
        observe o exemplo de quando a variável é usada mais de uma vez na mesma expressão.
         */

        int var1 = 5;
        int resultado1 = ++var1 * 2;  // var1 é incrementado (6) antes da multiplicação -> 12
        int resultado2 = var1++ * 2;  // var1 é multiplicado antes de ser incrementado ainda sendo 6 -> 12
        int resultado3 = ++var1 * 2;  // var1 foi incrementado para 7 antes e aqui é incrementado (8) antes da multiplicação -> 16

       /*
       Em loops,  teremos diferentes comportamentos, usamos geralmente o pós incremento para iterar a variavel de controle apos a realização da expressão.
       */

        // incrementando (somando de 1 em 1)
        num1 = 1;
        while (num1 <= 10) {
            System.out.println(num1);
            num1++;
        }
        System.out.println("----------------------------------");
        // decrementando (subtraindo de 1 em 1)
        num1 = 10;
        while (num1 > 0) {
            System.out.println(num1);
            num1--;
        }

        // 1.2) concatenação de strings por operadores matemáticos

        // Exemplo de Concatenação de Strings

        String firstName = "John";
        String lastName = "Doe";
        String fullName;

        fullName = firstName + " " + lastName;
        System.out.println("Nome completo: " + fullName);

        // Concatenação de string e numero converte o numero para string

        int numero = 42;
        String texto = "O número é: ";

        String resultadoA = texto + numero;  // O número é: 42


    // 2) operadores relacionais

        // == , != , > , < , >= , <=

        num1 = 10;
        num2 = 5;

        boolean igual = (num1 == num2);  // false
        boolean diferente = (num1 != num2);  // true
        boolean maiorQue = (num1 > num2);  // true
        boolean menorQue = (num1 < num2);  // false
        boolean maiorOuIgual = (num1 >= num2);  // true
        boolean menorOuIgual = (num1 <= num2);  // false

        int num1A, num2A;

        // testando uma igualdade
        num1A = 10;
        num2A = 10;
        if (num1A == num2A) {
            System.out.println("numero 1 e numeros são iguais");
        }

        // testando uma desigualdade
        num1A = 10;
        num2A = 30;
        if (num1A != num2A) {
            System.out.println("numero 1 e numero são diferentes");
        }

        // testando maior
        num1A = 10;
        num2A = 5;
        if (num1A > num2A) {
            System.out.println("numero 1 é maior que numero 2");
        } else {
            System.out.println("numero 2 é maior que numero 1");
        }


    // 3) operadores lógicos

        /*

        && -> and -> só sera verdadeiro se os dois forem verdadeiros
        a || b -> or -> sera verdadeiro se tiver pelo menos um verdadeiros
        ! -> negação, inversão do valor

        */

        // exemmplo E

        int  num1C = 10;
        int  num2C = 5;
        num3 = 20;
        int num4 = 5;

        if ((num1C > num3) && (num2C == num4)) {
            System.out.println("os dois são verdadeiros");
        } else {
            System.out.println("pelo menos um é falso");
        }

        // F ( 10 > 20)  E V ( 5 == 5 ) -> F -> pelo menos um é falso

        // exemplo OU

        int num3C = 10;
        if ((num1C > num3) || (num3C == num4)) {
            System.out.println("pelo menos um é verdadeiro");
        } else {
            System.out.println("os dois são falsos");
        }

        // F ( 10 > 20) ou F ( 10 == 5) -> F -> os dois são falsos

    // 3.1) Exemplo de condição direta

        boolean condicao1 = true;
        boolean condicao2 = false;

        boolean resultadoAND = condicao1 && condicao2;  // false (só é verdadeiro se ambos forem verdadeiros)
        boolean resultadoOR = condicao1 || condicao2;   // true (é verdadeiro se pelo menos um for verdadeiro)
        boolean resultadoNOT = !condicao1;  // false (negação, inverte o valor)


    // 3.2) Exemplo com verificações numéricas

        int numero1 = 8;
        int numero2 = 5;
        int numero3 = 10;

        boolean resultadoAND1 = (numero1 > numero2) && (numero2 < numero3);  // true (ambas as condições são verdadeiras)
        boolean resultadoOR1 = (numero1 == numero2) || (numero1 < numero3);   // true (pelo menos uma condição é verdadeira)
        boolean resultadoMisto = (numero1 > numero2) && (numero2 < numero3) || (numero1 == numero3);
            // true (a primeira condição é verdadeira, a segunda é verdadeira, então o resultado geral é verdadeiro)

    // 3.3) Exemplo usando o operador de negação.

        int numeroA = 8;
        int numeroB = 5;

        boolean resultadoNegacao = !(numeroA > numeroB);
            // false (a condição original é verdadeira, mas a negação inverte o resultado)

        boolean resultadoCombinado = !(numeroA > numeroB) || (numeroA == 8);
            // true (a primeira parte é falsa devido à negação, mas a segunda parte é verdadeira)


    // 3.4) Exemplo de uso do operador de negação em um if


        // por exemplo a lógica de se dadoRecebido for false dê uma mensagem de erro, se o dado recebido for true dê mensagem de sucesso.
        // eu posso pensar que se eu não tiver a dadoRecebido, ou seja if(!dadoRecebido) então eu jogo o erro.

        boolean dadoRecebido = false;

        if (!dadoRecebido) {
            System.out.println("ERRO");
            // Este bloco de código será executado se dadoRecebido for falso. Pois a expressão !dadoRecebido é true.
        } else {
            System.out.println("SUCESSO");
            // Este bloco de código será executado se dadoRecebido for true. Pois a expressão dadoRecebido é false.
        }

    }
}
