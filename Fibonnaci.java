/**
* This program outputs the fibonnaci sequence
* @author  Van Nguyen
* @version 1.0
* @since   2024-04-11
*/

import java.io.*;
import java.util.*;

public class Fibonnaci {
    public static int fibonacci(int n) {
        // Base cases: if n is 0 or 1, return n
        if (n <= 1) {
            return n;
        }
        // Recursive case: calculate Fibonacci number using previous two Fibonacci numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        // Try Catch
        try {
            // File paths
            String in = "./input.txt";
            String out = "./output.txt";
            File input = new File(in);
            File output = new File(out);

            // Scanner + Writer
            Scanner scanner = new Scanner(input);
            FileWriter writer = new FileWriter(output);

            // Initialize Variable
            int numTerms;

            // Input from input file
            if (scanner.hasNextInt()) {
                // Reading number of terms
                numTerms = scanner.nextInt();
                
                // Generate Fibonacci sequence
                writer.write("Fibonacci sequence of " + numTerms + " terms:\n");
                for (int i = 1; i <= numTerms; i++) {
                    writer.write(fibonacci(i) + " ");
                }
            } else {
                System.out.println("Input file is empty or does not contain a valid integer.");
            }

            // Closes writer and scanner
            scanner.close();
            writer.close();

        } catch (IOException e) {
            System.out.println("File could not be found or there was an error reading/writing the file.");
            e.printStackTrace();
        }
    }
}


