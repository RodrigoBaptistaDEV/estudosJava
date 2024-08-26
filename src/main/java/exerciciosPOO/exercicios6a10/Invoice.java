package main.java.exerciciosPOO.exercicios6a10;

import java.util.Objects;

public class Invoice {
    private String numeroItem;
    private String descricaoItem;
    private int quantidade;
    private double precoUnitario;

    // Construtor
    public Invoice(String numeroItem, String descricaoItem, int quantidade, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;

        // Verifica se a quantidade é positiva, caso contrário, configura como 0
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }

        // Verifica se o preço unitário é positivo, caso contrário, configura como 0
        if (precoUnitario > 0.0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }

    // Métodos Getters
    public String getNumeroItem() {
        return numeroItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    // Métodos Setters
    public void setNumeroItem(String numeroItem) {
        this.numeroItem = numeroItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public void setQuantidade(int quantidade) {
        // Verifica se a quantidade é positiva, caso contrário, configura como 0
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    public void setPrecoUnitario(double precoUnitario) {
        // Verifica se o preço unitário é positivo, caso contrário, configura como 0
        if (precoUnitario > 0.0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }

    // Método para calcular o valor total da fatura
    public double getInvoiceAmount() {
        return quantidade * precoUnitario;
    }
}

