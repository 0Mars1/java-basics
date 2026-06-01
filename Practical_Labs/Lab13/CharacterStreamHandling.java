/**
 * Lab Day 13: Character Stream Writing Loop
 * Purpose: Stream character inputs from system console directly to a text file until "stop".
 * Author: Ahmad Ali
 */
import java.io.*; // Import all classes from java.io for reading input and writing output

public class CharacterStreamHandling {
    public static void main(String[] args) {
        // Create a BufferedReader that reads characters from standard input (keyboard)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Prompt the user to enter text lines, with instructions on how to stop
        System.out.println("Enter lines of text to write to file (type 'stop' to terminate):");

        // Open a FileWriter for the output file and ensure it is closed automatically
        try (FileWriter fw = new FileWriter("outputLog.txt")) {
            String inputLine; // Declare a variable to hold each line entered by the user
            while (true) {
                inputLine = br.readLine(); // Read a line of text from the console

                // If the user enters "stop" (case-insensitive), exit the loop
                if (inputLine.equalsIgnoreCase("stop")) {
                    break;
                }

                // Write the entered text to the file followed by a newline for readability
                fw.write(inputLine + System.lineSeparator());
            }
            System.out.println("Data successfully stored within 'outputLog.txt'.");
        } catch (IOException e) {
            // Print an error message if reading from input or writing to file fails
            System.out.println("An infrastructure I/O Error occurred: " + e.getMessage());
        }
    }
}