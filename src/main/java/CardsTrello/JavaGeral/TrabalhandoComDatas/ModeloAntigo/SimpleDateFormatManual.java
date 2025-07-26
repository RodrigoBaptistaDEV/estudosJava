package main.java.CardsTrello.JavaGeral.TrabalhandoComDatas.ModeloAntigo;

// Manual: Utilizando a classe SimpleDateFormat

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatManual {

    public static void main(String[] args) {
        // A classe SimpleDateFormat é utilizada para formatação e análise (parsing) de datas em Java.
        // Ela permite a conversão de objetos Date para Strings e vice-versa, utilizando padrões específicos.

        // 1. Instanciando SimpleDateFormat:
        // O construtor SimpleDateFormat recebe uma String que define o padrão de formatação desejado.
        // Exemplo de padrões:
        // "dd/MM/yyyy" - dia/mês/ano
        // "yyyy-MM-dd HH:mm:ss" - ano-mês-dia horas:minutos:segundos
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // 2. Formatando Datas:
        // A formatação converte um objeto Date em uma String, segundo o padrão especificado.

        Calendar currentDate = Calendar.getInstance(); // ou tbm Date currentDate = new Date();
        String formattedDate = sdf.format(currentDate);
        System.out.println("Data formatada: " + formattedDate); // Exemplo de saída: "Data formatada: 29/05/2024"

        // 3. Analisando Datas (Parsing):
        // O method parse converte uma String em um objeto Calendar, seguindo o padrão especificado.
        String dateInString = "29/05/2024";
        try {
            Calendar parsedDate = Calendar.getInstance();
            parsedDate.setTime(sdf.parse(dateInString));
            System.out.println("Data analisada: " + sdf.format(parsedDate.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 4. Padrões Comuns de Formatação:
        // "dd/MM/yyyy" - 29/05/2024
        // "MM/dd/yyyy" - 05/29/2024
        // "yyyy-MM-dd" - 2024-05-29
        // "EEEE, MMMM d, yyyy" - Wednesday, May 29, 2024
        // "HH:mm:ss" - 14:23:15 (24-hour time)
        // "hh:mm:ss a" - 02:23:15 PM (12-hour time)

        // Exemplos adicionais:
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Data e Hora formatada: " + sdf1.format(currentDate.getTime())); // Exemplo: "2024-05-29 14:23:15"

        SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        System.out.println("Data detalhada: " + sdf2.format(currentDate)); // Exemplo: "Wednesday, May 29, 2024"

        // 5. Tratamento de Erros:
        // Sempre que utilizamos o method parse, é necessário tratar a possível exceção ParseException.
        // Isso é importante para evitar que o programa falhe ao tentar analisar uma data inválida.

        // 6. Definindo Localização (Locale):
        // Podemos definir uma localização específica para formatação e análise de datas.
        // Isso é útil para trabalhar com diferentes convenções regionais.
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd MMMM yyyy", new Locale("pt", "BR"));
        System.out.println("Data formatada em português: " + sdf3.format(currentDate)); // Exemplo: "29 maio 2024"

        // 7. Notas Importantes:
        // - SimpleDateFormat não é thread-safe, ou seja, não deve ser compartilhado entre múltiplas threads sem sincronização.
        // - A partir do Java 8, a classe DateTimeFormatter da API java.time é recomendada para formatação e análise de datas e horas.

        // 8. Exemplo Prático:
        // Vamos criar um method para formatar e analisar datas de forma prática.

        String datePattern = "dd/MM/yyyy";
        String dateString = "15/08/2021";

        try {
            Calendar formattedParsedDate = formatAndParseDate(datePattern, dateString);
            System.out.println("Data formatada e analisada: " + sdf.format(formattedParsedDate.getTime()));
        } catch (ParseException e) {
            System.err.println("Erro ao analisar a data: " + e.getMessage());
        }


        /// /////////
        //seção adicional Date + Calendar  + SimpleDateFormat

        Date agora = new Date();
        System.out.println("Data atual: " + agora);

        // Data específica
        Calendar calendario = Calendar.getInstance();
        calendario.set(2024, Calendar.DECEMBER, 25);
        Date natal = calendario.getTime();
        System.out.println("Natal: " + natal);

        // Adicionar 1 semana
        calendario.setTime(agora);
        calendario.add(Calendar.WEEK_OF_YEAR, 1);
        Date semanaQueVem = calendario.getTime();
        System.out.println("Semana que vem: " + semanaQueVem);

        // Formatando data
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatador.format(agora);
        System.out.println("Data formatada: " + dataFormatada);

        // Parseando string para data
            // Date dataParseada = formatador.parse("29/05/2024");
            // System.out.println("Data parseada: " + dataParseada);

        // Comparando datas
        boolean isAntes = agora.before(natal);
        System.out.println("Hoje é antes do Natal? " + isAntes);

        // Período entre duas datas (em dias)
        long diferencaMillis = natal.getTime() - agora.getTime();
        long diasDiferenca = diferencaMillis / (1000 * 60 * 60 * 24);

        System.out.println("Dias até o Natal: " + diasDiferenca);

    }

    // method utilitário para formatar e analisar datas
    public static Calendar formatAndParseDate(String pattern, String dateString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse(dateString));
        return calendar;
    }
}
