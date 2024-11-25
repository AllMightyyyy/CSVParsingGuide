package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ApacheCommonCSVParse {
    /*
    Pros:
        Powerful and flexible.
        Handles various CSV formats.
    Cons:
        Requires an external dependency.
     */
    public static void main(String[] args) {
        String filePath = "data.csv";
        try (Reader reader = new FileReader(filePath)) {
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(reader);
            for (CSVRecord record : records) {
                for (String value : record) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
