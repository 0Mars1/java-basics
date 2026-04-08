import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class BasicJavaClass {
    public static void main(String[] args) {

        System.out.println("Premitive Data types");

        byte b = 100;      // 1 byte    -128 to 127
        short s = 10000;   // 2 bytes
        int i = 100000;    // 4 bytes
        long l = 10000000; // 8 bytes

        // float
        float f = 2.5f;    // 4 bytes
        double d = 19.222; // 8 bytes

        // others
        char letter = 'a';   // 2 bytes
        boolean isTrue = true; // 1 bit (logical)

        Integer x = 100;

        Scanner sc = new Scanner(System.in);

        // Array
        int[] numbers = new int[10];
        int[] newnumbers = {5, 1, 3, 2, 6};

        ArrayList<String> al = new ArrayList<>();
        al.add("abc");

        // for loop input
        for (int j = 0; j < numbers.length; j++) {
            System.out.println("Enter Value at Index " + (j + 1));
            numbers[j] = sc.nextInt();
        }

        System.out.println("Entered Values are");
        for (int j = 0; j < numbers.length; j++) {
            System.out.print("\t" + numbers[j]);
        }

        // sorting
        Arrays.sort(newnumbers);
        System.out.println("\nSorted Values are");
        for (int j = 0; j < newnumbers.length; j++) {
            System.out.print("\t" + newnumbers[j]);
        }

        sc.close();
    }
}