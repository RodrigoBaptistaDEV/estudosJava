package main.java.CardsTrello.JavaGeral.estudoEnum.ExemploArquivosDiferentes;

// Declaração do enum Mes,
public enum Mes {
    // Definindo cada constante do enum com um valor associado (número do mês)
    JANEIRO(1),
    FEVEREIRO(2),
    MARCO(3),
    ABRIL(4),
    MAIO(5),
    JUNHO(6),
    JULHO(7),
    AGOSTO(8),
    SETEMBRO(9),
    OUTUBRO(10),
    NOVEMBRO(11),
    DEZEMBRO(12);

    // atributo privado para armazenar o valor associado a cada constante
    private final int valor;

    // Construtor privado que aceita um inteiro e o associa à constante do enum
    Mes(int valor) {
        this.valor = valor;
    }

    // method público para obter o valor associado à constante do enum
    public int getValor() {
        return valor;
    }
}
