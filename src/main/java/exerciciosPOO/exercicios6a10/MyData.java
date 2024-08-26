package main.java.exerciciosPOO.exercicios6a10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyData {

    private LocalDate objetoData;

    public MyData(String dataRecebida) {

    }

    public LocalDate getObjetoData() {
        return objetoData;
    }

    public void setObjetoData(LocalDate objetoData) {
        this.objetoData = objetoData;
    }

}
