package Lab9;

/**
 * Lab Day 9: Dual Mode Polymorphism Verification
 * Purpose: Combine Overloading (LogTransaction) and Overriding (PaymentProcess) mechanics.
 * Author: Ahmad Ali
 */

class Payment {
    // Overloaded variant 1 (Single Argument)
    void logTransaction(double amount) {
        System.out.println("Logged: Generic processing payment of Rs. " + amount);
    }

    // Overloaded variant 2 (Two Arguments)
    void logTransaction(double amount, String currency) {
        System.out.println("Logged: Generic processing payment of Rs. " + amount + " in base currency " + currency);
    }

    // Base target logic to be overridden
    void paymentProcess(double amount) {
        System.out.println("Executing generic flat payment system pipeline.");
    }
}

class UPIPayment extends Payment {
    @Override
    void paymentProcess(double amount) {
        System.out.println("Executing UPI payment of Rs. " + amount);
    }
}

class CreditCard extends Payment {
    @Override
    void paymentProcess(double amount) {
        System.out.println("Executing CreditCard payment of Rs. " + amount);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Payment baseSystem = new Payment();
        
        // Testing Compile-Time Overloading Polymorphism
        System.out.println("--- Overloading Demonstrations ---");
        baseSystem.logTransaction(1200.50);
        baseSystem.logTransaction(85.00, "USD");

        // Testing Runtime Overriding Polymorphism 
        System.out.println("\n--- Overriding Demonstrations ---");
        Payment upi = new UPIPayment();
        Payment card = new CreditCard();

        upi.paymentProcess(2500.00);
        card.paymentProcess(7800.00);
    }
}