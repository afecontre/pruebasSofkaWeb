package co.com.certification.testing.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor
{
    public static String extractDay(String dateStr) {
        // Definir la expresión regular para capturar el día
        String regex = "(\\d{2})/[a-zA-Z]{3}/\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dateStr);

        if (matcher.find()) {
            // Retornar el grupo capturado
            return matcher.group(1);
        }
        return null;
    }
    public static String extractMonth(String dateStr) {
        // Definir la expresión regular para capturar el mes
        String regex = "\\d{2}/([a-zA-Z]{3})/\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dateStr);

        if (matcher.find()) {
            // Retornar el grupo capturado
            return matcher.group(1);
        }
        return null;
    }

    public static String extractYear(String dateStr) {
        // Definir la expresión regular para capturar el año
        String regex = "\\d{2}/[a-zA-Z]{3}/(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dateStr);

        if (matcher.find()) {
            // Retornar el grupo capturado
            return matcher.group(1);
        }
        return null;
    }
}
