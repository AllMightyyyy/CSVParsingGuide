package org.example;

import org.supercsv.io.CsvListReader;
import org.supercsv.prefs.CsvPreference;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class SuperCSVParser {
    /*
    Pros:
        Offers advanced CSV parsing options.
    Cons:
        Requires an external dependency.
     */
    public static void main(String[] args) {
        String filePath = "data.csv";
        try (CsvListReader listReader = new CsvListReader(new FileReader(filePath), CsvPreference.STANDARD_PREFERENCE)) {
            List<String> values;
            while ((values = listReader.read()) != null) {
                for (String value : values) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
