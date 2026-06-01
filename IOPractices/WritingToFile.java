import java.io.*;
public class WritingToFile {
       public static void main(String[] args) {
		   try {
		   FileWriter fw = new FileWriter("MyNoteBook.txt");
		   fw.write("This is my new note book!");
		   fw.close();
		   } catch (IOException e) {
			   e.printStackTrace();
		   }
	   }
}
