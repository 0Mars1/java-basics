import java.util.Scanner;

class SmartDevice {
    String brand;
    String model;
    double price;

    // Constructor to initialize variables
    SmartDevice(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display device details
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
}

public class SmartDevices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array of SmartDevice objects
        SmartDevice[] devices = new SmartDevice[3];

        // Prompt user to enter values for each device
        for (int i = 0; i < devices.length; i++) {
            System.out.println("Enter details for device " + (i + 1));

            System.out.print("Brand: ");
            String brand = sc.nextLine();

            System.out.print("Model: ");
            String model = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            // Initialize object using constructor
            devices[i] = new SmartDevice(brand, model, price);
            sc.nextLine();
        }

        // Loop through array and display info
        System.out.println("Device Details:");
        for (int i = 0; i < devices.length; i++) {
            devices[i].displayInfo();
        }

        sc.close();
    }
}