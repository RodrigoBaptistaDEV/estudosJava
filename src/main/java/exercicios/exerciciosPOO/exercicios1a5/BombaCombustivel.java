package main.java.exercicios.exerciciosPOO.exercicios1a5;

/*
3. Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses
atributos a classes deve conter os seguintes métodos.
a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de
litros que foi colocada no veículo
b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o
valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combustível.
d. alterarCombustivel; //altera o tipo do combustível.
e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
f. imprime todos os atributos.
*/

public class BombaCombustivel {

    String tipoCombustivel;
    float valorLitro;
    float quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, float valorLitro, float quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(float valorParaAbastecer){

        float litroAbastecido = valorParaAbastecer/this.valorLitro;

        System.out.println("O valor por litro é: " +this.valorLitro + " R$" + "\n" +
                "Voce inseriu " + valorParaAbastecer + " R$" + "\n" +
                "Logo foi abastecido " + litroAbastecido + " litros");

        this.quantidadeCombustivel += litroAbastecido;

        System.out.println("Quantidade de combustivel atual é " + this.quantidadeCombustivel + "\n");
    }

    public void abastecerPorLitro(float quantidadeParaAbastecer){

        float valorPagar = quantidadeParaAbastecer * this.valorLitro;

        System.out.println("O valor do litro é: " + this.valorLitro + " R$" + "\n" +
                "Você está abastecendo " + quantidadeParaAbastecer + " litros" + "\n" +
                "Logo deve pagar " + valorPagar + " R$");

        this.quantidadeCombustivel += quantidadeParaAbastecer;

        System.out.println("Quantidade de combustivel atual é " + this.quantidadeCombustivel + "\n");
    }

    public void alterarValor(float valorNovo){

        System.out.println("O valor do litro atual é " + this.valorLitro);

        this.valorLitro = valorNovo;

        System.out.println("Agora se torna " + this.valorLitro + "\n");
    }

    public void alterarCombustivel(String tipoNovo){

        System.out.println("O tipo atual é " + this.tipoCombustivel);

        this.tipoCombustivel = tipoNovo;

        System.out.println("Agora está " + tipoCombustivel + "\n");
    }

    public void alterarQuantidadeCombustivel(int quantidadeNova){
        System.out.println("A quantidade atual é " + this.quantidadeCombustivel);

        this.quantidadeCombustivel = quantidadeNova;

        System.out.println("Agora está " + quantidadeCombustivel + "\n");

    }

    public void imprimirDados(){
        System.out.println("As informações atuais são: " + "\n" +
                "Tipo de Combustivel: " + this.tipoCombustivel + "\n" +
                "Valor por litro: " + this.valorLitro + " R$" + "\n" +
                "Quantidade de Combustivel: " + this.quantidadeCombustivel + " litros" + "\n");
    }

}
