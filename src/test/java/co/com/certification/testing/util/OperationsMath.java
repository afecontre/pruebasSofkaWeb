package co.com.certification.testing.util;


import java.math.BigDecimal;
import java.text.DecimalFormat;

public class OperationsMath {
    public static String sumarNumeros(String numero1, String numero2) {

        // Convertir las cadenas a BigDecimal
        BigDecimal num1 = new BigDecimal(numero1);
        BigDecimal num2 = new BigDecimal(numero2);

        // Sumar los números
        BigDecimal suma = num1.add(num2);

        // Formatear el resultado a la cadena deseada
        DecimalFormat df = new DecimalFormat("$#,###.00");
        return df.format(suma);
    }

    public static String restarNumeros(String numero1, String numero2) {

        // Limpiar las cadenas de caracteres no numéricos
        numero1 = numero1.replaceAll("[$,]", "");
        numero2 = numero2.replaceAll("[$,]", "");

        // Convertir las cadenas a BigDecimal
        BigDecimal num1 = new BigDecimal(numero1);
        BigDecimal num2 = new BigDecimal(numero2);

        // Sumar los números
        BigDecimal resta = num1.subtract(num2);

        // Formatear el resultado a la cadena deseada
        DecimalFormat df = new DecimalFormat("$#,###.00");
        return df.format(resta);
    }
}
