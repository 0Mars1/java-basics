package Lab10;
/**
 * Lab 10: File Copy Helper
 * Purpose: Copy content from a source file to a backup file destination.
 * Author: Ahmad Ali
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileCopyHelper {
    String sourceFilePath;
    String backupFileName;

    // Constructor to initialize file paths
    public FileCopyHelper(String sourceFilePath, String backupFileName) {
        this.sourceFilePath = sourceFilePath;
        this.backupFileName = backupFileName;
    }

    // Function to execute copy operation
    public void fileCopy() {
        try (FileReader reader = new FileReader(sourceFilePath);
             FileWriter writer = new FileWriter(backupFileName)) {
            
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("File successfully copied to " + backupFileName);
        } catch (IOException e) {
            System.out.println("Error processing file copy: " + e.getMessage());
        }
    }
}

public class FileCopy {
    public static void main(String[] args) {
        // Pre-requisite: Create a sample 'source.txt' file before running if testing locally
        FileCopyHelper helper = new FileCopyHelper("source.txt", "backup.txt");
        helper.fileCopy();
    }
}