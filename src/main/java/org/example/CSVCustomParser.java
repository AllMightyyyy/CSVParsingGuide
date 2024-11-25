package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVCustomParser {
    /*
     A custom parser that handles edge cases like escaped quotes, embedded commas, and multiline fields.
     Pros:
        Handles complex edge cases if implemented properly.
    Cons:
        Requires significant effort to handle all cases correctly.
     */
    public static void main(String[] args) {
        String filePath = "data.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] values = parseLine(line);
                for (String value : values) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    private static String[] parseLine(String line) {
        // Handle commas, quotes, etc.
        return line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
    }
}
