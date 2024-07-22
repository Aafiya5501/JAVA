import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DigitCounter {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java DigitCounter <filename>");
            return;
        }

        String filename = args[0];
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (ch == '5') {
                    count++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Number of occurrences of digit 5 in file '" + filename + "': " + count);
    }
}
