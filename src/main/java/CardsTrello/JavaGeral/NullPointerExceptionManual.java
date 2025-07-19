package main.java.CardsTrello.JavaGeral;

public class NullPointerExceptionManual {

    // ==========================================================
    // NULL / NULLPOINTEREXCEPTION EM JAVA
    // ==========================================================

    // Em Java, `null` representa a ausência de valor (ou de objeto).
    // É o valor padrão para variáveis de referência não inicializadas.

    String s = null; // s não aponta para nenhuma string

    // ==========================================================
    // EXEMPLOS DE NullPointerException EM OPERAÇÕES BÁSICAS
    // ==========================================================

    public void operacoesBasicas() {

        // 1. Operações matemáticas com wrappers
        try {
            Integer a = null;
            Integer b = 10;
            int sum = a + b; // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Erro: tentativa de soma com Integer null");
        }

        // 2. Conversões de String
        try {
            String str = null;
            int number = Integer.parseInt(str); // NullPointerException
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Erro: conversão inválida de string null");
        }

        // 3. Arrays com null
        try {
            Integer[] numbers = null;
            java.util.Arrays.sort(numbers); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Erro: tentativa de ordenar array null");
        }

        // 4. Autoboxing / Unboxing com null
        try {
            Integer a = null;
            int b = a; // NullPointerException (unboxing)
        } catch (NullPointerException e) {
            System.out.println("Erro: unboxing de Integer null");
        }

        // 5. Operações com array null
        try {
            int[] arr = null;
            int len = arr.length; // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Erro: acesso a length de array null");
        }
    }

    // ==========================================================
    // BOAS PRÁTICAS PARA EVITAR NULLPOINTEREXCEPTION
    // ==========================================================

    public void boasPraticas() {

        // 1. Verificar null antes de usar
        Integer a = null;
        Integer b = 10;
        if (a != null && b != null) {
            int sum = a + b;
            System.out.println("Soma segura: " + sum);
        } else {
            System.out.println("Evitando operação com null");
        }

        // 2. Uso de valor padrão
        int safeA = (a != null) ? a : 0;
        int sum = safeA + b;
        System.out.println("Soma com valor padrão: " + sum);

        // 3. Uso de Optional
        java.util.Optional<Integer> optionalA = java.util.Optional.ofNullable(a);
        int safeSum = optionalA.orElse(0) + b;
        System.out.println("Soma usando Optional: " + safeSum);

        // 4. Inicialização adequada
        Integer x = 0;
        Integer y = 5;
        int result = x + y;
        System.out.println("Soma com inicialização adequada: " + result);

        // 5. Tratamento com try-catch
        try {
            int r = a + b;
        } catch (NullPointerException e) {
            System.out.println("Tratando NullPointerException ao somar");
        }
    }

    // ==========================================================
    // NULLPOINTEREXCEPTION EM CONTEXTO POO
    // ==========================================================

    public void pooContexto() {

        // 1. method em objeto null
        try {
            String nome = null;
            int len = nome.length(); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Erro ao chamar method em objeto null");
        }

        // 2. Acesso a campo de objeto null
        try {
            Pessoa pessoa = null;
            String nome = pessoa.nome; // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Erro ao acessar campo de objeto null");
        }
    }

    // ==========================================================
    // BOAS PRÁTICAS EM POO
    // ==========================================================

    public void boasPraticasPOO() {

        // 1. Inicializar referências com valores seguros
        String s = "";

        // 2. Verificar null antes de acessar
        if (s != null) {
            System.out.println("Comprimento da string: " + s.length());
        }

        // 3. Optional com objeto
        java.util.Optional<String> optional = java.util.Optional.ofNullable(s);
        optional.ifPresent(str -> System.out.println("Tamanho com Optional: " + str.length()));

        // 4. Preferir coleções vazias
        java.util.List<String> nomes = getNamesSafe(null);
        System.out.println("Lista de nomes (segura): " + nomes);

        // 5. Inicialização com padrão
        Pessoa p = new Pessoa();
        System.out.println("Pessoa criada com endereço: " + p.endereco);

        // 6. Anotação @NotNull (simulado, pois precisa de frameworks específicos)
        setNomeSeguro("João");
    }

    public java.util.List<String> getNamesSafe(java.util.List<String> names) {
        return names != null ? names : java.util.Collections.emptyList();
    }

    public void setNomeSeguro(/*@NotNull*/ String nome) {
        // Simulando anotação @NotNull
        if (nome == null) throw new IllegalArgumentException("Nome não pode ser null");
        System.out.println("Nome atribuído: " + nome);
    }

    // ==========================================================
    // EXEMPLO CLÁSSICO COMPOSIÇÃO DE OBJETOS
    // ==========================================================

    public void exemploComposicao() {

        // Cenário com erro
        try {
            Pessoa p = new Pessoa();
            p.nome = "Paulo";
            p.endereco.logradouro = "Avenida XYZ"; // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Erro: endereço não foi inicializado");
        }

        // Correto: inicializa endereço antes de usar
        Pessoa p2 = new Pessoa();
        p2.nome = "Paulo";
        p2.endereco = new Endereco();
        p2.endereco.logradouro = "Avenida XYZ";
        System.out.println("Endereço correto: " + p2.endereco.logradouro);
    }

    // ==========================================================
    // CLASSES DE APOIO
    // ==========================================================

    class Pessoa {
        String nome;
        String cpf;
        int idade;
        Endereco endereco = new Endereco(); // Inicialização direta segura
    }

    class Endereco {
        String logradouro;
        String complemento;
        String numero;
        String bairro;
        String cidade;
        String cep;
    }

    // ==========================================================
    // MAIN PARA TESTES
    // ==========================================================

    public static void main(String[] args) {
        NullPointerExceptionManual manual = new NullPointerExceptionManual();
        manual.operacoesBasicas();
        manual.boasPraticas();
        manual.pooContexto();
        manual.boasPraticasPOO();
        manual.exemploComposicao();
    }
}
