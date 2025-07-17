package main.java.Intermediario.TrabalhandoComDatas.ModeloAntigo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Este manual cobre os conceitos e uso da classe Calendar em Java.
 *
 * A classe Calendar é uma classe abstrata que fornece methods para
 * converter entre um instante específico no tempo e um conjunto de campos
 * de calendário, como YEAR, MONTH, DAY_OF_MONTH, HOUR, etc.
 * Calendar também fornece methods para manipulação de data, como adicionar ou subtrair
 * tempo.
 */
public class CalendarManual {

    public static void main(String[] args) {
        // 1. Obtendo uma instância do Calendar

        // Usando o method estático getInstance() para criar um objeto de calendario.
        Calendar calendar = Calendar.getInstance();

        // Exemplo: Exibindo a data e hora atuais
        System.out.println("Data e Hora atuais: " + calendar.getTime());

        // 2. Configurando uma data específica
        // Configurando a data para 25 de dezembro de 2024
            calendar.set(2024, Calendar.DECEMBER, 25);
            System.out.println("Data configurada 1: " + calendar.getTime());
            calendar.set(Calendar.YEAR, 2022);
            calendar.set(Calendar.MONTH, Calendar.JANUARY);
            calendar.set(Calendar.DAY_OF_MONTH, 04);
            System.out.println("Data configurada 2: " + calendar.getTime());

        // 3. Obtendo valores específicos de campos de data
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH); // Note que Janeiro é 0, Dezembro é 11
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            // Exemplo: Exibindo os valores obtidos
            System.out.println("Ano: " + year);
            System.out.println("Mês: " + (month + 1)); // Somamos 1 para exibir o mês corretamente
            System.out.println("Dia: " + day);

        // 4. Manipulando datas

            // Adicionando 10 dias à data atual
            calendar.add(Calendar.DAY_OF_MONTH, 10);
            System.out.println("Data após adicionar 10 dias: " + calendar.getTime());

            // Subtraindo 2 meses
            calendar.add(Calendar.MONTH, -2);
            System.out.println("Data após subtrair 2 meses: " + calendar.getTime());

        // 5. Comparando datas
            Calendar anotherDate = new GregorianCalendar(2024, Calendar.DECEMBER, 31);
            boolean isBefore = calendar.before(anotherDate);
            boolean isAfter = calendar.after(anotherDate);

            // Exemplo: Comparando datas
            System.out.println("A data é antes de 31 de dezembro de 2024? " + isBefore);
            System.out.println("A data é depois de 31 de dezembro de 2024? " + isAfter);

        // 6. Uso de constantes de campos de data e hora
            // Obtendo e configurando a hora do dia
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            System.out.println("Hora atual: " + hour);

            // Configurando a hora para 15 (3 PM)
            calendar.set(Calendar.HOUR_OF_DAY, 15);
            System.out.println("Data e Hora configuradas para 3 PM: " + calendar.getTime());

        // 7. Trabalhando com fusos horários
            // Obtendo o fuso horário atual
            System.out.println("Fuso horário atual: " + calendar.getTimeZone().getID());

            // Configurando o fuso horário para GMT
            calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
            System.out.println("Data e Hora em GMT: " + calendar.getTime());

        // 8. Formatação de datas
            // A classe Calendar não formata datas diretamente, para isso usamos SimpleDateFormat
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            System.out.println("Data formatada: " + sdf.format(calendar.getTime()));
    }
}

