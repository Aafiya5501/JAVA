import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WordReplacement {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java WordReplacement <file1> <file2> <word1> <word2>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];
        String word1 = args[2];
        String word2 = args[3];

        int replacementCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Replace word1 with word2 in the current line
                String modifiedLine = line.replaceAll(word1, word2);
                // Update replacement count
                replacementCount += (line.length() - modifiedLine.length()) / word1.length();
                // Write the modified line to the output file
                writer.write(modifiedLine);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("Number of replacements: " + replacementCount);
    }
}
