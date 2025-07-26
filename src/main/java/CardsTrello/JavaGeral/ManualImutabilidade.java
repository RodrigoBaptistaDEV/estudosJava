package main.java.CardsTrello.JavaGeral;

/*
 * ==============================================================
 * MANUAL COMPLETO: IMUTABILIDADE EM JAVA
 * ==============================================================
 *
 * O que é uma classe imutável?
 * --------------------------------
 * Uma classe imutável é uma classe que, uma vez instanciada, não pode
 * ter seu estado alterado. Seus atributos permanecem constantes após
 * a construção do objeto.
 *
 * Vantagens:
 * ----------
 * - Thread-safe por padrão (sem necessidade de sincronização).
 * - Mais simples de entender, manter e testar.
 * - Excelente para programação funcional.
 * - Boa escolha para chaves em HashMap, HashSet, etc.
 *
 * Regras de implementação:
 * -------------------------
 * 1. Marcar a classe como `final`
 *    - Evita que ela seja estendida e altere o comportamento.
 *
 * 2. Todos os atributos devem ser `private` e `final`
 *    - Isso impede mudanças fora do construtor.
 *
 * 3. Não fornecer setters
 *    - O único modo de alterar os valores é via novo objeto.
 *
 * 4. Cuidado com atributos mutáveis (ex: arrays, listas, datas)
 *    - Usar cópia defensiva no construtor e no getter.
 *
 * 5. Fornecer methods que retornem novos objetos com valores modificados
 *    - Isso permite evoluções sem mutabilidade.
 *
 */

// ===================================================================
// EXEMPLO 1: CLASSE IMUTÁVEL SIMPLES COM CAMPOS PRIMITIVOS E STRING
// ===================================================================

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class Humano {
    private final String nome;
    private final int idade;

    public Humano(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Humano aniversario() {
        return new Humano(this.nome, this.idade + 1);
    }
}

// ================================================================
// EXEMPLO 2: ATRIBUTOS MUTÁVEIS (ARRAYS) COM CÓPIA DEFENSIVA
// ================================================================

final class CarrinhoDeCompras {
    private final String[] itens;

    public CarrinhoDeCompras(String[] itens) {
        this.itens = itens.clone(); // cópia defensiva no construtor
    }

    public String[] getItens() {
        return itens.clone(); // cópia defensiva no getter
    }

    public CarrinhoDeCompras adicionarItem(String novoItem) {
        String[] novos = new String[itens.length + 1];
        System.arraycopy(itens, 0, novos, 0, itens.length);
        novos[itens.length] = novoItem;
        return new CarrinhoDeCompras(novos);
    }
}

// ===================================================================
// EXEMPLO 3: COM LISTAS (usando cópia imutável)
// ===================================================================

final class Pedido {
    private final List<String> produtos;

    public Pedido(List<String> produtos) {
        this.produtos = Collections.unmodifiableList(new ArrayList<>(produtos));
    }

    public List<String> getProdutos() {
        return new ArrayList<>(produtos);
    }

    public Pedido adicionarProduto(String novoProduto) {
        List<String> novaLista = new ArrayList<>(produtos);
        novaLista.add(novoProduto);
        return new Pedido(novaLista);
    }
}

// ===================================================================
// TESTES DOS EXEMPLOS
// ===================================================================

public class ManualImutabilidade {
    public static void main(String[] args) {
        // Testando Pessoa
        Humano h1 = new Humano("Rodrigo", 30);
        Humano h2 = h1.aniversario();

        System.out.println("Pessoa original: " + h1.getNome() + " - " + h1.getIdade());
        System.out.println("Nova Pessoa: " + h2.getNome() + " - " + h2.getIdade());

        // Testando CarrinhoDeCompras
        CarrinhoDeCompras c1 = new CarrinhoDeCompras(new String[]{"Arroz", "Feijão"});
        CarrinhoDeCompras c2 = c1.adicionarItem("Macarrão");

        System.out.println("Carrinho original:");
        for (String item : c1.getItens()) System.out.println(item);

        System.out.println("Carrinho novo:");
        for (String item : c2.getItens()) System.out.println(item);

        // Testando Pedido com Lista
        Pedido pedido1 = new Pedido(List.of("Pizza", "Suco"));
        Pedido pedido2 = pedido1.adicionarProduto("Sobremesa");

        System.out.println("Pedido original:");
        for (String item : pedido1.getProdutos()) System.out.println(item);

        System.out.println("Pedido novo:");
        for (String item : pedido2.getProdutos()) System.out.println(item);
    }
}

/*
 * ==============================================================
 * BOAS PRÁTICAS EM PRODUÇÃO
 * ==============================================================

 * ✔️ Usar objetos imutáveis como `LocalDate`, `BigDecimal`, `UUID`.
 * ✔️ Para listas: preferir `List.of(...)` ou `Collections.unmodifiableList(...)`.
 * ✔️ Para construção mais elegante: usar builders com retorno imutável.
 * ✔️ Bibliotecas úteis: Lombok (@Value), Immutables, AutoValue (Google).
 *
 * Atenção:
 * ❌ Não usar arrays públicos nem getters que retornam diretamente campos mutáveis.
 * ❌ Não confiar em objetos de terceiros que podem ser modificados externamente.
 *
 */
