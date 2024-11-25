package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CSVParserScanner {
    /*
    Pros:
        Simple to implement.
    Cons:
        Similar limitations as the split approach.
     */
    public static void main(String[] args) {
        String filePath = "data.csv";
        try (Scanner scanner = new Scanner(new File(filePath))) {
            scanner.useDelimiter("[,\\n]");
            while (scanner.hasNext()) {
                String line = scanner.next();
                System.out.print(line + " ");
            }
            scanner.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
