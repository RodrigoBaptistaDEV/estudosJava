package main.java.Intermediario;

import java.util.HashMap;
import java.util.Map;

public class HashMapManual {

    public static void main(String[] args) {
        // Criando um HashMap
        HashMap<String, Integer> idadePorNome = new HashMap<>();

        // Adicionando elementos ao HashMap
            // put(chave, valor): Adiciona um par chave-valor ao HashMap.
        idadePorNome.put("João", 30);
        idadePorNome.put("Maria", 25);
        idadePorNome.put("Pedro", 40);

        // Obtendo um valor associado a uma chave específica.
            // get(chave): Retorna o valor associado a uma chave específica.
        int idadeMaria = idadePorNome.get("Maria");
        System.out.println("A idade de Maria é: " + idadeMaria);

        // Removendo um par chave-valor.
            // remove(chave): Remove o par chave-valor associado a uma chave específica.
        idadePorNome.remove("Pedro");
        System.out.println("Após remover Pedro, o HashMap contém: " + idadePorNome);

        // Verificando se o HashMap contém uma chave específica.
            // containsKey(chave): Verifica se o HashMap contém uma chave específica.
        boolean existeChaveJoao = idadePorNome.containsKey("João");
        System.out.println("Existe a chave 'João' no HashMap? " + existeChaveJoao);

        // Verificando se o HashMap contém um valor específico.
            // containsValue(valor): Verifica se o HashMap contém um valor específico.
        boolean existeValor25 = idadePorNome.containsValue(25);
        System.out.println("Existe o valor 25 no HashMap? " + existeValor25);

        // Obtendo um conjunto contendo todas as chaves do HashMap.
            // keySet(): Retorna um conjunto contendo todas as chaves do HashMap.
        System.out.println("Chaves no HashMap: " + idadePorNome.keySet());

        // Obtendo uma coleção contendo todos os valores do HashMap.
            // values(): Retorna uma coleção contendo todos os valores do HashMap.
        System.out.println("Valores no HashMap: " + idadePorNome.values());

        // Obtendo um conjunto contendo todos os pares chave-valor do HashMap usando entrySet()
            // entrySet(): Retorna um conjunto contendo todos os pares chave-valor do HashMap.
        System.out.println("Pares chave-valor no HashMap: " + idadePorNome.entrySet());

        // Obtendo o tamanho do HashMap usando size()
        int tamanhoHashMap = idadePorNome.size();
        System.out.println("O tamanho do HashMap é: " + tamanhoHashMap);

        // Verificando se o HashMap está vazio usando isEmpty()
        boolean estaVazio = idadePorNome.isEmpty();
        System.out.println("O HashMap está vazio? " + estaVazio);

        // Limpando o HashMap usando clear()
        idadePorNome.clear();
        System.out.println("Após limpar o HashMap, ele contém: " + idadePorNome);
    }
}


