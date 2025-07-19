package main.java.CardsTrello.JavaGeral.estudoEnum;

public class ManualEnum {
}

/**
 * Manual de Enums em Java
 * =======================
 *
 * Este manual explica o conceito de Enums (enumerations) em Java,
 * como declará-los, utilizá-los e os methods úteis associados a eles.
 */

// 1. Declaração básica de um Enum
// Enums são tipos especiais de classes que representam um conjunto fixo de constantes (valores imutáveis).

enum DiaDaSemana {
    SEGUNDA, // Cada constante do Enum é implicitamente `public static final`
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO
}

// 2. Usando um Enum em um programa
class ExemploEnum {
    public static void main(String[] args) {
        DiaDaSemana hoje = DiaDaSemana.QUARTA;

        // Imprimindo um valor Enum
        System.out.println("Hoje é: " + hoje);

        // Usando Enums em um switch-case
        switch (hoje) {
            case SEGUNDA:
                System.out.println("Começo da semana!");
                break;
            case TERCA:
            case QUARTA:
            case QUINTA:
                System.out.println("Meio da semana.");
                break;
            case SEXTA:
                System.out.println("Quase fim de semana!");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("Fim de semana!");
                break;
        }
    }
}

// 3. methods úteis em Enums
// Enums têm methods integrados úteis como `values()` e `valueOf()`

enum Cor {
    VERMELHO, VERDE, AZUL
}

class MetodosEnum {
    public static void main(String[] args) {
        // `values()` retorna um array contendo todos os valores do Enum
        for (Cor cor : Cor.values()) {
            System.out.println(cor);
        }

        // `valueOf()` retorna o Enum correspondente ao nome passado como String
        Cor minhaCor = Cor.valueOf("VERDE");
        System.out.println("Minha cor favorita é: " + minhaCor);
    }
}

// 4. Enums com construtores, campos e methods
// Enums podem ter construtores, campos e methods como classes normais.

enum Tamanho {
    PEQUENO("P"), MEDIO("M"), GRANDE("G");

    private String abreviacao;

    // Construtor do Enum
    private Tamanho(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    // method getter para obter a abreviação
    public String getAbreviacao() {
        return abreviacao;
    }
}

class EnumAvancado {
    public static void main(String[] args) {
        Tamanho tamanho = Tamanho.GRANDE;

        // Acessando o campo de um Enum
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Abreviação: " + tamanho.getAbreviacao());
    }
}

// 5. Sobrescrevendo methods em Enums
// Enums podem sobrescrever methods. O exemplo a seguir mostra como sobrescrever o method `toString()`

enum Moeda {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

    private int valor;

    private Moeda(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return name() + " vale " + valor + " centavos";
    }
}

class EnumComToString {
    public static void main(String[] args) {
        for (Moeda moeda : Moeda.values()) {
            // Usando o method sobrescrito `toString()`
            System.out.println(moeda);
        }
    }
}

// 6. Enums com methods abstratos
// Enums podem ter methods abstratos que cada constante do Enum deve implementar

enum Operacao {
    SOMA {
        @Override
        public double executar(double x, double y) {
            return x + y;
        }
    },
    SUBTRACAO {
        @Override
        public double executar(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICACAO {
        @Override
        public double executar(double x, double y) {
            return x * y;
        }
    },
    DIVISAO {
        @Override
        public double executar(double x, double y) {
            return x / y;
        }
    };

    // method abstrato que cada constante deve implementar
    public abstract double executar(double x, double y);
}

class EnumComMetodoAbstrato {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;

        for (Operacao op : Operacao.values()) {
            // Executando a operação definida por cada constante
            System.out.println(a + " " + op + " " + b + " = " + op.executar(a, b));
        }
    }
}

// 7. Associação de valores personalizados a constantes de enum
// =============================================================
// Cada constante do enum pode carregar valores (como um número, texto ou outro enum).
// Isso é feito com campos, um construtor e um getter.

enum DiasDaSemana {
    SEGUNDA(1),
    TERCA(2),
    QUARTA(3),
    QUINTA(4),
    SEXTA(5),
    SABADO(6),
    DOMINGO(7);

    private final int valor;

    // Construtor personalizado
    DiasDaSemana(int valor) {
        this.valor = valor;
    }

    // Getter para acessar o valor associado
    public int getValor() {
        return valor;
    }
}

class UsoDiasDaSemana {
    public static void main(String[] args) {
        // Acessando constantes com valores associados
        System.out.println("Valor de SEGUNDA: " + DiasDaSemana.SEGUNDA.getValor());
        System.out.println("Valor de SEXTA: " + DiasDaSemana.SEXTA.getValor());
    }
}

// 8. methods concretos e sobrescritos por constante no enum
// =========================================================
// Um enum pode definir methods concretos com comportamento padrão.
// Cada constante pode opcionalmente sobrescrevê-los se necessário.

enum OperacaoMatematica {
    SOMA {
        @Override
        public double executar(double a, double b) {
            return a + b;
        }

        @Override
        public String descricao() {
            return "Adição";
        }
    },
    SUBTRACAO {
        @Override
        public double executar(double a, double b) {
            return a - b;
        }

        @Override
        public String descricao() {
            return "Subtração";
        }
    },
    MULTIPLICACAO {
        @Override
        public double executar(double a, double b) {
            return a * b;
        }

        @Override
        public String descricao() {
            return "Multiplicação";
        }
    },
    DIVISAO {
        @Override
        public double executar(double a, double b) {
            return b != 0 ? a / b : Double.NaN;
        }

        @Override
        public String descricao() {
            return "Divisão";
        }
    };

    // method abstrato que cada constante deve implementar
    public abstract double executar(double a, double b);

    // method concreto com comportamento padrão
    public String descricao() {
        return "Operação matemática genérica";
    }
}

class TesteOperacoes {
    public static void main(String[] args) {
        double x = 10.0;
        double y = 2.0;

        // Percorrendo cada operação e executando
        for (OperacaoMatematica op : OperacaoMatematica.values()) {
            System.out.printf("%s: %.2f - %s%n", op, op.executar(x, y), op.descricao());
        }
    }
}


