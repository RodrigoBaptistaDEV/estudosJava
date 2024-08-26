package main.java.exerciciosBasico;

import javax.swing.*;
import java.util.Scanner;

public class exerciciosBasico {

    public static void main(String[] args) {
        funcao35();
    }

    /*
    1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
    */

    public static void funcao1() {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2"));
        int resultado = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "o resultado da soma dos dois numeros é " + resultado);
    }

    /*
    2.
    Faça um algoritmo que receba dois números e ao final mostre a soma,
    subtração, multiplicação e a divisão dos dois números lidos;
    */

    public static void funcao2() {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2"));

        int soma = numero1 + numero2;
        int sub = numero1 - numero2;
        int multi = numero1 * numero2;
        int divi = numero1 / numero2;

        String msgm = "resultado de SOMA = " + soma;
        String msgm2 = "resultado de sub = " + sub;
        String msgm3 = "resultado de multi = " + multi;
        String msgm4 = "resultado de divi = " + divi;

        /*
        String mensagem = "Soma: " + soma + "\n" +
                  "Subtração: " + sub + "\n" +
                  "Multiplicação: " + multi + "\n" +
                  "Divisão: " + divi;

        System.out.println(msgm);
        System.out.println(msgm2);
        System.out.println(msgm3);
        System.out.println(msgm4);

         */

        String mensagem = "Soma: " + soma + "\n" +
                "Subtração: " + sub + "\n" +
                "Multiplicação: " + multi + "\n" +
                "Divisão: " + divi;

        System.out.println(mensagem);
    }

    /*
    3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
    total percorrida pelo automóvel e o total de combustível gasto;
    */

    public static void funcao3() {
        int distanciaTotal = Integer.parseInt(JOptionPane.showInputDialog("digite a DT"));
        int combustivelTotal = Integer.parseInt(JOptionPane.showInputDialog("digite o CT"));

        if (combustivelTotal == 0) {
            JOptionPane.showMessageDialog(null,"Não é possível calcular o consumo médio. O total de combustível é zero.");
        }

        int consumoMedio = (distanciaTotal / combustivelTotal);

        JOptionPane.showMessageDialog(null, "o consumo médio do automóvel é " + consumoMedio + " km/l");
    }

    /*
    Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
    por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
    efetuadas, informar o seu nome, o salário fixo e salário no final do mês
    */

    public static void funcao4() {
        String nomeVendedor = JOptionPane.showInputDialog("nome vendedor");
        int salarioFixo = Integer.parseInt(JOptionPane.showInputDialog("salario Fixo"));
        int valorTotalVendasMes = Integer.parseInt(JOptionPane.showInputDialog("valor Total das Vendas no Mes"));

        double comissao = 0.15;

        double salarioFinal = salarioFixo + (valorTotalVendasMes * comissao);

        String msgm = "O salario final de " + nomeVendedor + "é igual a " + salarioFinal;

        JOptionPane.showMessageDialog(null, msgm);
    }

    /*
    5.
    Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
    No finalinformar o nome do aluno e a sua média (aritmética);
    */

    public static void funcao5() {
        String nomeAluno = JOptionPane.showInputDialog("nome aluno");
        int nota1 = Integer.parseInt(JOptionPane.showInputDialog("nota1"));
        int nota2 = Integer.parseInt(JOptionPane.showInputDialog("nota2"));
        int nota3 = Integer.parseInt(JOptionPane.showInputDialog("nota3"));

        int mediaAritmetica = (nota1 + nota2 + nota3) / 3;

        String msgm = "A média de " + nomeAluno + " é de " + mediaAritmetica;

        JOptionPane.showMessageDialog(null, msgm);
    }

    /*
    6.
    Leia dois valores para as variáveis A e B, efetuae as trocas dos valores de forma que a variável A passe a
    possuir o valor da variável B e a variável B passe a possuir o valor da variável A.
    Apresentar os valores trocados
    */

    public static void funcao6() {
        String varA = JOptionPane.showInputDialog("varA");
        String varB = JOptionPane.showInputDialog("varB");

        String msgm1 = "os valores recebidos são " + varA + " " + varB;

        JOptionPane.showMessageDialog(null, msgm1);

        // Repare que isso daqui daria errado
        // varA assume o valor de varB do input
        // varB assume o mesmo valor, pois é o que está em varA
        /*
            varA = varB;
            varB = varA;

            String msgm2 = "os valores trocados são " + varA + " " + varB;
         */


        // solução -> usar uma variavel intermediaria

        String intermedio = varA;
        varA = varB;
        varB = intermedio;

        String msgm2 = "os valores recebidos são " + varA + " " + varB;

        JOptionPane.showMessageDialog(null, msgm2);
    }


    /*
    7.
    Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
    A fórmula de conversão é: F=(9*C+160) / 5
    sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
    */

    public static void funcao7() {
        int variavelCelsius = Integer.parseInt(JOptionPane.showInputDialog("variavelCelsius"));

        int variavelEmFarenheit = (9 * variavelCelsius + 160) / 5;

        JOptionPane.showMessageDialog(null, "variavel em F é " + variavelEmFarenheit);
    }

    /*
    8.
    Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
    dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
    disponíveis com o usuário;
    */
    public static void funcao8() {
        int cotacaoDolar = Integer.parseInt(JOptionPane.showInputDialog("cotacaoDolar"));
        int carteiraDolar = Integer.parseInt(JOptionPane.showInputDialog("carteiraDolar"));

        int valorReal = (carteiraDolar * cotacaoDolar);

        JOptionPane.showMessageDialog(null, "valor em real é " + valorReal);
    }


    /*
    9.
    Faça um algoritmo que receba um valor que foi depositado e exiba este valor com rendimento após um mês.
    Considere fixo o juro da poupança em 0,07% por mes;
    */
    public static void funcao9() {
        int valorDepositado = Integer.parseInt(JOptionPane.showInputDialog("valorDepositado"));

        double juros = (0.07) / 100;

        double rendimento = (valorDepositado * juros);

        double valorFinal = valorDepositado + rendimento;

        JOptionPane.showMessageDialog(null, "valor final é " + valorFinal);
    }

    /*
    10.
    A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações sem juros. Faça um
    algoritmo que receba um valor de uma compra e mostre o valor das prestações;
    */

    public static void funcao10() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        int numPrestacoes = 5;
        double valorPrestacao = valorCompra / numPrestacoes;

        System.out.println("O valor de cada prestação é: " + valorPrestacao);

        scanner.close();
    }

    /*
    10.1 Bônus
    escreva um algoritmo que receba um valorTotal, o numero de Parcelas e dai retorne para o usuario
    a interação do valor até chegar a zero, para que ele saiba quantas vezes tera que pagar até zerar o valor.
    */

    public static void funcao101() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: ");
        double valorTotal = scanner.nextDouble();

        System.out.print("Digite o número de parcelas: ");
        int nroParcelas = scanner.nextInt();

        double valorCadaParcela = valorTotal / nroParcelas;
        double valorRestante = valorTotal;

        System.out.println("Valor da parcela: " + valorCadaParcela);
        System.out.println("Valor restante para cada mês:");

        for (int i = 0; i < nroParcelas; i++) {
            valorRestante -= valorCadaParcela;
            System.out.println("Mês " + (i + 1) + ": R$" + valorRestante);
        }

        scanner.close();
    }

    /*
    11.
    Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
    preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
    */
    public static void funcao11() {
        int precoCusto = Integer.parseInt(JOptionPane.showInputDialog("precoCusto"));
        double acrescimo = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de acrescimo")) / 100;

        double aumentoReal = precoCusto * acrescimo;

        double precoVenda = precoCusto + aumentoReal;

        JOptionPane.showMessageDialog(null, "valor venda é " + precoVenda);
    }

    /*
    12. O valor final de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
    dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
    do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
    45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo;
    */

    public static void funcao12() {
        double custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de fábrica do carro:"));
        double percentualDistribuidor = 0.28;
        double impostos = 0.45;

        double valorRealImpostos = custoFabrica * impostos;
        double valorRealDistribuidor = valorRealImpostos * percentualDistribuidor;

        double valorFinalCarro = custoFabrica + valorRealImpostos + valorRealDistribuidor;

        JOptionPane.showMessageDialog(null, "O valor final do carro ao consumidor é: " + valorFinalCarro);
    }

    /*
    13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10
    */

    public static void funcao13() {
        int precoCusto = Integer.parseInt(JOptionPane.showInputDialog("precoCusto"));
        if (precoCusto >= 10) {
            System.out.println("numero é maior ou igual a 10");
        }
    }

    /*
    14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
    */
    public static void funcao14() {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("valor1"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("valor2"));

        if (valor1 > valor2) {
            System.out.println("valor 1 é maior que valor 2");
        } else if (valor1 == valor2) {
            System.out.println("valor 1 é igual a valor 2");
        } else {
            System.out.println("valor 1 é menor que valor 2");
        }
    }

    /*
    15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
    */
    public static void funcao15() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("numero"));

        if (numero >= 100 && numero <= 200) {
            System.out.println("este número está no intervalo entre 100 e 200");
        } else {
            System.out.println("este número não está no intervalo entre 100 e 200");
        }
    }

    /*
    16. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
    sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
    Recuperação (media entre 5.1 a 6.9);
    */
    public static void funcao16() {

        String nome = JOptionPane.showInputDialog("nome");

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("numero"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("numero"));

        int media = (n1 + n2 + n3) / 3;

        // dica de if
        // começar pelo caso mais específico e, em seguida,
        // considerar os casos mais gerais ( possivelmente serão englobados sem ter que declarar)

        if (media >= 7.0) {
            System.out.println(nome + " está Aprovado.");
        } else if (media <= 5.0) {
            System.out.println(nome + " está Reprovado.");
        } else {
            System.out.println(nome + " está em Recuperação.");
        }
    }

    /*
    23. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 80,
    menor que 25 ou igual a 40;
    */

    public static void funcao23() {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("numero"));

        if (n1 < 25) {
            JOptionPane.showMessageDialog(null, "numero é menor que 25");
        }

        if (n1 == 40) {
            JOptionPane.showMessageDialog(null, "numero é igual a 40");
        }

        if (n1 > 80) {
            JOptionPane.showMessageDialog(null, "numero é maior que 80");
        }

    }


    /*
    24. Faça um algoritmo que receba “N” números e retorne positivo, negativo ou zero para cada número digitado;
    */

    public static void funcao24() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja classificar? ");
        int n = scanner.nextInt();

        // Loop para receber e classificar cada número
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            // Verifica se o número é positivo, negativo ou zero
            if (numero > 0) {
                System.out.println("O número " + numero + " é positivo.");
            } else if (numero < 0) {
                System.out.println("O número " + numero + " é negativo.");
            } else {
                System.out.println("O número é zero.");
            }
        }

        scanner.close();
    }

    /*
    25. Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais
    imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o
    maior, e uma mensagem que são diferentes;
    */

    public static void funcao25() {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("numero1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("numero2"));

        if (n1 == n2) {
            JOptionPane.showMessageDialog(null, "numeros são iguais");
        } else if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "numeros sao diferentes");
            JOptionPane.showMessageDialog(null, "n1 é maior que n2");
        } else {
            JOptionPane.showMessageDialog(null, "numeros sao diferentes");
            JOptionPane.showMessageDialog(null, "n2 é maior que n1");
        }
    }

    /*
    26. Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número
    que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;
    */

    public static void funcao26() {
        short n1 = Short.parseShort(JOptionPane.showInputDialog("digite a opção"));

        switch (n1) {
            case 1:
                JOptionPane.showMessageDialog(null, "um");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "dois");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "três");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "quatro");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "cinco");
                break;
            default:
                JOptionPane.showMessageDialog(null, "número inválido");
        }
    }

    /*
    27. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um
    algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser
    calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel
    –14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos
    clientes;
    */

    public static void funcao27() {

        // declarando as constantes, taxas de cada opção.

        final float PERCENTUAL_ALCOOL = 0.25f;
        final float PERCENTUAL_GASOLINA = 0.21f;
        final float PERCENTUAL_DIESEL = 0.14f;

        float veiculo = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do veículo"));
        short opcao = Short.parseShort(JOptionPane.showInputDialog("Digite a opção:\n1) Álcool\n2) Gasolina\n3) Diesel"));

        float percentual;
        float valorDescontado;
        float valorFinal;

        switch (opcao) {
            case 1:
                percentual = PERCENTUAL_ALCOOL;
                break;
            case 2:
                percentual = PERCENTUAL_GASOLINA;
                break;
            case 3:
                percentual = PERCENTUAL_DIESEL;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                return; // encerra a execução do método funcao27 retornado nulo.
        }

        valorDescontado = veiculo * percentual;
        valorFinal = veiculo - valorDescontado;
        funcao27Aux(valorDescontado, valorFinal);
    }

    public static void funcao27Aux(float valorDescontado, float valorFinal) {
        JOptionPane.showMessageDialog(null, "valor descontado é " + valorDescontado);
        JOptionPane.showMessageDialog(null, "valor final é " + valorFinal);
    }

    /*
    28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo
    com os seguintes critérios:
    a. 50% para aqueles que ganham menos do que três salários mínimos;
    b. 20% para aqueles que ganham entre três até dez salários mínimos;
    c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
    d. 10% para os demais funcionários.

    Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário
    reajustado. Retornar o nome do funcionário, o reajuste e seu novo salário para cada funcionario.
    Retornar quanto à empresa vai aumentar sua folha de pagamento;
    */

    public static void funcao28() {
        Scanner scanner = new Scanner(System.in);

        // Definindo o valor do salário mínimo
        System.out.print("Informe o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        // Variável para armazenar o total do aumento na folha de pagamento
        double aumentoTotal = 0;

        // Iterando sobre os 584 funcionários
        for (int i = 1; i <= 584; i++) {
            System.out.println("\nFuncionário " + i + ":");

            // Obtendo o nome e salário do funcionário
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();

            // Calculando o reajuste e o novo salário
            double reajuste = 0;
            if (salario < (3 * salarioMinimo)) {
                reajuste = 0.5;
            } else if ((salario >= 3 * salarioMinimo) && (salario <= 10 * salarioMinimo)) {
                reajuste = 0.2;
            } else if ((salario > 10 * salarioMinimo) && (salario <= 20 * salarioMinimo)) {
                reajuste = 0.15;
            } else {
                reajuste = 0.1;
            }
            double aumento = salario * reajuste;
            aumentoTotal += aumento;
            double novoSalario = salario + aumento;

            // Exibindo o nome do funcionário, o reajuste e o novo salário
            System.out.println("Reajuste: " + (reajuste * 100) + "%");
            System.out.println("Novo Salário: " + novoSalario);
        }

        // Exibindo o aumento total na folha de pagamento
        System.out.println("\nAumento total na folha de pagamento: " + aumentoTotal);

        scanner.close();
    }

    //29. Faça um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido;
    public static void funcao29(){

        short nroMesEscolhido = Short.parseShort(JOptionPane.showInputDialog("digite o nro do mes escolhido"));

        switch(nroMesEscolhido){
            case 1:
                JOptionPane.showMessageDialog(null,"Janeiro");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Fevereiro");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Março");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Abril");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Maio");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Junho");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"Julho");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,"Agosto");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,"Setembro");
                break;
            case 10:
                JOptionPane.showMessageDialog(null,"Outubro");
                break;
            case 11:
                JOptionPane.showMessageDialog(null,"Novembro");
                break;
            case 12:
                JOptionPane.showMessageDialog(null,"Dezembro");
                break;
            default:
                JOptionPane.showMessageDialog(null,"mês inválido");
                break;
        }
    }

    //30. Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
    public static void funcao30(){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

        int maior = Math.max(Math.max(a, b), c);
        int menor = Math.min(Math.min(a, b), c);
        int meio = (a + b + c) - (maior + menor);

        // Imprima em ordem crescente
        JOptionPane.showMessageDialog(null, "Em ordem crescente: " + menor + ", " + meio + ", " + maior);

    }

    /*
    31. Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o
    resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser
    impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;
    */

    public static void funcao31(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de B:");
        double b = scanner.nextDouble();

        System.out.println("Digite o operador aritmético (+, -, *, /):");
        char c = scanner.next().charAt(0);

        double resultado = 0.0;

        switch (c) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Operador não definido!");
                System.exit(0);
        }

        System.out.println("Resultado: " + resultado);
    }

    /*
    32. Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo.

    Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos
    outros dois lados.

    Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.

    a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
    b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
    c. Triângulo equilátero é também isóscele;
    d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
    */

    public static void funcao32(){

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite o numero 1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("digite o numero 2"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("digite o numero 3"));

        boolean propriedadeCumprida = (n1 < n2 + n3) && (n2 < n1 + n3) && (n3 < n1 + n2);

        if (!propriedadeCumprida) {
            JOptionPane.showMessageDialog(null, "Não é possível formar um triângulo");
            return;
        }

        if((n1 == n2) && (n2== n3)){
            JOptionPane.showMessageDialog(null, "todos lados iguais = Equilátero");
        } else if ((n1 == n2) || (n1 == n3)){
            JOptionPane.showMessageDialog(null, "dois lados iguais = Isócele");
        } else if(n2 == n3){
            JOptionPane.showMessageDialog(null, "dois lados iguais = Isócele");
        } else {
            JOptionPane.showMessageDialog(null, "todos lados diferentes = Escaleno");
        }
    }

    /*
    33. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que
    calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
    a. Professor Nível 1 R$12,00 por hora/aula;
    b. Professor Nível 2 R$17,00 por hora/aula;
    c. Professor Nível 3 R$25,00 por hora/aula.
     */
    public static void funcao33(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o nome do professor");
        String nome = scanner.next();
        System.out.println("digite o numero de horas");
        int horas = scanner.nextInt();
        System.out.println("escolha o nivel do professor");
        short nivel = scanner.nextShort();

        int salario;

        switch (nivel){
            case 1:
                salario = 12 * horas;
                break;
            case 2:
                salario = 17 * horas;
                break;
            case 3:
                salario = 25 * horas;
                break;
            default:
                System.out.println("opcao não definida");
                return;
        }

        System.out.println("O salário de " + nome + " é " + "RS:" + salario);
    }

    /*
    34. Elabore um algoritmo que, dada a idade de um nadador.
    Classifique-o em uma das seguintes categorias:
    a. Infantil A = 5 - 7 anos;
    b. Infantil B = 8 - 10 anos;
    c. Juvenil A = 11- 13 anos;
    d. Juvenil B = 14 - 17 anos;
    e. Sênior = 18 - 25 anos.
    Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado;
    */

    public static void funcao34(){
        short idade = Short.parseShort(JOptionPane.showInputDialog("digite a idade do nadador"));
        String classificacao;

        if((idade >= 5) && (idade <= 7)){
            classificacao = "Infantil A";
        } else if ((idade >= 8) && (idade <=10)){
            classificacao = "Infantil B";
        } else if ((idade >= 11) && (idade <=13)) {
            classificacao = "Juvenil A";
        } else if ((idade >= 14) && (idade <=17)) {
            classificacao = "Juvenil B";
        } else if ((idade >= 18) && (idade <=25)) {
            classificacao = "Sênior";
        } else {
            classificacao = "idade fora da faixa etária";
        }

        JOptionPane.showMessageDialog(null,classificacao);
    }

    /*
    35. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa.
    Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
    Tipo de Cliente - Valor do KW/h
    a. (Residência) 0,60;
    b. (Comércio) 0,48;
    c. (Indústria) 1,29.
    */

    public static void funcao35(){
        short opcao = Short.parseShort(JOptionPane.showInputDialog("escolha o tipo de cliente: \n1) Residencia \n2) Comércio \n3)Indústria"));
        int qtdHoras = Integer.parseInt(JOptionPane.showInputDialog("insira a quantidade de horas kw/h indicada no aparelho"));

        float valorConta;

        switch (opcao){
            case 1:
                valorConta = (qtdHoras * 0.60f);
                break;
            case 2:
                valorConta = (qtdHoras * 0.48f);
                break;
            case 3:
                valorConta = (qtdHoras * 1.29f);
                break;
            default:
                JOptionPane.showMessageDialog(null,"opção não disponivel");
                return;
        }

        JOptionPane.showMessageDialog(null,"Valor da conta é RS:" +valorConta);
    }

}

