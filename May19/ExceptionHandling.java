/*
Write a program for Exception Handling,
make an array of 5 elements and assign them values during declararion
now get the index from user, with that index print the value at that index
after that get 2 values from user divide them and save the result in third and print it
Guard against any runtime exception that may occur in this code
*/

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        // Decalaration and Initialization of array
        int[] arr = { 10, 20, 30, 40, 50 };
        // Getting index from user
        System.out.println("Enter index from 0 to 4: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        // Printing the index while handling exception
        try {
            System.out.println("Element is: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occured: " + e.getMessage());
        }

        // Getting 2 integers from user
        System.out.println("Enter 2 values: ");
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        // Diving them and printing result while handling the division by zero exception
        try {
            int v3 = v1 / v2;
            System.out.println("Divising of " + v1 + " And " + v2 + " equals to " + v3);
        } catch (ArithmeticException e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
        sc.close();
    }

}
