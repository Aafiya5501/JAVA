import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStatsCounter {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileStatsCounter <filename>");
            return;
        }

        String filename = args[0];
        try {
            // Open the file
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            String line;

            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                // Count characters
                charCount += line.length();
                // Count words
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
                // Count lines
                lineCount++;
            }

            // Close the file
            bufferedReader.close();

            // Print the statistics
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
