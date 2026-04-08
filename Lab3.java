import java.util.Scanner;

class ArrayInputExample {
    public static void main(String[] args) {
        // Step 1: Declare an array of integers with size 15
        int [] a = new int[15];

        // Create Scanner object ti read input from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 15 integer values for the array:");

        // Step 2: Use for loop to get the values from user
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        // Step 3: Print the array
        System.out.println("\nArray in one line: ");
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");

        //Close the scanner
        scanner.close();
    }
}