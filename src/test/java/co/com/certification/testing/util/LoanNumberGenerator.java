package co.com.certification.testing.util;

import java.text.DecimalFormat;
import java.util.Random;

public class LoanNumberGenerator {

    private static final String BASE = "LOAN-LG-";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9999;  // Puedes ajustar el rango según tus necesidades

    public static String generateRandomLoanNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;

        // Formatear el número con ceros a la izquierda para que tenga siempre 4 dígitos
        DecimalFormat df = new DecimalFormat("0000");
        String formattedNumber = df.format(randomNumber);

        return BASE + formattedNumber;
    }

    public static void main(String[] args) {
        // Ejemplo de generación de 5 números de préstamo aleatorios
        for (int i = 0; i < 5; i++) {
            System.out.println(generateRandomLoanNumber());
        }
    }

}
