package main.java.CardsTrello.JavaUtil;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapManualCompleto {

    public static void main(String[] args) {
        // Criação de um HashMap simples com chaves do tipo String e valores do tipo Integer.
        HashMap<String, Integer> idadePorNome = new HashMap<>();

        // Adicionando pares chave-valor ao HashMap com o method put().
        // Se a chave já existir, o valor será sobrescrito.
        idadePorNome.put("João", 30);
        idadePorNome.put("Maria", 25);
        idadePorNome.put("Pedro", 40);

        // Obtendo o valor associado à chave "Maria" com o method get().
        int idadeMaria = idadePorNome.get("Maria");
        System.out.println("A idade de Maria é: " + idadeMaria);

        // Removendo o par chave-valor correspondente à chave "Pedro" com remove().
        idadePorNome.remove("Pedro");
        System.out.println("Após remover Pedro, o HashMap contém: " + idadePorNome);

        // Verificando a existência de uma chave com containsKey().
        boolean existeChaveJoao = idadePorNome.containsKey("João");
        System.out.println("Existe a chave 'João' no HashMap? " + existeChaveJoao);

        // Verificando a existência de um valor com containsValue().
        boolean existeValor25 = idadePorNome.containsValue(25);
        System.out.println("Existe o valor 25 no HashMap? " + existeValor25);

        // Listando todas as chaves presentes no HashMap com keySet().
        System.out.println("Chaves no HashMap: " + idadePorNome.keySet());

        // Listando todos os valores presentes no HashMap com values().
        System.out.println("Valores no HashMap: " + idadePorNome.values());

        // Exibindo todos os pares chave-valor presentes no HashMap com entrySet().
        System.out.println("Pares chave-valor no HashMap: " + idadePorNome.entrySet());

        // Verificando o número total de entradas no HashMap com size().
        System.out.println("O tamanho do HashMap é: " + idadePorNome.size());

        // Verificando se o HashMap está vazio com isEmpty().
        System.out.println("O HashMap está vazio? " + idadePorNome.isEmpty());

        // Removendo todos os elementos do HashMap com clear().
        idadePorNome.clear();
        System.out.println("Após limpar o HashMap, ele contém: " + idadePorNome);

        // Atualizando o valor de uma chave existente com replace().
        idadePorNome.put("João", 30);
        idadePorNome.replace("João", 35); // substitui valor atual por 35
        idadePorNome.replace("João", 35, 36); // substitui apenas se valor atual for 35

        // Recuperando um valor com getOrDefault(), útil para evitar NullPointerException.
        int idadeCarlos = idadePorNome.getOrDefault("Carlos", 0);

        // Usando computeIfAbsent() para adicionar uma chave apenas se ela não existir.
        idadePorNome.computeIfAbsent("Ana", nome -> 20);

        // Iterando sobre o HashMap com entrySet().
        for (Map.Entry<String, Integer> entry : idadePorNome.entrySet()) {
            System.out.println(entry.getKey() + " tem " + entry.getValue() + " anos.");
        }

        // Iterando sobre o HashMap com forEach e expressões lambda.
        idadePorNome.forEach((nome, idade) -> System.out.println(nome + ": " + idade));

        // Diferentes implementações de Map:
        // LinkedHashMap mantém a ordem de inserção.
        // TreeMap mantém as chaves ordenadas.
        // ConcurrentHashMap é seguro para uso em múltiplas threads.
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        // O HashMap permite uma chave null e múltiplos valores null.
        idadePorNome.put(null, 100);
        idadePorNome.put("X", null);

        // merge(): combina um novo valor com o existente usando uma função.
        idadePorNome.merge("João", 1, Integer::sum);

        // compute(): recalcula o valor com base no valor atual da chave.
        idadePorNome.compute("João", (k, v) -> v == null ? 1 : v + 1);

        // Criando um mapa imutável com Map.of(), útil para configurações constantes.
        Map<String, Integer> imutavel = Map.of("A", 1, "B", 2);
        System.out.println("Mapa imutável: " + imutavel);
    }
}
