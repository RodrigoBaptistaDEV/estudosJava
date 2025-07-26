package main.java.CardsTrello.JavaUtil;

// Set em Java - Manual Prático para Desenvolvedores Java

// A interface Set faz parte do pacote java.util e representa uma coleção
// que **não permite elementos duplicados**. Ela estende a interface Collection.
// As implementações mais comuns são: HashSet, LinkedHashSet e TreeSet.

// Principais características:
// - Não aceita duplicatas;
// - Pode ou não manter a ordem de inserção (depende da implementação);
// - Pode ou não manter os elementos ordenados (TreeSet faz isso).

// Importações necessárias:
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class ManualDeSet {
    public static void main(String[] args) {

        // ==============================================================
        // Exemplo básico com HashSet
        // ==============================================================
        // HashSet usa uma tabela de hash para armazenar os elementos.
        // Não mantém ordem e permite acesso rápido.

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Elemento duplicado, será ignorado

        System.out.println("HashSet (sem ordem): " + hashSet);

        // ==============================================================
        // Exemplo com LinkedHashSet
        // ==============================================================
        // LinkedHashSet mantém a ordem de inserção dos elementos.
        // Internamente, usa uma lista duplamente ligada com a tabela de hash.

        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Apple");
        linkedSet.add("Banana");
        linkedSet.add("Orange");
        linkedSet.add("Apple"); // Ignorado por ser duplicado

        System.out.println("LinkedHashSet (ordem de inserção): " + linkedSet);

        // ==============================================================
        // Exemplo com TreeSet
        // ==============================================================
        // TreeSet mantém os elementos em ordem natural (alfabética, no caso de Strings)
        // ou usa um Comparator customizado, se fornecido.
        // Internamente, é baseado em uma árvore Red-Black.

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Apple"); // Ignorado por ser duplicado

        System.out.println("TreeSet (ordem natural): " + treeSet);

        // ==============================================================
        // methods principais da interface Set
        // ==============================================================

        // add(E e): adiciona elemento se não estiver presente
        hashSet.add("Grape");

        // remove(Object o): remove o elemento, se existir
        hashSet.remove("Banana");

        // contains(Object o): verifica se existe
        boolean hasApple = hashSet.contains("Apple");
        System.out.println("HashSet contém 'Apple'? " + hasApple);

        // size(): número de elementos
        int tamanho = hashSet.size();
        System.out.println("Tamanho do HashSet: " + tamanho);

        // isEmpty(): verifica se está vazio
        boolean vazio = hashSet.isEmpty();
        System.out.println("HashSet está vazio? " + vazio);

        // iterator(): iteração com Iterator
        System.out.println("Iterando sobre o HashSet:");
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // clear(): remove todos os elementos
        hashSet.clear();
        System.out.println("HashSet está vazio após clear()? " + hashSet.isEmpty());

        // ==============================================================
        // Exemplo completo resumido
        // ==============================================================

        Set<String> frutas = new HashSet<>();
        frutas.add("Apple");
        frutas.add("Banana");
        frutas.add("Orange");
        frutas.add("Apple");

        System.out.println("\nSet de frutas: " + frutas);
        System.out.println("Contém Apple? " + frutas.contains("Apple"));

        frutas.remove("Banana");
        System.out.println("Após remover Banana: " + frutas);

        System.out.println("Iteração sobre o conjunto:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println("Tamanho do conjunto: " + frutas.size());

        frutas.clear();
        System.out.println("Está vazio? " + frutas.isEmpty());
    }
}

