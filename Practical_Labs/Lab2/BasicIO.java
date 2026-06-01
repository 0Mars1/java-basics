package Lab2;
/**
 * Lab Day 2: User Information Display
 * Purpose: Accept user details (name, address, age, height) and print them.
 * Author: Ahmad Ali
 */
import java.util.Scanner;

public class BasicIO {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Reading user inputs
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Height (in feet): ");
        double height = scanner.nextDouble();

        // Displaying the gathered information
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + height + " ft");

        scanner.close();
    }
}