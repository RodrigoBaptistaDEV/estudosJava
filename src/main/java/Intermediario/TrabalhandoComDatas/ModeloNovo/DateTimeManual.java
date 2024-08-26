package main.java.Intermediario.TrabalhandoComDatas.ModeloNovo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeManual {

    public static void main(String[] args) {
        // LocalDate: Representa uma data no calendário (sem horário)
        LocalDate hoje = LocalDate.now(); // Obtém a data atual
        System.out.println("Data atual: " + hoje);

        // LocalTime: Representa um horário específico do dia (sem data)
        LocalTime agora = LocalTime.now(); // Obtém o horário atual
        System.out.println("Horário atual: " + agora);

        // LocalDateTime: Representa uma combinação de data e horário
        LocalDateTime agoraComDataHora = LocalDateTime.now(); // Obtém data e horário atuais
        System.out.println("Data e Horário atual: " + agoraComDataHora);

        // Construção de datas e horários específicos
        LocalDate dataEspecifica = LocalDate.of(2024, 5, 29);
        LocalTime horarioEspecifico = LocalTime.of(14, 30, 0);
        LocalDateTime dataHoraEspecificos = LocalDateTime.of(2024, 5, 29, 14, 30);

        // Manipulação de datas e horários
                LocalDate ontem = hoje.minusDays(1); // Subtrai um dia
                LocalTime umaHoraAtras = agora.minusHours(1); // Subtrai uma hora
                LocalDateTime umAnoAtras = agoraComDataHora.minusYears(1); // Subtrai um ano

            // Exemplos de subtração com valores específicos
                    LocalDate dataNoPassado = LocalDate.of(2023, 12, 31);
                    LocalDate tresDiasAtras = dataNoPassado.minusDays(3);

                    LocalTime horarioNoPassado = LocalTime.of(12, 0, 0);
                    LocalTime duasHorasAtras = horarioNoPassado.minusHours(2);

                    LocalDateTime dataHoraNoPassado = LocalDateTime.of(2023, 12, 31, 12, 0, 0);
                    LocalDateTime umAnoTresMesesAtras = dataHoraNoPassado.minusYears(1).minusMonths(3);

            // Exemplos de combinação de operações de adição e subtração
                    LocalDate semanaPassada = hoje.minusWeeks(1);

                    LocalTime umaHoraETrintaMinAtras = agora.minusHours(1).minusMinutes(30);

                    LocalDateTime tresMesesUmaSemanaAtras = agoraComDataHora.minusMonths(3).minusWeeks(1);

        // Acesso a partes específicas de datas e horários
        int ano = hoje.getYear();
        int mes = hoje.getMonthValue();
        int dia = hoje.getDayOfMonth();
        int hora = agora.getHour();
        int minuto = agora.getMinute();
        int segundo = agora.getSecond();

        // Exemplo de comparação de datas
        LocalDate dataFutura = LocalDate.of(2024, 12, 31);
        if (hoje.isBefore(dataFutura)) {
            System.out.println("Hoje é antes de " + dataFutura);
        } else if (hoje.isAfter(dataFutura)) {
            System.out.println("Hoje é depois de " + dataFutura);
        } else {
            System.out.println("Hoje é igual a " + dataFutura);
        }

        // Exemplo de formatação de datas e horários
        String dataFormatada = hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String horarioFormatado = agora.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        String dataHoraFormatados = agoraComDataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        System.out.println("Data formatada: " + dataFormatada);
        System.out.println("Horário formatado: " + horarioFormatado);
        System.out.println("Data e Horário formatados: " + dataHoraFormatados);
    }
}

