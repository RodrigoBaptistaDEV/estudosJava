package main.java.CardsTrello.JavaGeral.TrabalhandoComDatas.ModeloNovo;

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

    /*
    --------------------------------------------
    PARSE: Convertendo Strings para Datas e Horários
    --------------------------------------------

    O method "parse" é utilizado para converter uma String em um objeto do tipo:
        - LocalDate  -> Apenas data (sem hora)
        - LocalTime  -> Apenas hora (sem data)
        - LocalDateTime -> Data + hora

    Essa conversão é feita com o method estático:
        .parse(CharSequence text)
        .parse(CharSequence text, DateTimeFormatter formatter)

    A conversão pode ser feita de duas formas:
        1. Usando formatos padrão (ISO)
        2. Usando formatos personalizados com DateTimeFormatter.ofPattern()

        ===================================================
        PARSE COM LocalDate (apenas data, exemplo: "2024-06-14")
        ===================================================
        */

        // Com formato padrão ISO_LOCAL_DATE ("yyyy-MM-dd")
                LocalDate dataISO = LocalDate.parse("2024-06-14");

        // Com formato personalizado
                DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dataCustom = LocalDate.parse("14/06/2024", formatadorData);

        /*
            ===================================================
            PARSE COM LocalTime (apenas hora, exemplo: "14:30:00")
            ===================================================
        */

        // Com formato padrão ISO_LOCAL_TIME ("HH:mm:ss")
                LocalTime horaISO = LocalTime.parse("14:30:00");

        // Com formato personalizado
                DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm");
                LocalTime horaCustom = LocalTime.parse("14:30", formatadorHora);

        /*
            ===================================================
            PARSE COM LocalDateTime (data + hora, exemplo: "2024-06-14T14:30:00")
            ===================================================
        */

        // Com formato padrão ISO_LOCAL_DATE_TIME ("yyyy-MM-dd'T'HH:mm:ss")
                LocalDateTime dataHoraISO = LocalDateTime.parse("2024-06-14T14:30:00");

        // Com formato personalizado
                DateTimeFormatter formatadorDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                LocalDateTime dataHoraCustom = LocalDateTime.parse("14/06/2024 14:30:00", formatadorDataHora);

        /*
            ===================================================
            FORMATAÇÕES ISO MAIS COMUNS SUPORTADAS PELO DateTimeFormatter
            ===================================================

            Abaixo estão os principais formatadores ISO prontos na classe DateTimeFormatter:

            - ISO_LOCAL_DATE         -> "yyyy-MM-dd"                  → Apenas data
            - ISO_LOCAL_TIME         -> "HH:mm:ss"                    → Apenas hora
            - ISO_LOCAL_DATE_TIME    -> "yyyy-MM-dd'T'HH:mm:ss"       → Data e hora
            - ISO_DATE_TIME          -> Inclui timezone se disponível → Data, hora e offset
            - ISO_OFFSET_DATE_TIME   -> "yyyy-MM-dd'T'HH:mm:ssXXXXX"  → Data, hora e offset
            - ISO_ZONED_DATE_TIME    -> Data, hora, offset e timezone → Completo com zona
            - ISO_ORDINAL_DATE       -> "yyyy-DDD"                    → Dia ordinal do ano
            - ISO_WEEK_DATE          -> "YYYY-'W'ww-e"                → Data por semana ISO
            - BASIC_ISO_DATE         -> "yyyyMMdd"                    → Data compacta

            Esses formatadores podem ser usados diretamente:
            Exemplo:
                LocalDate.parse("2024-06-14", DateTimeFormatter.ISO_LOCAL_DATE);

            IMPORTANTE:
            Se o formato da string não corresponder ao especificado pelo formatter, será lançada a exceção:
                java.time.format.DateTimeParseException

            Portanto, sempre verifique se o padrão da string é compatível com o DateTimeFormatter usado.
        */


    }
}

