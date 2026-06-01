package Lab5;
/**
 * Lab Day 5: Single Inheritance Realization
 * Purpose: Implement single inheritance with Teacher and ComputerTeacher classes.
 * Author: Ahmad Ali
 */

// Parent Class
class Teacher {
    String designation = "Lecturer";
    String collegeName = "ABC Engineering College";

    void work() {
        System.out.println("Status: Teaching students and conducting labs.");
    }
}

// Child Class extending Parent Class
class ComputerTeacher extends Teacher {
    String mainSubject = "Computer Networks";

    // Method to print all details (inherited + child variables)
    void printDetails() {
        System.out.println("College: " + collegeName);
        System.out.println("Designation: " + designation);
        System.out.println("Main Subject: " + mainSubject);
    }
}

// Main Execution Class
public class SingleLevelInheritance {
    public static void main(String[] args) {
        // Creating an object of the child class
        ComputerTeacher teacherObj = new ComputerTeacher();
        
        // Display details and trigger parent function
        teacherObj.printDetails();
        teacherObj.work();
    }
}