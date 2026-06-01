/**
 * Lab Day 16: Defensive Exception Guarding 
 * Purpose: Protect array indices query and mathematical division operations from runtime failure.
 * Author: Ahmad Ali
 */
import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initializing static fixed array layout
        int[] fixedDataset = {12, 24, 36, 48, 60};

        try {
            // Subtask 1: Target Array Lookup Access
            System.out.print("Enter an array index to query (0 to 4): ");
            int index = scanner.nextInt();
            System.out.println("Value at element index " + index + " is: " + fixedDataset[index]);

            // Subtask 2: Standard Division Calculations
            System.out.print("\nEnter Dividend number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter Divisor number: ");
            int num2 = scanner.nextInt();
            
            int calculationResult = num1 / num2;
            System.out.println("Division Output Result: " + calculationResult);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: Array position out of bounds limits!");
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: Arithmetic error (Cannot divide by zero)!");
        } catch (Exception e) {
            System.out.println("Exception Caught: A general error occurred: " + e.getMessage());
        } finally {
            System.out.println("\nExecution process sequence completed cleanly.");
            scanner.close();
        }
    }
}