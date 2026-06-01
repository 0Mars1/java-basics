package Lab4;
/**
 * Lab Day 4: String Array Management
 * Purpose: Take 10 names from the user, store them in an array, and display them.
 * Author: Ahmad Ali
 */
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declare a String array of size 10
        String[] names = new String[10];

        System.out.println("Enter 10 names:");
        // Collect 10 names using a loop
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Print the array using a loop
        System.out.println("\n--- List of Names ---");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }

        scanner.close();
    }
}