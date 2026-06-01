import java.io.*;
import java.util.Scanner;

public class ReadingFromFile {
public static void main(String[] args) {
	File fileObj = new File("MyNoteBook.txt");
	try {
		Scanner sc = new Scanner(fileObj);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}