package Lab11;

/**
 * Lab 11: ByteStream Input Processing
 * Purpose: Take console user input and write to file using ByteStream until "stop" is encountered.
 * Author: Ahmad Ali
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to save to byte file (type 'stop' to finish):");

        try (FileOutputStream fos = new FileOutputStream("byteOutput.txt")) {
            while (true) {
                String input = scanner.nextLine();
                if (input.equals("stop")) {
                    break;
                }
                // Append line break separator back to raw data line string
                String dataWithNewLine = input + "\n";
                fos.write(dataWithNewLine.getBytes());
            }
            System.out.println("Data saved successfully using Byte Stream output.");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
        scanner.close();
    }
}