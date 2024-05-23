package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoadLoanCSV implements Task {
    private final String rutaArchivo;
    public LoadLoanCSV(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public static LoadLoanCSV withTheFollowingField(String rutaArchivo) {
        return instrumented(LoadLoanCSV.class,rutaArchivo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
             CSVParser csvParser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader)) {
            for (CSVRecord record : csvParser) {
                String loan_file_number = record.get("loan_file_number");
                String loan_type = record.get("loan_type");
                String loanProgram = record.get("loanProgram");
                String transaction_table = record.get("transaction_table");
                String loan_funded_date = record.get("loan_funded_date");
                String term_day = record.get("term_day");
                String subject = record.get("subject");
                String zip = record.get("zip");
                actor.remember("loan_file_number", loan_file_number);
                actor.remember("loan_type", loan_type);
                actor.remember("loanProgram", loanProgram);
                actor.remember("transaction_table", transaction_table);
                actor.remember("loan_funded_date", loan_funded_date);
                actor.remember("term_day", term_day);
                actor.remember("subject", subject);
                actor.remember("zip", zip);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
