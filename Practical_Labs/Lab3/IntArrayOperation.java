package Lab3;
/**
 * Lab Day 3: Integer Array Initialization and Traversal
 * Purpose: Collect integer inputs into an array using a loop and print them.
 * Author: Ahmad Ali
 */
import java.util.Scanner;

public class IntArrayOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declare an array of integers with size 5
        int[] numbers = new int[5];

        System.out.println("Enter 5 integer values:");
        // Loop to populate the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        // Loop to display the array elements
        System.out.println("\nThe array elements are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // New line

        scanner.close();
    }
}