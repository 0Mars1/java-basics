/*
 * Program: File Copy Utility
 * 
 * Description:
 * This program demonstrates how to copy data from one file to another
 * using java.io streams in Java.
 * 
 * It consists of:
 * 1. A helper class (FileCopyHelper) that handles file copying.
 * 2. A main class (FileCopier) that creates an object and calls the method.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Class: FileCopyHelper
 * 
 * Purpose:
 * This class is responsible for copying a file from a source path
 * to a backup (destination) file.
 */
class FileCopyHelper {

    // Instance variable to store source file path
    String sourceFilePath;

    // Instance variable to store destination (backup) file name
    String backupFileName;

    /*
     * Constructor
     * 
     * Purpose:
     * Initializes the source and destination file paths when an object is created.
     * 
     * Parameters:
     * sourceFilePath - path of the file to copy from
     * backupFileName - path of the file to copy to
     */
    public FileCopyHelper(String sourceFilePath, String backupFileName) {
        this.sourceFilePath = sourceFilePath;
        this.backupFileName = backupFileName;
    }

    /*
     * Method: fileCopy
     * 
     * Purpose:
     * Copies the contents of the source file to the destination file.
     * 
     * Logic:
     * 1. Open input stream (read source file)
     * 2. Open output stream (write to destination file)
     * 3. Read data in chunks using a buffer
     * 4. Write each chunk to the destination file
     * 5. Close both streams
     */
    public void fileCopy() {

        // Input stream for reading file
        FileInputStream fis = null;

        // Output stream for writing file
        FileOutputStream fos = null;

        try {
            // Open source file
            fis = new FileInputStream(sourceFilePath);

            // Open/create destination file
            fos = new FileOutputStream(backupFileName);

            // Buffer to store bytes temporarily (1 KB size)
            byte[] buffer = new byte[1024];

            // Variable to store number of bytes read
            int length;

            /*
             * Read from source and write to destination
             * until end of file is reached
             */
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

            // Success message
            System.out.println("File copied successfully!");

        } catch (IOException e) {
            // Handle file-related errors
            System.out.println("Error: " + e.getMessage());

        } finally {
            /*
             * Close streams to free system resources
             * This block always executes
             */
            try {
                if (fis != null)
                    fis.close();

                if (fos != null)
                    fos.close();

            } catch (IOException e) {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
    }
}

/*
 * Class: FileCopier (Main Class)
 * 
 * Purpose:
 * Entry point of the program.
 * Creates an object of FileCopyHelper and calls the fileCopy method.
 */
public class FileCopier {

    public static void main(String[] args) {

        /*
         * Create object of FileCopyHelper
         * Provide source file and destination file names
         */
        FileCopyHelper helper = new FileCopyHelper(
                "source.txt",   // Source file
                "backup.txt"    // Destination file
        );

        // Call method to copy file
        helper.fileCopy();
    }
}