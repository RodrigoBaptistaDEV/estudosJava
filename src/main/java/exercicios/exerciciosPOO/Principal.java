package main.java.exercicios.exerciciosPOO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Principal {

    public static void main(String[] args) {

/*
1. Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
altura. Crie os methods públicos necessários para getters e setters e também um method para imprimir
todos dados de uma pessoa. Crie um method para calcular a idade da pessoa.
*/
//        Pessoa pessoa = new Pessoa("Nena","15/05/2000",1.75f);
//        pessoa.imprimeDadosPessoa();

/*
2. Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
número da conta, nome do correntista e saldo. Os methods são os seguintes: alterarNome, depósito e
saque; A inicialização do objeto terá saldo como opcional, sendo seu valor default zero e os demais atributos são obrigatórios.
*/

//        // objeto completo com construtor com todos argumentos
//        ContaCorrente conta1 = new ContaCorrente(123, "Fulano", 1000);
//
//        conta1.imprimirInfo();
//        conta1.deposito(500);
//        conta1.saque(200);
//        conta1.imprimirInfo();
//
//        // objeto completo com  Construtor com saldo opcional, não passando.
//        ContaCorrente conta2 = new ContaCorrente(456, "Ciclano");
//
//        conta2.imprimirInfo();
//        conta2.deposito(100);
//        conta2.saque(300);
//        conta2.imprimirInfo();

/*
3. Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses
atributos a classes deve conter os seguintes methods.
a. abastecerPorValor; //method onde é informado o valor a ser abastecido e mostra a quantidade de
litros que foi colocada no veículo
b. abastecerPorLitro; // method onde é informado a quantidade em litros de combustível e mostra o
valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combustível.
d. alterarCombustivel; //altera o tipo do combustível.
e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
f. imprime todos os atributos.
*/

//        BombaCombustivel bc = new BombaCombustivel("Gasolina", 6.5f, 4.0f);
//
//        bc.imprimirDados();
//        bc.abastecerPorValor(6.5f);
//        bc.abastecerPorLitro(1);
//        bc.imprimirDados();
//        bc.alterarValor(7);
//        bc.alterarCombustivel("Diesel");
//        bc.alterarQuantidadeCombustivel(0);
//        bc.imprimirDados();
/*
4. Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um
prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o
térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também
disponibilizar os seguintes methods:
a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no
prédio (os elevadores sempre começam no térreo e vazio);
b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
e. Desce: para descer um andar (não deve descer se já estiver no térreo);
*/

//        Elevador elevador = new Elevador();
//
//        elevador.informar();
//
//        // nao podemos fazer elevador.inicializar(5, 10); porque como padrão eles são ints, precisa explicitar.
//        short capacidadeEscolhida = 5;  // Declare short variables
//        short qtdeDeAndaresEscolhida = 10;
//
//        elevador.inicializar(capacidadeEscolhida,qtdeDeAndaresEscolhida);
//
//        // nao podemos passar só o 4, porque como padrão eles são ints, precisa explicitar.
//        elevador.entrar((short) 4);
//        elevador.subir();
//        elevador.subir();
//        elevador.sair((short) 2);
//        elevador.descer();
//
//        elevador.informar();
//
//        // outras mensagens :
//
//            // entrar mais que possivel
//            elevador.entrar((short) 10);
//
//            // entrar novamente possivel
//            elevador.entrar((short) 3);
//
//            // está vazio
//            elevador.sair((short) 5);
//            elevador.sair((short) 1);


/*
5. Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa
classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 2 notas de trabalho.
Escreva os seguintes methods para esta classe:
a. media: calcula a média final do aluno (cada prova tem peso 3 e os trabalhos tem peso 2)
b. final: calcula quanto o aluno precisa para a prova final
- considere que para a aprovação ((MA + PF) / 2) > 7
 */

//    AlunosMatriculados aluno1 = new AlunosMatriculados(1190900354, "Rodrigo Pelopous", 10.0f,
//            10.0f, 10 , 10);
//
//    System.out.println("O aluno " + aluno1 + "tem como média final " + aluno1.calculaMediaFinal());
//
//    System.out.println("Ele precisa de " + aluno1.calculaComplementarParaFinal() + "para fazer a final");
//

/*
6. Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática para
representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações
como atributos:
a. o número do item faturado,
b. a descrição do item,
c. a quantidade comprada do item e
d. o preço unitário do item.
Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela
deve ser configurada como 0.0. Se o preço por item não for positivo ele deve ser configurado como 0.0.
Forneça os methods getters e setters para cada variável de instância. Além disso, forneça um method
chamado getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por
item) e depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra as
capacidades da classe Invoice.
*/

//        Invoice fatura1 = new Invoice("477", "Whey Protein", 5, 75.5);
//        System.out.println(fatura1.getInvoiceAmount());

/*
8. Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe deverá dispor dos
seguintes methods:
a. Construtor: define a data que determinado objeto (através de parâmetro), este method verifica se a
data está correta, caso não esteja a data é configurada como 01/01/0001
b. Compara: recebe como parâmetro um outro objeto da Classe data, compare com a data corrente e
retorne:
i. 0 se as datas forem iguais;
ii. 1 se a data corrente for maior que a do parâmetro;
iii. -1 se a data do parâmetro for maior que a corrente.
c. GetDia: retorna o dia da data
d. GetMes: retorna o mês da data
e. GetMesExtenso: retorna o mês da data corrente por extenso
f. GetAno: retorna o ano da data
g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
-- resolvi usar o exercicio pra treinar a localdate mesmo --

*/
        String dataEnviada = "07/15/2025";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate data1 = LocalDate.parse(dataEnviada, formatter);

            String dia = String.valueOf(data1.getDayOfMonth());
            String mes = String.valueOf(data1.getMonthValue());
            String mexExtenso = String.valueOf(data1.getMonth());
            String ano = String.valueOf(data1.getYear());
            boolean isBissexto = LocalDate.now().isLeapYear();

            System.out.println(dia + '\n' + mes + '\n' + mexExtenso + '\n' + ano + '\n' + isBissexto);

        } catch (DateTimeParseException e){
            System.out.println(e.getMessage());
        }

    }
}
