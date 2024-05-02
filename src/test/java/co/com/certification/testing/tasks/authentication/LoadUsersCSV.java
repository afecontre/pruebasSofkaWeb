package co.com.certification.testing.tasks.authentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static co.com.certification.testing.pages.authentication.LoginPage.EMAIL_EMPTY;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class LoadUsersCSV implements Task {
    private final String rutaArchivo;
    public LoadUsersCSV(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public static LoadUsersCSV withTheFollowingField(String rutaArchivo) {
        return instrumented(LoadUsersCSV.class,rutaArchivo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
             CSVParser csvParser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader)) {
            for (CSVRecord record : csvParser) {
                String username = record.get("username");
                String password = record.get("password");
                actor.remember("username", username);
                actor.remember("password", password);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
