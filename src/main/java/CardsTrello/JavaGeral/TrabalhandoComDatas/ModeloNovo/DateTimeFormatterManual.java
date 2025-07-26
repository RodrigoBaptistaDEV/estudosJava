package main.java.CardsTrello.JavaGeral.TrabalhandoComDatas.ModeloNovo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateTimeFormatterManual {

    public static void main(String[] args) {
        // Criando um objeto LocalDateTime
        LocalDateTime agora = LocalDateTime.now();

        // Criando um objeto DateTimeFormatter usando o method ofPattern
        DateTimeFormatter formatoPersonalizado = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Formatando a data e hora usando o formato personalizado
        String dataFormatada = agora.format(formatoPersonalizado);
        System.out.println("Data e Hora Formatadas: " + dataFormatada);

        // Extraindo um DateTimeFormatter pré-definido
        DateTimeFormatter formatoPredefinido = DateTimeFormatter.ISO_DATE_TIME;

        // Formatando a data e hora usando o formato pré-definido
        String dataHoraFormatada = agora.format(formatoPredefinido);
        System.out.println("Data e Hora Formatadas (ISO): " + dataHoraFormatada);

        // Parseando uma string para LocalDateTime usando DateTimeFormatter
        String dataString = "2024-05-29T15:30:00";
        LocalDateTime dataParseada = LocalDateTime.parse(dataString, formatoPredefinido);
        System.out.println("Data e Hora Parseadas: " + dataParseada);

        // Utilizando DateTimeFormatterBuilder para criar formatos complexos
        DateTimeFormatter formatoComplexo = new DateTimeFormatterBuilder()
                .appendPattern("dd/MM/yyyy")
                .appendLiteral(" às ")
                .appendPattern("HH:mm:ss")
                .toFormatter();

        String dataHoraFormatadaComplexa = agora.format(formatoComplexo);
        System.out.println("Data e Hora Formatadas (Complexo): " + dataHoraFormatadaComplexa);
    }
}

