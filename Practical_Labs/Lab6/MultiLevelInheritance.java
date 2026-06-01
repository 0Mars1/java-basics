package Lab6;
/**
 * Lab Day 6: Multilevel Inheritance Execution
 * Purpose: Implement Multilevel Inheritance (Device -> MobilePhone -> SmartPhone).
 * Author: Ahmad Ali
 */

// Base Class
class Device {
    String brandName;

    void showBrandName() {
        System.out.println("Brand: " + brandName);
    }
}

// Intermediate Class inheriting from Device
class MobilePhone extends Device {
    double screenSize;

    void showScreenSize() {
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}

// Child Class inheriting from MobilePhone
class SmartPhone extends MobilePhone {
    String os;

    void showAllDetails() {
        showBrandName();    // Inherited from Device
        showScreenSize();   // Inherited from MobilePhone
        System.out.println("Operating System: " + os);
    }
}

// Main operational function nested inside MobilePhoneClass as per requirement
public class MultiLevelInheritance {
    public static void main(String[] args) {
        // Create object of the bottom-most subclass
        SmartPhone phone = new SmartPhone();
        
        // Setting values across the chain hierarchy
        phone.brandName = "Samsung";
        phone.screenSize = 6.7;
        phone.os = "Android 14";

        // Displaying unified data
        System.out.println("--- SmartPhone Specification Sheets ---");
        phone.showAllDetails();
    }
}