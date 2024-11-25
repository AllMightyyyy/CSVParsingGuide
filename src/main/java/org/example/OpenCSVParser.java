package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class OpenCSVParser {
    /*
    Pros:
        Feature-rich and robust.
        Handles edge cases like escaped characters, quotes, and embedded delimiters.
    Cons:
        Requires an external dependency.
     */
    public static void main(String[] args) {
        String filePath = "data.csv";
        try( CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                for (String value : line) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IOException | CsvValidationException e) {
            System.err.println(e.getMessage());
        }
    }
}
