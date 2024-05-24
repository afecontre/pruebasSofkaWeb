package co.com.certification.testing.tasks.loan;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoadLoanCSV implements Task {
    private final String rutaArchivo;
    private final List<CSVRecord> records = new ArrayList<>();

    public LoadLoanCSV(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public static LoadLoanCSV withTheFollowingField(String rutaArchivo) {
        return instrumented(LoadLoanCSV.class, rutaArchivo);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
             CSVParser csvParser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader)) {
            for (CSVRecord record : csvParser) {
                records.add(record);
            }
            actor.remember("loan_records", records);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
