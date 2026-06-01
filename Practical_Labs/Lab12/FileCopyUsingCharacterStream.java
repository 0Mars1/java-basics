package Lab12;

/**
 * Lab 12: Character Stream File Cloner
 * Purpose: Duplicate a file's contents using character stream structures.
 * Author: Ahmad Ali
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyUsingCharacterStream {
    public static void main(String[] args) {
        // Automatically manages and flushes streams when done
        try (FileReader fileInput = new FileReader("input.txt");
             FileWriter fileOutput = new FileWriter("cloned_output.txt")) {

            int characterData;
            while ((characterData = fileInput.read()) != -1) {
                fileOutput.write(characterData);
            }
            System.out.println("Character stream file clone generation executed successfully.");
        } catch (IOException e) {
            System.out.println("Error processing file replication: " + e.getMessage());
        }
    }
}
