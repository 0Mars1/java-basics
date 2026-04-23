/*
Write a program to implement polymorphism
Create a payment class which will have 3 functions:
    LogTransection: which will receive a Double amount this will log process payment of Rs amount
    LogTransection which will receive double amount and currency this will log process payment of Rs amount in the currency
    PaymentProcess which will receive amount and it will print executing generic payment
then create another class UPIPayment that will overwrite PaymentProcess will receive amount and it will print executing UPI payment of Rs amount
then create another class Creditcard that will overwrite PaymentProcess will receive amount and it will print executing CreditCard payment Rs amount
then create a public class PaymentSystem where we will create any subclass to call the function
*/
package April23;

// Base class
class Payment {

    // Method overloading
    void LogTransaction(double amount) {
        System.out.println("Processing payment of Rs " + amount);
    }

    void LogTransaction(double amount, String currency) {
        System.out.println("Processing payment of Rs " + amount + " in " + currency);
    }

    // Method to be overridden
    void PaymentProcess(double amount) {
        System.out.println("Executing generic payment of Rs " + amount);
    }
}

// Subclass 1
class UPIPayment extends Payment {
    @Override
    void PaymentProcess(double amount) {
        System.out.println("Executing UPI payment of Rs " + amount);
    }
}

// Subclass 2
class CreditCard extends Payment {
    @Override
    void PaymentProcess(double amount) {
        System.out.println("Executing CreditCard payment of Rs " + amount);
    }
}

// Main class
public class PaymentSystem {

    public static void main(String[] args) {
        UPIPayment p1 = new UPIPayment();
        p1.LogTransaction(5000);
        p1.PaymentProcess(5000);

        CreditCard p2 = new CreditCard();
        p2.LogTransaction(7000, "USD");
        p2.PaymentProcess(7000);
    }
}