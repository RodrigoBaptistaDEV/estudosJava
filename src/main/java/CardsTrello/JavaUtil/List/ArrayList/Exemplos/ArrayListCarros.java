package main.java.CardsTrello.JavaUtil.List.ArrayList.Exemplos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayListCarros {
	
	public static void main(String[] args) {
        // construindo um arraylist para os carros
        ArrayList<String> carros = new ArrayList<>();
        
        // adicionando Carros ao arraylist
        carros.add("KOMBI");
        carros.add("JAGUAR");
        carros.add("BMW");
        carros.add("MERCEDES");
        carros.add("FUSCA");
        carros.add("VECTRA");
        // mostra array list
        System.out.println("Array list versao 1 " + carros);
        
        // substituir FUSCA por MITSUBISHI
        carros.set(4,"MITSUBISHI");
        // mostra o
        System.out.println("Array list versao 2 " + carros);
        
        // remover VECTRA
        carros.remove("VECTRA");
        // mostra array
        System.out.println("Array list versao 3 " + carros);
        
        // adicionando Carros ao arraylist com JOPtionPane
        carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));
        // mostra array
        System.out.println("Array list versao 4 " + carros);
        
        // esvaziando o array
        /*carros.clear();
        // mostra array
        System.out.println(carros);
        */
        
        // verificar se o array esta vazio
        if (carros.isEmpty()) {
            System.out.println("O vetor esta vazio");
        }
        
        if (carros.contains("BMW")) {
            // substituindo quando nao se sabe a posição
            for (int i = 0; i < carros.size(); i++) {
                if ("BMW".equals(carros.get(i))) {
                    carros.set(i, "BUGATTI");
                    break;
                }
            }
        }
        // mostra array
        System.out.println("Array list versao 5 " + carros);
	}
}
