package co.com.certification.testing.util;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVLoader {

    private static List<CSVRecord> records;

    public static List<CSVRecord> getRecords(String rutaArchivo) {
        if (records == null) {
            try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
                 CSVParser csvParser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader)) {
                records = csvParser.getRecords();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return records;
    }
}
