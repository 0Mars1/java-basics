/**
 * Lab Day 7: Multiple Inheritance Implementation via Interfaces
 * Purpose: Emulate multiple inheritance using PaymentProcess and Refundable interfaces.
 * Author: Ahmad Ali
 */

interface PaymentProcess {
    void processPayment(double amount);
}

interface Refundable {
    void processRefund(double amount);
}

// Concrete class implementing both contracts
class PaymentGateway implements PaymentProcess, Refundable {
    String apiKey;

    // Constructor setup
    public PaymentGateway(String apiKey) {
        this.apiKey = apiKey;
    }

    // Implementing abstract method from PaymentProcess
    public void processPayment(double amount) {
        System.out.println("Payment of Rs." + amount + " processed securely using API Key: " + apiKey);
    }

    // Implementing abstract method from Refundable
    public void processRefund(double amount) {
        System.out.println("Refund of Rs." + amount + " initialized back to core source account.");
    }
}

public class MultiLevelInheritanceUsingInterfaces {
    public static void main(String[] args) {
        // Instantiate using setup constructor
        PaymentGateway gateway = new PaymentGateway("secret_key_99x");
        
        gateway.processPayment(4999.00);
        gateway.processRefund(150.50);
    }
}