/* Write a program in java to implement multiple inheritance
Make two interfaces PaymentProcess and Refundable (Both will receive an amount in double)
then make a class PaymentGateway which will implement both interfaces PaymentProcess and Refundable
The PaymentGateway class which will have String APIkey
a constructor to setup the APIkey
and aalso implement the two methods PatmentProcess and refundable */

package April16;
// Interface for processing payments
interface PaymentProcess {
    void processPayment(double amount);
}

// Interface for handling refunds
interface Refundable {
    void processRefund(double amount);
}
// Child class that implements 2 parents
class PaymentGateway implements PaymentProcess, Refundable {
    private String apiKey;

    // Constructor to set up the API key
    PaymentGateway(String apiKey) {
        this.apiKey = apiKey;
    }
    // Using public before the function implementations, because methods of interfaces are public by default and their implementation needs to be public too
    public void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " is processing...");
    }

    public void processRefund(double amount) {
        System.out.println("Refund of $" + amount + " is processing...");
    }
}
// Main class starts here
public class MultipleInheritance {
    public static void main(String[] args) {
        PaymentGateway gw = new PaymentGateway("SECRET_88293_UX");

        // Execute payment
        gw.processPayment(250);
        
        System.out.println("----------------------------");

        // Execute refund
        gw.processRefund(50);
    }
}