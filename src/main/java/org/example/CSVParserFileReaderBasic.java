package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVParserFileReaderBasic {
    /*
    Pros:
        No external dependencies.
    Cons:
        Limited functionality.
        Does not handle edge cases like escaped quotes or embedded commas.
     */
    public static void main(String[] args) {
        String filePath = "data.csv";
        String line;
        String delimiter = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while((line = br.readLine()) != null) {
                String[] values = line.split(delimiter);
                for (String value : values) {
                    System.out.println(value + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}