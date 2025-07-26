package main.java.CardsTrello.JavaGeral.TrabalhandoComDatas.ModeloAntigo;

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

        // 9. Exemplo extra: Como Instanciar uma Data Especifica:

            // 08/08/2024 (Quinta-feira) ->

                // ===============================
                // 1. Declaração de uma data específica
                // ===============================

                // Definimos o ano como 2024
                int ano = 2024;

                // Definimos o mês como agosto
                    // IMPORTANTE: em Java, a classe Calendar representa os meses de forma zero-based,
                    // ou seja, de 0 a 11:
                    // 0 = Janeiro, 1 = Fevereiro, ..., 7 = Agosto, ..., 11 = Dezembro

                // Forma recomendada: usar as constantes da classe Calendar, que tornam o código mais claro e seguro
                        int mes = Calendar.AUGUST;

                    // Alternativamente (menos recomendado), você pode usar o valor numérico diretamente:
                    // int mes = 7; // Agosto (lembrando que 7 equivale a agosto, pois janeiro começa em 0)
                    // Ou ainda, calcular a partir da forma "humana" do mês (1 a 12), subtraindo 1:
                    // int mes = 8 - 1; // Agosto (8 humano - 1 para ajustar ao índice do Calendar)

                // Definimos o dia do mês como 8
                int dia = 8;

                // ===============================
                // 2. Criação do objeto Calendar
                // ===============================

                // Obtém uma instância do Calendar com a data e hora atuais
                Calendar c = Calendar.getInstance();

                // Configura o Calendar com a data desejada: ano, mês e dia
                c.set(ano, mes, dia);


                // ===============================
                // 3. Descobrir o dia da semana correspondente
                // ===============================

                // Recupera o valor numérico do dia da semana
                // Calendar.DAY_OF_WEEK retorna um número de 1 a 7, sendo:
                // 1 = Domingo, 2 = Segunda-feira, ..., 7 = Sábado
                int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

                // Array com os nomes dos dias da semana em português
                // A ordem precisa bater com os índices de Calendar.DAY_OF_WEEK - 1
                String[] daysOfWeek = {
                        "Domingo",
                        "Segunda-feira",
                        "Terça-feira",
                        "Quarta-feira",
                        "Quinta-feira",
                        "Sexta-feira",
                        "Sábado"
                };

                // Como o índice retornado por DAY_OF_WEEK começa em 1,
                // subtraímos 1 para acessar o índice correto no array (que vai de 0 a 6)
                String dayOfWeekName = daysOfWeek[dayOfWeek - 1];

                // ===============================
                // 4. Impressão do resultado formatado
                // ===============================

                // Mostra a data no formato tradicional
                System.out.println("Data: " + dia + "/" + mes + "/" + ano);

                // Mostra o nome do dia da semana correspondente
                System.out.println("Dia da semana: " + dayOfWeekName);
    }
}

