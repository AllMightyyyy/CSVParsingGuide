package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JavaStreamsCSVParser {
    public static void main(String[] args) {
        /*
        Pros:
            Concise and modern.
        Cons:
            May require additional effort for complex cases.
         */
        try {
            Files.lines(Paths.get("data.csv"))
                    .map(line -> line.split(","))
                    .forEach(values -> {
                        for (String value : values) {
                            System.out.print( value + " ");
                        }
                        System.out.println();
                    });
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
