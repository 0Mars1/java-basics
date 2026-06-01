import java.io.File;
import java.io.IOException;

public class NewFile {
    public static void main(String[] args) {
        // We use File class to create a new file object.
        File myFile = new File("newFileCreated.txt");
        try {
            // We use the method createNewFile() to actually create the file on the disk.
            // This method returns true if the file was created successfully, and false if the file already exists.
            myFile.createNewFile();
            // getName() method is used to retrieve the name of the file, which is then printed to the console.
            System.out.println("File created successfully: " + myFile.getName());
        } catch (IOException e) {
            System.out.println("Error occurred while creating the file!");
            e.getMessage();
        }
    }
}
