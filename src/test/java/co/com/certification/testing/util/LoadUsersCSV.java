package co.com.certification.testing.util;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

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
                String type = record.get("type");
                String username = record.get("username");
                String password = record.get("password");

                switch (type.toLowerCase()) {
                    case "admin":
                        actor.remember("admin_username", username);
                        actor.remember("admin_password", password);
                        System.out.println("type: admin, username: " + username + ", password: " + password);
                        break;
                    case "sub":
                        actor.remember("sub_username", username);
                        actor.remember("sub_password", password);
                        System.out.println("type: sub, username: " + username + ", password: " + password);
                        break;
                    case "reset":
                        actor.remember("reset_username", username);
                        actor.remember("reset_password", password);
                        System.out.println("type: reset, username: " + username + ", password: " + password);
                        break;
                    case "blocked":
                        actor.remember("blocked_username", username);
                        actor.remember("blocked_password", password);
                        System.out.println("type: blocked, username: " + username + ", password: " + password);
                        break;
                    default:
                        System.out.println("Unrecognized type: " + type);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
