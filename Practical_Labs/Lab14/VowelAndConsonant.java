/**
 * Lab 14: Character Sorter File Router
 * Purpose: Process a text file and isolate vowels and non-vowels into separate text destinations.
 * Author: Ahmad Ali
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class VowelAndConsonant {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("alphabets.txt");
             FileWriter vowelWriter = new FileWriter("vowels.txt");
             FileWriter consonantWriter = new FileWriter("non_vowels.txt")) {

            int data;
            while ((data = reader.read()) != -1) {
                char ch = (char) data;

                // Check if the read character is a letter
                if (Character.isLetter(ch)) {
                    char lowerCh = Character.toLowerCase(ch);
                    if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                        vowelWriter.write(ch);
                    } else {
                        consonantWriter.write(ch);
                    }
                } else {
                    // Forward spacing and layout symbols straight to both destinations uniformly
                    vowelWriter.write(ch);
                    consonantWriter.write(ch);
                }
            }
            System.out.println("Characters successfully split into 'vowels.txt' and 'non_vowels.txt'.");
        } catch (IOException e) {
            System.out.println("Error parsing characters from stream: " + e.getMessage());
        }
    }
}