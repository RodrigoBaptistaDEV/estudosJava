package main.java.CardsTrello.JavaUtil.List;

import java.util.LinkedList;

public class LinkedListManual {
    public static void main(String[] args) {
        // Criando uma LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        // Adicionando elementos à LinkedList
        linkedList.add("Maçã");
        linkedList.add("Banana");
        linkedList.add("Pera");
        // Exibindo a LinkedList
        System.out.println("LinkedList: " + linkedList);
        // Adicionando um elemento no início da LinkedList
        linkedList.addFirst("Abacaxi");
        System.out.println("Após adicionar no início: " + linkedList);
        // Adicionando um elemento no final da LinkedList
        linkedList.addLast("Uva");
        System.out.println("Após adicionar no final: " + linkedList);
        // Acessando o primeiro e o último elemento da LinkedList
        System.out.println("Primeiro elemento: " + linkedList.getFirst());
        System.out.println("Último elemento: " + linkedList.getLast());
        // Removendo o primeiro e o último elemento da LinkedList
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Após remover o primeiro e o último elemento: " + linkedList);
        // Acessando um elemento por índice
        System.out.println("Elemento no índice 1: " + linkedList.get(1));
        // Verificando se a LinkedList contém um elemento
        System.out.println("Contém 'Banana'? " + linkedList.contains("Banana"));
        // Verificando o tamanho da LinkedList
        System.out.println("Tamanho da LinkedList: " + linkedList.size());
        // Removendo um elemento específico da LinkedList
        linkedList.remove("Pera");
        System.out.println("Após remover 'Pera': " + linkedList);
        // Limpando a LinkedList
        linkedList.clear();
        System.out.println("Após limpar a LinkedList: " + linkedList);
    }
}