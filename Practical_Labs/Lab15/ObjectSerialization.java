/**
 * Lab 15: Object State Serialization Engine
 * Purpose: Store the complete state of a Student object inside a binary structured file.
 * Author: Ahmad Ali
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;

// Must implement Serializable to permit object stream conversions
class Student implements Serializable {
    // Unique structural layout identifier for versioning
    private static final long serialVersionUID = 1L;
    
    int id;
    String name;
    int javaMarks, dbmsMarks, osMarks;

    public Student(int id, String name, int javaMarks, int dbmsMarks, int osMarks) {
        this.id = id;
        this.name = name;
        this.javaMarks = javaMarks;
        this.dbmsMarks = dbmsMarks;
        this.osMarks = osMarks;
    }
}

public class ObjectSerialization {
    public static void main(String[] args) {
        // Construct entity object
        Student studentObj = new Student(101, "Aman Verma", 92, 88, 85);

        try (FileOutputStream fos = new FileOutputStream("studentData.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            
            // Serialize object state directly 
            oos.writeObject(studentObj);
            System.out.println("Student profile instance object state successfully serialized to disk storage.");
        } catch (IOException e) {
            System.out.println("Serialization workflow failed: " + e.getMessage());
        }
    }
}