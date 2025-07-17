package main.java.POO.Herança;

//Criamos uma nova classe e usamos o “extends” para herdar a classe pai

public class EmpregadoComissionado extends Empregado {

    private double comissao;
    private double unidades;

    /*
    no construtor da classe filha devemos usar o method super.
    Serve para inicializar a superclasse do objeto corretamente antes que a classe filha adicione suas próprias inicializações.
    */

    /*
    Em fluxo de execução temos ->
    1) Criação da Instância da Classe Filha:

        - Quando uma instância da classe filha é criada, o construtor da classe filha é chamado.

    2) Chamada ao Construtor da Superclasse:

        - O primeiro passo dentro do construtor da classe filha é uma chamada ao construtor da superclasse.
        Essa chamada pode ser explícita ou implícita.
        Se você não chamar explicitamente o construtor da superclasse usando super(),
        o compilador Java procurará automaticamente o construtor padrão da superclasse, buscando inserir no construtor da
        classe filha o method super() sem argumentos, para cumprir portanto a inicialização do construtor da classe pai.

        dessa maneira, Se a superclasse não tiver usando o construtor padrão (sem argumentos),
        você deve chamar explicitamente um dos construtores criados usando super com os argumentos apropriados.

    3) Inicialização da Superclasse:
    O construtor da superclasse é executado, inicializando a parte da superclasse do objeto.
    Se a superclasse também estender outra classe, o processo continua recursivamente,
    chamando os construtores das superclasses até a classe base (que é a Object, se nenhuma outra superclasse for especificada).

    4) Execução do Construtor da Classe Filha:
        Após a execução do construtor da superclasse, o controle retorna ao construtor da classe filha,
    que então pode executar seu próprio código de inicialização.

    */

    /*
    dessa forma podemos inclusive visualizar a chamada do construtor da superclasse primeiro
    pois tendo:

        class A {
            A() {
                System.out.println("mensagem no Construtor de A");
            }
        }

        class B extends A {
            B() {
                // Chamada implícita a super() acontece aqui
                System.out.println("mensagem no Construtor de B");
            }
        }

    Ao criar uma instância de B:

        B b = new B();

    A saída será:

        Construtor de A
        Construtor de B

    */

    public EmpregadoComissionado(String pNome, String uNome, double salario, double comissao) {
        super(pNome, uNome, salario); // super inicializadndo o construtor da classe pai.
        this.comissao = comissao;
    }


    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getUnidades() {
        return unidades;
    }

    public void setUnidades(double unidades) {
        this.unidades = unidades;
    }

    public double calculaPagamento(){
        return super.getSalario() + (this.comissao * this.unidades);
        // com a herança conseguimos usar todos os metodos da classe pai,

        /*
        o que mostra inclusive porque essa classe deve ser inicializada pelo Super,
        afinal methods e variaveis não estáticos podem acessar as variaveis de instancia da classe que precisam ser instanciadas;
        */
    }

    public void adicionarUnidades(int unidades){
        this.unidades = this.unidades + unidades;
    }

    public void resetUnidades(){
        this.unidades = 0;
    }

}
