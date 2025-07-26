package main.java.CardsTrello.POO;

/*
 * ===============================================================
 * Título: Membros de Classe vs Membros de Instância em Java
 * ===============================================================
 *
 * Na programação orientada a objetos com Java, as classes podem conter dois
 * tipos principais de membros: os membros de instância e os membros de classe
 * (também chamados de estáticos).
 *
 * Membros de instância são específicos de cada objeto criado a partir de uma
 * classe. Já membros de classe pertencem à própria classe e são compartilhados
 * entre todas as instâncias.
 *
 * Este arquivo explora as diferenças, usos e exemplos práticos de:
 * - Atributos de instância e atributos de classe
 * - methods de instância e methods de classe
 * - Acesso dentro e fora da classe
 */

public class MembrosDeClasseVsInstancia {

    /*
     * ===============================================================
     * ATRIBUTOS DE INSTÂNCIA
     * ===============================================================
     *
     * Atributos de instância são variáveis que pertencem a cada instância
     * (objeto) de uma classe. Cada objeto possui sua própria cópia destes
     * atributos, com valores independentes.
     *
     * Exemplo clássico: o nome de uma pessoa, o saldo de uma conta,
     * a posição de um jogador etc.
     */

    private String nome; // Atributo de instância

    /*
     * ===============================================================
     * ATRIBUTOS DE CLASSE (STATIC)
     * ===============================================================
     *
     * Atributos de classe, também chamados de atributos estáticos, são
     * compartilhados por todas as instâncias de uma classe.
     *
     * Eles são declarados com a palavra-chave `static` e pertencem à
     * própria classe, e não a objetos individuais.
     *
     * São ideais para armazenar dados comuns como contadores globais,
     * configurações padrão, caches, etc.
     */

    private static int totalDeInstancias = 0; // Atributo de classe

    /*
     * ===============================================================
     * CONSTRUTOR
     * ===============================================================
     *
     * Este construtor é chamado ao criar um novo objeto.
     * Aqui usamos tanto membros de instância quanto membros de classe.
     */

    public MembrosDeClasseVsInstancia(String nome) {
        this.nome = nome;            // Acesso ao atributo de instância
        totalDeInstancias++;         // Acesso ao atributo de classe
    }

    /*
     * ===============================================================
     * methodS DE INSTÂNCIA
     * ===============================================================
     *
     * methods de instância operam sobre dados específicos de um objeto.
     * Eles acessam atributos de instância diretamente.
     *
     * ➤ Acesso aos atributos de instância:
     *     - Leitura/escrita dos valores próprios do objeto.
     * ➤ Acesso dentro da classe:
     *     - Podem ser chamados livremente dentro de outros methods de instância.
     * ➤ Acesso fora da classe:
     *     - Exige criação de uma instância.
     */

    public void exibirNome() {
        System.out.println("Nome da instância: " + nome);
    }

    public void chamarOutroMetodoDeInstancia() {
        // Acesso a outro method de instância diretamente
        exibirNome();
    }

    /*
     * ===============================================================
     * methodS DE CLASSE (STATIC)
     * ===============================================================
     *
     * methods de classe pertencem à classe e não a objetos específicos.
     * São declarados com a palavra-chave `static`.
     *
     * ➤ Acesso aos atributos de classe:
     *     - Podem acessar apenas membros estáticos diretamente.
     * ➤ Acesso dentro da classe:
     *     - Chamados entre si sem instanciar.
     * ➤ Acesso fora da classe:
     *     - Usados via NomeDaClasse.metodoStatic()
     */

    public static void exibirTotalDeInstancias() {
        System.out.println("Total de instâncias criadas: " + totalDeInstancias);
        // Não é possível acessar o atributo `nome` aqui (não estático)
    }

    public static void chamarOutroMetodoStatic() {
        // Acesso a outro method estático diretamente
        exibirTotalDeInstancias();
    }

    /*
     * ===============================================================
     * method MAIN – EXEMPLOS DE ACESSO FORA DA CLASSE
     * ===============================================================
     *
     * Aqui demonstramos como acessar os diferentes membros
     * de dentro de um method `static` (ponto de entrada do programa).
     */

    public static void main(String[] args) {

        // Acesso a method de classe (não precisa criar objeto)
        MembrosDeClasseVsInstancia.exibirTotalDeInstancias(); // Saída: 0

        // Criando objetos (instâncias)
        MembrosDeClasseVsInstancia obj1 = new MembrosDeClasseVsInstancia("Rodrigo");
        MembrosDeClasseVsInstancia obj2 = new MembrosDeClasseVsInstancia("Camila");

        // Acesso a methods de instância através das instâncias criadas
        obj1.exibirNome(); // Saída: Nome da instância: Rodrigo
        obj2.exibirNome(); // Saída: Nome da instância: Camila

        // Acesso ao method de classe novamente, após criar instâncias
        MembrosDeClasseVsInstancia.exibirTotalDeInstancias(); // Saída: 2

        // Também é possível (mas não recomendado) chamar methods estáticos via instância
            // obj1.exibirTotalDeInstancias();
        // Funciona, mas prefira usar o nome da classe

    }
}

